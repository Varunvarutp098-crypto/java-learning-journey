import java.util.Locale;

public class strings {
    public static void main(String[] args){
        String message = "Hello world" + " !  !";
        System.out.println(message.startsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("H"));
        System.out.println(message.replace("!","$$"));
        System.out.println(message);
        System.out.println(message.toLowerCase(Locale.ROOT));
        System.out.println(message.toUpperCase());
        System.out.println("message" + " hello");
        System.out.println(message.trim());
    }

}
