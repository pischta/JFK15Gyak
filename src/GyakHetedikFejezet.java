public class GyakHetedikFejezet {
  /*7.3.1 ElsőNÖsszege2
  static int összead(int n){
    return n*(n+1)/2;
  }
  public static void main(String[] args) {
    int szám;
    do{
      szám=extra.Console.readInt("Kérek egy pozitív egész számot: ");
      if(szám<=0)
        System.out.println("A szám nem pozitív!");
        
    }while(szám<=0);
    System.out.println("Az "+szám+" szám összege: "+összead(szám));
  }*/
  /*7.3.3 Szökőévek1, Szökőévek2
  static boolean szökőév(int évszám){
    return ((évszám>1582)&&(évszám%4==0)&&((évszám%100!=0)||(évszám%400==0))) ;
  }
  static void szökőévek(int év1, int év2){
    for (int i = év1; i <= év2; i++) {
      if (szökőév(i)) {
        System.out.print(i+"; ");
      }
    }
  }
  public static void main(String[] args) {
    for (int i = 1880; i <= 1930; i++) {
      if (szökőév(i)) {
        System.out.println("A "+i+" év szökőév.");
      }
    }
    System.out.println("Az 1977 és 2009 év közötti szökőévek:");
    szökőévek(1977, 2009);
    System.out.println("");
  }*/
/*7.3.5 Számjegyek összege 
  public static void main(String[] args) {
   int szám=extra.Console.readInt("Kérek egy egész számot: ");
   //Rekurzív változathoz:
   //System.out.println("A "+szám+" szám számjegyeinek összege: "+(int)számjegyekÖsszege(Math.abs(szám)));
   System.out.println("A "+szám+" szám számjegyeinek összege: "+számjegyekÖsszege(Math.abs(szám)));
}

private static int számjegyekÖsszege(int szám){
  int összeg=0;
  do{
    összeg+=szám%10;
    szám=(int)szám/10;
  }while(szám>0);
  return összeg;
}
/*Rekurzívan:
  private static double számjegyekÖsszege(double szám) {
    System.out.println(szám);
    if (szám<10){
      System.out.println("Vissza:"+Math.floor(szám));
      return Math.floor(szám);
    }
    else
      return szám%10+Math.floor(számjegyekÖsszege(szám/10.0));
  }*/
  /*7.3.6 LegközelebbiPrímSzám
  private static boolean prím(int szám){
    if (szám==1) {
      return false;
    }
    if(szám==2)
      return true;
    else if(szám%2==0)
      return false;
    int osztók=0;
    for (int i = 3; (i <= Math.sqrt(szám))&&(osztók==0); i+=2) {
      if (szám%i==0) {
        osztók++;
      }
    }
    return osztók==0;
  }

  private static int legközelebbiPrímszám(int szám) {
    if (prím(szám)) {
      return szám;
    }
    int balLegközelebbiPrím=0;
    for (int i = szám; (i >1)&&(balLegközelebbiPrím==0); i--) {
      if (prím(i)) {
        balLegközelebbiPrím=i;
      }
    }
    int jobbLegközelebbiPrím=0;
    for (int i = szám+1; jobbLegközelebbiPrím==0; i++) {
      if (prím(i)) {
        jobbLegközelebbiPrím=i;
      }
    }
    //ha tőle egyforma távolságra van mínuszban, és pluszban is prím szám, akkor nem jó eredményt ad!!
    if((szám-balLegközelebbiPrím)<(jobbLegközelebbiPrím-szám))
      return balLegközelebbiPrím;
    else
      return jobbLegközelebbiPrím;
  }

  public static void main(String[] args) {
    int legközelebbiPrímszám=legközelebbiPrímszám(extra.Console.readInt("Kérek egy egész számot!"));
    System.out.println("A megadott számhoz legközelebb eső prímszám: "+legközelebbiPrímszám);
  }*/
  /*7.3.12
  private static int lnko(int szám1,int szám2){
    if(szám1<szám2){
      int x=szám1;
      szám1=szám2;
      szám2=x;
    }
    int m;
    do{
      m=szám1%szám2;
      szám1=szám2;
      szám2=m;
    }while(m!=0);
    return szám1;
  }
  
  public static void main(String[] args) {
    int szám1,szám2;
    do{
      szám1=extra.Console.readInt("Kérek egy pozitív egész számot: ");
      if (szám1<1) {
        System.out.println("Nem pozitív!");
      }
    }while(szám1<1);  
    do{
      szám2=extra.Console.readInt("Kérek egy második pozitív egész számot: ");
      if (szám2<1) {
        System.out.println("Nem pozitív!");
      }
    }while(szám2<1);  
    int lnko=lnko(szám1,szám2);
    int lkkt=szám1*szám2/lnko;
    System.out.println("A két megadott szám legnagyobb közös osztója: "+lnko);
    System.out.println("Legkisebb közös többszöröse: "+lkkt);
  }*/
}