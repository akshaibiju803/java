import java.util.Scanner;
public class calcgrade {
    void calculategrade(int marks) {
        if (marks >= 90) {
            System.out.println("Grade A");
        }
        else if (marks >= 75) {
            System.out.println("Grade B");
        }
        else if (marks >= 50) {
            System.out.println("Grade C");
        } 
        else {
            System.out.println("Grade F");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Enter marks: ");
            int marks = sc.nextInt();
            calcgrade c1 = new calcgrade();
            c1.calculategrade(marks);
        }
        
        
    }
}
