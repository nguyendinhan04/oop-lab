package hust.soict.globalict.test.store;

import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store myStore = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The lion king ","Animation", "Roger Allers",87,19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star war ","Science Fiction", "George Lucas ",87,24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin ","Animation", "Roger Allers",8,18.99f);
        Book b1 = new Book(5, "New Book", "Scientific ", 15);

        myStore.addMedia(dvd1);
        myStore.addMedia(dvd2);
        myStore.addMedia(dvd3);
        myStore.addMedia(b1);
        myStore.getStore();



    }
}
