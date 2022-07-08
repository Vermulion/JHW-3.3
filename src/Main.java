public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        String payment = "Ваш ежемесячный платеж составит: ";

        System.out.println("Кредит сроком на 1 год");


        System.out.printf("Ваш ежемесячный платеж составит: %.0f", (double) service.calc(1_000_000, 1, 9.99));
        System.out.println();
        System.out.println("Кредит сроком на 2 года");
        System.out.printf("Ваш ежемесячный платеж составит: %.0f", (double) service.calc(1_000_000, 2, 9.99));
        System.out.println();
        System.out.println("Кредит сроком на 3 года");
        System.out.printf("Ваш ежемесячный платеж составит: %.0f", (double) service.calc(1_000_000, 3, 9.99));

    }
}
