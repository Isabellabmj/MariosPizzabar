import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;


public class Main
{

    Scanner scanner = new Scanner(System.in); //Skaber en scanner instans

    public static void main(String[] args)
    {
        Main nonStaticMain = new Main(); //opretter en instans af main klassen
        nonStaticMain.run();
    }

    private void run()
    {
        //MENUKORTET:

        Menukort menukortInstans = new Menukort(); // instans
        menukortInstans.createMenuKort();
        menukortInstans.writePizzaMenuToFile();


        //BESTILLINGSLISTE:

        Bestillingsliste bestillingsliste = new Bestillingsliste(); //instans

        while (true)
        {
            System.out.println("Choose a pizza (or type 'exit' to finish, or 'remove' to remove an order)");

            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit"))
            {
                break; // Exit the loop if user types 'exit'

            } else if (input.equalsIgnoreCase("remove"))
            {
                System.out.println("Enter the order number to remove:");
                int ordreToRemove;
                try
                {
                    ordreToRemove = Integer.parseInt(scanner.nextLine());
                    bestillingsliste.removeOrdreByNumber(ordreToRemove);
                    System.out.println("Order number " + ordreToRemove + " has been removed.");
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter a valid order number.");
                }
                continue; // Går til næste iteration af loopet
            }

            // Handle pizza selection
            try
            {
                int pizzaIndex = Integer.parseInt(input) - 1; // Parse the input as an integer

                // Check if the index is valid
                if (pizzaIndex < 0 || pizzaIndex >= menukortInstans.getPizzaMenuList().size())
                {
                    System.out.println("Invalid pizza number. Please choose a valid number.");
                    continue; // Skip to the next iteration
                }

                Pizza selectedPizza = menukortInstans.getPizzaMenuList().get(pizzaIndex);

                Ordre ordre = new Ordre(bestillingsliste.getCurrentOrderNr(), LocalDateTime.now(), LocalDate.now(), selectedPizza);
                bestillingsliste.addOrderToList(ordre);

                // Print the order details after adding the new one
                System.out.println("Order added: " + ordre);
            } catch (NumberFormatException e)
            {
                System.out.println("Invalid input! Please enter a valid pizza number or 'exit' to finish.");
            }



        }
    }
}