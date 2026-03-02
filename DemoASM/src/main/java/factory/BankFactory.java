package factory;

import payment.Payment;

public class BankFactory extends PaymentFactory{
    @Override
    public Payment createPayment() {
        return null;
    }
}
