public static int balance = 1000;
class currentAcc {
    void withdraw() {
        if(balance<500){
            System.out.println("Insufficient balance");
        }
        else{
            System.out.println("Withdrawal successful");
        }
    }
    void deposit() {
        System.out.println("Deposit successful");
    }
}
class savingsAcc {
    void withdraw() {
        if(balance<1000){
            System.out.println("50 rupees charged");
        }
        else{
            System.out.println("Withdrawal successful");
        }
    }
    void deposit() {
        System.out.println("Deposit successful");
    }
}
public class accounts {
    public static void main(String[] args) {
        currentAcc c1 = new currentAcc();
        savingsAcc s1 = new savingsAcc();
    }
}