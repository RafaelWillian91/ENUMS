package EnumsStaticImports;

public class Car {

    enum Logotipo{
        BMW, CHEVROLET, FIAT;
    }

    private final Logotipo logotipo;
    public Car(Logotipo logotipo){
        this.logotipo = logotipo;

    }

    public Logotipo getLogotipo() {
        return logotipo;
    }
}
