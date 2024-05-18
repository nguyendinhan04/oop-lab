package hust.soict.globalict.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{
    private static int nbDigitalVideoDiscs = 0; 

    // public DigitalVideoDisc(int id, String title, String category, float cost,int length, String director){
    //     super(id, title, category, cost, length, director);
    //     nbDigitalVideoDiscs += 1;

    // }

    public DigitalVideoDisc(String title){
        super(title);
        nbDigitalVideoDiscs += 1;
    }

    // public DigitalVideoDisc(String title, String category, float cost){
    //     this.title = title;
    //     this.category = category;
    //     this.cost = cost;
    //     this.id = nbDigitalVideoDiscs;
    //     nbDigitalVideoDiscs += 1;
    // }

    public DigitalVideoDisc(String title, String category, String director, float cost){
        super(title, category,director, cost);
        nbDigitalVideoDiscs += 1;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost){
        super(title, category,director, length, cost);
        nbDigitalVideoDiscs += 1;
    }


    public String toString(){
        return"ID: "+ this.getId() +"- DVD - " + this.getTitle() + " - "+ this.getCategory()+ " - " + this.getDirector()+ " - " + this.getLength() + " : " + this.getCost();
    }
    
    public void swap(DigitalVideoDisc d2) {
    	this.setTitle(d2.getTitle());
    }

    public void play() {
        System.out.println("*********************PLAYING*********************");
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
        System.out.println("*************************************************");
        }
}
