package services;

import model.Ujsag;
import model.Hetilap;
import model.Napilap;

import java.util.ArrayList;
import java.util.List;

public class UjsagUtils {

CsvFeldolgozo beolvaso = new CsvFeldolgozo("resources/ujsagok.csv");

List<Ujsag> ujsagok = beolvaso.beolvasUjsagokat();

public static List<Ujsag> ujsagokOssz(List<Ujsag> ujsagok){
  List<Ujsag> ujsagok1 = new ArrayList<>();
   for (Ujsag u : ujsagok){
        ujsagok1.add(u);
    } 
    return ujsagok1;
}

public static List<Hetilap> hetilapok(List<Ujsag> ujsagok){
  List<Hetilap> hetilapok = new ArrayList<>();
   for (Ujsag u : ujsagok){
    // pattern matchig
      if(u instanceof Hetilap h){
        // down-casting:hetilapok.add((Hetilap) n);
        hetilapok.add(h);
      }
    } 
    return hetilapok;
}

public static List<Napilap> napilapok(List<Ujsag> ujsagok){
  List<Napilap> napilapok = new ArrayList<>();
    for (Ujsag u : ujsagok){
      if(u instanceof Napilap n){
        napilapok.add(n);
      }
    } 
    return napilapok;
}

public static int altalanosSzamlalo(List<Ujsag> ujsagok){
    int counter = 0;
    for (Ujsag u : ujsagok){
     if (u instanceof Ujsag && !(u instanceof Hetilap) && !(u instanceof Napilap)){
      counter++;
     }
    }
    return counter;
}

public static Ujsag maxKivalasztas(List<Ujsag> ujsagok){
   Ujsag legdragabb = ujsagok.get(0);;

    for(int i = 1; i < ujsagok.size(); i++){
      if(ujsagok.get(i).getAr() > legdragabb.getAr()){
        legdragabb = ujsagok.get(i);
      }
    }
    return legdragabb;
}


}
