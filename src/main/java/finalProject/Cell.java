package finalProject;

public class Cell {
    public static final String SHIP = "\uD83D\uDEA2";
    public static final String WHITE = "\uD83D\uDFE8";
    public static final String AREA = "\uD83D\uDFE5";
    public static final String HIT_THE_TARGET = "❌";
    public static final String OFF_THE_TARGET = "⭕";

    private String symbol;
    private boolean isShip;
    private boolean isAlive;
    private boolean isArea;

    public Cell(String symbol) {
        this.symbol = symbol;
        isShip = false;
        isAlive = true;
        isArea = false;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public boolean isShip() {
        return isShip;
    }

    public void setShip(boolean ship) {
        isShip = ship;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public boolean isArea() {
        return isArea;
    }

    public void setArea(boolean area) {
        isArea = area;
    }

    @Override
    public String toString() {
        return symbol;
    }


}
