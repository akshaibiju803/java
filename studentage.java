class age{
    public void printAge() {
        int age = 18;
        System.out.println("Age is: " + age);
    }
}

public class studentage {
    public static void main(String[] args) {
        age obj = new age();
        obj.printAge();
    }
    
}
