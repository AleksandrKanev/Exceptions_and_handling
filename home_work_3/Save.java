package home_work_3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Save {

    public static void save(Object[] arr) {
        try {
            FileWriter f = new FileWriter(arr[0] + ".txt", true);
            f.write(Arrays.toString(arr) + "\n");
            f.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
