public class ternary_operator {
    public static void main(String[] args){
        int income = 120_0;
        String className = income > 100_00 ? "First class" : "second class" ;          // insted of else we can write as "String classname = "second class" and then if statement only
        //if (income > 100_00 ? "First" : "second")
          //  className = "first class";
        //else
          //  className ="second class";

        System.out.println(className);
    }
}
