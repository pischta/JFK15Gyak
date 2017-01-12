
public class Veletlen {
  public static void main(String[] args) {
//    double tipp=Math.random();
//    System.out.println("tipp: "+tipp);
//    System.out.println("tipp: "+tipp*6);
//    System.out.println("tipp: "+(tipp*6+1));
//    System.out.println("tipp: "+(int)(tipp*6));
//    int min=1, max=6;
//    System.out.println("tipp: "+(int)(tipp*(max-min+1)+min)); //ez ua., mint a nyolcas sor, csak kifejtve
//    if(Math.random()<0.5)//(double)3/4)//()double)(1/2))//1.0/2)//1/2)//0.5)
//      System.out.println("fej");
//    else
//      System.out.println("írás");
//System.out.println("10 db véletlen kétjegyű páros szám: ");
    for (int i = 1; i < 100; i++) {
      int szám=(int)(Math.random()*45)*2+10;
      System.out.println(i+". szám: "+szám);
    }



    //System.out.println();
/*    System.out.println("Totószelvény:");
    for (int i = 1; i < 13+1; i++) {
      double tipp=Math.random();
      if(tipp<(double)1/3)
        System.out.println("1");
      else if(tipp<2/3.0)
        System.out.println("2");
      else //tipp>=2/3
        System.out.println("x");
    }
    */

//    System.out.println("Totószelvény:");
//    for (int i = 1; i < 13+1; i++) {
//      int tipp=(int)(Math.random()*3); //0,1,2
//      if(tipp==1||tipp==2)
//        System.out.print(tipp+" ");
//      else
//        System.out.print("X ");
//      /*if(tipp==0)
//        System.out.print("X ");
//      else
//        System.out.print(tipp+" ");*/
//      
//    }
//    System.out.println("");
  }
}
