/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pt
 */
public class GyakHatodikFejezet {
  public static void main(String[] args) {
    /*6.1.8
    int a=2, b=3, c=4;
    for (int i = 2; i <= 4; i++) {
      for (int j = 2; j <= 4; j++) {
        for (int k = 2; k <= 4; k++) {
          if (i!=j && i!=k && j!=k) {
            System.out.print(i+""+j+""+k+", ");
          }
        }
      }
    }
    System.out.println("");*/
    /*6.1.9 Euler Állat
    int megoldásDb=0;
    for (int ser = 1; ser <= 98; ser++) {
      for (int kecs = 1; kecs <= 98; kecs++) {
        for (int juh = 1; juh <= 98; juh++) {
          double össz=ser*3.5+kecs*(4.0/3)+juh*0.5;
          if((össz==100)&&(ser+kecs+juh==100)) {
            System.out.println(++megoldásDb +". megoldás: \n");
            System.out.println("Sertés: "+ser+" db; Kecske: "+kecs+" db; Juh: "+juh+" db.\n");
            System.out.println("Össz értéke: "+össz+"\n");
          }
        }
      }*/
    /*6.2.3 LnkoLkkt1
    
    int szám1, szám2;
    System.out.println("Szükségem van két pozitív egész számra.");
    while((szám1=extra.Console.readInt("Kérem az első számot: "))<1){
      System.out.println("A szám nem pozitív!\n");
    }
    while((szám2=extra.Console.readInt("Kérem a második számot: "))<1){
      System.out.println("A szám nem pozitív!\n");
    }
    int osztandó=szám1, osztó=szám2, hányados, maradék;
    System.out.println("  Osztandó     Osztó  Hányados   Maradék");
    do{
      System.out.println("   "+osztandó+"   "+osztó+"     "+
              (hányados=osztandó/osztó)+"   "+(maradék=osztandó%osztó));
      osztandó=osztó;
      osztó=maradék;
    }while(maradék>0);
    int lnko=osztandó;
    System.out.println("LNKO: "+lnko);
    System.out.println("LKKT: "+(szám1*szám2/lnko));*/
    /*6.4.6NéhánySzámÖsszege1
    System.out.println("Beolvasott néhány szám összege (végjel: 0)");
    final int VÉGJEL=0;
    int db=0, összeg=0, szám;
    while((szám=extra.Console.readInt((db+1)+". szám: "))!=VÉGJEL){
      összeg+=szám;
      db++;
    }
    System.out.println("A megadott "+db+" szám összege "+összeg+".");*/
    /*6.5.2 SzinuszÉrtéktáblázat
    System.out.println("Színusz értékek:");
    for (int i = 0; i <= 180; i+=5) {
      System.out.println("színusz "+i+"°: "+Math.sin(Math.toRadians(i)));
    }*/
    /*6.5.3FejVagyÍrás2
    int fej=0, írás=0;
    for (int i = 1; i <= 500; i++) {
      if ((int)(Math.random()*2)==1)
        fej++;
      else
        írás++;
    }
      System.out.println("Fej: "+fej);
      System.out.println("Írás: "+írás);*/
    /*6.5.4 FibonacciSorozat2
    long tag1=1, tag2=1,tag3;
    for (int i = 1; i <= 80; i++) {
      System.out.println(i+". tag: "+tag1);
      tag3=tag1+tag2;
      tag1=tag2;
      tag2=tag3;
    }*/
    /*6.5.5 Kétjegyű5telOszthatóSzámok
    System.out.println("Kétjegyű, öttel osztható számok:");
    for (int i = 10; i <= 99; i+=5) {
      System.out.print(i+"; ");
    }
    System.out.println("");*/
    /*6.5.7Ketjegyu5telNemOszthatoSzamok
    System.out.println("1.:");
    int i=10;
    while(i<100){
      if (i++%5!=0) 
        System.out.print(i-1+"; ");
      else
        System.out.println("");
    }
    System.out.println("\n2.:");
    for (int j = 11; j < 100; ) {
      if (j++%5!=0) {
        System.out.print(j-1+"; ");
      }
      else
        System.out.println("");
    }
    System.out.println("");*/
    /*6.5.8 Osztópárok
    int szám=extra.Console.readInt("Kérek egy pozitív egész számot:");
    if (szám<1) {
      System.out.println("A szám nem lehet nulla, vagy negatív!");
    }
    for (int i = 1; i <= (int)(Math.sqrt(szám)); i++) {
      for (int j = (int)(Math.sqrt(szám)); j <=szám; j++) {
        if ((szám%i==0)&&(szám%j==0)&&(i*j==szám)) {
          System.out.println(i+"*"+j);
        }
      }*/
    /*6.5.9 SzökőévBeolvasása
    int évszám=extra.Console.readInt("Kérek egy évszámot:");
    if ((évszám>1582)&&(évszám%4==0)&&((évszám%100!=0)||(évszám%400==0))) 
      System.out.println("A megadott évszám szökőév.");
    else
      System.out.println("A megadott évszám nem szökőév!");*/
    /*6.5.10 Totó3, Totó4*/
    /*System.out.println("Véletlenszerű totószelvény\n"+
      "  1  2  3  4  5  6  7  8  9 10 11 12 13 +1");    //1
    int tipp;
    for(int i=1; i<=14; i++) {
      tipp=(int)(Math.random()*3);       // 0 vagy 1 vagy 2
      System.out.println(tipp==0?"  X":"  "+tipp);
    }
    for(int i=1; i<14; i++)                             //1
      System.out.print(extra.Format.right(i, 3));
    System.out.println(" +1");
    double tipp;
    for(int i=1; i<=14; i++) {
      tipp=Math.random();
      System.out.println(tipp<(double)1/3?"1":(tipp<(2.0/3)?"2":"X"));
    }*/
  }
}
