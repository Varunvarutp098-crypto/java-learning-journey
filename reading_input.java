import java.util.Scanner;

public class reading_input {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("A: " + " How old are you ");
        String age = scanner.nextLine().trim();
        System.out.println("B: " + "i am " + age + " old men " + "but also more energetic");

    }
}
