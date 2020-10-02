package day11;

public class Courier implements Worker {
    private int salary;
    Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        warehouse.setBalance(warehouse.getBalance() + 1000);
        if ((warehouse.getBalance() % 1_000_000) == 0) {
            bonus();
        } else {
            salary += 100;
        }
    }

    @Override
    public void bonus() {
        salary *= 2;
    }
}
