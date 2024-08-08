public class PaymentSystemTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setStrategy(new CreditCardPayment());
        context.payAmount(250.75);

        context.setStrategy(new PayPalPayment());
        context.payAmount(120.50);
    }
}
