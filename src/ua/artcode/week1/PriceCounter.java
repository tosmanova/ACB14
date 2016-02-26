package ua.artcode.week1;

/**
 * Created by tos on 2/26/16.
 */
public class PriceCounter {

    public static void main(String[] args) {
        int discount = 10;
        double price = 4000;
        double priceWithDiscount;

        if (price >= 1000) {
            priceWithDiscount = price * 0.9;
        } else {
            priceWithDiscount = price;
        }
        System.out.println(priceWithDiscount);
    }
}
