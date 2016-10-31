
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import javafx.util.converter.LocalDateTimeStringConverter;


public class SaveObjectsToFiles {

    public static void main(String[] args) throws IOException, ClassNotFoundException{
        String titel = "Scary Movie";
        String[] actors = new String[] {"Gosho", "Pesho", "Tosho"};
        LocalDateTime time = LocalDateTime.of(2000, 4, 10, 12,00);
        
        Movie scaryMovie = new Movie(titel, "Keenen Ivory Wayans", actors, time);
        //System.out.print(scaryMovie.toString());
        
        String fileName = "ScaryMovie.txt";

        try (FileOutputStream fileStream = new FileOutputStream(fileName)) {
            try (ObjectOutputStream objStream = new ObjectOutputStream(fileStream)) {
                objStream.writeObject(scaryMovie);
            }
        }
                Movie parsed;

        try (FileInputStream fileInStream = new FileInputStream(fileName)) {
            try (ObjectInputStream objInStream = new ObjectInputStream(fileInStream)) {
                parsed = (Movie) objInStream.readObject();
            }
        }
           if (scaryMovie.director.equals(parsed.director)
                && scaryMovie.releaseDate.equals(parsed.releaseDate)
                && scaryMovie.title.equals(parsed.title)
                && Arrays.deepEquals(scaryMovie.actors, parsed.actors)) {
            System.out.println("same object");
        }
    }
    
}
