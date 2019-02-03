package Algos.data_abstraction;
class VisualCounterDemo {
    public static void main(String[] args) {
        VisualCounter vc = new VisualCounter(Integer.parseInt(args[0]), Integer.parseInt(args[1]), args[2]);
        for (int i = 0; i <  Integer.parseInt(args[3]); i++) {
            vc.increment();
        }
        for (int i = 0; i < Integer.parseInt(args[4]); i++) {
            vc.decrement();
        }
        System.out.println(vc);
    }
}