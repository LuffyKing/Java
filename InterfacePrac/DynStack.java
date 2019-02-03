/**
 * DynStack
 */
package InterfacePrac;
 public class DynStack {
    private int[] stack;
    private int tos;
    private int[] tempStack;
    DynStack(int i){
        stack = new int[i];
        tos = -1;
    }
    public void push(int inputInt){
        if( tos == stack.length -1){
            tempStack = new int[stack.length*2];
            int i = 0;
            for (int oldStackInt : stack) {
                tempStack[i++] = oldStackInt;
            }
            stack = tempStack;
            tempStack = new int[0];
            System.out.println("Stack size increased!");
            stack[++tos] = inputInt;

        } else{
            stack[++tos] = inputInt;    
        }
    }
    public int pop(){
        if (tos < 0) {
            System.out.println("Stack underflow");
            return 0;

        } 
        return stack[tos--];
         
    }
}