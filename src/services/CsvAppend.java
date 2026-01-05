package services;

import model.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

// ide jön az appendToFile(), ami paraméterül átveszi az objectFactory()-t, ami objektumot ad vissza: ezt az objektumot csak formattálja(kibontja) és hozzáfűzi a path-hez
public class CsvAppend{

  // ezt hívom majd main-ből, átadva neki objecfactory-t és a path-t
  public static void appendToFile(Ujsag u, String filePath){
    // true = append mode
    try (FileWriter myWriter = new FileWriter(filePath, true)) {
      String line;
// megnezzuk milyen tipus, és annak megfeleloen castoljuk ujsagot
      if(u instanceof Hetilap){
        Hetilap h = (Hetilap) u;
        line = "Hetilap-" + h.getMegnevezes() + "-" + h.getKiado() + "-" + h.getAr() + "-" + h.getHetiMegjelenesSzam();
      } else if(u instanceof Napilap){
        Napilap n = (Napilap) u;
        line = "Napilap-" + n.getMegnevezes() + "-" + n.getKiado() + "-" + n.getAr() + "-" + n.getHetiMegjelenesSzam();
      } else {
        line = "Ujsag-" + u.getMegnevezes() + "-" + u.getKiado() + "-" + u.getAr();
      }

      myWriter.write(line + "\n");
     
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

  }
}


