import java.util.Scanner;

public class ExpenceTracker {
    public static void main(String[] args) {
        System.out.println("Welcome to Expence Tracker");
        System.out.println("----------------------------");
        System.out.println("We Will help you keep track of your daily expenses");

        dailyExpenses dailyExpenses = new dailyExpenses();
        expenses expenses;
        boolean flag = true;

        while (flag) {
            System.out.println(); 
            System.out.println("Enter your choice");
            System.out.println("Enter 1 to add an expense");
            System.out.println("Enter 2 to display expenses");
            System.out.println("Enter 3 save expenses");
            System.out.println("Enter 4 to view previous saved expenses");
            System.out.println("Enter 5 to exit");

            Scanner sc = new Scanner(System.in);
            String choice = sc.nextLine();

            int choice2 = Integer.parseInt(choice);

            switch (choice2) {
                case 1:
                    System.out.println("Enter the name of the expense");
                    String name = sc.nextLine();
                    System.out.println("Enter the amount of the expense");
                    double amount = sc.nextDouble();
                    expenses = new expenses(name, amount);
                    dailyExpenses.addExpense(expenses);
                    break;
                case 2:
                    dailyExpenses.displayExpenses();
                    break;
                case 3:
                    System.out.println("Enter file name");
                    String fileName = sc.next();
                    Save save = new Save(fileName);
                    save.saveToFile(dailyExpenses);
                    break;
                case 4:
                    System.out.println("Enter file name");
                    String fileName2 = sc.next();
                    Save save2 = new Save(fileName2);
                    save2.loadFromFile(dailyExpenses);
                    break;
                case 5:
                    flag = false;
                    break;
            }
        }
        
    }
}
