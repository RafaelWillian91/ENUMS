package EnumsAula1;

public enum Month {

        JANUARY(1),
        FEBRUARY(2),
        MARCH(3),
         APRIL(4),
         MAY(5),
         JUNE(6);


        private final int monthNum;


    Month(int monthNum){
        this.monthNum = monthNum;
    }


    public int getMonthNum() {
        return monthNum;
    }


}
