
public class billingsystem {
    public static void main(String[] args) {
        System.out.println("Welcome to the billing system");
        
        for (int i = 1; i <= 5; i++) {
            int invoiceNumber = 10001;
            invoiceNumber=invoiceNumber+i;
            System.out.println("Invoice Number for Customer " + i + ": " + invoiceNumber);
        }
    }
}

