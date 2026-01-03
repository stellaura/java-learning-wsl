import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
  public static void main(String[] args){
    CsvFeldolgozo beolvaso = new CsvFeldolgozo("resources/ujsagok.csv");

    List<Ujsag> ujsagok = beolvaso.beolvasUjsagokat();

    for (Ujsag u  : ujsagok){
        System.out.println(u.getMegnevezes() + "-" + u.getAr());
    }
  }
}