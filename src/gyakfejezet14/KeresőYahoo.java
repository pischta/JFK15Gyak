package gyakfejezet14;

public class KeresőYahoo implements InternetesKereső{
  public String keresSzöveg(String szöveg){
    return "Velem sem jársz jobban!";
  }
  @Override
  public String keresSzöveg(String szöveg, String hely){
    return "Velem sem jársz jobban!";
  }
  @Override
  public String keresKép(String szöveg){
    return "Velem sem jársz jobban!";
  }
  @Override
  public String keresKép(String szöveg, String hely){
    return "Velem sem jársz jobban!";
  }
}
