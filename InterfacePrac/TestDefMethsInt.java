package InterfacePrac;
/**
 * DefMethsInt
 */
interface DefMethsInt {

    default int doSomething(){
        return 2+2;
    }
    void doNothing();
}

/**
 * InnerDefMethsInt
 */
class DefMethsIntClass implements DefMethsInt {
    
    public void doNothing() {
     System.out.println("Do nothing");   
    }
    
}

class TestDefMethsInt{
    public static void main(String[] args) {
        DefMethsIntClass test = new DefMethsIntClass();
        System.out.println(test.doSomething());
        test.doNothing();
    }
}