public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "90500");
        Teacher t2 = new Teacher("Graham Bell", "FZK", "00001");
        Teacher t3 = new Teacher("Külyutmaz", "BIO", "1111");


        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji", "101", "BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "123", "4", tarih,fizik,biyo);
        s1.addBulkExamNote(100,78,50,1,1,1);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", "444", "4", tarih,fizik,biyo);
        s2.addBulkExamNote(50,30,70,80,80,80);
        s2.isPass();

        Student s3 = new Student("DENEME OGRENCI","777", "4", tarih,fizik,biyo);
        s3.addBulkExamNote(100,50,80,20,60,90);
        s3.isPass();

    }
}