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
            wynik = wynik/grades.length
        }
        if(wynik <= 2.5 ){
            wynik = 2.5;
        }else if(wynik <=2.5 && wynik >= 3.01){
            wynik = 3;
        }else if(wynik <=3.01 && wynik >= 3.99){
            wynik = 3.5;
        }
        else if(wynik <= 4.00 && wynik >= 4.5){
            wynik = 4;
        }else if(wynik <= 4.01 && wynik >= 4.99){
            wynik = 4.5;
        }else if(wynik <= 5){
            wynik = 5;
        }

        return wynik;
    }

}
