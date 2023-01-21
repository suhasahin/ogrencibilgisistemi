public class Student {
    Course c1;
    Course c2;
    Course c3;



    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0 ;
        this.isPass = false;

    }

    void addBulkExamNote(int note1, int note2, int note3, int oe1, int oe2, int oe3){
        if (note1 >= 0 && note1 <= 100){
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100){
            this.c2.note = note2;
        }

        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }

        if (oe1 >= 0 && oe1 <= 100) {
            this.c1.oe = oe1;
        }
        if (oe2 >= 0 && oe2 <= 100) {
            this.c2.oe = oe2;
        }
        if (oe3 >= 0 && oe3 <= 100) {
            this.c3.oe = oe3;
        }

    }
    void isPass(){
        System.out.println("================");
        this.average = ((((this.c1.note*0.8) + (this.c1.oe*0.2)) + ((this.c2.note*0.8) + (this.c2.oe*0.2)) + ((this.c3.note*0.8) + (this.c3.oe*0.2)))/3);
        if(this.average > 55){
            System.out.println("Sınıfı başarılı şekilde geçtiniz!");
            this.isPass = true;
        }else{
            System.out.println("Sınıfta kaldınız!");
            this.isPass = false;
        }
        printNote();
    }

    void printNote(){
        System.out.println(name);
        System.out.println(this.c1.name + " Sınav Notu\t\t:" + this.c1.note);
        System.out.println(this.c1.name + " Sözlü Notu\t\t:" + this.c1.oe);
        System.out.println(this.c2.name + " Sınav Notu\t\t:" + this.c2.note);
        System.out.println(this.c2.name + " Sözlü Notu\t\t:" + this.c2.oe);
        System.out.println(this.c3.name + " Sınav Notu\t\t:" + this.c3.note);
        System.out.println(this.c3.name + " Sözlü Notu\t\t:" + this.c3.oe);
        System.out.println("Ortalamanız : " + this.average);
        System.out.println("================");
    }
}
