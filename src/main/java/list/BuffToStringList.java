package list;


import stream.GetStream;

import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.List;


public class BuffToStringList {
    public static List<String> buffToStringList(String fileName, int size) {
        List<String> stringList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            BufferedReader buff = GetStream.getStream(fileName);
            buff.lines()
                    .forEachOrdered(stringList::add);
            //.collect(Collectors.toList());
        }
        return stringList;
    }
}
