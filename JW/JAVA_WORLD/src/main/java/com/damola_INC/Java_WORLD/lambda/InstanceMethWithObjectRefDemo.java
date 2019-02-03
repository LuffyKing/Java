package com.damola_INC.Java_WORLD.lambda;
import java.io.PrintWriter;

/**
 * InstanceMethWithObjectRefDemo
 */
public class InstanceMethWithObjectRefDemo {
    static <T> int counter(T[] vals, TempInterface<T> f, T v){
        int count =0;
        for (int i = 0; i < vals.length; i++) {
            if (f.func(vals[i], v)) {
                count++;
            }

        }
        return count;
    }
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        int count;
        HighTemp[] weekDayHighs = {
            new HighTemp(89), new HighTemp(82),
            new HighTemp(90), new HighTemp(89),
            new HighTemp(89), new HighTemp(91),
            new HighTemp(84), new HighTemp(83)
        };
        count = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(89));
        pw.println(count + " days had a high of 89");
        HighTemp[] weekDayHighs2 = {
            new HighTemp(32), new HighTemp(12),
            new HighTemp(24), new HighTemp(19),
            new HighTemp(18), new HighTemp(12),
            new HighTemp(-1), new HighTemp(13)
        };

        count = counter(
            weekDayHighs2, HighTemp::sameTemp, new HighTemp(12)
        );
        pw.println(count + " days had a high of 12");
        count = counter(weekDayHighs, HighTemp::lessThanTemp, new HighTemp(89));
        pw.println(count + " days had a high less tahn 89");
        count = counter(weekDayHighs2, HighTemp::lessThanTemp, new HighTemp(19));
        pw.println(count + " days had a high of less than 19");
    }
}

interface TempInterface <T>{
    boolean func(T v1, T v2);
}

class HighTemp{
    private int hTemp;
    HighTemp(int ht){
        hTemp = ht;
    }
    boolean sameTemp(HighTemp ht2){
        return hTemp == ht2.hTemp;
    }
    boolean lessThanTemp(HighTemp ht2){
        return hTemp < ht2.hTemp;
    }
}