package haromszog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/*class Haromszog implements Comparable<Haromszog> { //szakétő gyémánt operátor

  
}*/
public class HaromszogVezerlo{
  
  public static void main4(String[] args) {
    ArrayList<Haromszog> lista=new ArrayList<>();
    lista.add(new Haromszog(5, 6, 7));
    for (int i = 0; i < 14; i++) {
      int a=12;
      int b=(int)(Math.random()*7+10); //10-16
      int c=(int)(Math.random()*8+11);
      lista.add(new Haromszog(a, b, c));
    }
    //  for (int i = 0; i < lista.size(); i++) 
    //    System.out.println(lista.get(i));
    
    //for(Haromszog h:lista)
    //  System.out.println(h);
    lista.forEach((h)->{
      System.out.println(h);
    });
    
//    int[] tömb={1,2,-3,4};
//    for (int i : tömb) {
//      System.out.println(i);
//    }
    //mennyi a területátlaguk
    //külön listába...
    System.out.println("A háromszögek területeinek átlaga: ");
    double területösszeg=0.0;
    for (Haromszog haromszog : lista) 
      területösszeg+=haromszog.terület();
    double területÁtlag=területösszeg/lista.size();
    System.out.println(területÁtlag);
    ArrayList<Haromszog> kisHáromszögLista=new ArrayList<>();//<= Ez egy kollekció
    ArrayList<Haromszog> nagyHáromszögLista=new ArrayList<>();//>
    for (Haromszog haromszog : lista) 
      if(haromszog.terület()<=területÁtlag)
        kisHáromszögLista.add(haromszog);
      else
        nagyHáromszögLista.add(haromszog);
    System.out.println(kisHáromszögLista+"\n"+nagyHáromszögLista);
    
    System.out.println("A háromszögek listája sorrendben:");
    
    //Collections.sort(lista);
 
//    Collections.sort(lista, new Comparator<Haromszog>(){
//      @Override
//      public int compare(Haromszog h1, Haromszog h2) {
//        return h1.getC()-h2.getC();
//      }
    Collections.sort(lista, (Haromszog h1, Haromszog h2) -> h1.getC()-h2.getC());
    for (Haromszog haromszog : lista) 
      System.out.println(haromszog);
    
  }
  
  public static void main(String[] args) {
    Haromszog[] hTömb=new Haromszog[15];
    for (int i = 0; i < hTömb.length; i++) {
      int a=12;
      int b=(int)(Math.random()*7+10); //10-16
      int c=(int)(Math.random()*8+11);
      hTömb[i]=new Haromszog(a, b, c);
    }
    System.out.println("A háromszögek listája:");
    for(int i=0;i<hTömb.length;i++){
            System.out.println(hTömb[i]);
    }
    Arrays.sort(hTömb);
        System.out.println("\nA háromszögek listája rendezetten:");
    for(int i=0;i<hTömb.length;i++){
            System.out.println(hTömb[i]);
    }
    //1
    int i=0;
    while(i<hTömb.length){
      //2
      int aktKerület=hTömb[i].kerület();
      System.out.print(aktKerület+" ");
      int minIndex=i;
      int kDb=0;
      while(i<hTömb.length &&aktKerület==hTömb[i].kerület()){
        //3
        kDb++;
        i++;
      }
      //4
      System.out.print("K: "+kDb+" db");
      int maxIndex=i;
      int j=minIndex;
      int területKategóriaDb=0;
      while(j<maxIndex){
        double aktTerület=hTömb[j].terület();
        while(j<maxIndex && aktTerület==hTömb[j].terület()){
          j++;
        }
        területKategóriaDb++;
      }
      System.out.println(" T: "+területKategóriaDb+" db");
    }
    //5
  }
}



//public class HaromszogVezerlo {//vezérlő
  /*public static void main2(String[] args) {
    Haromszog h1=new Haromszog(4,5,3);
    Haromszog h2=new Haromszog(3,4,5);
    System.out.println(h1.equals(h2));
  /*  System.out.println(h1.terület());//üzenetküldés
    System.out.println(h2.terület());//üzenetküldés
    System.out.println(h1.getA());*/
    //System.out.println(h1);
    //System.out.println(h1.toString());
    //System.out.println(h2);
//  }
//}
