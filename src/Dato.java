public class Dato
{
    private int datoen; // Heltal - Farmat YYYYMMMDD - klassens eneste attribut/data

    static final String[] dag = {"mandag","tirsdag","onsdag","torsdag","fredag","lørdag","søndag"};

    /* Konstruktører - skaber objekter/instanser af klassen
     * Contructors     hedder det samme som klassen
     *                 har ingen returværdier; altid public
     */
    public Dato() //Default constructor - skaber et tomt objekt
    {}

    public Dato(int enDato) //Al. constructor m. parametre
    {
        datoen = enDato; //Parameteren tildeler attributen en værdi

    }

    public Dato(int enDag, int enMaaned, int etAar)
    {
        datoen = etAar * 10000 + enMaaned * 100 + enDag; // fx 20010000+900+11=20010811
    }

    /*
     * Klassens metoder - aktuel kun én
     * udgør sammen med konstuktøerne objektets værdi
     */
    public int getDatoen() //int angiver metodens returværdi
    {
        return datoen; //værdien af attributten datoen (et heltal) returners
    }

    public int getAar()
    {
        return datoen / 10000;
    }
    public int getMaaned()
    {
        int maaned = 0;
        maaned = datoen / 100;
        maaned = maaned % 100;
        return maaned;
    }

    public int getMaanedAShort()
    {
        return (datoen / 100) % 100;
    }

    public int getDag()
    {
        return (datoen % 100);
    }

    public int getKvartal()
    {
        return (getMaaned() + 2) / 3;
    }

    // "og" skrives && , eller skrives || , ikke skrives som !


    public boolean skudAar()

    {
        int aar = getAar();

        if (aar % 4 !=0)
        {
            return false;
        }
        else
        if (aar % 100 == 0 && aar % 400 !=0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public boolean valid()

    {
        int datoen = getDatoen();

        if (datoen < 17000301)

            return false;

        else
        if (getDag() < 1 || getDag() > 31)

            return false;

        else
        if (getMaaned() < 1 || getMaaned() > 12)

            return false;

        else
        if ((getMaaned() == 4 || getMaaned() == 6 || getMaaned() == 9 || getMaaned() == 11) && getDag() > 30)
            return false;


        else
        if (skudAar() && getMaaned() == 2 && getDag() > 29)
            return false;
        if (!skudAar() && getMaaned() == 2 && getDag() < 28)
            return false;
        return true;



    }
    //precondition: datoen er valid
    public int dagIAar()

    {
        int skudDag = 0;
        if (skudAar())
            skudDag = 1;

        if (getMaaned() == 1)
            return getDag();

        if (getMaaned() == 2)
            return 31 + getDag();

        if (getMaaned() == 3)
            return 59 + getDag() + skudDag;

        if (getMaaned() == 4)
            return 90 + getDag() + skudDag;

        if (getMaaned() == 5)
            return 120 + getDag() + skudDag;

        if (getMaaned() == 6)
            return 151 + getDag() + skudDag;

        if (getMaaned() == 7)
            return 181 + getDag() + skudDag;

        if (getMaaned() == 8)
            return 212 + getDag() + skudDag;

        if (getMaaned() == 9)
            return 243 + getDag() + skudDag;

        if (getMaaned() == 10)
            return 273 + getDag() + skudDag;

        if (getMaaned() == 11)
            return 305 + getDag() + skudDag;


        return 334 + getDag() + skudDag;


    }

    public int dagIAarShort()
    {
        int skudDag = 0;
        if (skudAar() && getMaaned() > 2)
            skudDag = 1;

        int [] sumDage = {0,0,31,58,90,120,151,181,212,243,273,304,334};

        return getDag() + skudDag + sumDage[getMaaned()];


    }

    public int restDageIAr()
    {

        //Kontroller om det er skudår
        if (skudAar())
        {
            return 366 - dagIAar();
        }
        else
        {
            return 365 - dagIAar();
        }

    }

    public void setDatoPlusEn()
    {
        datoen++;
        while (!valid())
            datoen++;
    }

    public void setDatoMinusEn()
    {
        datoen--;
        while (!valid())
            datoen--;
    }

    public int forskelIDage(Dato enDato)
    {
        int antalDage = 0;

        Dato kopiDato = new Dato();
        kopiDato.datoen = datoen;

        if (kopiDato.datoen < enDato.datoen)
        {
            while (kopiDato.datoen != enDato.datoen)
            {
                kopiDato.setDatoPlusEn();
                antalDage++;
            }
        }
        else
        if (kopiDato.datoen > enDato.datoen)
        {
            while (kopiDato.datoen != enDato.datoen)
            {
                kopiDato.setDatoMinusEn();
                antalDage--;
            }
        }

        return antalDage;


    }

    public int ugeDag()
    {
        Dato udgDato = new Dato();
        udgDato.datoen = 17000301;

        return udgDato.forskelIDage (this) % 7+ 1;
    }

    public String ugeDagTekst()
    {
        return dag[ugeDag()-1];
    }
}
