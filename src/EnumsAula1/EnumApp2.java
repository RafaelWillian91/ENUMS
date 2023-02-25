package EnumsAula1;

public class EnumApp2 {

    public static void main(String[] args) {

        Month a = Month.JUNE;

        System.out.println(a.getMonthNum());
        System.out.println(a.name());

        System.out.println(a.ordinal());
        System.out.println(a.name());

        Month value = Month.valueOf("APRIL");
        System.out.println("Value => " + value + " getMonthNum()=> " + value.getMonthNum());
        System.out.println(value.getMonthNum());

        Month month = Enum.valueOf(Month.class, "MARCH");
        System.out.println(month.getMonthNum());


        for (Month M : Month.values()){
            System.out.println(M.name());
        }
    }
}
