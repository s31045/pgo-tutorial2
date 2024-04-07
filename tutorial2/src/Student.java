public class Student {
    String fname;
    String lname;
    int indexNumber;
    String email;
    String address;
    double grades[];

    public Student(String fname,String lname,double grades[]) {
        this.fname = fname;
        this.lname = lname;
        this.grades = grades;
    }
    public double obliczSrednia(){
        double wynik = 0;

        if(grades.length == 0){
            throw new IllegalArgumentException("Brak ocen");
        }else if(grades.length<=20){
            throw  new IllegalArgumentException("Student może mieć maksymalnie 20 ocen");
        }else{
            for(int i=0;i<=grades.length; i++){
                wynik +=grades[i];
            }
        }

        return Math.round(wynik = wynik/grades.length);
    }

}
