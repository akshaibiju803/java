public class storeprice {
    public static void main(String[] args) {
        System.out.println("Welcome to the store");
        int price[] = {28, 150, 220, 158, 8};
        String product[] = {"Milk", "Bread", "Butter", "Cheese", "Eggs"};
        for (int i = 1; i <= 5; i++) {
            System.out.println("Product: " + product[i-1] + " \n Price: " + price[i-1]);
        }
    }
}
