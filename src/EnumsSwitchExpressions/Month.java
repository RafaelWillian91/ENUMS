package EnumsSwitchExpressions;

public enum Month {

    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6);

    private int month;
    Month(int month){
        this.month = month * 2;
    }




}
