
import java.util.Random;

public class CsakEgyTeszt {
  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      double szám=Math.random()*20;
      System.out.println("szám: "+szám);
      System.out.println("kerekítve: "+Math.round(szám));
    }
    System.out.println("mínusz kerekítése: "+((int)-1.6));
    Random véletlen=new Random();
    while((véletlen.nextInt(101)+1)!=0);
    short a,b,c;
    a=1;
    b=2;
    c=(short)(a+b);//itt kell a type cast
    float v1,v2,v3;
    v1=3.2f;
    v2=5.5f;
    v3=v1+v2;//ez marad float
  }
}
