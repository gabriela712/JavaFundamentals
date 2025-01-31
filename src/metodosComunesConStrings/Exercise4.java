package metodosComunesConStrings;

public class Exercise4 {
    public static void main(String[] args) {

        String firstname = "Sandy";
        String lastName = "Jones";
        String movieTitle = "The Source Code";
        int numberOfTicket = 8;
        double pricePerTicket = 10.57;

        double totalPrice = numberOfTicket * pricePerTicket;

        String fullName = firstname + lastName;
        String userName = fullName.toLowerCase();

        String movieName = movieTitle.toUpperCase();


        // TODO 5: Write multiple print statements to match your output as per the Final Expected Output
        System.out.println("Congratulations!! You have successfull booked the tickets\n");
        System.out.println("Username: " + userName);
        System.out.println("Movie: " + movieName);
        System.out.println("Number of Tickets: " + numberOfTicket);
        System.out.println("Price per ticket: $" + pricePerTicket);
        System.out.println("Total price of " + numberOfTicket + "tickets: $" + totalPrice + "\n");
        System.out.println("Thank you for choosing us for booking your movie tickets");
        System.out.println("Enjoy your movie!!!");
    }
}

