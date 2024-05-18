package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();


    public CompactDisc( String title, String category, float cost, String director,String artist) {
        super(  title,  category, director, 0, cost);
        this.artist = artist;
    }

    public CompactDisc(String title){
        super(title);
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist(){
        return this.artist;
    }

    public String addTrack(String title, int length) {
        for(int i = 0; i < this.tracks.size();i ++){
            if(this.tracks.get(i).getTitle().equals(title)){
                return "Track has been already added in list";
            }
        }
        Track newTrack = new Track(title, length);
        this.tracks.add(newTrack);
        this.setLength(this.getLength() + length);
        return "Track has been added";
    }

    public String removeTrack(String trackName){
        for(int i = 0; i < tracks.size(); i++){
            if(this.tracks.get(i).getTitle().equals(trackName)){
                this.setLength(this.getLength() - this.tracks.get(i).getLength());
                tracks.remove(i);
                return "Track has been removed";
            }
        }
        return "Cant found track";
    }

    public String toString(){
        return"ID: "+ this.getId() + " CD - " + this.getTitle() + " - "+ this.getCategory() + " - " + this.getDirector() + " - " + this.getArtist() + " - " + this.getLength() + " : " + this.getCost();
    }

    public void play(){
        System.out.println("*********************PLAYING*********************");
        System.out.println("Now playing: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
        for(int i = 0; i < this.tracks.size(); i++){
            this.tracks.get(i).play();
        }
        System.out.println("*************************************************");
    }

    // public static void main(String[] args) {
    //     CompactDisc md = new CompactDisc(0, "newtitle", "newcategory", 3, "an", "an");
    //     md.addTrack("Track 1", 3);
    //     md.addTrack("Track 2", 5);
    //     md.addTrack("Track 3", 9);
    //     System.out.println(md.getLength());
    //     md.play();
    // }


}


