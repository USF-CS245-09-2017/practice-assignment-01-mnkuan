
public class Factorial {
  public int factorial(int n, String type) {
    if (type.equals("iterative")) {
      return iterativeFactorial(n);
    } else if (type.equals("recursive")) {
      return recursiveFactorial(n);
    }
    
    return 0;
  }
  
  // Uses the iterative style to return the factorial
  private int iterativeFactorial(int n) {
    int total = 1;
    
    for (int i = 2; i <= n; ++i) {
      total *= i;
    }
    
    return total;
  }
  
//Uses the recursive style to return the factorial
  private int recursiveFactorial(int n) {
    if (n <= 1) {
      return 1;
    }
    
    return recursiveFactorial (n - 1) * n;
  }
}
