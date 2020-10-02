package day11;

public class Warehouse {
    private int countOrders;
    private int balance;

    public int getCountOrders() {
        return countOrders;
    }

    public void setCountOrders(int countOrders) {
        this.countOrders = countOrders;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Количество собранных заказов: " + countOrders + ", доход от доставленных заказов: " + balance;
    }
}
