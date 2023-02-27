package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.Collections;
import java.util.LinkedList;

// BEGIN
public class App {

    public static LinkedHashMap<String, String> genDiff(Map<String, Object> map1, Map<String, Object> map2) {
        Set<String> aset = new HashSet<>();
        Set<String> bset = new HashSet<>();
        LinkedHashMap<String, String> result = new LinkedHashMap<>();

        for (String key: map1.keySet()) {
            aset.add(key);
        }
        for (String key: map2.keySet()) {
            bset.add(key);
        }

        Set<String> bDiff = new HashSet<>();
        bDiff.addAll(bset);
        bDiff.removeAll(aset);

        Object[] bDiffArr = bDiff.toArray();

        for (int i = 0; i < bDiffArr.length; i++) {
            result.put(bDiffArr[i].toString(), "added");
        }

        Set<String> aDiff = new HashSet<>();
        aDiff.addAll(aset);
        aDiff.removeAll(bset);

        Object[] aDiffArr = aDiff.toArray();

        for (int i = 0; i < aDiffArr.length; i++) {
            result.put(aDiffArr[i].toString(), "deleted");
        }

        for (String aKey: map1.keySet()) {
            for (String bKey: map2.keySet()) {
                if (aKey.equals(bKey)) {
                    if (map1.get(aKey).equals(map2.get(bKey))) {
                        result.put(aKey, "unchanged");
                    } else {
                        result.put(aKey, "changed");
                    }
                }
            }
        }
        List<Map.Entry<String, String>> list = new LinkedList<>(result.entrySet());
        Collections.sort(list, (mapA, mapB) -> mapA.getKey().compareTo(mapB.getKey()));
        LinkedHashMap<String, String> finalResult = new LinkedHashMap<>();
        for (Map.Entry<String, String> map: list) {
            finalResult.put(map.getKey(), map.getValue());
        }
        return finalResult;
    }
}

//END
