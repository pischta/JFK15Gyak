public class TengerimalacEgyNapja {
  /*
  A megoldások között ez máshogy van: külön Emlősállat osztály van!!!!
  */
  public String név;
  private String faj;
  private int lábDb=4;
  private double tömeg;

  public TengerimalacEgyNapja(String osztály, String faj, String név, double tömeg){
    if(osztály.equalsIgnoreCase("emlős"))
      Emlősállat(faj, név, tömeg);
  }

  public void Emlősállat(String faj, String név, double tömeg){
    this.faj=faj;
    this.név=név;
    this.tömeg=tömeg;
  }

  public double táplálkozik(double elfogyasztottMennyiség){
    if(elfogyasztottMennyiség>=0 &&elfogyasztottMennyiség<=0.05)
      tömeg+=tömeg*elfogyasztottMennyiség;
    else if(elfogyasztottMennyiség>0.5)
      tömeg+=tömeg*0.05;
    return tömeg;
  }

  public double ürít(double ürítettMennyiség){
    if(ürítettMennyiség>=0 &&ürítettMennyiség<=0.05)
      tömeg-=tömeg*ürítettMennyiség;
    else if(ürítettMennyiség>0.05)
      tömeg-=tömeg*0.5;
    return tömeg;
  }
  
  public double szaladgál(double lemozgottMennyiség){
    if(lemozgottMennyiség>=0 &&lemozgottMennyiség<=0.1)
      tömeg-=tömeg*lemozgottMennyiség;
    else if(lemozgottMennyiség>0.1)
      tömeg-=tömeg*0.1;
    return tömeg;
  }

  public double alszik(){
    return tömeg;
  }
  
  @Override
  public String toString(){
    return "Faja: "+this.faj+"\nNeve: "+this.név+"\nLábainak száma: "+this.lábDb+
            "\nTömege: "+this.tömeg+"kg";
  }
  
  public void setNév(String újNév){
    this.név=újNév;
  }
  public String getNév(){
    return this.név;
  }
  public double getTömeg(){
    return this.tömeg;
  }
  
  public String getFaj(){
    return this.faj;
  }
  
  public static void main(String[] args) {
    TengerimalacEgyNapja tm1;
    tm1 = new TengerimalacEgyNapja("emlős","tengerimalac","Egon",(double)0.5);
    System.out.println(tm1.toString());
    System.out.println("Súlya táplálkozás után:"+tm1.táplálkozik(0.05)+"kg");
    System.out.println("Súlya szaladgálás után:"+tm1.táplálkozik(0.09)+"kg");
    tm1.setNév("Harapós");
    System.out.println("Új neve: "+tm1.getNév());
    System.out.println("Súlya alvás után:"+tm1.alszik()+"kg");
    
  }
}
