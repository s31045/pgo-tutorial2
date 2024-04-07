import java.util.ArrayList;

public class StudentGroup {
    String nawza;

    int maxCzlonkow = 15;

    ArrayList <Student> studentList = new ArrayList<Student>();

    public void dodajstudenta(Student student){
        if(studentList.contains(student)) {
            throw new IllegalArgumentException("Lista zawiera tego studenta");
        }
        if(studentList.size()+1 > maxCzlonkow){
            throw new IllegalArgumentException("Przekraczono maksymalną liczbę studentów w grupie");
        }
    }
}
