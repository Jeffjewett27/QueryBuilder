import com.google.code.regexp.Matcher;
import com.google.code.regexp.Pattern;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

import org.json.simple.*;
import org.json.simple.parser.ParseException;

public class Tester {
    public String build;
    public String input;
    public BuildContext buildContext;
    public SymbolTable namespace;
    HashMap<String, SymbolTable> namespaces;

    public JSONArray json;

    public Tester(HashMap<String, SymbolTable> namespaces, SymbolTable namespace, String input, String output, BuildContext buildContext) {
        build = buildContext.rawString;
        this.input = input;
        this.buildContext = buildContext;
        this.namespace = namespace;
        this.namespaces = namespaces;

        testRegex();

        if (output != null) {
            saveJSON(output);
        }
    }

    public void testRegex() {
        Pattern pattern = Pattern.compile(build);
        Matcher matcher = pattern.matcher(input);

        System.out.println("Showing matches for query: " + build);
        List<Map<String,String>> namedGroups = null;
        if (namespace.captured.size() > 0) {
            namedGroups = matcher.namedGroups();
        }
        int count = 0;
        List<String> matches = new ArrayList<>();
        while (matcher.find()) {
            matches.add(matcher.group());
            count++;
        }
        json = getCapturesJSON(namedGroups, matches);
    }

    public JSONArray getCapturesJSON(List<Map<String,String>> maps, List<String> matches) {
        var jsonroot = new JSONArray();
        int idx = 0;
        if (maps == null) {
            maps = new ArrayList<>();
            maps.add(new HashMap<>());
        }
        if (matches.size() == 0) {
            System.out.println("Nothing matched");
            return jsonroot;
        }
        for (var map : maps) {
            var mapobject = new JSONObject();
            for (var skey : namespaces.keySet()) {
                var symobject = new JSONObject();
                SymbolTable ns = namespaces.get(skey);
                symobject.put("namespace", skey);
                var symvals = new JSONObject();
                String match = matches.get(idx);
                System.out.println("Match " + idx + ": " + match);
                symobject.put("match", match);
                symobject.put("values", symvals);
                for (var ckey : ns.captured.keySet()) {
                    var cval = ns.captured.get(ckey);
                    if (cval == VarTerm.CaptureType.None) {
                        continue;
                    }
                    var cident = buildContext.getCaptureIdent(skey, ckey);
                    var ccount = buildContext.captureCounts.get(cident);
                    if (ccount == null || ccount == 0) {
                        continue;
                    }
                    String nsident = skey + "." + ckey;

                    if (cval == VarTerm.CaptureType.Array) {
                        var vallist = new JSONArray();
                        var list = new ArrayList<String>();
                        for (int i = 0; i < ccount; i++) {
                            var cidn = cident + i;
                            String rval = map.get(cidn);
                            vallist.add(rval);
                            //System.out.println("\t" + nsident + ": " + rval);
                            list.add(rval);
                        }
                        System.out.println("\t" + nsident + ": " + list);
                        symvals.put(ckey, vallist);
                    } else {
                        String rval = map.get(cident);
                        System.out.println("\t" + nsident + ": " + rval);
                        symvals.put(ckey, rval);
                    }
                }
                mapobject.put(skey, symobject);
            }
            jsonroot.add(mapobject);
            idx++;
        }
        System.out.println();
        return jsonroot;
    }

    public void saveJSON(String outputname) {
        try {
            @SuppressWarnings("resource")
            FileWriter file = new FileWriter(outputname);
            file.write(json.toJSONString());
            file.flush();
            System.out.println("\nSaved output to json file at " + outputname);
        } catch (IOException e) {
            System.out.println("Could not save json to file at " + outputname);
        }
    }
}
