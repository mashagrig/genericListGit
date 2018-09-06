package list;


import stream.GetStream;

import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.List;


public class BuffToIntList {
    
    public static List<Integer> buffToIntList(String fileName, int size) {
        List<Integer> integerList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            BufferedReader buff = GetStream.getStream(fileName);
            buff.lines()
                    .map(Integer::parseInt)
                    .forEachOrdered(integerList::add);
                    //.collect(Collectors.toList());
        }
        return integerList;
    }
}
