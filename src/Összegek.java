
public class Összegek {
    private static int összeg1(int n) {
      int összeg=0;
      for (int i = 0; i <= n; i++) 
        összeg+=i;
    return összeg;
  }
  private static int összeg2(int n) {
    return n*(n+1)/2;
  }
  private static int összeg3(int n) {
    if(n==0)
      return 0;
    return n+összeg3(n-1);//ez jobb rekurzió. Van bal, meg közép, meg....
  }

  public static void main(String[] args) {
    System.out.println("A számok összege 1-100-ig: ");
    //n>=0
    System.out.println("Összeg: "+összeg1(100));
    System.out.println("Összeg: "+összeg2(100));
    System.out.println("Összeg: "+összeg3(100));
  }

}
