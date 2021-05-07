package az.code;
/**
 *  Method text qəbul edir.
 *  Əvvəlcə həmin texti boşluqlar, vergül, nöqtə, nida, sual işarələrinə görə
 *  split edib daha sonra təkrar sözləri çıxarmaqla
 *  vergüllə birləşdirib yeni text yaradıb return etsin.
 **/
public class Task2 {
    public static void main(String[] args) {
        System.out.println(clearText(",,,,,   ! ,,,seynur  . , ! ad. ? seynur... sada !....!sgdd,"));
    }
    public static StringBuilder clearText(String dirtyText){
     String[] splitedText = dirtyText.split("[\\s,!?.]+");
     StringBuilder stringBuilder= new StringBuilder();
     for (int i=1; i<splitedText.length;i++){
         if(stringBuilder.indexOf(splitedText[i])==-1){
             if(i!=1){
                 stringBuilder.append(",").append(splitedText[i]);
             } else{
                 stringBuilder.append(splitedText[i]);
             }
         }
     }
     return stringBuilder;
    }
}
