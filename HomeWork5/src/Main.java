import java.io.*;
import java.util.Arrays;


public class Main {

    public static  void main(String[] args) {
        File file = new File("src/test.csv");
        File file2 = new File("src/test2.csv");

        AppData appData = new AppData();

        appData.read(file);

        System.out.println(Arrays.toString(appData.getHeader()));
        System.out.println(Arrays.toString(appData.getData()[0]));
        
        appData.write(file2);
    }
}



