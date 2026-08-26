public class logical_operators {
    public static void main(String[] args){
        int temperature = 22;
        boolean iswarm = temperature > 58 && temperature < 30 ;
        System.out.println(iswarm);

        long moremarks = 100;
        boolean morks = moremarks > 52 || moremarks < 25;
        System.out.println(morks);

        boolean hashighIncome = false;
        boolean hashighcrdit = true;
        boolean hascriminalrecord = false;
        boolean iseligible = (hashighcrdit || hashighIncome) && !hascriminalrecord;
        System.out.println(iseligible);
    }
}
