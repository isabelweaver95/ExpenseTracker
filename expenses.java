import java.util.ArrayList;

public class expenses {
    private String name;
    private double amount;

    public expenses(String name, Double amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public String toString() {
        return name + ": " + amount;
    }

    public double setAmount() {
        return amount;
    }

    public String setName() {
        return name;
    }
}
