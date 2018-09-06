package list;


import stream.IsTypeBuffParsing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Fill {
    
    public static Map<String, List> map = new HashMap<>();
    
    public static List<?> fillList(String key, List<?> list, int size, String fileName) {
        map.put(key, list);
        switch (key) {
            case "Integer": {
                Fill.fillListInt(size, fileName);
                break;
            }
            case "String": {
                Fill.fillListString(size, fileName);
                break;
            }
        }
        return map.get(key);
    }
    
    private static void fillListInt(int size, String fileName) {
        
        if (IsTypeBuffParsing.isTypeBuffParsing(fileName, "^[0-9]")) {
            List<Integer> listToMap = new ArrayList<>();
            List<Integer> listFromBuff;
            
            for (int i = 0; i < size; i++) {
                listFromBuff = BuffToIntList.buffToIntList(fileName, size);
                if (listFromBuff.size() != 0) {
                    listToMap.add(i, listFromBuff.get(i));
                }
            }
            map.put("Integer", listToMap);
        }
    }
    
    private static void fillListString(int size, String fileName) {
        
        List<String> listToMap = new ArrayList<>();
        List<String> listFromBuff;
        
        if (IsTypeBuffParsing.isTypeBuffParsing(fileName, "[А-яA-z]")) {
            
            for (int i = 0; i < size; i++) {
                listFromBuff = BuffToStringList.buffToStringList(fileName, size);
                
                if (listFromBuff.size() != 0) {
                    listToMap.add(i, listFromBuff.get(i));
                }
            }
            map.put("String", listToMap);
        }
    }
}
