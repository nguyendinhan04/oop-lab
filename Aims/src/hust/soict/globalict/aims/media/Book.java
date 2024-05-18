package hust.soict.globalict.aims.media;
import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
    private List<String> authors = new ArrayList<String>();

    public Book(int id, String title, String category, float cost){
        super(id, title, category, cost);
    }

    public Book(String title){
        super(title);
    }

    public List<String> getAuthor() {
        return this.authors;
    }

    public void setAuthor(List<String> author) {
        this.authors = author;
    }

    public String addAuthor(String authorName){
        for(int i = 0; i < this.authors.size(); i++){
            if(this.authors.get(i).equals(authorName)){
                return "The author has already been added";
            }
        }
        this.authors.add(authorName);
        return "The author has been added";
    }

    public String removeAuthor(String authorName){
        for(int i = 0; i < this.authors.size();i++){
            if(this.authors.get(i).equals(authorName)){
                this.authors.remove(i);
                return "The author has been removed";
            }
        }
        return "Cant find the author";
    }

    public String toString(){
        return"ID: "+ this.getId() +"- Book - " + this.getTitle() + " - "+ this.getCategory() + " : " + this.getCost();
    }

    public void play() {
        System.out.println("The method is invalid in this type of media");
    }
}