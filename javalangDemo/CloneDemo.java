package javalangDemo;
/**
 * TestClone
 */
class TestClone implements Cloneable {
    int a;
    double b;
    public Object clone(){
        try {
            return super.clone();
        } catch(CloneNotSupportedException e){
            System.out.println("Cloning not allowed");
            return this;
        }
    }
}



class CloneDemo{
    public static void main(String[] args) {
        TestClone t1 = new TestClone();
        TestClone t2;
        t1.a = 10;
        t1.b = 20.98;
        t2 = (TestClone) t1.clone();
        System.out.println("a: "+t1.a+" "+t2.a);
        System.out.println("b: "+t1.b+" "+t2.b);
    }
}