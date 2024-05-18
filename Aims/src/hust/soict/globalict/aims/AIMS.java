package hust.soict.globalict.aims;

import java.util.Scanner;
import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.media.*;
import hust.soict.globalict.aims.store.*;


public class AIMS {

    public static int showMenu(){
        System.out.println("--------------------------------------------------------------");
        System.out.println("AIMS: ");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        Scanner myScanner = new Scanner(System.in);
        int userChoice = myScanner.nextInt();
        // myScanner.close();
        return userChoice;

    }

    public static int cartMenu(){
        System.out.println("--------------------------------------------------------------");
        System.out.println("Options: ");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        Scanner myScanner = new Scanner(System.in);
        int userChoice = myScanner.nextInt();
        // myScanner.close();
        return userChoice;
    }

    public static int storeMenu(){
        System.out.println("--------------------------------------------------------------");
        System.out.println("Options: ");
        System.out.println("1. See a media details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        Scanner myScanner = new Scanner(System.in);
        int userChoice = myScanner.nextInt();
        // myScanner.close();
        return userChoice;
    }

    public static int mediaDetailsMenu() {
        System.out.println("--------------------------------------------------------------");
        System.out.println("Options: ");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        Scanner myScanner = new Scanner(System.in);
        int userChoice = myScanner.nextInt();
        // myScanner.close();
        return userChoice;
    }

    public static int filterDetail(){
        System.out.println("--------------------------------------------------------------");
        System.out.println("Option: ");
        System.out.println("1. Search by ID");
        System.out.println("2. Search by title");
        System.out.println("0. Back");
        Scanner myScanner = new Scanner(System.in);
        int userChoice = myScanner.nextInt();
        // myScanner.close();
        return userChoice;
    }

    public static int sortDetail(){
        System.out.println("--------------------------------------------------------------");
        System.out.println("Option: ");
        System.out.println("1. Sort by ID");
        System.out.println("2. Sort by title");
        System.out.println("0. Back");
        Scanner myScanner = new Scanner(System.in);
        int userChoice = myScanner.nextInt();
        // myScanner.close();
        return userChoice;
    }

    public static int addMedaiDetail(){
        System.out.println("--------------------------------------------------------------");
        System.out.println("Option: ");
        System.out.println("1. Add a book");
        System.out.println("2. Add a CD");
        System.out.println("3. Add a DVD");
        System.out.println("0. Back");
        Scanner myScanner = new Scanner(System.in);
        int userChoice = myScanner.nextInt();
        // myScanner.close();
        return userChoice;
    }

    public static int updateStoreDetail(){
        System.out.println("--------------------------------------------------------------");
        System.out.println("Option: ");
        System.out.println("1. Add a media");
        System.out.println("2. Remove a media");
        System.out.println("0. Back");
        Scanner myScanner = new Scanner(System.in);
        int userChoice = myScanner.nextInt();
        return userChoice;
    }



    public static void main(String[] args) {
        Cart myCart = new Cart();
        Scanner myScanner = new Scanner(System.in);
        Store myStore = new Store();
        int userChoice0;
        do{
            userChoice0 = showMenu();
            switch(userChoice0){
                case 1:
                int viewStoreCHoice;
                    do{
                        viewStoreCHoice = storeMenu();
                        switch(viewStoreCHoice){
                            case 1:
                            System.out.println("Please input the media's title you want to see");
                                String mediaString = myScanner.nextLine();
                                Media item = myStore.searchByTitle(mediaString);
                                if(item != null){
                                    System.out.println(item.toString());
                                    int seeMediaDetailChoice;
                                    do{
                                    seeMediaDetailChoice = mediaDetailsMenu();
                                    switch(seeMediaDetailChoice){
                                        case 1:
                                            myCart.addMedia(item);
                                        break;
                                        case 2:
                                            item.play();
                                        break;
                                    }
                                    }while(seeMediaDetailChoice != 0);
                                }
                            break;
                            case 2:
                                System.out.println("Please input the media's title you want to add to cart");
                                String userTitle = myScanner.nextLine();
                                Media foundedItem = myStore.searchByTitle(userTitle);
                                if(foundedItem != null){
                                    myCart.addMedia(foundedItem);
                                }
                            break;
                            case 3:
                                String userinputTitle = myScanner.nextLine();
                                Media playingItem = myStore.searchByTitle(userinputTitle);
                                if(playingItem != null){
                                    playingItem.play();
                                }
                            break;
                            case 4:
                                myCart.getCart();
                            break;
                            case 0:
                            break;
                        }
                    }while(viewStoreCHoice != 0);
                break;
                case 2:
                    int updateStoreChoice;
                    do{
                        System.out.println("--------------------------------------------------------------");
                        myStore.getStore();
                        updateStoreChoice = updateStoreDetail();
                        switch(updateStoreChoice){
                            case 1:
                                int addMediaChoice;
                                do{
                                    String mediaTitle;
                                    addMediaChoice = addMedaiDetail();
                                    switch(addMediaChoice){
                                        case 1:
                                        System.out.println("Please input the book title you want to add");
                                        mediaTitle = myScanner.nextLine();
                                        Book newBook = new Book(mediaTitle);
                                        myStore.addMedia(newBook);
                                        break;
                                        case 2:
                                        System.out.println("Please input the CD title you want to add");
                                        mediaTitle = myScanner.nextLine();
                                        CompactDisc newCD = new CompactDisc(mediaTitle);
                                        myStore.addMedia(newCD);
                                        break;
                                        case 3:
                                        System.out.println("Please input the DVD title you want to add");
                                        mediaTitle = myScanner.nextLine();
                                        DigitalVideoDisc newDVD = new DigitalVideoDisc(mediaTitle);
                                        myStore.addMedia(newDVD);
                                        break;
                                        case 0:
                                        break;

                                    }
                                }while(addMediaChoice != 0);
                            break;
                            case 2:
                                System.out.println("Please input the media's title you want to remove");
                                String removeTitle = myScanner.nextLine();
                                Media removedMedia = myStore.searchByTitle(removeTitle);
                                if(removedMedia != null){
                                    myStore.removeMedia(removedMedia);
                                }
                                else{
                                    System.out.println("Cannot found media" + removeTitle);
                                }
                            break;
                            case 0:
                            break;
                        }
                    }while(updateStoreChoice != 0);
                break;
                case 3:
                    myCart.getCart();
                    int userChoice1;
                    do{
                        userChoice1 = cartMenu();
                        switch(userChoice1){
                            case 1:
                                int filterChoice = filterDetail();
                                switch(filterChoice){
                                    case 1:
                                    System.out.println("Input the media's ID you want to search");
                                        int userinput = myScanner.nextInt();
                                        Media targetByID = myCart.searchByID(userinput);
                                        if(targetByID != null){
                                            System.out.println(targetByID.toString());
                                        }
                                        else{
                                            System.out.println("Cannot found media " + userinput);
                                        }
                                    break;
                                    case 2:
                                    System.out.println("Input the media's title you want to search");
                                        String userInput = myScanner.nextLine();
                                        Media targetByTitle = myCart.searchByTitle(userInput);
                                        if(targetByTitle != null){
                                            System.out.println(targetByTitle.toString());
                                        }
                                        else{
                                            System.out.println("Cannot found media " + userInput);
                                        }
                                    break;
                                }
                            break;
                            case 2:
                                int sortChoice = sortDetail();
                                switch(sortChoice){
                                    case 1:
                                        myCart.sortByID();
                                        myCart.getCart();
                                    break;
                                    case 2:
                                        myCart.sortByTitleCost();
                                        myCart.getCart();
                                    break;
                                }
                            break;
                            case 3:
                                System.out.println("Input the media's title you want to remove");
                                String mediaTitle = myScanner.nextLine();
                                myCart.removeMedia(mediaTitle); 
                            break;
                            case 4:
                                System.out.println("Input the media's title you want to play");
                                String playingTitle = myScanner.nextLine();
                                Media playingMedia = myCart.searchByTitle(playingTitle);
                                if(playingMedia != null){
                                    playingMedia.play();
                                }
                                else{
                                    System.out.println("Cannot found media" + playingTitle);
                                }

                            break;
                            case 5:
                                System.out.println("Place order");
                                myCart.placeOrder();
                            break;
                            case 0:
                            break;
                        }
                    }while(userChoice1 != 0);
                break;
                case 0:
                    System.out.println("Exiting...");
                break;
            }
        }while(userChoice0 != 0);
    }
}
