import java.util.Scanner;

public class TollSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter vehicle type (Car(1)/Truck(2)): ");
            int vehicleType = sc.nextInt();
            System.out.println("Does the vehicle have an RFID pass? (yes(1)/no(0)): ");
            int hasRFID = sc.nextInt();
            if(vehicleType==1 && hasRFID==1){
                System.out.println("Toll fee for vehicle " + (i + 1) + ": $90");
            }
            if(vehicleType==1 && hasRFID==0){
                System.out.println("Toll fee for vehicle " + (i + 1) + ": $100");
            }
            if(vehicleType==2 && hasRFID==1){
                System.out.println("Toll fee for vehicle " + (i + 1) + ": $180");
            }
            if(vehicleType==2 && hasRFID==0){
                System.out.println("Toll fee for vehicle " + (i + 1) + ": $200");
            }
        }
    }
}