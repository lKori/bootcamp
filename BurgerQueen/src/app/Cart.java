package app;

import app.Product.Product;
import app.Product.ProductRepository;
import app.Product.subproduct.BurgerSet;
import app.Product.subproduct.Drink;
import app.Product.subproduct.Hamburger;
import app.Product.subproduct.Side;

import java.util.Scanner;

public class Cart {
    private ProductRepository productRepository;
    private Product[] items = new Product[0];
    private Scanner s = new Scanner(System.in);

    public Cart(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void printCart() {
        System.out.println("🧺 장바구니");
        System.out.println("-".repeat(60));

//        여기에 장바구니 상품들을 옵션 정보와 함께 출력

        System.out.println("-".repeat(60));
        System.out.printf("합계 : %d원%n", 금액합계);

        System.out.println("이전으로 돌아가려면 엔터를 누르세요. ");
        s.nextLine();
    }

    private void printCartItemDetails() {
        for(Product product : items) {
            if(product instanceof BurgerSet) {
                BurgerSet burgerSet = (BurgerSet) product;
                System.out.printf(
                        "  %-8s %6d원 (%s(케첩 %d개), %s(빨대 %s))%n",
                        product.getName(),
                        product.getPrice(),
                        burgerSet.getSide().getName(),
                        burgerSet.getSide().getKetchup(),
                        burgerSet.getDrink().getName(),
                        burgerSet.getDrink().hasStraw() ? "있음" : "없음"
                );
            } else if(product instanceof Hamburger) {
                System.out.printf(
                        "  %-8s %6d원 (단품)%n",
                        product.getName(),
                        product.getPrice()
                );
            } else if(product instanceof Side) {
                System.out.printf(
                        "  %-8s %6d원 (케첩 %d개)%n",
                        product.getName(),
                        product.getPrice(),
                        ((Side) product).getKetchup()
                );
            } else if(product instanceof Drink) {
                System.out.printf(
                        "  %-8s %6d원 (빨대 %s)%n",
                        product.getName(),
                        product.getPrice(),
                        ((Drink) product).hasStraw()? "있음" : "없음"
                );
            }
        }
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for(Product product : items) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    public void addToCart(int productId) {
//        TODO
//        Product product = productId로 해당하는 제품 찾아오기
        Product product = productRepository.findById(productId);
        }

//        상품 옵션 설정 choseOption()

//        if(product가 Hamburger 인스턴스이고, isBurgerSet이 true 라면)
//          product = 세트 구성 // composeSet

//        items에 product 추가

//        "[📣] xxxx를 장바구니에 담았습니다." 출력
    }
}
