public class Logikai {
  public static void main(String[] args) {
    int a=-5, b=8;
    System.out.println(a>0);
    System.out.println(b<10);
    System.out.println(a>0 &&b<10);
    boolean c=a<b?true:false;
    int d=a<b?a:b;
    int e=3;
    e+=(a<b)?5:10;
  }
}
