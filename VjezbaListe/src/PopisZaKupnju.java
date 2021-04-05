import java.util.ArrayList;

public class PopisZaKupnju {
    //stvaram listu u koju pohranjujem podatke tipa "String". Ime liste je popisZaKupnju
    private ArrayList<String> popisZaKupnju =  new ArrayList<>();

    public void dodajStvar(String stvar){
        popisZaKupnju.add(stvar);
    }

    // +1 dodajem jer indeksiranje u listi počinje od 0, ljudi obično stvari svrstavaju od 1...stoga
    //unosim  + 1 kako bi na popisu stvari bile sortirane od broja 1
    public void ispišiPopisZaKupnju(){
        for(int i = 0; i < popisZaKupnju.size(); i++){
            System.out.println((i+1) + ". " + popisZaKupnju.get(i));
        }
    }

    public void azurirajStvarNaPopisu(int pozicija, String novaStvar){
        popisZaKupnju.set(pozicija, novaStvar);
        System.out.println("Stvar " + (pozicija + 1) + " je ažurirana!");
    }

    public  void ukloniStvarSaPopisa(int pozicija){
        String stvarZaBrisanje = popisZaKupnju.get(pozicija);
        popisZaKupnju.remove(pozicija);
    }

    public String pronadiStvar(String trazenaStvar){
        int pozicija = popisZaKupnju.indexOf(trazenaStvar);
        if(pozicija >= 0){
            return popisZaKupnju.get(pozicija);
        }
        return null;
    }
}
