import java.util.List;

public class UjsagUtils {

CsvFeldolgozo beolvaso = new CsvFeldolgozo("resources/ujsagok.csv");

 List<Ujsag> ujsagok = beolvaso.beolvasUjsagokat();

public static void Listazo(List<Ujsag> ujsagok){
  for (Ujsag u  : ujsagok){
        System.out.println(u.getMegnevezes() + "-" + u.getAr());
    }
}

public static void Hetilapok(List<Ujsag> ujsagok){
   for (Ujsag n : ujsagok){
      if(n instanceof Hetilap){
        System.out.println(n.getMegnevezes() + "-" + n.getKiado() + "-" + n.getAr() + "-" + n.getHetiMegjelenesSzam());
      }
    }
}

public static void Napilapok(List<Ujsag> ujsagok){
    for (Ujsag n : ujsagok){
      if(n instanceof Napilap && (n.getHetiMegjelenesSzam() >= 6)){
        System.out.println(n.getMegnevezes() + "-" + n.getKiado() + "-" + n.getAr() + "-" + n.getHetiMegjelenesSzam());
      }
    }
}

public static void AltalanosSzamlalo(List<Ujsag> ujsagok){
    int counter = 0;
    for (Ujsag u : ujsagok){
     if (u instanceof Ujsag && !(u instanceof Hetilap) && !(u instanceof Napilap)){
      counter++;
     }
    }
    System.out.println("Általános újságok darabszáma: " + counter);
}

public static void MaxKivalasztas(List<Ujsag> ujsagok){
     double max = 0;
    for(int i = 0; i < ujsagok.size(); i++){
      if(ujsagok.get(i).getAr() > max){
        max = ujsagok.get(i).getAr();
      }
    }

    for(int i = 0; i < ujsagok.size(); i++ )
       if(ujsagok.get(i).getAr() == max){
          System.out.println("A legdrágább termék megnevezése: "+ujsagok.get(i).getMegnevezes()+", áfatartalma: "+ujsagok.get(i).afaTartalomSzamitas());
      }
}


}
