package Exercises.EnumOperations;

public class App {

    public static void main(String[] args) {

        Operationn a = Operationn.SUM;
        System.out.println(Operationn.SUM);
        System.out.println(a.calculate(10, 20));

        Operationn b = Operationn.DIVIDE;
        System.out.println(b.calculate(20,2));

        Operationn c = Operationn.MULTIPLY;
        System.out.println(c.calculate(40, 5));

        System.out.println(Operationn.SUBTRACT.calculateI(30, 30));


    }




}
