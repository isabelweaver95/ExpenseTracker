import java.util.ArrayList;  
import java.util.Date;

public class dailyExpenses {
    private ArrayList<expenses> expenses;
    private Date date;

    public dailyExpenses() {
        this.date = new Date();
        expenses = new ArrayList<expenses>();
    }

    public void addExpense(expenses expense) {
        expenses.add(expense);
    }

    public ArrayList<expenses> getExpenses() {
        return expenses;
    }

    public void displayExpenses() {

        System.out.println(); 
        for (expenses expense : expenses) {
            System.out.println(expense);
        }
    }

    public Date getDate() {
        return date;
    }
}