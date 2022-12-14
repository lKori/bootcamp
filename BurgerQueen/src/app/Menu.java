package app;

import app.product.Product;
import app.product.subproduct.Drink;
import app.product.subproduct.Hamburger;
import app.product.subproduct.Side;

public class Menu {
    private Product[] products;

    public Menu(Product[] products) {
        this.products = products;
    }

    public void printMenu() {
        System.out.println("[ð»]ë©ë´");
        System.out.println("-".repeat(60));

        System.out.println("ð íë²ê±°");
        // íë²ê±° ì¶ë ¥
        printHamburgers(true);
        System.out.println();

        System.out.println("ð ì¬ì´ë");
        // ì¬ì´ë ì¶ë ¥
        printSides(true);
        System.out.println();

        System.out.println("ð¥¤ìë£");
        // ìë£ ì¶ë ¥
        printDrinks(true);
        System.out.println();

        System.out.println();
        System.out.println("(0) ì¥ë°êµ¬ë");
        System.out.println("(+) ì£¼ë¬¸íê¸°");
        System.out.println("-".repeat(60));
        System.out.println("[ð¢] ë©ë´ë¥¼ ì íí´ì£¼ì¸ì : ");
    }

    protected void printDrinks(boolean printPrice) {
        for(Product product : products) {
            if(product instanceof Drink) {
                printEachMenu(product, printPrice);
            }
        }
        System.out.println();
    }

    protected void printSides(boolean printPrice) {
        for(Product product : products) {
            if(product instanceof Side) {
                printEachMenu(product, printPrice);
            }
        }
        System.out.println();
    }

    private void printHamburgers(boolean printPrice) {
        for(Product product : products) {
            if(product instanceof Hamburger) {
                printEachMenu(product, printPrice);
            }
        }
        System.out.println();
    }

    private static void printEachMenu(Product product, boolean printPrice) {
        if(printPrice) {
            System.out.printf("    (%d) %s %5dKcal %5dì\n", +
                    product.getId(), product.getName(), product.getKcal(), product.getPrice());
        } else {
            System.out.printf("    (%d) %s %5dKcal\n", +
                    product.getId(), product.getName(), product.getKcal());
        }
    }
}
