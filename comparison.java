public class comparison {
    public static void main(String[] args) {
        int num = 22;
        int num2 = 22;
        System.out.println("  for integers  ");
        System.out.println(num == num2);
        System.out.println(num != num2);
        System.out.println(num > num2);
        System.out.println(num < num2);
        System.out.println(num >= num2);
        System.out.println(num <= num2);

        System.out.println("  for strings  ");
        String str = "hello";
        String str2 = "Hello";
        System.out.println(str == str2);
        System.out.println(str != str2);
    }
}
