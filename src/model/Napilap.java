public class Napilap extends Ujsag{

  private int hetiMegjelenesSzam;

  public Napilap(String megnevezes, String kiado, double ar, int hetiMegjelenesSzam){
    super(megnevezes, kiado, ar);
    setHetiMegjelenesSzam(hetiMegjelenesSzam);
  }

  @Override
  protected int getHetiMegjelenesSzam(){
    return this.hetiMegjelenesSzam;
  }

  public void setHetiMegjelenesSzam(int hetiMegjelenesSzam){
    if(hetiMegjelenesSzam < 4 || hetiMegjelenesSzam > 7){
      throw new IllegalArgumentException("Napilap heti megjelenése 4 és 7 között kell legyen!");
    }
    this.hetiMegjelenesSzam = hetiMegjelenesSzam;
  }

}