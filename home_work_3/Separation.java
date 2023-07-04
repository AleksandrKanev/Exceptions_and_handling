package home_work_3;

import static home_work_3.CheckingInput.isNumeric;
import static home_work_3.CheckingInput.isString;
import static home_work_3.Save.save;

public class Separation {
    public static void sep(String[] arr) throws RuntimeException{
        Object[] final_arr = new Object[6];
        int count = 0;
        for (String i : arr) {
            if (i.matches("(0?[1-9]|[12][0-9]|3[01]).(0?[1-9]|1[012]).((19|20)\\d\\d)")) {
                final_arr[3] = i;
            } else if (isNumeric(i) && final_arr[4] == null) {
                final_arr[4] = i;
            } else if (isString(i)){
                if (i.equals("f") || i.equals("m")) {
                    final_arr[5] = i;
                } else if (count < 3) {
                    final_arr[count] = i;
                    count++;
                }
            } else {
                throw new SeparationException("Некорректный ввод: " + i);
            }
        }
        save(final_arr);
    }

}
