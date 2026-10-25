public class Main { 
    public static void main(String[] args) { 
 
        int a = 5; 
        int b = 3; 
        int count = 2; 
 
        System.out.println("=== Precedence Puzzle Solver ==="); 
 
        // PREDICTED: true 
        System.out.println("Expression 1: " + (a + b * count > 10 && a < 10)); 
 
        // PREDICTED: 3 
        System.out.println("Expression 2: " + (count++ + 1)); 
 
        // PREDICTED: true 
        System.out.println("Expression 3: " + (++count + b == 7 || a < 0)); 
 
    } 
}