package Exercises.EnumOperations;

public enum Operationn implements Operations {

    SUM('+'){
        @Override
        public double calculateI(double a, double b) {
        return a + b;
      }
    },
    SUBTRACT('-'){
        @Override
        public double calculateI(double a, double b) {
            return a - b;
        }
    },
    MULTIPLY('X'){
        @Override
        public double calculateI(double a, double b) {
            return a * b;
        }
    },
    DIVIDE('/'){
        @Override
        public double calculateI(double a, double b) {
            return a / b;
        }
    };

    private char simbol;
    Operationn(char simbol){
        this.simbol = simbol;
    }



    public double calculate(double a, double b) {
        return calculateI(a, b);
    }

    @Override
    public String toString() {
        return "Operationn{" +
                "simbol=" + simbol +
                '}';
    }
}
