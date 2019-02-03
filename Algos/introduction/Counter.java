package Algos.introduction;

class Counter {
    private final String name;
    private int count;

    Counter(String id){
        name = id;
        count = 0;
    }
    public void increment(){
        count++;
    }

    public int tally(){
        return count;
    }

    public String toString(){
        return count+" "+name;
    }
}