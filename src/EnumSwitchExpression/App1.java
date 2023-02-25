package EnumSwitchExpression;

public class App1 {

    public static void main(String[] args) {

       Month m =  Month.JUNE;

        System.out.println(m);
        System.out.println(m.getMonthNum());

        System.out.println(Month.APRIL.numberOfDays());
        System.out.println(Month.JANUARY.numberOfDays());

    }

}
