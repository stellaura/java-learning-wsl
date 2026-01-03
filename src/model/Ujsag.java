public class Ujsag {

  private String megnevezes;
  private String kiado;
  private double ar;

public Ujsag(String megnevezes, String kiado, double ar){

  this.megnevezes = megnevezes;
  this.kiado = kiado;
  this.ar = ar;

}

// getter & setter for megnevezes
public String getMegnevezes(){
  return this.megnevezes;
}

public void setMegnevezes(String megnevezes){
  this.megnevezes = megnevezes;
}

// getter & setter for kiado
public String getKiado(){
  return this.kiado;
}

public void setKiado(String kiado){
  this.kiado = kiado;
}

// getter & setter for ar
public double getAr(){
  return this.ar;
}

public void setAr(double ar){
  this.ar = ar;
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