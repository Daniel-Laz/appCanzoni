package appMusica;

public class Canzone{
    private String canzone;
    private String cantante;
    private int durata;

    public String getCanzone(){
        return canzone;
    }
    public String getCantante(){
        return cantante;
    }
    public int getDurata(){
        return durata;
    }

    public void setCanzone(String canzone){
        this.canzone=canzone;
    }
    public void setCantante(String cantante){
        this.cantante=cantante;
    }
    public void setDurata(int durata){
        if(durata<0){
            durata=0;
        }
        this.durata=durata;
    }

    public Canzone(){

    }
    public Canzone(String canzone,String cantante,int durata){
        this.canzone=canzone;
        this.cantante=cantante;
        setDurata(durata);
    }

    public String toString(){
        return canzone+" - "+cantante+" - "+durata;
    }
}