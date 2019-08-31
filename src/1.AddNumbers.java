/*
 * Add two numbers a and b
 */
class AddNumbers {
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main (String[] args){
      // Test case 1
      int a = 1;
      int b = 2;
      int c  = addNumbers(a, b);
      System.out.println(c);

      // Test case 2
      int a = 1;
      int b = 5;
      int c  = addNumbers(a, b);
      System.out.println(c);

    }
}


