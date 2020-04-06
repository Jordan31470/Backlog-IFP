package Dto;

import java.sql.Date;

public class DtoNewsReporter {
    private String titre;
    private String contenu;
    private Date date;
    private int id_reporter;
    private String pseudo ;

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setId_reporter(int id_reporter) {
        this.id_reporter = id_reporter;
    }

    public String getContenu() {
        return contenu;
    }

    public Date getDate() {
        return date;
    }

    public int getId_reporter() {
        return id_reporter;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getTitre() {
        return titre;
    }

    public DtoNewsReporter(){

    }

    public DtoNewsReporter(String pseudo, String titre,String contenu,Date date, int id_reporter){
        this.pseudo = pseudo;
        this.titre = titre;
        this.contenu = contenu;
        this.date = date;
        this.id_reporter = id_reporter;
    }

    public String getPseudo(){
        return pseudo;
    }
    public void setPseudo(String pseudo){
        this.pseudo = pseudo;
    }


}
