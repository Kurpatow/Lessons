package ru.itmo.lessons.paterns.strategy;

public class Account {
    private Payment paymentMethod;
    private Order currentOrder;

    public Account(Payment paymentMethod) {this.paymentMethod = paymentMethod;}

    public void setPaymentMethod(Payment paymentMethod) {this.paymentMethod = paymentMethod;}

    public void setOrder(Order order) {this.currentOrder = order;}

    public void setCurrentOrder() {paymentMethod.pay(currentOrder.getSum());}
}
