import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Save {
    private String fileName;

    public Save(String fileName) {
        this.fileName = fileName;
    }

    public void saveToFile(dailyExpenses expenses) {

        System.out.println(); 
        System.out.println("Saving to " + fileName);

        System.out.println(); 

        // Save to file
        String filePath = fileName + ".txt";

        try (PrintWriter writer = new PrintWriter(filePath)) {
            ArrayList<expenses> expenses2 = expenses.getExpenses();

            writer.println("Date: " + expenses.getDate());
            for (expenses expense : expenses2) {
                writer.println("Name: " + expense.getName() + ", Amount: " + expense.getAmount());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadFromFile(dailyExpenses expenses) {

        System.out.println(); 
        System.out.println("Loading from " + fileName);

        System.out.println(); 

        // Load from file
        String filePath = fileName + ".txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {  // Read each line
                System.out.println(line);  // Print the line to the console
            }
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception if an I/O error occurs
        }
    }
}