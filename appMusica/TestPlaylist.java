package appMusica;

public class TestPlaylist{
    public static void main(String[] args){
        Playlist playlist = new Playlist();
        System.out.println("numero canzoni: "+playlist.getNCanzoni());
        if(playlist.aggiungiCanzone(new Canzone("a","b",120))){
            System.out.println("canzone aggiunta");
        }else{
            System.out.println("canzone non aggiunta");
        }
        if(playlist.aggiungiCanzone("c", "d", 180)){
            System.out.println("canzone aggiunta");
        }else{
            System.out.println("canzone non aggiunta");
        }
        if(playlist.aggiungiCanzone("e", "d", 210)){
            System.out.println("canzone aggiunta");
        }else{
            System.out.println("canzone non aggiunta");
        }
        System.out.println("numero canzoni: "+playlist.getNCanzoni());
        if(playlist.cancellaCanzone(new Canzone("a","b",120))){
            System.out.println("canzone eliminata");
        }else{
            System.out.println("canzone non trovata");
        }
        Canzone[] canzoni=playlist.ricercaCanzoni("d");
        System.out.println("canzoni cantate da 'd' : ");
        for (int i=0; i<canzoni.length;i++){
            System.out.println(canzoni[i]+" ");
        }
        System.out.println("cantante di 'c' : "+playlist.ricercaCantante("c"));
        System.out.println("\n\nplaylist finale:\n"+playlist);
    }
}