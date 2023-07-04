package home_work_3;


import java.util.Scanner;


import static home_work_3.CheckingInput.checkingInput;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите строку через ПРОБЕЛ (строка должна содержать Ф.И.О, дату рождения - dd.mm.yyyy," +
                    " номер телефона - цифры, пол - f/m ) : ");
            checkingInput(sc.nextLine().split(" "));
            System.out.println("Информация сохранена!");
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }




}
