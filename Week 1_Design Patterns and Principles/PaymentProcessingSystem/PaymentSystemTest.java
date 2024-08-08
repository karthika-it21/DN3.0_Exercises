public class PaymentSystemTest {
    public static void main(String[] args) {
        // Using PayPal
        PayPalPayment payPal = new PayPalPayment();
        PaymentProcessor payPalProcessor = new PayPalAdapter(payPal);
        payPalProcessor.processPayment(50.0);

        // Using Stripe
        StripePayment stripe = new StripePayment();
        PaymentProcessor stripeProcessor = new StripeAdapter(stripe);
        stripeProcessor.processPayment(75.0);

        // Using Square
        SquarePayment square = new SquarePayment();
        PaymentProcessor squareProcessor = new SquareAdapter(square);
        squareProcessor.processPayment(100.0);
    }
}
