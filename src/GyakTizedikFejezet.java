
import java.util.Calendar;
import java.util.Date;

public class GyakTizedikFejezet {
/*10.5.1 BmiIndex4
  static int beolvas(String üzenet,                     //1
      int alsóHatár, int felsőHatár) {                  //2
    boolean ok;
    int x;
    do {
      x=extra.Console.readInt(üzenet+": ");
      ok=(alsóHatár<=x && x<=felsőHatár);
      if(x<alsóHatár)
        System.out.println("Túl kicsi szám. Újra!");
      if(x>felsőHatár)
        System.out.println("Túl nagy szám. Újra!");
    } while(!ok);
    return x;                                           //3
  }
  
  static double bmi(int tömeg, int magasság) {          //4
    return tömeg/(Math.pow(magasság/100.0, 2));         //5
  }
  
  static String értékelés(double bmi) {                   //6
    String testalkat=null;
    if(bmi<20)
      testalkat="sovány";
      //System.out.print("sovány");
    else if(bmi<25) //bmi>=20
      //System.out.print("normál");
      testalkat="normál";
    else if(bmi<30) //bmi>=25
      //System.out.print("túlsúlyos");
      testalkat="túlsúlyos";
    else if(bmi<40) //bmi>=30
      //System.out.print("elhízott");
      testalkat="elhízott";
    else //bmi>=40
      //System.out.print("kórosan elhízott");
      testalkat="kórosan elhízott";
    testalkat+=" testalkatú.\n";
    return testalkat;
  }

  public static void main(String[] args) {
    System.out.println("BMI index kiszámítása");
    int testMagasság=
      beolvas("Testmagasság (cm) [100; 200]", 100, 200);//7
    int testTömeg=
      beolvas("Testtömeg (kg) [40; 150]", 40, 150);     //8
    double bmi=bmi(testTömeg, testMagasság);            //9
    System.out.print("Ön "+testMagasság+" cm magas és "+
      testTömeg+" kg tömegű, így BMI indexe "+
      extra.Format.left(bmi, 0, 1)+", tehát Ön "+értékelés(bmi));     //10
    //értékelés(bmi);                                    //11
  }*/
  /*10.5.3 MásodfokúEgyenlet3*/
/*  public static String másodfokúEgyenlet(double a, double b, double c){
    double d;
    String válasz="";
    d=b*b-4*a*c;
    if(d>0) {                       //pl.: a=2, b=3, c=-5
      double x1=((-1)*b+Math.sqrt(d))/(2*a),
        x2=(-b-Math.sqrt(d))/(2*a);
      válasz="Két valós gyök: x1 = "+x1+" és x2 = "+x2;
    }
    if(d==0) {                       //pl.: a=2, b=4, c=2
      double x=(-b)/(2*a);
      válasz="Egy valós gyök: x = "+x;
    }
    if(d<0)                          //pl.: a=1, b=2, c=2
      válasz="Nincs valós gyök.";
    return válasz;
  }
  public static void main(String[] args) {
    double a=extra.Console.readDouble("a = ");
    System.out.println("Másodfokú egyenlet megoldása (a*x^2+b*x+c=0, a!=0)");
    if(a==0)                                  //ha lineáris
      System.out.println("Az egyenlet nem másodfokú!");
    else{ //ha másodfokú
      double b=extra.Console.readDouble("b = ");
      double c=extra.Console.readDouble("c = ");
      System.out.println(másodfokúEgyenlet(a,b,c));
    }
  }*/
 /*10.5.10 SzövegbenCsere
  public static void main(String[] args) {
    String szöveg=null;
    char erről,erre;
    szöveg=extra.Console.readLine("Kérek egy szöveget");
    erről=extra.Console.readChar("Melyik karaktert cseréljem?");
    erre=extra.Console.readChar("Mire cseréljem?");
    szöveg=szöveg.replace(erről, erre);
    System.out.println("Új sztring:"+szöveg);
  }*/
  /*public static void main(String[] args) {
    for(int i=1; i<=20; i++) {
      for(double j=1; j<=i; j+=0.3)
        System.out.print("*");
      System.out.println();

    }
  }*/
  public static void main(String[] args) {
   
  }
}