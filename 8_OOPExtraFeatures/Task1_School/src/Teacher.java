
public class Teacher extends Class{

    String teacherName;
    Discipline[] disciplines;
    
    public Teacher(String name,String clas, String teacherName, Discipline[] discipline) {
        super(name, clas);
        this.teacherName = teacherName;
        this.disciplines = discipline;
    }

    
    
}
