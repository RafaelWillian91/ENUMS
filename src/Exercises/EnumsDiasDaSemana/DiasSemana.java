package Exercises.EnumsDiasDaSemana;

public enum DiasSemana {

    SEGUNDA(),
    TERCA(),
    QUARTA(),
    QUINTA(),
    SEXTA(),
    SABADO(),
    DOMINGO();

    private static DiasSemana [] days = values();
    private static int i = 0;
    public DiasSemana next(){

        if(i >= (values().length -1)){
            i = -1;
        }

        return days[++i];
    }


}
