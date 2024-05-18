package hust.soict.globalict.aims.media;

public class Track implements Playable{
    private String title;
    private int length;

    public Track(String title, int length){
        this.title = title;
        this.length = length;
    }


    public int getLength(){
        return this.length;
    }

    public String getTitle(){
        return this.title;
    }

    public void play(){
        System.out.println("Playing Track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }

    public boolean equals(Track otherTrack){
        if(this.title == otherTrack.getTitle() && this.length == otherTrack.getLength()){
            return true;
        }
        return false;
    }   

}
