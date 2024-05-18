package hust.soict.globalict.test.cart;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.media.*;

public class CartTest{
    public static void main(String[] args) {
        Cart cart = new  Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The lion king","Animation", "Roger Allers",87,19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star war","Science Fiction", "George Lucas ",87,24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation", "Roger Allers",8,18.99f);
        // Book b1 = new Book(5, "New Book", "Scientific ", 15);
        cart.addMedia(dvd1);
        cart.addMedia(dvd2);
        cart.addMedia(dvd3);
        // cart.sortByCostTitle();
        // cart.sortByTitleCost();
        cart.sortByID();
        cart.getCart();
        // System.out.println(cart.searchByTitle("Aladin"));
        // System.out.println(cart.searchByID(1));
    }
}