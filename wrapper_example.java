public class wrapper_example {
    public static void main(String[] args){
        int f = 10;
        int g = 30 ;

        Integer a = 34;
        Integer b = 35;

        swap(a, b);

        System.out.println(a+ " " +b);

        final int bonus = 2;


         final A varun = new A("varun garuda");// always sholud be in public static void main
        varun.name = "only varun";
         //  varun = new A("new only");  we cant do like these // when a non primitive is final you cannot ressign it;

        A obj;

        for (int i = 0; i < 100000; i++){   //here 10000 object memory created and deleted bcz we cant use it
            obj = new  A("random name ");
        }

    }
    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }




}

class A {
    final int number = 23;
    String name;

    public A(String name){
        System.out.println("object created");
        this.name = name;
    }

    //@Override
    //protected void finalize() throws Throwable {
      //  System.out.println("object is destroyed");
    }

