public class CreditPaymentService {
    public double calculate(int months, int amount, double ratePerMonth) {
        double z = 1 + ratePerMonth;
        double exponent = Math.pow(z, months);
        double ratio = (ratePerMonth * exponent) / (exponent - 1);
        int payment = (int) (ratio * amount);
        return payment;
    }
}
