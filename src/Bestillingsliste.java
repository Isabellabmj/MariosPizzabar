import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;

public class Bestillingsliste
{

    public Bestillingsliste()
    {}

    private ArrayList<Ordre> bestillingsListe = new ArrayList<>();
    private int currentOrderNr = 1;

    public void addOrderToList(Ordre ordre)
    {
        bestillingsListe.add(ordre);
        currentOrderNr++;
        writeBestillingsliste();
    }

    public void printBestillingsListe()
    {
        for (int i = 0; i < bestillingsListe.size(); i++)
        {
            Ordre ordre = bestillingsListe.get(i);
            System.out.println(ordre);
        }
    }

    public int getCurrentOrderNr()
    {
        return currentOrderNr;
    }

    public void removeOrdreByNumber(int ordreNumber) {
        for (int i = 0; i < bestillingsListe.size(); i++) {
            Ordre o = bestillingsListe.get(i);
            if (o.getOrdreNr() == ordreNumber) {
                bestillingsListe.remove(i);
                writeBestillingsliste(); // Update the file after removal
                break; // Exit loop after finding and removing the order
            }
        }
    }

    public void writeBestillingsliste() {
        File bestillingsliste = new File("C:/Users/Isabella/OneDrive/IJ/MariosPizzabar/src/Bestillingsliste.txt");

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH.mm");
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yy");

        try (FileWriter writer = new FileWriter(bestillingsliste, false))
        {
            for (int i = 0; i < bestillingsListe.size(); i++) {
                Ordre o = bestillingsListe.get(i);
                Pizza pizza = o.getPizzaObjekt();

                writer.append(String.format("ORDRE:\n" + // \n er for at skifte linje
                                " - ordre Number: %d\n" +
                                " - bestillings Tid: %s\n" +
                                " - bestillings Dato: %s\n" +

                                " - Pizza: %s, Price: %d, Nr: %d\n",

                        o.getOrdreNr(),
                        o.getBestillingsTid().format(timeFormatter),
                        o.getBestillingsDato().format(dateFormatter),

                        pizza.getPizzaName(), pizza.getPizzaPrice(), pizza.getPizzaNumber()));

                writer.append(System.lineSeparator());


                //System.out.println(o.getPizzaObjekt() + ", " + o.getBestillingsTid() + ", " + o.getOrdreNr());
            }

        } catch (IOException e)
        {
            e.printStackTrace();
        }

    }


}
