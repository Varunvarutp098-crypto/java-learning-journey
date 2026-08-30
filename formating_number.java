import java.text.NumberFormat;

public class formating_number {
        public static void main(String[] args){
           NumberFormat currency =  NumberFormat.getCurrencyInstance();
            String result = currency.format(1445.55);
            System.out.println(result);
            NumberFormat percent =  NumberFormat.getPercentInstance();
            String results = percent.format(0.02);
            System.out.println(results);
                // these alos right
            String res = NumberFormat.getNumberInstance().format(255);
            System.out.println(res);
        }

}
