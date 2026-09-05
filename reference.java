import java.awt.*;
public class reference{
    public static void main(String[] args){
        Point point1 = new Point(1,2);
        Point point2 = point1;
        point1.y = 4;
        point1.x = 45;
        Point point_varun = new Point(2,5);
        Point point_garuda = point_varun;
        point_varun.y = 67;
        System.out.println(point_garuda);
        System.out.println(point2);
    }
}