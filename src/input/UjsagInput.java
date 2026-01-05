package input;
import model.*;
import java.util.Scanner;

// csak adatbekérés
public class UjsagInput {

  private static final Scanner sc = new Scanner(System.in);


  public static String stringBekeres(String uzenet){
    System.out.print(uzenet + ": ");
    String input = sc.nextLine();
    while(input.isBlank()){
     System.out.print("Hibás input! " + uzenet + ": ");
      input = sc.nextLine();

    }
    return input;
  }

  public static double doubleBekeres(String uzenet){
    System.out.print(uzenet + ": ");
    while(true){
      try{
        double input = Double.parseDouble(sc.nextLine());
        if(input <= 0) {
          System.out.println("Az értéknek nagyobbnak kell lennie 0-nál!");
          continue;
        }
        return input;
      } catch(NumberFormatException e) {
      System.out.println("Érvénytelen szám, próbáld újra!");
      }
    
    }
  }

  public static int intBekeres(String uzenet){
    System.out.print(uzenet + ": ");
    while(true){
      try{
        int input = Integer.parseInt(sc.nextLine());
        if(input <= 0) {
          System.out.println("Az értéknek nagyobbnak kell lennie 0-nál!");
          continue;
        }
        return input;
      } catch(NumberFormatException e) {
      System.out.println("Érvénytelen szám, próbáld újra!");
      }
    
    }
  }
  // ide jön a példányosító objectFactory() metódus, ami az itteni adatbekérőket használja (ezeket mainből törlöm).

  public static Ujsag objectFactory(){

    String tipus = UjsagInput.stringBekeres("Add meg az újság típusát(Ujsag/Hetilap/Napilap");
    String megnevezes = UjsagInput.stringBekeres("Add meg a megnevezést");
    String kiado = UjsagInput.stringBekeres("Add meg a kiadót");
    double ar = UjsagInput.doubleBekeres("Add meg az árat");

    // példányosítás
    if(tipus.equalsIgnoreCase("Hetilap")){
      int hetiMegjelenesSzam = UjsagInput.intBekeres("Add meg a heti megjelenések számát");
      return new Hetilap(megnevezes, kiado, ar, hetiMegjelenesSzam);
    }else if(tipus.equalsIgnoreCase("Napilap")){
      int hetiMegjelenesSzam = UjsagInput.intBekeres("Add meg a heti megjelenések számát");
      return new Napilap(megnevezes, kiado, ar, hetiMegjelenesSzam);
    } else {
      return new Ujsag(megnevezes, kiado, ar);
    }

  }
} 
