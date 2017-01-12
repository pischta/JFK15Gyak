
public class Téglalap2 {
  private double a,b;
  
  public Téglalap2(double a,double b){
    if(a>0)
      this.a=a;
    else
      this.a=1;
    if(b>0)
      this.b=b;
    else
      this.b=1;
  }
  
  public double getA(){
    return a;
  }
  
  public double getB(){
    return b;
  }
  
  public double kerület(){
    return 2*(a+b);
  }
  
  public double terület(){
    return a*b;
  }
  
  @Override
  public String toString(){
    return "oldalak: "+a+","+b+"\nKerülete: "+kerület()+"\nTerülete: "+terület()+"\n";
  }
  
  public boolean equals(Téglalap2 t){
    return (this.terület()==t.terület());
  }
  
  public static void main(String[] args) {
    Téglalap2 t1=new Téglalap2(5, 12);
    Téglalap2 t2=new Téglalap2(12, 5);
    System.out.println(t1.equals(t2));
  }
}
