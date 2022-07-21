public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.divide.apply(a, b); // Мы не можем выполнить деление, так как,
        // исходя из вычитания в предыдущем примере, b == 0, а делить на 0 нельзя.
        // Я изменила код, добавив try/catch.
        // В подсказке к этому дз говорится о том, что необходимо обратить внимание на
        // поиск абсолюта, но я не вижу, чтобы операция выполнялась некорректно.
        // Тернарный оператор выдаёт верный ответ.
        calc.println.accept(c);
    }
}
