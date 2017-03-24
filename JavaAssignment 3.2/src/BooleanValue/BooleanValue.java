
package BooleanValue;
 import java.lang.*;
public class BooleanValue {

   public static void main(String[] args) {
      Boolean b;
      b = new Boolean(true);
      boolean bool;
      bool = b.booleanValue();
      String str = "Primitive value of Boolean object " + b + " is " + bool;
      System.out.println( str );
   }
}