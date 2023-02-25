package EnumsAula1;

public class EnumApp1 {

    private enum Month{
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE
    }
    public static void main(String[] args) {

        Month a = Month.JANUARY;
        Month b = null;


        System.out.println(a);

    }

}
