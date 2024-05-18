package hust.soict.globalict.aims.media;

import java.util.Comparator;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;
    private static int nbMedia = 0;

    public static final Comparator<Media> COMPARRE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARRE_BY_COST_TITLE = new MediaComparatorByCostTitle();

    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = nbMedia;
        nbMedia++;
    }


    public Media(String title, String category) {
        this.title = title;
        this.category = category;
        this.id = nbMedia;
        nbMedia++;
    }

    public Media(String title) {
        this.title = title;
        this.id = nbMedia;
        nbMedia++;
    }

    public Media(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getCategory() {
        return this.category;
    }

    public float getCost() {
        return this.cost;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }


    public boolean isMatch (String title){
        return this.getTitle().equalsIgnoreCase(title);
    }
    
    public boolean isMatch (int id){
        return this.getId() == id;
    }

    public boolean equals(Media otherMedia){
        if( this.title == otherMedia.getTitle()){
            return true;
        }
        return false;
    }

    public void play(){
        
    }

}
