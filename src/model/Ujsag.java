public class Ujsag {

  private String megnevezes;
  private String kiado;
  private double ar;

public Ujsag(String megnevezes, String kiado, double ar){

  setMegnevezes(megnevezes);
  setKiado(kiado);
  setAr(ar);

}
 
public String getMegnevezes(){
  return this.megnevezes;
}

public void setMegnevezes(String megnevezes){
  if(megnevezes == null || megnevezes.isBlank()){
    throw new IllegalArgumentException("A megnevezés nem lehet üres!");
  } this.megnevezes = megnevezes;
}

public String getKiado(){
  return this.kiado;
}

public void setKiado(String kiado){
    if(kiado == null || kiado.isBlank()){
    throw new IllegalArgumentException("A kiadó nem lehet üres!");
  } this.kiado = kiado;
}

public double getAr(){
  return this.ar;
}

public void setAr(double ar){
  if(Double.isNaN(ar) || ar < 0){
    throw new IllegalArgumentException("Érvénytelen ár!");
  }this.ar = ar;
}

public double afaTartalomSzamitas(){
  return this.ar * 0.05;
}

public final double hetiArKalkulacio(){
  return this.ar * getHetiMegjelenesSzam();
}

protected int getHetiMegjelenesSzam(){
  return 1;
}

}