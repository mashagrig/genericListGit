package stream;


import java.io.BufferedReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class IsTypeBuffParsing {
    
    /**
     * Метод проверяет соответствует ли указанному типу данных поток из файла
     *
     * @param fileName - файл
     * @param type     - тип данных для проверки на соответствие
     *
     * @return - соответствует/нет
     */
    public static boolean isTypeBuffParsing(String fileName, String type) {
        BufferedReader buff = GetStream.getStream(fileName);
        Pattern p;
        Matcher m;
        p = Pattern.compile(type);
        return buff.lines().anyMatch(s -> p.matcher(s).find());
        // p = Pattern.compile(type, Pattern.MULTILINE);
        //return buff.lines().anyMatch(s -> p.matcher(s).matches());
        // return buff.lines().allMatch(s -> s.matches(type));
        
    }
    
}
