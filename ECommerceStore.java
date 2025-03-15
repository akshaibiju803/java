public class ECommerceStore {
    public static void main(String[] args) {
        int[] prices = {2000, 1500, 1800, 1200};
        boolean isPremiumMember = true;
        double totalPrice = calculateTotalPrice(prices, isPremiumMember);
        System.out.printf("The total price of items in the cart is: %f", totalPrice);
    }

    public static double calculateTotalPrice(int[] prices, boolean isPremiumMember) {
        double total = 0;
        for (int price : prices) {
            total += price;
        }
        if (isPremiumMember) {
            total *= 0.95;
        }
        if (total > 5000) {
            total *= 0.90;
        }
        return total;
    }
}
