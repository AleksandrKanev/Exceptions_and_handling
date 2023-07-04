package home_work_3;


import static home_work_3.Separation.sep;

public class CheckingInput {

    public static void checkingInput(String[] arr) throws RuntimeException{
        if (arr.length == 6) {
            sep(arr);
        } else {
            throw new CheckingInputException("Введены не все данные");
        }
    }

    public static boolean isNumeric(String s) {
        try {
            Integer.valueOf(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isString(String s) throws RuntimeException {
        String[] t = s.split("");
        for (String value : t) {
            if (isNumeric(value)) {
                return false;
            }
        }
        return true;
    }

}
