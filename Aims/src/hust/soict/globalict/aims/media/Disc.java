package hust.soict.globalict.aims.media;

public class Disc extends Media{
    private int length;
    private String director;

    public Disc( String title, String category,String director,int length, float cost) {
        super(title,category,cost);
        this.length = length;
        this.director = director;
    }

    public Disc(String title, String category,String director, float cost) {
        super(title,category,cost);
        this.director = director;
    }
    public Disc(String title) {
        super(title);
    }



    public int getLength() {
        return this.length;
    }

    public String getDirector() {
        return this.director;
    }
    public void setLength(int length){
        this.length = length;
    }
    public void setDirector(String Director){
        this.director = Director;
    }
}
