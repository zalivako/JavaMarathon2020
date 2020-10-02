package day11;

public class Picker implements Worker {
    private int salary;
    Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        warehouse.setCountOrders(warehouse.getCountOrders() + 1);
        if ((warehouse.getCountOrders() % 1500) == 0) {
            bonus();
        } else {
            salary += 80;
        }
    }

    @Override
    public void bonus() {
        salary *= 3;
    }
}
