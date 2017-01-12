/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haromszog;

class Haromszog implements Comparable<Haromszog>{//szakértő
  private int a,b,c;

  public Haromszog(int a, int b, int c) {//konstruktor
    if(a<=0)
      throw new IllegalArgumentException("Hiba! a<=0.");//Miért nagy I-val kell kezdeni??
    if(b<=0)
      throw new IllegalArgumentException("Hiba! b<=0.");
    if(c<=0)
      throw new IllegalArgumentException("Hiba! c<=0.");
    if(!megszerkeszthető(a, b, c))
      throw new IllegalArgumentException("Hiba: nincs háromszög!");
    this.a = a;//arra hivatkozok, amilyen névvel lesz elnevezve az osztály(?)
    this.b = b;//a h1 és a h2... helyettesítődik majd be
    this.c = c;
  }

  private static boolean megszerkeszthető(int a, int b, int c){
    return (a+b>c && a+c>b && b+c>a);
  }
          
  
  public int getA() {
    return a;
  }

  public int getB() {
    return b;
  }

  public int getC() {
    return c;
  }
  
  
  
  public int kerület(){
    return a+b+c;
  }
  public double terület(){//Hérón képlet: wikipédián
    double s=kerület()/2.0;
    return Math.sqrt(s*(s-a)*(s-b)*(s-c));
  }

  @Override
  public String toString() {
    return "Háromsszög{a="+a+", b="+b+"c="+c+
            ", K="+kerület()+
            ", Terület="+extra.Format.left(terület(), 0, 2)+"}";
  }
  
  public  boolean equals(Haromszog h){
    int k1=this.kerület(), k2=h.kerület();
    double t1=this.terület(),t2=h.terület();
    return (k1==k2 && t1==t2);
  }

  @Override
  public int compareTo(Haromszog h) {
    if(this.kerület()==h.kerület())//ha a kerületük egyenlő, akkor a területük alapján rendez
      return (int)Math.signum(this.terület()-h.terület());
    return this.kerület()-h.kerület();
  }
}
