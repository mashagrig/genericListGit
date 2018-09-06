package list;


import java.util.List;


public class MyList {
    
    public static void main(String[] args) {
    
      String names = "./src/main/resources/csv/names.csv";
     //   String countryFile = "./src/main/resources/csv/countries.csv";
        String age = "./src/main/resources/csv/age.csv";
   
/*        String names = "D:\\JAVA\\JAVA-lernings\\lambda2\\src\\main\\resources\\csv\\names.csv";
        String age = "D:\\JAVA\\JAVA-lernings\\lambda2\\src\\main\\resources\\csv\\age.csv";*/
        
/*        List<Integer> listInt = new LinkedList<>();
        List<String> listString = new LinkedList<>();
    
        List listIntAfterFill = Fill.fillList("Integer", listInt, 20, age);
        System.out.println(listIntAfterFill.toString());
    
        List listStringAfterFill = Fill.fillList("String", listString, 20, names);
        System.out.println(listStringAfterFill.toString());*/
    
        System.out.println("//n **Просто сразу создание заполненных списков данными определенных типов** //n");
    
        List listIntAfterFill2 = Fill2.fillList( 20, age);
        System.out.println(listIntAfterFill2.toString());
    
        List listStringAfterFill2 = Fill2.fillList( 20, names);
        System.out.println(listStringAfterFill2.toString());
 
    
       
        /*
        List<Integer> dl3 = new LinkedList<Integer>();
        FillList.FillDiffList(dl3, 10, age, Integer.class);
        System.out.println(dl3.toString());
        */
    }
}
