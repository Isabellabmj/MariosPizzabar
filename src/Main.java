


public class Main
{
    public static void main(String[] args) {

        new Main().run();
    }

    private void run()
    {
        Menukort menukortInstans = new Menukort();
        menukortInstans.createMenukort();
        menukortInstans.writePizzaMenuToFile();
    }
}
