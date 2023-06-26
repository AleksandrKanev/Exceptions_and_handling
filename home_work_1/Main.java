package home_work_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        String[] txt = {"1", null, "2"};

//        method1(10,0);
//        method2(txt);
        method3(arr);


    }

    public static double method1(int a, int b){
        return a/b;
    }

    public static void method2(String[] sArr) {
        for (String item :
                sArr) {
            System.out.println(item.toString());
        }
    }

    public static void method3(int[] arr){
        System.out.println(arr[10]);
    }
}
