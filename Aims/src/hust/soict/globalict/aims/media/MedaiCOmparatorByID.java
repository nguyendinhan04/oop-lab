package hust.soict.globalict.aims.media;
import java.util.Comparator;
public class MedaiCOmparatorByID implements Comparator<Media>{
    @Override
    public int compare(Media firstMedia, Media secondMedia){
        return Integer.compare(firstMedia.getId(), secondMedia.getId());
    }
}