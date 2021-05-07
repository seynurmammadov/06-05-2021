package az.code;

import java.time.LocalDate;

/**
 * Doğum tarixini qəbul edib bütün ad günlərinin həftənin hansı günlərinə düşdüyünü çap etmək
 */

public class Task3 {
    public static void main(String[] args) {
        getBirthdayDays("2001-09-04");
    }
    public static void getBirthdayDays(String birthDateStr){
      try{
          LocalDate dateNow= LocalDate.now();
          LocalDate birthDate = LocalDate.parse(birthDateStr);
          int counter = dateNow.getYear()-birthDate.getYear();
          if (counter<=0){
              System.out.println("Enter correct birth date!");
            return;
          }
          for (int i=0;i<counter;i++){
              System.out.println(birthDate);
              System.out.println(birthDate.getDayOfWeek());
              birthDate= birthDate.plusYears(1);
          }
      }catch (Exception e){
          System.out.println("Birth date isn't correct format!");
      }
    }

}
