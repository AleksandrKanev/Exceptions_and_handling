package home_work_2;

import java.util.Scanner;

public class Task_1_and_3 {
    public static void main(String[] args) {
        sc_method();

    }

    public static void sc_method(){
        System.out.println("Введите число с плавающей точкой: ");
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        try{
            if (txt != null) { // Проверка на пустую строку 3 задание.
                ret_num(txt);
                System.out.println("Успех!");
            }else {
                throw new RuntimeException("Пустые строки вводить нельзя!");
            }
        } catch (NumberFormatException e){
            System.out.println("Введено не числовой значение!");
            sc_method();
        }
    }
    public static float ret_num(String txt){
        return Float.parseFloat(txt);
    }

}
