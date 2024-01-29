public abstract class Validators {
    
    public static boolean isAlpha(String string){
        if (string.isBlank()) return false;
        return string.matches("^[a-zA-Z]*$");
    }
    
    public static boolean isAlpha(String string,int min, int max){
        String regex = String.format("[a-zA-Z]{%d,%d}",min,max);
        return string.matches(regex);
    }
    
    public static boolean isNum(String string){
        if (string.isBlank()) return false;
        return string.matches("^[0-9]*$");
    }
    
    public static boolean isNum(String string,int min, int max){
        String regex = String.format("[0-9]{%d,%d}",min,max);
        return string.matches(regex);
    }
    
    public static boolean isAlNum(String string){
        if (string.isBlank()) return false;
        return string.matches("^[a-zA-Z0-9]*$");
    }

    public static boolean isAlNum(String string,int min, int max){
        String regex = String.format("[a-zA-Z0-9]{%d,%d}",min,max);
        return string.matches(regex);
    }

    public static boolean isEmail(String string){
        return string.matches("^(.+)@(.+)$");
    }

    public static boolean isValidPassword(String password1, String password2, int min){
        return password1.equals(password2) && password1.length()>=min;
    }

    public static boolean isFloat(String string){
        return string.matches("[+-]?([0-9]+([.][0-9]*)?|[.][0-9]+)");
    }

    public static boolean isFloat(String string, double min, double max){
        if(!string.matches("[+-]?([0-9]+([.][0-9]*)?|[.][0-9]+)"))
            return false;
        double num = Double.parseDouble(string);
        return num>=min && num<=max;
    }

    public static boolean isName(String string){
        return string.matches("[a-zA-Z][a-zA-Z ]+[a-zA-Z]$");
    }

    public static boolean isDate(String string){
        if(!string.matches("\\d{4}-\\d{2}-\\d{2}"))
            return false;
        String[] date = string.split("-");

        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);

        if (year > 9999 || year < 1800)
            return false;
        if (month < 1 || month > 12)
            return false;
        if (day < 1 || day > 31)
            return false;


        if (month == 2){
            if (isLeap(year))
                return (day <= 29);
            else
                return (day <= 28);
        }

        if (month == 4 || month == 6 || month == 9 || month == 11)
            return (day <= 30);

        return true;
    }

    public static boolean isLeap (int year){
        return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
    }

}
