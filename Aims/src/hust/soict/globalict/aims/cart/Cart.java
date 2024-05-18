package hust.soict.globalict.aims.cart;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import hust.soict.globalict.aims.media.*;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<Media> itemsOdered = new ArrayList<Media>();

    public Cart(){
    }

    public String addMedia(Media newMedia){
        if(this.itemsOdered.size() >= MAX_NUMBERS_ORDERED){
            return "The cart has been full";
        }
        if(this.itemsOdered.contains(newMedia)){
            return "Item " + newMedia.getTitle() +" has been already added";
        }
        this.itemsOdered.add(newMedia);
        return "Item " +newMedia.getTitle() +" has been sucessfully added";
    }

    public String removeMedia(Media removedMedia){
        if(this.itemsOdered.contains(removedMedia)){
            this.itemsOdered.remove(removedMedia);
            return "item" +removedMedia.getTitle() +" has been sucessfully removed";
        }
        return "Item "+ removedMedia.getTitle()+" not exist in cart";
    }

    public String removeMedia(String title){
        for(int i = 0; i < itemsOdered.size(); i++){
            if(itemsOdered.get(i).getTitle().compareTo(title) == 0){
                itemsOdered.remove(i);
                return "item" +title +" has been sucessfully removed"; 
            }
        }
        return "Item "+ title+" not exist in cart";
    }

    public float totalCost(){
        float res=0;
        for(int i = 0; i < this.itemsOdered.size(); i += 1)
        {
            res += this.itemsOdered.get(i).getCost();
        }
        return res;                            
    }


    public void addMedia(ArrayList<Media> mediaList){
        for(int i = 0; i < mediaList.size(); i++){
            addMedia(mediaList.get(i));
        }
    }


    public void getCart(){
        System.out.println("***********************CART***********************");
        System.out.println("Ordered items:");
        for(int i = 0; i < this.itemsOdered.size(); i++){
            System.out.println((i+1 )+ ". " + this.itemsOdered.get(i).toString());
        }
        System.out.println("Total cost: " + this.totalCost());
        System.out.println("***************************************************");
    }


    public Media searchByID(int id){
        for(int i = 0; i <this.itemsOdered.size(); i++){
            if(this.itemsOdered.get(i).getId() == id){
                return this.itemsOdered.get(i);
            }
        }
        return null;
    }

    public Media searchByTitle(String title){
        for(int i = 0; i < this.itemsOdered.size(); i++){
            if(this.itemsOdered.get(i).isMatch(title)){
                return this.itemsOdered.get(i);
            }
        }
        return null;
    }

    // public void playMedia(String title){
    //     DigitalVideoDisc dvd = new DigitalVideoDisc(title);
    //     CompactDisc cd = new CompactDisc(title); 
    //     for(int i = 0; i < this.itemsOdered.size(); i++){
    //         if(this.itemsOdered.get(i).equals(cd))
    //         this.itemsOdered.get(i)
    //     }
    // }

    public void placeOrder(){
        this.itemsOdered.clear();
    }

    public void sortByCostTitle(){
        Comparator<Media> COMPARRE_BY_COST_TITLE = new MediaComparatorByCostTitle();
        Collections.sort(this.itemsOdered, COMPARRE_BY_COST_TITLE);
    }

    public void sortByTitleCost(){
        Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
        Collections.sort(this.itemsOdered, COMPARE_BY_TITLE_COST);
    }

    public void sortByID(){
        Comparator<Media> COMPARE_BY_ID = new MedaiCOmparatorByID();
        Collections.sort(this.itemsOdered, COMPARE_BY_ID);
    }
    

}

