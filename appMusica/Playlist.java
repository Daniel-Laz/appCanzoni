package appMusica;

public class Playlist {
    private Canzone[] miaPlaylist;
    private int nCanzoni=0;

    public Playlist(){
        miaPlaylist=new Canzone[100];
    }

    public void setPlaylist(Canzone[] miaPlaylist){
        this.miaPlaylist=miaPlaylist;
    }
    public Canzone[] getPlaylist(){
        return miaPlaylist;
    }
    public int getNCanzoni(){
        return nCanzoni;
    }

    public boolean aggiungiCanzone(Canzone canzone){
        if(nCanzoni==miaPlaylist.length){
            return false;
        }
        miaPlaylist[nCanzoni]=canzone;
        nCanzoni++;
        return true;
    }

    public boolean aggiungiCanzone(String canzone,String cantante,int durata){
        if(nCanzoni==miaPlaylist.length){
            return false;
        }

        miaPlaylist[nCanzoni]=new Canzone(canzone,cantante,durata);
        nCanzoni++;
        return true;
    }

    public boolean cancellaCanzone(Canzone canzone){
        for (int i = 0; i<nCanzoni; i++){
            if (miaPlaylist[i].toString().equals(canzone.toString())){
                for (int j=0; j<nCanzoni-1;j++){
                    miaPlaylist[j]=miaPlaylist[j+1];
                }
                nCanzoni--;
                return true;
            } 
        }
        return false;
    }

    public String ricercaCantante(String canzone){
        for(int i=0; i<nCanzoni;i++){
            if(miaPlaylist[i].getCanzone().equals(canzone)){
                return miaPlaylist[i].getCantante();
            }
        }
        return null;
    }

    public Canzone[] ricercaCanzoni(String cantante){
        int contatore = 0;
        // viene contato da quanti elementi è composto l'array
        for (int i=0; i<nCanzoni;i++){
            if(miaPlaylist[i].getCantante().equals(cantante)){
                contatore++;
            }
        }
        Canzone[] canzoni = new Canzone[contatore];
        // la variabile contatore viene riutilizzata per sistemare gli elementi nell'array
        contatore = 0;
        for (int i=0; i<nCanzoni;i++){
            if(miaPlaylist[i].getCantante().equals(cantante)){
                canzoni[contatore]=miaPlaylist[i];
                contatore++;
            }
        }
        return canzoni;
    }

    public String toString(){
        String out="[";
        for (int i=0; i<nCanzoni-1;i++){
            out+=miaPlaylist[i].toString()+", ";
        }
        // non viene messa la virgola all'ultimo elemento
        out+=miaPlaylist[nCanzoni-1].toString();
        out+="]";
        return out;
    }
}
