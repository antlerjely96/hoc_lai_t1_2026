package factory;

import payment.Payment;

public abstract class PaymentFactory {
    public abstract Payment createPayment();
}
