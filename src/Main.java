public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int prime = calc.plus.apply(8,9);
        int second = calc.multiply.apply(12,38);

        calc.println.accept(second);

        int isError = calc.abc.apply(-15);
        calc.println.accept(isError);
        calc.println.accept(prime);

    }
}