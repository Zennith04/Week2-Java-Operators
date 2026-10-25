public class Main { 
    public static void main(String[] args) { 
 
  
        double balance = 1000.00; 
 
        System.out.println("=== Compound Growth Tracker ==="); 
        System.out.println("Initial Balance: " + balance); 
 
        balance += 200; 
        System.out.println("After adding 200: " + balance); 
 
        balance *= 1.10; 
        System.out.println("After 10% growth: " + balance); 
 
        balance += 150; 
        System.out.println("After adding 150: " + balance); 
 
 
        int count = 5; 
 
        System.out.println("\n=== Postfix Increment (count++) ==="); 
        System.out.println("Inside println: " + count++); 
        System.out.println("After println: " + count); 
 
     
        count = 5; 
 
        System.out.println("\n=== Prefix Increment (++count) ==="); 
        System.out.println("Inside println: " + (++count)); 
        System.out.println("After println: " + count); 
 
        
    } 
}