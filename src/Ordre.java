import java.util.Random;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Ordre
{
    private int ordreNr = 0;
    private LocalDate bestillingsDato;
    private LocalDateTime bestillingsTid;
    private Pizza pizzaObjekt;
    private int antal;
    private boolean paid;

    private Random random = new Random();

   /* private static String[] fornavn = {"Asger","Mikkel","Ole","Per","Peter","Fie","Frida","Jane","Jenny","Lis"};
    private static String[] efternavn = {"Jels","Lind","Haupt","Holm","Jensen","Als","Hardis","Friis","Kaas","Biehl"}; */



    public Ordre()
    {}



    public Ordre(int oNummer, LocalDateTime oTid, LocalDate oDato, Pizza pizzaObjekt)
    {
        this.ordreNr = oNummer;
        this. bestillingsTid = oTid;
        this.bestillingsDato = oDato;
        this.pizzaObjekt = pizzaObjekt;
        this.paid = false;

    }

    public void markAsPaid()
    {
        this.paid = true;
    }

    public boolean isPaid()
    {
        return this.paid;
    }

    public int getOrdreNr()
    {
        return ordreNr;
    }

    public LocalDateTime getBestillingsTid()
    {
        return bestillingsTid;
    }

    public LocalDate getBestillingsDato()
    {
        return bestillingsDato;
    }

    public int getAntal()
    {
        return antal;
    }

    public Pizza getPizzaObjekt()
    {
        return pizzaObjekt;
    }


    @Override
    public String toString() {
        return "ORDRE:\n" +
                " - Ordre Nr: " + ordreNr + "\n" +
                " - Bestillings Tidspunkt: " + bestillingsTid + "\n" +
                " - Bestillings Dato: " + bestillingsDato + "\n" +
                " - Pizza: " + pizzaObjekt + "\n";

    }



}
