package varia.java.pkg1;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        Scanner skanneri = new Scanner(System.in);
    
    /*
        Ohjeet:
        Tehtävien koodit on kommentoitu yli joko multi-line(/*)-kommenteilla
        tai normaaleilla yhden rivin kommenteilla(//). Aina kun olet saanut
        tehtävän valmiiksi kommentoi valmis tehtävä yli jotta et tulosta edellisten
        tehtävien vastauksia tai sotke muuten koodiasi mahdollisilla ongelmilla.
        Muista myös tallentaa tehtäväsi säännöllisesti.
        */
    
    
    
    
    /*
    Tehtävä 1: Listat
    
    Poista alla olevasta koodista multi-line kommentit ja suorita ohjelma.
    */
    
    /*
    int lista[] = {1,2,3,4};
        System.out.println(lista[0]);
        System.out.println(lista[1]);
        System.out.println(lista[2]);
        System.out.println(lista[3]);
    */
    
    /*
    Mitä ohjelma tekee? Mitä tapahtuu jos listassamme on 1000 integeriä?
    joudummeko kirjoittamaan System.out.println(); 1000 kertaa?
    */  
            
    
    
    /*
    Tehtävä 2: for-loop
    
    Vastaus edelliseen kysymykseen = Emme onneksi joudu koska käytämme for-looppia.
    Poista alla olevasta koodista multi-line kommentit ja suorita koodi.
    */
    
    /*
    int lista[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    
    for(int i = 0; i<20; i++){
        System.out.println(lista[i]);
    }
    */
    
    
    
    /*
    Tehtävä 2.1: Tee alle lista joka pitää sisällään vähintään 10 itse määrittämääsi integeriä.
    Tulosta for-looppia käyttäen listan 7 ensimmäistä integeriä konsoliin
    */
    
    
    //Koodisi tähän
    
    /*
    int lista[] = {45,53,1,53,63,94,0,5,74,12};
    
    for(int i = 0; i<7; i++) {
        System.out.println(lista[i]);
        }
     */
    
    
    
    
    
    
    /*
    Tehtävä 2.2: Tee alle lista joka sisältää 20 integeriä, kysy käyttäjältä
    kuinka monta integeriä hän haluaa listasta tulostaa.
    tulosta vaadittu määrä listan alkioita KÄYTTÄJÄN SYÖTTÄMÄN INTEGERIN PERUSTEELLA.
    
    esimerkki: int x = skanneri.nextInt();
    */
    
    
    //Koodisi tähän
    
    /*
    int lista[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    System.out.println("Kuinka monta integeriä haluat listasta tulostaa?");
    int listantulostus = skanneri.nextInt();
    for (int i = 0; i<listantulostus; i++){
        System.out.println(lista[i]);
    }
    */
    
    
    
    
    /*
    Tehtävä 2.3: Lista merkkijonoja (String)
    
    Alla on luotu lista String tyyppisiä muuttujia, haluatko laskea montako niitä on?
    et tietenkään vaan haluat käyttää lista.length metodia listan pituuden määrittämiseen.
    tulosta listan muuttujat for looppia käyttäen.
    esimerkki: i<lista.length
    */
    
    //String lista[] = {"Moi","nimeni","on","Pekka","ja","tykkään","ohjelmoinnista","jos","minun","pitäisi","vastata","kysymykseen","mitä","haluan","tehdä","aikuisena","tulisi","minun","sanoa","haluavani","olla","hyvä","koodaaja","sekä","arvostettu","osa","yhteiskuntaa","tämä","tehtävä","on","mielestäni","hauska","tapa","oppia","käyttämään","lista.length","komentoa","juhuu","opin","tässä","tehtävässä","paljon","asioita"};
    
    
    //Koodisi tähän
    
    /*
     String lista[] = {"Moi","nimeni","on","Pekka","ja","tykkään","ohjelmoinnista","jos","minun","pitäisi","vastata","kysymykseen","mitä","haluan","tehdä","aikuisena","tulisi","minun","sanoa","haluavani","olla","hyvä","koodaaja","sekä","arvostettu","osa","yhteiskuntaa","tämä","tehtävä","on","mielestäni","hauska","tapa","oppia","käyttämään","lista.length","komentoa","juhuu","opin","tässä","tehtävässä","paljon","asioita"};
     for (int i = 0; i<lista.length; i++){
         System.out.println(lista[i]);
     }
    */   
    
    
    /*
    Tehtävä 3: Arraylist
    Poista alla olevasta koodista multi-line kommentit ja suorita koodi.
    */
    
    /*
    ArrayList<Integer> lista = new ArrayList<Integer>();
    lista.add(10);
    lista.add(20);
    lista.add(30);
    
    System.out.println(lista);
    */
    
    //Mitä koodissa tapahtuu? Miten tämä eroaa aiemmin tekemästämme listasta?
    
    
    /*
    Tehtävä 3.1
    
    Luo alle ArrayList joka sisältää String tyyppisiä muuttujia.
    Luo alle kolme vapaasti nimeämääsi String-tyyppistä muuttujaa ja lisää ne listaan.
    Lopuksi for looppia käyttäen tulosta listan sisältö konsoliin.
    */
    
    
    //Koodisi tähän.
    
    /*
   ArrayList<String> lista = new ArrayList<String>();
   String a = "Auto";
   String b = "Talvi";
   String c = "Helsinki";
   lista.add(a);
   lista.add(b);
   lista.add(c);
    for (int i = 0; i<lista.size(); i++){
        System.out.println(lista.get(i));
    }
     
    */
    
    
    
    
    
    /*
    Tehtävä 3.2
    Poista alla olevasta koodista multi-line kommentit
    */
    
    /*
    ArrayList<Double> lista1 = new ArrayList<Double>();
    double luku1 = 1;
    double luku2 = 2;
    double luku3 = 3;
    lista1.add(luku1);
    lista1.add(luku2);
    lista1.add(luku3);
    
    ArrayList<Double> lista2 = new ArrayList<Double>();
    
    for(int i = 0; i<lista1.size(); i++){
        lista2.add(lista1.get(i));
    }
        System.out.println(lista2);
    */
    
    /*
    Mitä ohjelma tekee? Miten tästä tavasta voisi olla hyötyä ohjelmoinnissa?
    Seuraavaksi teet ArrayListin joka koostuu neljästä(4) String tyyppisestä muuttujasta.
    Tee toinen ArrayList joka ottaa sisäänsä String tyyppisiä muuttujia. Lisää ensimmäisen listan kolme(3) ensimmäistä
    muuttujaa tyhjään listaan for-looppia hyödyntäen. printtaa lopuksi toisena luomasi listan sisältö konsoliin.
    */
    
    //Koodisi tähän.
    
    /*
       ArrayList<String> lista1 = new ArrayList<String>();
       String a = "Kasvi";
       String b = "Päivä";
       String c = "Aurinko";
       String d = "Vesi";
       lista1.add(a);
       lista1.add(b);
       lista1.add(c);
       lista1.add(d);
       ArrayList<String> lista2 = new ArrayList<String>();
       for(int i = 0; i<3; i++){
       lista2.add(lista1.get(i));
       }
        System.out.println(lista2);
    */
    
    
    
    
    
    /*
    Tehtävä 4: While-loop
    
    Olemme tutustuneet for-looppiin, nyt tutustumme hyvin samankaltaiseen looppiin.
    Kyseessä on tietysti while-loop. Poista alla olevasta koodista multi-line kommentit
    ja suorita ohjelma.
    */
    
    /*
    boolean totuus = true;
    
    while(totuus=true){
        System.out.println("Totuus on totta");
    }
    */
    
    
    /*
    Kuten huomaat ohjelma jatkaa konsoliin printtaamista ikuisesti. Tämä on siis
    huonosti suunniteltu while loop. Mitäpä jos koodaisimme ohjelman hieman toisella
    tavalla? Toteuta alle koodi jossa luot yhden integer tyyppisen muuttujan. Anna muuttujalle
    arvo ja tee while loop joka toistaa seuraavan asian 10 kertaa juuri luomasi integerin avulla.
    vinkki: Tee while loop samaa logiikkaa käyttäen kuin for-loopissa.
    */
    
    
    //Koodisi tähän.
    /*
    int luku = 0;
    while(luku < 10){
        System.out.println(luku);
        luku = luku +1;
    }
    */
    
    
    
    
    /*
    Tehtävä 4.1
    
    Poista alla olevasta koodista multi-line kommentit ja suorita koodi.
    */
    
    /*
    boolean totuus = true;
    int i = 30;
    
    while(totuus = true && i < 10 ){
        System.out.println("Tämä ei toimi");
        
    }
    */
    
    /*
    Kuten huomaat ohjelma ei printtaa mitään. Korjaa koodia WHILE LOOPIN EHTOJA MUUTTAMATTA
    siten että ohjelma printtaa konsoliin tekstin  "Tämä toimii" 15 kertaa
    */
    /*
    boolean totuus = true;
    int i = 30;
    
    while(totuus = true && i < 45 ){
        System.out.println("Tämä toimii");
        i = i + 1;
        
    }
    */
    
    
    
    
    
    /*
    Tehtävä 4.2
    Poista multi-line kommentit alta ja suorita ohjelma.
    */
    
    /*
    String nimi = "Musti";
    
    while(nimi != "Hessu"){
        System.out.println("Koiran nimi ei ole Hessu");
    }
    while(nimi == "Hessu"){
        System.out.println("Koiran nimi on Hessu! Hyvä!");
        break;
    }
    */
    
    /*
    Tutki miten koodi toimii ja laita se toistamaan "Koiran nimi on Hessu! Hyvä!" kolme(3) kertaa
    */
    /*
     String nimi = "Hessu";
    
    while(nimi != "Hessu"){
        System.out.println("Koiran nimi ei ole Hessu");
    }
    while(nimi == "Hessu"){
        System.out.println("Koiran nimi on Hessu! Hyvä!");
        System.out.println("Koiran nimi on Hessu! Hyvä!");
        System.out.println("Koiran nimi on Hessu! Hyvä!");

        break;
    }
    */
    
    /*
    Tehtävä 5: If-else
    Poista kommentit alla olevasta koodista ja aja ohjelma.
    */
        
    /*
        System.out.println("Anna nimesi: ");
        String nimi = skanneri.nextLine();
        System.out.println("Anna ikäsi");
        int ika = skanneri.nextInt();
        
        if(ika < 18){
            System.out.println("Moi " + nimi + " olet vasta " + ika + " vuotta vanha, eli et saa ostaa alkoholia");
        }else if(ika >= 18){
            System.out.println("Moi " + nimi + " olet jo " + ika + " vuotta vanha joten saat ostaa alkoholia");
        }
    */
    
    
    /*
    Tutki miten koodi toimii ja toteuta alle seuraavanlainen ohjelma:
    Ohjelma kysyy käyttäjältä hänen ikäänsä ja sukupuoltansa.
    
    Ohjelmassa tulee olla seuraavat vaihtoehdot (vähintään)
    mies alle 18 vuotta, mies yli 18 vuotta. Nainen alle 18 vuotta, nainen yli 18 vuotta
    
    Ohjelman tulee vastata käyttäjälle jotain asiallista hänen ikäänsä liittyen.
    Esim: "Olet nainen ja 20 vuotta vanha. Olet vielä nuori ja sinulla on valoisa tulevaisuus".
    Esim2: "Plet mies ja 65 vuotta. Onneksi olkoon pitkästä iästäsi!"
    */
    
    //Koodisi tähän.
    /*
        System.out.println("Anna sukupuolesi: ");
        String sukupuoli = skanneri.nextLine();
        System.out.println("Anna ikäsi");
        int ika = skanneri.nextInt();
        
        if(ika < 20){
            System.out.println("Olet " + sukupuoli + " ja " + ika + " vuotta vanha, sinulla on edessä valoisa tulevaisuus!");
        }else if(ika >= 60){
            System.out.println("Olet " + sukupuoli + " ja " + ika + ", olet varmasti viisas!");
        }
    */
    
    
    /*
    Tehtävä 6: Lopputehtävä
    
    Tee alle aluksi ArrayList joka ottaa sisäänsä String tyyppisiä muuttujia.
    Käytä skanneria kysyäksesi käyttäjältä minkä tuotteen hän haluaisi tilata.
    Jos tuotteen merkkijono on yli 0 pituinen lisätään tuote listaan.
    Jos tuote on 0 pituinen merkkijono pitää ohjelman kehottaa käyttäjää antamaan kelvollisen tuotenimen.
    Ohjelman tulee toistaa tämä operaatio 4 kertaa jonka jälkeen ohjelma tulostaa listan sisällön käyttäjälle.
    */
    /*
     ArrayList<String> lista = new ArrayList<String>();
     int i = 0;
while(i < 4){
    System.out.println("Syötä tuoteen nimi jonka haluaisit tilata: ");
    String tuote = skanneri.nextLine();
    if(tuote.length()>0){
    lista.add(tuote);
    i = i+1;
    }
    else{
        System.out.println("Anna kelvollisen tuotteen nimi.");
    }
}
        System.out.println(lista);
 */


}
}
