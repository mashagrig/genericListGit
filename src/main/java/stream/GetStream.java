package stream;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class GetStream {
    /**
     * Метод возвращает построчный поток из файла
     *
     * @param filePath - адрес файла file path
     *
     * @return BufferedReader buff  - построчный поток данных из файла
     */
    public static BufferedReader getStream(String filePath) {
        FileInputStream fis = null;
        InputStreamReader reader = null;
        BufferedReader buff = null;
        
        try {
            fis = new FileInputStream(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
            
            if (fis != null) {
                reader = new InputStreamReader(fis);
            }
            if (reader != null) {
                buff = new BufferedReader(reader);
            }
/*        if (fis != null) {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
  
        return buff;

    }
}
