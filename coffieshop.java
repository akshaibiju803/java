import java.util.Scanner;

public class coffieshop {
    public static void main(String[] args) {
        int choice;
        System.out.println("Welcome to the coffee shop");
        System.out.println("Select your coffee");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("You have selected Espresso");
                System.out.println("Price: 150");
                break;
            case 2:
                System.out.println("You have selected Cappuccino");
                System.out.println("Price: 200");
                break;
            case 3:
                System.out.println("You have selected Latte");
                System.out.println("Price: 180");
                break;
            case 4:
                System.out.println("You have selected Mocha");
                System.out.println("Price: 190");
                break;
            case 5:
                System.out.println("You have selected Macchiato");
                System.out.println("Price: 210");
                break;
            default:
                System.out.println("Invalid choice");
        }
}
}