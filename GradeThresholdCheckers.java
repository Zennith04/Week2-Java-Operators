public class Main { 
    public static void main(String[] args) { 
 
    
        double averageGrade = 85; 
        int absences = 2; 
 
        
        boolean eligible = (averageGrade >= 75 && absences <= 3) 
                           || (averageGrade >= 90); 
 
        System.out.println("=== Grade Threshold Checker ==="); 
        System.out.println("Average Grade: " + averageGrade); 
        System.out.println("Number of Absences: " + absences); 
 
         
        if (eligible) { 
            System.out.println("Result: PASS"); 
        } else { 
            System.out.println("Result: FAIL"); 
        } 
 
        
        if (averageGrade >= 90) { 
            System.out.println("Reason: Grade is 90 or above, regardless of absences."); 
        } else if (averageGrade >= 75 && absences <= 3) { 
            System.out.println("Reason: Grade is at least 75 and absences are 3 or fewer."); 
        } else { 
            System.out.println("Reason: The student does not meet the passing requirements."); 
        } 
    } 
} 