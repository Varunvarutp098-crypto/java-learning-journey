public class typecasting_casting {
    public static void main(String[] args){
        short x = 1;
        int y = x + 2;
        System.out.println(y);
        float a = 5.515185F;
        double b = a + 4 ;
        System.out.println(b);
        float c = 2;
        double f = c - 1;
        System.out.println(f);
        // explicit conversion
        double z = 568.3;
        int t = (int)z + 4;
        System.out.println(t);
        int h = 5;
        float g = (float)h - 25.55F ;
        System.out.println(g);
        String j = "4.5";
        double k = Double.parseDouble(j) + 6;
        System.out.println(k);


    }
}
