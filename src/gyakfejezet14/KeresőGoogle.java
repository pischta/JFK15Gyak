package gyakfejezet14;
public class KeresőGoogle implements InternetesKereső{
  @Override
  public String keresSzöveg(String szöveg){
    return "Bármit keresel, ezt kapod!";
  }
  @Override
  public String keresSzöveg(String szöveg, String hely){
    return "Bármit keresel, ezt kapod!";
  }
  @Override
  public String keresKép(String szöveg){
    return "Bármit keresel, ezt kapod!";
  }
  @Override
  public String keresKép(String szöveg, String hely){
    return "Bármit keresel, ezt kapod!";
  }
}
