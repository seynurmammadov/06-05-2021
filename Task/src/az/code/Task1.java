package az.code;
/**
 *  Immutable Person class-ı yaratmaq. name, surname, age field-ları olsun.
 *  Bu field-ləri set edəndə yeni obyekt yaranmalıdır.
 *  Yaranmış obyektin heç bir field-i dəyişməməlidir.
 **/
public class Task1 {
    public static void main(String[] args) {
        Person p1= new Person("Seynur","Mammadov",19);
        System.out.println(p1);
        Person p2 = p1;
        p1=p1.setAge(20);
        p1=p1.setName("Nurlan");
        System.out.println(p1);
        System.out.println(p2);
    }
}
