
public class GyakNyolcadikFejezet {

  /*8.4.1 KockaDobás2
  public static void main(String[] args) {
    int dobásDb;
    int[] eredmény=new int[13];
    for (int i = 0; i <= 12; i++) {
      eredmény[i]=0;
    }
    System.out.println("Hány kockadobás legyen?");
    while((dobásDb=extra.Console.readInt())<=0)
      System.out.println("Nem jó. Pozitív egész számot kérek!");
    int dobásÖsszeg;
    for (int i = 1; i <= dobásDb; i++) {
      dobásÖsszeg=(int)(Math.random()*6)+1+(int)(Math.random()*6)+1;
      eredmény[dobásÖsszeg]++;
    }
    for (int i = 2; i <= 12; i++) {
      System.out.println(eredmény[i]+" alkalommal volt az összeg "+i);
    }
  }*/
 /*8.4.2 Kenó1
  public static void main(String[] args) {
    boolean[] kenóSzámok=new boolean[81];
    for(int i=1;i<=80;i++)
      kenóSzámok[i]=false;
    //int számDb=1;
    int egySzám;
    for (int i = 1; i <= 10; i++) {
      do{
        egySzám=(int)(Math.random()*80)+1;
      }while(kenóSzámok[egySzám]);
      kenóSzámok[egySzám]=true;
    }
    System.out.println("Kenószámok:");
    int db=1;
    for (int i = 1; i <= 80; i++) {
      if(kenóSzámok[i]){
        System.out.println(db++ +". szám: "+i);
      }
    }
  }*/
 /*8.3.3 Kenó2
  public static void main(String[] args) {
    int[] kenóSzámok=new int[10];
    for (int i = 0; i <= 9; i++) {
      kenóSzámok[i]=0;
    }
    for (int i = 1; i <= 10; i++) {
      int egySzám;
      boolean vanMár;
      do{
        vanMár=false;
        egySzám=(int)(Math.random()*80)+1;
        int j=0;
        while((j<i)&&!vanMár){
          if(kenóSzámok[j]==egySzám)
            vanMár=true;
          j++;
        }
      }while(vanMár);
      kenóSzámok[i-1]=egySzám;
    }
    for (int i = 0; i < 10; i++) {
      System.out.println(i+1+". szám: "+kenóSzámok[i]);
    }
  }*/
 /*8.3.4 SzámokElőfordulása
  public static void main(String[] args) {
    int[] számTömb=new int[500];
    int[] előfordulásTömb=new int[100];
    for (int i = 0; i < 100; i++) {
      előfordulásTömb[i]=0;
    }
    int egySzám;
    for (int i = 0; i < 500; i++) {
      egySzám=(int)(Math.random()*90)+10;
      számTömb[i]=egySzám;
      előfordulásTömb[egySzám]++;
    }
    System.out.println("Számok előfordulása az 500 elemű tömbben:");
    for (int i = 10; i < 100; i++) {
      System.out.println(i+": "+előfordulásTömb[i]);
    }
  }*/
 /*8.3.5 ÖtösHatosHetesLottó 
  static int[] lottó(String lottóFajta){
      int ennyiSzámot,ennyiSzámból;
    switch (lottóFajta) {
      case "ötös": ennyiSzámot=5;
                   ennyiSzámból=90;
      break;
      case "hatos": ennyiSzámot=6;
                    ennyiSzámból=45;
      break;
      case "hetes": ennyiSzámot=7;
                    ennyiSzámból=35;
      break;
      default:
        throw new AssertionError();
    }
    int[] nyerőSzámok=new int[ennyiSzámot];
    int tipp;
    boolean vanMár;
    for (int i = 0; i < ennyiSzámot; i++) {
      do{
        vanMár=false;
        tipp=(int)(Math.random()*ennyiSzámból)+1;
        int j=0;
        while(j<ennyiSzámot&&!vanMár){
          if (nyerőSzámok[j]==tipp) {
            vanMár=true;
          }
          j++;
        }
      }while(vanMár);
      nyerőSzámok[i]=tipp;
    }
    return nyerőSzámok;
  }
  
  static void lottóKiír(int[] nyerőSzámok){
    switch(nyerőSzámok.length){
      case 5: System.out.println("Ötöslottó nyerőszámok:");
              break;
      case 6: System.out.println("Hatoslottó nyerőszámok:");
              break;
      case 7: System.out.println("Heteslottó nyerőszámok:");
              break;
    }
    for (int i = 0; i < nyerőSzámok.length; i++) {
      System.out.println(i+1+". nyerőszám: "+nyerőSzámok[i]);
    }
  }
  public static void main(String[] args) {
    lottóKiír(lottó("ötös"));
    lottóKiír(lottó("hatos"));
    lottóKiír(lottó("hetes"));
  }*/
 /*8.3.6 MátrixSzorzása
  static int[][] mFeltölt(){
    int[][] mátrix=new int[10][10];
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        mátrix[i][j]=(int)(Math.random()*9)+1;
      }
    }
    return mátrix;
  }

  static int[][] mSzoroz(int[][] m1,int[][] m2){
    int[][] mSzorzat=new int[10][10];
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        mSzorzat[i][j]=m1[i][j]*m2[i][j];
      }
    }
    return mSzorzat;
  }

  static void mKiír(int[][] mátrix,String szöveg){
    System.out.println(szöveg);
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        System.out.print(extra.Format.right(mátrix[i][j],3));
      }
      System.out.println("");
    }
  }

  public static void main(String[] args) {
     int[][] m1,m2=new int[10][10];
     m1=mFeltölt();
     mKiír(m1, "Első mátrix: ");
     m2=mFeltölt();
     mKiír(m2, "Első mátrix: ");
     mKiír(mSzoroz(m1,m2),"A két mátrix szorzata: ");
  }*/
 /*8.3.7 MelyikbőlVanTöbb
  public static void main(String[] args) {
    int[] tömb=new int[300];
    int pozitívak=5,negatívak=5;
    for (int i = 0; i < 300; i++) {
      tömb[i]=(int)(Math.random()*101-50);
      //System.out.println("tömb "+i+". eleme: "+tömb[i]);
    }
    for (int i = 0; i < 300; i++) {
      if (tömb[i]<0) {
        negatívak++;
      }else if(tömb[i]>0){
        pozitívak++; 
      }
    }
    System.out.println("Negatívból "+negatívak+", pozitívból "+pozitívak+" szám van a tömbben.");
    /*if (pozitívak>negatívak) {
      System.out.println("A pozitív számokból van több a tömbben!");
    }else if(negatívak>pozitívak){
      System.out.println("A negatív számokból van több a tömbben!");
    }else
      System.out.println("Egyelnő pozitív és negatív számot tartalmaz a tömb!");*/
 /*System.out.println(pozitívak<negatívak?"A negatív számokból van több a tömbben!":
      (pozitívak>negatívak?"A pozitív számokból van több a tömbben!":
      "Egyelnő pozitív és negatív számot tartalmaz a tömb!"));
  }*/
 /*8.3.9 LegkisebbPozitívSzám
  public static void main(String[] args) {
  int[] tömb=new int[300];
    for (int i = 0; i < 300; i++) {
      tömb[i]=(int)(Math.random()*101-50);
    }
    int legkisebbPozitív=60;
    for (int i = 0; i < 300; i++) {
      if(tömb[i]>0&&tömb[i]<legkisebbPozitív){
        legkisebbPozitív=tömb[i];
        System.out.println("i: "+i+" tömb[i]:"+tömb[i]);
      }
    }
    System.out.println("Tömb legkisebb pozitív eleme: "+legkisebbPozitív);
}*/
 /*8.3.10 LeggyakoribbSzám
  public static void main(String[] args) {
    int[] tömb=new int[300];
    int[] előfordulások=new int[101];
    for (int i = 0; i <= 100; i++) {
      előfordulások[i]=0;
    }
    for (int i = 0; i < 300; i++) {
      tömb[i]=(int)(Math.random()*101-50);
    }
    for (int i = 0; i < 300; i++) {
      előfordulások[tömb[i]+50]++;
    }
    System.out.println("A tömbben a számok a következő gyakorisággal fordulnak elő:");
    int ellenőrzőösszeg=0;
    for (int i = 0; i <= 100; i++) {
      System.out.println(i-50+": "+előfordulások[i]);
      ellenőrzőösszeg+=előfordulások[i];
    }
    System.out.println("Előfordulások összege: "+ellenőrzőösszeg);
  }*/
 /*8.3.11 MátrixLegkisebbEleme
  static int[][] mátrix=new int[7][10];
  static void mátrixFeltölt(){
    for (int i = 0; i < 7; i++) {
      for (int j = 0; j < 10; j++) {
        mátrix[i][j]=(int)(Math.random()*500);
      }
    }
  }
  static void mátrixKiír(){
    for (int i = 0; i < 7; i++) {
      for (int j = 0; j < 10; j++) {
        System.out.print(extra.Format.right(mátrix[i][j],3)+" ");
      }
      System.out.println("");
    }
  }
  static void mátrixMin(){
    int legkisebbÉrtéke=mátrix[0][0], legkisebbSor=0,legkisebbOszlop=0;
    for (int i = 0; i < 7; i++) {
      for (int j = 0; j < 10; j++) {
        if(mátrix[i][j]<legkisebbÉrtéke){
          legkisebbÉrtéke=mátrix[i][j];
          legkisebbOszlop=j;
          legkisebbSor=i;
        }
      }
    }
    System.out.println("Legkisebb érték helye a mátrixban: "+(legkisebbSor+1)+". sor, "+(legkisebbOszlop+1)+". oszlop;");
    System.out.println("Értéke: "+legkisebbÉrtéke);
  }
  public static void main(String[] args) {
    mátrixFeltölt();
    mátrixKiír();
    mátrixMin();
  }*/
 /*8.3.12 ÉvHányadikNapja
  static boolean szökőév(int év) {
    return (év>=1582) && ((év%4==0 && év%100!=0) || (év%400==0));
  }
  static int évHányadikNapja(String dátum){
    int[] hónapokNapjai={31,28,31,30,31,30,31,31,30,31,30,31};
    int napok=0;
    if (szökőév(Integer.parseInt(dátum.substring(0, 4)))) {
      hónapokNapjai[1]=29;
    }
    for (int i = 0; i < Integer.parseInt(dátum.substring(5,7)); i++) {
      napok+=hónapokNapjai[i];
    }
    //System.out.println("string vége: "+Integer.parseInt(dátum.substring(8,10)));
    napok+=Integer.parseInt(dátum.substring(8,10));
    return napok;
}
  public static void main(String[] args) {
    final String dátum="2000,03,15";
    int napok;
    napok=évHányadikNapja(dátum);
    System.out.println("napok:"+napok);
  }*/

}
