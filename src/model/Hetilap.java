public class Hetilap extends Ujsag{

  private int HetiMegjelenesSzam;

  public Hetilap(String megnevezes, String kiado, double ar, int HetiMegjelenesSzam){
    super(megnevezes, kiado, ar);
    this.HetiMegjelenesSzam = HetiMegjelenesSzam;
  }

  @Override
  protected int getHetiMegjelenesSzam(){
    return this.HetiMegjelenesSzam;
  }

}