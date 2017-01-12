package gyakfejezet14;

public class InternetesKeresők {
  public static void main(String[] args) {
    KeresőGoogle google=new KeresőGoogle();
    KeresőYahoo yahoo=new KeresőYahoo();
    String keresendőSzöveg="valami";
    String keresésHelye="valahol";
    System.out.println("Google szöveg keresés:"+google.keresKép(keresendőSzöveg));
    System.out.println("Google szöveg keresés hellyel:"+google.keresKép(keresendőSzöveg,keresésHelye));
    System.out.println("Yahoo szöveg keresés:"+yahoo.keresKép(keresendőSzöveg));
    System.out.println("Yahoo szöveg keresés hellyel:"+yahoo.keresKép(keresendőSzöveg,keresésHelye));
  }
  
}
