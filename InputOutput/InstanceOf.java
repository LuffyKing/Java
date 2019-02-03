package InputOutput;
import java.io.*;
class A{
    int i,j;
}
class B{
    int i,j;
}
class C extends A{
    int k;
}
class D extends A{
    int k;
}
/**
 * InstanceOf
 */
public class InstanceOf {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        PrintWriter pw  = new PrintWriter(System.out, true);
        if (a instanceof A) {
            pw.println("a is instance of A");
        }
        if(b instanceof B){
            pw.println("b is instance of B");
        }
        if(c instanceof C){
            pw.println("c is instance of C");
        }
        if(c instanceof A){
            pw.println("c can be cast to A");
        }
        if(a instanceof C){
            pw.println("a can be cast to C");
        }
         A ob;
         ob =d;
         pw.println("ob now refers to d");
         if (ob instanceof D) {
             pw.println("ob can be cast to D");
         } else{
             pw.println("ob can not be cast to D");
         }
         if (ob instanceof A) {
             pw.println("ob can be cast to A");
         }
         pw.println();

         if (a instanceof Object) {
             pw.println("a may be cast to Object");
         }

         if (b instanceof Object) {
            pw.println("b may be cast to Object");
        }

        if (c instanceof Object) {
            pw.println("c may be cast to Object");
        }

        if (d instanceof Object) {
            pw.println("d may be cast to Object");
        }

    }
}