import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;



public class CsvFeldolgozo {
  private String filePath;

  public CsvFeldolgozo(String filePath){
    this.filePath = filePath;
  }

  public List<Ujsag> beolvasUjsagokat(){
    List<Ujsag> lista = new ArrayList<>();

    try(Scanner sc = new Scanner(new File(filePath))){
      while (sc.hasNextLine()){
        // sor = egy sor a file-ból
        String sor = sc.nextLine();
        // mezok tömbbe töltöm az elemeket, amiket "-" határol el
        String[] mezok = sor.split("-");

        String tipus = mezok[0];
        String megnevezes = mezok[1];
        String kiado = mezok[2];
        double ar = Double.parseDouble(mezok[3]);

        if(tipus.equalsIgnoreCase("napilap")){
          int HetiMegjelenesSzam = Integer.parseInt(mezok[4]);
          lista.add(new Napilap(megnevezes, kiado, ar, HetiMegjelenesSzam));
        } else if(tipus.equalsIgnoreCase("hetilap")){
           int HetiMegjelenesSzam = Integer.parseInt(mezok[4]);
          lista.add(new Hetilap(megnevezes, kiado, ar, HetiMegjelenesSzam));
        }else{
          lista.add(new Ujsag(megnevezes, kiado, ar));
        }

      }

    } catch (Exception e){
      e.printStackTrace();
    }
    return lista;
  }
}