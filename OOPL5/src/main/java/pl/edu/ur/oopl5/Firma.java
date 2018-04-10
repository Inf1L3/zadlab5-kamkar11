package pl.edu.ur.oopl5;

import java.util.Scanner;


public class Firma extends Pracownik{

    Scanner input = new Scanner(System.in);

    private Pracownik tab[];
 // Pracownik[] tab = new Pracownik[100];

    public Firma(String imie, String nazwisko, String stanowisko, int wiek) {
        super(imie, nazwisko, stanowisko, wiek);
        
    }
   
    
    
    
    public  Firma(){
        int n = 100;
        tab = new Pracownik[n];
        for(int i=0; i<tab.length;i++){
            tab[i] = new Pracownik("", "", "", 0);
        }
    }
    
    

     public void wprDaneNowegoPracownika() {
        System.out.println("Podaj index tablicy do której wprowadzisz dane: [lista pracownikow od 0 do 99]");
        int i = input.nextInt();

        System.out.println("Podaj imię: ");
        String imie = input.next();
        tab[i].setImie(imie);
        System.out.println("Podaj nazwisko: ");
        String nazwisko = input.next();
        tab[i].setNazwisko(nazwisko);
        System.out.println("Podaj stanowisko: ");
        String stanowisko = input.next();
        tab[i].setStanowisko(stanowisko);
        System.out.println("Podaj wiek: ");
        int wiek = input.nextInt();
        tab[i].setWiek(wiek);
        

    }
    
    
    public void listaPracownikow() {
        for (int i = 0; i < 100; i++) {
            System.out.println("  ");
            System.out.println("Imię: " + tab[i].getImie());
            System.out.println("Nazwisko: " + tab[i].getNazwisko());
            System.out.println("Stanowisko: " + tab[i].getStanowisko());
            System.out.println("Wiek: " + tab[i].getWiek());
        }
    }

}
