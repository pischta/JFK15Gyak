public class Prím {
  static int lépésSzám=0;
  /*static boolean prím(int szám){
    int osztóDb=0;//megszámolás programozási tétel
    for (int i = 1; i <= szám; i++){ 
      if(szám % i ==0) //modulo
        osztóDb++;
      lépésSzám++;
    }
    return (osztóDb==2);
  }//5050
*/
/*  static boolean prím(int szám){
    if(szám<2)
      return false;
    if(szám==2)
        return true;
    int osztóDb=0;
    for (int i = 2; i <= szám-1; i++){ 
      if(szám % i ==0) //modulo
        osztóDb++;
      lépésSzám++;
    }
    return (osztóDb==0);
  }//4851
  */
/*  static boolean prím(int szám){
    if(szám<2)
      return false;
    if(szám==2)
        return true;
    int osztóDb=1;
    for (int i = 2; i <= Math.sqrt(szám); i++){ 
      if(szám % i ==0) //modulo
        osztóDb++;
      lépésSzám++;
    }
    return (osztóDb==1);
  }//525
*/
  /*static boolean prím(int szám){//ez itt a saját verzióm, amiben kiszűrtem a páros számokat
    if(szám<2)
      return false;
    if(szám==2)
        return true;
    if((szám>2)&&(szám/2.0==szám/2))//itt a szám%2==0 egyszerűbb lenne, a következőnél ezt használtuk
        return false;
    int osztóDb=1;
    for (int i = 2; i <= Math.sqrt(szám); i++){//itt nem vettem figyelembe, hogy nyugodtan mehetne háromtól is 
      if(szám % i ==0) //modulo
        osztóDb++;
      lépésSzám++;
    }
    return (osztóDb==1);
  }//260
  */
  /*
  static boolean prím(int szám){
    if(szám<2)
      return false;
    if(szám==2)
        return true;
    if(szám %2 ==0)
      return false;
    int osztóDb=1;
    for (int i = 3; i <= Math.sqrt(szám); i+=2){//mivel a párosakat kiszűrtük, kettesével is lépdelhetünk 
      if(szám % i ==0) //modulo
        osztóDb++;
      lépésSzám++;
    }
    return (osztóDb==1);
  }//120
  */
  static boolean prím(int szám){
    if(szám<2)
      return false;
    if(szám==2)
        return true;
    if(szám %2 ==0)
      return false;
    int osztóDb=1;
    for (int i = 3; i <= Math.sqrt(szám) && osztóDb==1; i+=2){ 
      if(szám % i ==0) //modulo
        osztóDb++;
      lépésSzám++;
    }
    return (osztóDb==1);
  }//87


  public static void main(String[] args) {
    System.out.println("1-től 100-ig a prímszámok: ");
    for (int i = 1; i <= 100; i++){ 
    if(prím(i))
      System.out.print(i+", ");
    }
      System.out.println();
      System.out.println("Lépésszám: "+lépésSzám+"\n");
  }
  
}
