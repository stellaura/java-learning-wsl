//import java.util.Scanner;
import java.util.List;
//import java.util.ArrayList;
//import java.io.File;
//import java.io.FileNotFoundException;

public class Main {
  public static void main(String[] args){

    CsvFeldolgozo beolvaso = new CsvFeldolgozo("resources/ujsagok.csv");

    List<Ujsag> ujsagok = beolvaso.beolvasUjsagokat();

    System.out.println("Listazo");
    UjsagUtils.Listazo(ujsagok);

    System.out.println("Hetilapok");
    UjsagUtils.Hetilapok(ujsagok);

    System.out.println("Napilapok");
    UjsagUtils.Napilapok(ujsagok);

    System.out.println("Általános");
    UjsagUtils.AltalanosSzamlalo(ujsagok);

    System.out.println("maximum kiválasztás");
    UjsagUtils.MaxKivalasztas(ujsagok);
  }
}