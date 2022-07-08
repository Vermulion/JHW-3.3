public class CreditPaymentService {
    public double calc(double debt, double period, double percent) {
        double result;
        result = debt * (percent / (100 * 12)) / (1 - Math.pow(1 + (percent / (100 * 12)), -(period * 12)));
        return result;
    }
}
