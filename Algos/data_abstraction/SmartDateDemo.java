package Algos.data_abstraction;

class SmartDateDemo {
    public static void main(String[] args) {
        int day;
        int month;
        int year;

        try {
            if (args.length != 3) {
                throw new RuntimeException("Error improper usage: correct example usage -> 31 01 2018"); 
            }
            day = Integer.parseInt(args[0]);
            month = Integer.parseInt(args[1]);
            year = Integer.parseInt(args[2]);

        } catch(RuntimeException e){
            System.out.println(e.getMessage());
            return;
        }

        SmartDate s = new SmartDate(day, month, year);
        if (s.isValidDate()) {
            System.out.println(s);
            System.out.println(s.dayOfTheWeek());
        }
        
    }
}