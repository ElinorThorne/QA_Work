
public class StackFunctions{
   private int maxSize;
   private long[] stackArray;
   private int top;
   private long tempVal;
   
   public StackFunctions(int s) {
      maxSize = s;
      stackArray = new long[maxSize];
      top = -1;
   }
   public void push(long j) {
      stackArray[++top] = j;
   }
   public long pop() {
	  tempVal = stackArray[top];
	  //System.out.println(tempVal);
      stackArray[top] = stackArray[top--];
      //System.out.println(tempVal);
      return tempVal;
   }
   public long peek() {
      return stackArray[top];
   }
   public boolean isEmpty() {
      return (top == -1);
   }
   public boolean isFull() {
      return (top == maxSize - 1);
   }
}