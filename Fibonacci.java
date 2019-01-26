
public class Fibonacci {
  public int fibonacci(int n, String type) {
    
    if (type.equals("iterative")) {
      return iterativeFib(n);
    } else if (type.equals("recursive")) {
      return recursiveFib(n);
    }
    
    return 0;
  }
  
  // Uses iterative style to return the Fibonacci number
  private int iterativeFib(int n) {
    int backVal = 0, frontVal = 1;
    
    for (int i = 1; i < n - 1; i++) {
      int temp = frontVal + backVal;
      backVal = frontVal;
      frontVal = temp;
    }
    
    return frontVal + backVal;
  }
  
//Uses recursive style to return the Fibonacci number
  private int recursiveFib(int n) {
    if (n <= 2) {
      return 1;
    }
    
    return recursiveFib(n - 2) + recursiveFib(n - 1);
  }
}
