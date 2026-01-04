public class Hetilap extends Ujsag{

  private int hetiMegjelenesSzam;

  public Hetilap(String megnevezes, String kiado, double ar, int hetiMegjelenesSzam){
    super(megnevezes, kiado, ar);
    this.hetiMegjelenesSzam = hetiMegjelenesSzam;
  }

  @Override
  protected int getHetiMegjelenesSzam(){
    return this.hetiMegjelenesSzam;
  }

}