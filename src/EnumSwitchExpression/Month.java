package EnumSwitchExpression;

public enum Month {

    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    JUNE(5);

    private final int monthNum;
    Month (int month){
        this.monthNum = month;
    }

    public int getMonthNum(){
        return monthNum;
    }

    public int numberOfDays(){
        return switch (this) {
            case JANUARY, MARCH -> 31;
            case FEBRUARY -> 28;
            case APRIL, JUNE -> 30;

        };
    }
    @Override
    public String toString() {
        return "EnumsAula1.Month: " + name();
    }
}
