import java.util.Scanner;
class Employee {
    void calculateSalary(int salary,String job) {
        if(job.equals("manager")){
            System.out.println("Salary: "+salary*2);
        }
        else if(job.equals("developer")){
            System.out.println("Salary: "+salary*1.5);
        }
        else{
            System.out.println("Salary  : "+salary);
    }
}
}
public class calcsalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner j = new Scanner(System.in);
        Employee e1 = new Employee();
        for(int i=0;i<3;i++){
            System.out.println("Enter salary: ");
            int salary = sc.nextInt();
            System.out.println("Enter job: ");
            String job = j.nextLine();
            e1.calculateSalary(salary,job);
        }
    }
}