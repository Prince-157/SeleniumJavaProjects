package temp;

import java.util.Date;

public class GenerateEmail {

    public static void main(String[] args) {
        // Get the current date and time
        Date date = new Date();

        // Convert the date to a string
        String dateString = date.toString();

        // Remove spaces and colons from the date string
        String noSpaceDateString = dateString.replaceAll("\\s", "");
        String noSpaceAndNoColonsDateString = noSpaceDateString.replace(":", "");

        // Generate an email address with a timestamp
        String emailWithTimeStamp = noSpaceAndNoColonsDateString + "@gmail.com";

        // Print the generated email address
        System.out.println(emailWithTimeStamp);
    }
}
