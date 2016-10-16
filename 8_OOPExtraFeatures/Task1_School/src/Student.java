
public class Student extends Class {
    
    String studentName;
    String studentID;
    
    public Student(String name, String classID, String studentName, String studentID) {
        super(name, classID);
        this.setStudentName(studentName);
        this.setStudentID(studentID);
    }
    
    void setStudentName(String name){
        this.studentName = name;
    }
    
    void setStudentID(String studID){
        this.studentID = studID;
    }
}
