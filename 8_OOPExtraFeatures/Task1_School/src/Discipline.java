
public class Discipline extends Class{
    
    String disciplineName;
    int diciplineClasses;
    
    public Discipline(String name, String classID, String discName, int discAmount) {
        super(name, classID);
        this.diciplineClasses = discAmount;
        this.disciplineName = discName;
    
    }
    
    
}
