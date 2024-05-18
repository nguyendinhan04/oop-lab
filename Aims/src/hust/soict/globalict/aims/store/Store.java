package hust.soict.globalict.aims.store;

import java.util.ArrayList;
import hust.soict.globalict.aims.media.*;
import java.util.Scanner;

public class Store {
    public static final int MAX_NUMBERS_STORE = 1000;
    ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public Store(){

    }

    public String addMedia(Media newDics){
        if(this.itemsInStore.size() < MAX_NUMBERS_STORE){
            this.itemsInStore.add(newDics);
            System.out.println("THe item has been successfully added");
            return "THe item has been successfully added";
        }
        else{
            // System.out.println("THe Store is full");
            return "The Store is full";
        }
    }

    public String removeMedia(Media DVD){
        if(this.itemsInStore.contains(DVD)){
            this.itemsInStore.remove(DVD);
            // System.out.println("The DVD is successfully removed");
            return "The item is successfully removed";
        }
        else{
            // System.out.println("THis DVD is not in Store");
            return "THis item is not in Store";
        }
    }


    public void getStore(){
        System.out.println("**********************STORE***********************");
        System.out.println("Items:");
        for(int i = 0; i < itemsInStore.size(); i++){
            System.out.println((i + 1)+". " + itemsInStore.get(i).toString());
        }
        System.out.println("***************************************************");
    }

    public Media searchByTitle(String title){
        for(int i = 0; i < this.itemsInStore.size(); i++){
            if(this.itemsInStore.get(i).getTitle().compareTo(title) == 0){
                return this.itemsInStore.get(i);
            }
        }
        System.out.println("Cannot found media");
        return null;
    }
}
