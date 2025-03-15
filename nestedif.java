public class nestedif {
    public static void main(String[] args) {
        int x=10;
        int y=20;

        if(x>15){
            if(y>15){
                System.out.println(" AND condition TRUE ");
            }
            else{
                System.out.println(" AND condition FALSE ");
            }
        }
        else{
            System.out.println(" AND condition FALSE ");
        }
        if(x>15 || y>15){
            System.out.println("OR condition TRUE ");
        }
        else{
            System.out.println("OR condition FALSE ");
        }
    }
}
