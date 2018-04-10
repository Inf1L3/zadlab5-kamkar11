
package pl.edu.ur.oopl5;


public class Pracownik {
    
    private String imie;      
    private String nazwisko; 
    private String stanowisko;
    private int wiek; 

    public Pracownik(String imie, String nazwisko, String stanowisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stanowisko = stanowisko;
        this.wiek = wiek;
    }
    
    public Pracownik() {
        
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
    
    public void pokazDane() {
        System.out.println("Pracownik");
        System.out.println("imię: " + this.imie);
        System.out.println("nazwisko: " + this.nazwisko);
        System.out.println("stanowisko: " + this.stanowisko);
        System.out.println("wiek: " + this.wiek + " lat");
    }
    
    
}
