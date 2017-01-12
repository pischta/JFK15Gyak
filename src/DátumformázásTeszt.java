
import java.text.DateFormat;
import java.util.Date;

public class DátumformázásTeszt {
  public static void main(String[] args) {
    Date egyDátum=new Date();
    DateFormat egyDátumFormázó=DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.MEDIUM);
    System.out.println("Dátum és idő:"+egyDátumFormázó.format(egyDátum));
    
  }
}
