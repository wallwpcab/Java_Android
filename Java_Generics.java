public class GenericMethodTest {
   public static < E > void printArray( E[] inputArray ) {
      for(E element : inputArray) {
         System.out.printf("%s ", element);
      }
      System.out.println();
   }
   public static void main(String args[]) {
      Integer[] intArray = { 1, 2, 3, 4, 5 };
      Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
      Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
      System.out.println("Array integerArray contains:");
      printArray(intArray);  
      System.out.println("\nArray doubleArray contains:");
      printArray(doubleArray);  
      System.out.println("\nArray characterArray contains:");
      printArray(charArray);   
   }
}
public class MaximumTest {
   public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
      T max = x;   
      if(y.compareTo(max) > 0) {
         max = y;   
      }
      if(z.compareTo(max) > 0) {
         max = z;               
      }
      return max;  
   }
   public static void main(String args[]) {
      System.out.printf("Max of %d, %d and %d is %d\n\n", 
         3, 4, 5, maximum( 3, 4, 5 ));
      System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n",
         6.6, 8.8, 7.7, maximum( 6.6, 8.8, 7.7 ));
      System.out.printf("Max of %s, %s and %s is %s\n","pear",
         "apple", "orange", maximum("pear", "apple", "orange"));
   }
}
public class Box<T> {
   private T t;
   public void add(T t) {
      this.t = t;
   }
   public T get() {
      return t;
   }
   public static void main(String[] args) {
      Box<Integer> integerBox = new Box<Integer>();
      Box<String> stringBox = new Box<String>();
      integerBox.add(new Integer(10));
      stringBox.add(new String("Hello World"));
      System.out.printf("Integer Value :%d\n\n", integerBox.get());
      System.out.printf("String Value :%s\n", stringBox.get());
   }
}