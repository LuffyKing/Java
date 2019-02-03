package InputOutput;
/**
 * MyClass
 */
public class MyClass {
    int a;
    int b;
    MyClass(int i, int j){
        a =i;
        b = j;

    }
    MyClass(int i){
        a = i;
        b =i;
    }
    MyClass(){
        a=0;
        b=0;
    }

}

/**
 * InnerMyClass
 */
class InnerMyClass {

    int a;
    int b;
    InnerMyClass( int i, int j){
        a =i;
        b =j;
    }
    InnerMyClass(int i){
        this(i, i);
    }
    InnerMyClass(){
        this(0);
    }
}