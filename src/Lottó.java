public class Lottó {
  public static void main(String[] args) {
    boolean[] logikaiTömb=new boolean[91];
    for (int i = 1; i < logikaiTömb.length; i++) 
      logikaiTömb[i]=false;
    int jóSzámDb=0;
    while(jóSzámDb<5){
      int tipp=(int)(Math.random()*90+1);//1-90
      if (!logikaiTömb[tipp]) {
        logikaiTömb[tipp]=true;
        jóSzámDb++;
      }
    }
    System.out.println("Ötöslottó szelvény:");
    for (int i = 1; i <= 90; i++) {
      if (logikaiTömb[i]) 
        System.out.println(i+" ");

    }
    System.out.println("");    }
}
