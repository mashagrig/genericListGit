package list;

import stream.IsTypeBuffParsing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Просто сразу создание заполненных мап определенных типов в зависимости от типов данных в файлах
 */
public class Fill2 {
    
    public static Map<String, List> map = new HashMap<>();
    
    public static List fillList(int size, String fileName) {
        
        String key = "";
        
        if (IsTypeBuffParsing.isTypeBuffParsing(fileName, "^[0-9]$")) {
            key = "Integer";
            map.put(key, Fill2.fillListInt(size, fileName));
        } else if (IsTypeBuffParsing.isTypeBuffParsing(fileName, "[А-яA-z]")) {
            key = "String";
            map.put(key, Fill2.fillListString(size, fileName));
        }
        return map.get(key);
    }
    
    
    private static List<Integer> fillListInt(int size, String fileName) {
        
        List<Integer> listToMap = new ArrayList<>();
        List<Integer> listFromBuff;
        
        for (int i = 0; i < size; i++) {
            listFromBuff = BuffToIntList.buffToIntList(fileName, size);
            if (listFromBuff.size() != 0) {
                listToMap.add(i, listFromBuff.get(i));
            }
        }
        return listToMap;
    }
    
    private static List fillListString( int size, String fileName) {
        
        List<String> listToMap = new ArrayList<>();
        List<String> listFromBuff;

            for (int i = 0; i < size; i++) {
                listFromBuff = BuffToStringList.buffToStringList(fileName, size);
                
                if (listFromBuff.size() != 0) {
                    listToMap.add(i, listFromBuff.get(i));
                }
            }
        return listToMap;
    }
}
