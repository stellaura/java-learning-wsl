package app;
import services.*;
//import services.CsvAppend;
import input.UjsagInput;
//import services.UjsagUtils;
//import services.CsvFeldolgozo;
import model.*;
import java.util.List;

public class Main {
  public static void main(String[] args){

    CsvFeldolgozo beolvaso = new CsvFeldolgozo("resources/ujsagok.csv");

    List<Ujsag> ujsagok = beolvaso.beolvasUjsagokat();

    Ujsag u = UjsagUtils.maxKivalasztas(ujsagok);

    CsvAppend.appendToFile(UjsagInput.objectFactory(), "resources/ujsagok.csv");

    /*System.out.println(UjsagUtils.ujsagokOssz(ujsagok));
    System.out.println(UjsagUtils.hetilapok(ujsagok));
    System.out.println(UjsagUtils.napilapok(ujsagok));
    System.out.println(UjsagUtils.altalanosSzamlalo(ujsagok));
    System.out.println(u.getMegnevezes() + " - " + u.afaTartalomSzamitas()); */ 

  }
}