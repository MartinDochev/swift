
import com.sun.org.apache.xml.internal.security.encryption.Serializer;
import java.io.Serializable;
import java.time.LocalDateTime;


public class Movie implements Serializable{
    
    String title;
    String director;
    String[] actors;
    LocalDateTime releaseDate;
    
    
    public Movie(String title, String director, String[] actors,LocalDateTime date){
        
        this.title = title;
        this.director = director;
        this.actors = actors;
        releaseDate = date;
        
    }

    @Override
    public String toString() {
        String actArr = this.actors[0] + ", " + this.actors[1] + ", " + this.actors[2];
        String result = this.title + ", " + this.director + ", " + actArr + ", " + releaseDate;
        return result;
    }
    
    

 
}
