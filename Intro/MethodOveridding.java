class A{
    int i;
    int j;
    A(int a, int b){
        i = a;
        j = b;
    }
    void show(){
        System.out.println("i: "+ i +" j: "+ j);
    }
}
class B extends A{
    int k;
    B(int a, int b, int c){
        super(a, b);
        k = c;
    }
    void show(){
        System.out.println("k: " + k);
    }
}
class MethodOveridding{
    public static void main(String[] args) {
        A a = new A(1, 2);
        B b = new B(1,2,3);
        a.show();
        b.show();
    }
}