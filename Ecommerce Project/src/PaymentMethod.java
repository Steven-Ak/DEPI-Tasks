public interface PaymentMethod {
    void pay(double price);
}
//////// Strategy Pattern to handle many behaviours
// Steven Akram
    class CreditCardPayment implements PaymentMethod
    {
        @Override
        public void pay(double price)
        {
            System.out.println(price + " Egp is paid using credit card");
        }
    }

    class CashPayment implements PaymentMethod
    {
        @Override
        public void pay(double price) {
            System.out.println(price + " Egp is paid in cash");
        }
    }

    class PayPalPayment implements PaymentMethod
    {

        @Override
        public void pay(double price) {
            System.out.println(price + " Egp is paid through paypal");
        }
    }

    class PaymentProcessor
    {
        private PaymentMethod paymentMethod;

        public PaymentProcessor(PaymentMethod paymentMethod)
        {
            this.paymentMethod = paymentMethod;
        }

        public void processPayment(double price)
        {
            paymentMethod.pay(price);
        }
    }