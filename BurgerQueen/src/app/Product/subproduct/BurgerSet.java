package app.product.subproduct;

import app.product.Product;

public class BurgerSet extends Product {
    private Hamburger hambuger;
    private Side side;
    private Drink drink;

    public BurgerSet(String name, int price, int kcal, Hamburger hambuger, Side side, Drink drink) {
        super(name, price, kcal);
        this.hambuger = hambuger;
        this.side = side;
        this.drink = drink;
    }

    public Hamburger getHambuger() {
        return hambuger;
    }

    public Side getSide() {
        return side;
    }

    public Drink getDrink() {
        return drink;
    }
}
