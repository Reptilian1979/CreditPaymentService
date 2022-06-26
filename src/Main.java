public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        {
            int years = 1;
            int months = years * 12;
            double rate = 9.99;
            double ratePerMonth = rate / 12 / 100;
            int amount = 1_000_000;
            int payment;
            payment = (int) service.calculate(months, amount, ratePerMonth);
            int overpayment = (payment * months) - amount;
            System.out.println("Ежемесячный платеж = " + payment + " руб.;");
            System.out.println("Переплата за весь срок действия кредита = " + overpayment + " руб.");
        }
    }
}