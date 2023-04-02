import java.time.LocalDate; // import the LocalDate class
import java.time.LocalDateTime;
import java.time.LocalTime; // import the LocalTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

          //........................................................................
        LocalDate myToDay = LocalDate.now(); // Create a date object
          System.out.println("Today is : " + myToDay); // Display the current date
          System.out.println();

          LocalTime myTime = LocalTime.now();
          System.out.println("Current Time : " + myTime);
          System.out.println();
          //......................................................................


          LocalDateTime myDataTime = LocalDateTime.now();
               System.out.println("Current Data and Time : " + myDataTime);
               System.out.println();

               System.out.println("Before formatting: " + myDataTime); // берем текущую дату и время
          DateTimeFormatter myDatatTimeFormatted = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); // задаем новый формат

          String formattedDate = myDataTime.format(myDatatTimeFormatted); // передаем формат в метод
               System.out.println("After formatting: " + formattedDate); // напечатали новую строку с отформатированной датой
                                                                // и временем
    }
}