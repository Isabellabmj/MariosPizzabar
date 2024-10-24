
import java.util.ArrayList;

        public class Main {
            public static void main(String[] args) {
                // ArrayList med pizzamenuer
                ArrayList<String> pizzaMenu = new ArrayList<>();
                pizzaMenu.add(1, "Margherita");
                pizzaMenu.add(2, "Pepperoni");
                pizzaMenu.add(3, "Hawaiian");
                pizzaMenu.add(4, "BBQ Chicken");
                pizzaMenu.add(5,"Vegetarian");
                pizzaMenu.add(6,"Meat Lovers");
                pizzaMenu.add(7, "Four Cheese");
                pizzaMenu.add(8, "Buffalo Chicken");
                pizzaMenu.add(9, "Supreme");
                pizzaMenu.add(10, "Mexican");
                pizzaMenu.add(11, "Seafood Special");
                pizzaMenu.add(12,"Tuna and Sweetcorn");
                pizzaMenu.add(13,"Spicy Sausage");
                pizzaMenu.add(14,"Prosciutto and Rocket");
                pizzaMenu.add(15,"Mushroom and Truffle Oil");
                pizzaMenu.add(16,"Calzone");
                pizzaMenu.add(17,"Carbonara Pizza");
                pizzaMenu.add(18,"Pesto and Chicken");
                pizzaMenu.add(19,"Gorgonzola and Pear");
                pizzaMenu.add(20,"Salami and Olive");
                pizzaMenu.add(21,"Spinach and Ricotta");
                pizzaMenu.add(22,"Greek Pizza (Feta and Olives)");
                pizzaMenu.add(23,"Zucchini and Goat Cheese");
                pizzaMenu.add(24,"Egg and Bacon");
                pizzaMenu.add(25,"Shrimp and Pesto");
                pizzaMenu.add(26,"Tandoori Chicken");
                pizzaMenu.add(27,"Pastrami Pizza");
                pizzaMenu.add(28,"Bolognese Pizza");
                pizzaMenu.add(29,"Quattro Stagioni");
                pizzaMenu.add(30,"Lamb and Mint");

                // ArrayList med priser (tilsvarende rækkefølge)
                ArrayList<Double> pizzaPrices = new ArrayList<>();
                pizzaPrices.add(1,60.0);
                pizzaPrices.add(2,70.0);
                pizzaPrices.add(3,75.0);
                pizzaPrices.add(4,85.0);
                pizzaPrices.add(5,65.0);
                pizzaPrices.add(6,90.0);
                pizzaPrices.add(7,80.0);
                pizzaPrices.add(8,95.0);
                pizzaPrices.add(9,100.0);
                pizzaPrices.add(10,85.0);
                pizzaPrices.add(11,110.0);
                pizzaPrices.add(12,95.0);
                pizzaPrices.add(13,80.0);
                pizzaPrices.add(14,90.0);
                pizzaPrices.add(15,120.0);
                pizzaPrices.add(16,85.0);
                pizzaPrices.add(17,90.0);
                pizzaPrices.add(18,95.0);
                pizzaPrices.add(19,110.0);
                pizzaPrices.add(20,80.0);
                pizzaPrices.add(21,70.0);
                pizzaPrices.add(22,75.0);
                pizzaPrices.add(23,85.0);
                pizzaPrices.add(24,100.0);
                pizzaPrices.add(25,90.0);
                pizzaPrices.add(26,110.0);
                pizzaPrices.add(27,95.0);
                pizzaPrices.add(28,85.0);
                pizzaPrices.add(29,105.0);
                pizzaPrices.add(30,115.0);


                //Print menuen ud med dens pris
                for (int i = 0; i < pizzaMenu.size(); i++)
                {
                    System.out.println(pizzaMenu.get(2) + ": " + pizzaPrices.get(2) + " DKK");
                }

            }
        }
