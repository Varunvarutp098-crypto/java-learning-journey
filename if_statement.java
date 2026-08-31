public class if_statement {
    public static void main(String[] args) {
        int temp = 29;
        if (temp > 30) {
            System.out.println("it's a hot day");
            System.out.println("Drink more water");
        }
        else if (temp > 26 && temp <= 28) {
            System.out.println("Beautifull day");
        }
        else {
            System.out.println("cold day");
        }
    }
}