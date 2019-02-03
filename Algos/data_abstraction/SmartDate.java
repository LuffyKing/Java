package Algos.data_abstraction;
public class SmartDate {
    private int day;
    private int month;
    private int year;
    private String[] dayString;
    private boolean isValid;
    SmartDate(int d, int m, int y){
        try{
            if(checkDate(d, m, y)){
                day = d;
                month = m;
                year = y;
                dayString = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday","Thursday","Friday","Saturday"};
                isValid = true;
            } else{
                throw new RuntimeException("Illegal date format");
            }
        } catch(RuntimeException e){
            isValid = false;
            System.out.println(e.getMessage());
        }
    }

    SmartDate(String dateString){
        String[] dateStringArr = dateString.split("-");
        int d = 0;
        int m = 0;
        int y = 0;
        try {
            d = Integer.parseInt(dateStringArr[0]);
            m = Integer.parseInt(dateStringArr[1]);
            y = Integer.parseInt(dateStringArr[2]);
        } catch (NumberFormatException e) {
            //TODO: handle exception
            isValid = false;
            throw new RuntimeException("Illegal date format");
        }
        
        if(checkDate(d, m, y)){
            day = d;
            month = m;
            year = y;
            dayString = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday","Thursday","Friday","Saturday"};
            isValid = true;
        } else{
            isValid = false;
            throw new RuntimeException("Illegal date format");
        }

    }

    public String dayOfTheWeek(){
        int y = year;
        int offset[] = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        y -= month < 3  ? 1 : 0;
        return dayString[(y + y/4 - y/100 + y/400 + offset[month-1]+day) % 7];
        
    }

    

    public boolean checkDate(int d, int m, int y){
        if(d > 31 || d <= 0){
            return false;
        } else if(m > 12 || m <= 0){
            return false;
        } else if(y <= 0){
            return false;
        }
        return checkDay(d, m, y);
    }

    public boolean checkDay(int d, int m, int y){
       switch (m) {
            case 9:
            case 4:
            case 6:
            case 11:
                if (d > 30) {
                    return false;
                }
                
                break;
            case 2:
                if(isLeapYear(y)){
                    if ( d > 29) {
                        return false;
                    }
                } else if(d> 28){
                    return false;
                }
                
                break;
            default:
                if (d > 31) {
                    return false;
                }
               break;
       }
       return true;
    }
    public int month(){
        return month;
    }
    public int year(){
        return year;
    }

    public int day(){
        
        return day;
    }

    public boolean isLeapYear(int y){
        return y%4 == 0 && (y %100 != 0 || y % 400 == 0);
    }
    public String toString(){
        return day+"/"+month+"/"+year;
    }

    public boolean isValidDate(){
        return isValid;
    }
}