/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pt
 */
public class GyakötödikFejezet {
    public static void main(String[] args) {
/*5.2.4. osztalyzat if-else:
      int szam=extra.Console.readInt("Szám:");
        if(szam>0 && szam<6){
          if(szam==1)
            System.out.println("Elégtelen\n");
          else if(szam==2)
            System.out.println("Elégséges\n");
          else if(szam==3)
            System.out.println("Közepes\n");
          else if(szam==4)
            System.out.println("Jó\n");
          else
            System.out.println("Kitűnő\n");
        }
        else
          System.out.println("Nem osztályzat!\n");*/

/*5.2.4. Osztályzat kiíratása switch-csel:
          int szam=extra.Console.readInt("Szám: ");
          switch(szam){
            case 1: System.out.println("Elégtelen");
            case 2: System.out.println("Elégséges");
            case 3: System.out.println("Közepes");
            case 4: System.out.println("Jó");
            case 5: System.out.println("Kitűnő");
            default: System.out.println("Nem osztályzat!");
          }*/
/*5.3.1. Szam abszolutertekenek kiiratasa:
    double szam=extra.Console.readDouble("Kérek egy számot: ");
    double abszolutErtek= szam>=0?szam:-1*szam;
      System.out.println("Szam abszoluterteke: "+abszolutErtek+"\n");
*/
/*5.3.7 negyzetgyok
      double szam=extra.Console.readDouble("Kérek egy valós számot: ");
      if(szam<0)
        System.out.println("Negatív számnak nincs gyöke!");
      else
        System.out.println("A szám négyzetgyöke: "+Math.sqrt(szam)+"\n");*/
        
/*5.3.8 Véletlenszám
      int alsoHatar,felsoHatar;
      int szam1=extra.Console.readInt("Kérek egy egész számot: ");
      int szam2=extra.Console.readInt("Kérek még egy egész számot: ");
      if(szam1<szam2){
        alsoHatar=szam1;
        felsoHatar=szam2;
      }else{
        alsoHatar=szam2;
        felsoHatar=szam1;
      }
      System.out.println("A megadott számok közötti véletlen szám: "+((int)(Math.random()*(felsoHatar-alsoHatar+1))+alsoHatar));
*/
/*5.3.15 teglalap1
      double szam1=extra.Console.readDouble("Szám1: ");
      double szam2=extra.Console.readDouble("Szám2: ");
      if(szam1>0 && szam2>0){
        System.out.println("Négyzet kerülete: "+extra.Format.left(szam1+szam2, 0, 2));
        System.out.println("Négyzet területe: "+extra.Format.left(szam1*szam2, 0, 2));
      }*/
/* 5.3.17 Kétegyű szám
      int szam=extra.Console.readInt("szám: ");
      if((szam>9 && szam<100)||(szam<-9 && szam>-100))
        System.out.println("A szám kétjegyű!\n");
      else
        System.out.println("A szám nem kétjegyű!\n");*/
/*5.3.18 Római számjegyek
      int szam=extra.Console.readInt("Kérek egy 1 és 10 közé eső számot: ");
      if(szam>0 && szam<10)
        switch(szam){
          case 1: System.out.println("I\n");break;
          case 2: System.out.println("II\n");break;
          case 3: System.out.println("III\n");break;
          case 4: System.out.println("IV\n");break;
          case 5: System.out.println("V\n");break;
          case 6: System.out.println("VI\n");break;
          case 7: System.out.println("VII\n");break;
          case 8: System.out.println("VIII\n");break;
          case 9: System.out.println("IX\n");break;
        }else
          System.out.println("Túl kicsi, vagy túl nagy szám!\n");*/
/*5.3.21 Legkisebb3közül
      double legKisebb=0;
      for(int i=0;i<3;i++){
        double szam=extra.Console.readDouble("Kérek egy számot: ");
        if(i==0)
          legKisebb=szam;
        else if(szam<legKisebb)
          legKisebb=szam;
        }
      System.out.println("A három megadott szám közül a legkisebb: "+legKisebb+"\n");*/
/*5.3.22
        double szamA=extra.Console.readDouble("Kérek egy számot: ");
        double szamB=extra.Console.readDouble("Kérek még egy számot: ");
        if(szamA!=0)
          System.out.println("Eredmény: "+(-szamB/szamA)+"\n");*/
/*5.3.23 Osztható15-tel
      int szam=extra.Console.readInt("Kérek egy háromjegyű egész számot: ");
      if(szam>99){
        if(szam/15.0==szam/15)
          System.out.println("A szám osztható 15-tel!\n");
        else
          System.out.println("A szám nem osztható 15-tel!\n");
      }else
        System.out.println("A megadott szám nem háromjegyű!\n");*/
/*        int szám=0;
        if(szám%2!=0)
          System.out.println("Nem nulla!\n");
        */
    }
}
    