package Dto;

import java.sql.Date;

public class DtoNew {
    private String titre;
    private String contenu;
    private Date date;
    private String tags;
    private String pseudo ;

    public DtoNew(String pseudo, String titre,String contenu,Date date, int id_reporter){
        this.pseudo = pseudo;
        this.titre = titre;
        this.contenu = contenu;
        this.date = date;
        this.tags = tags;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getTitre() {
        return titre;
    }

    public String getContenu() {
        return contenu;
    }

    public Date getDate() {
        return date;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getTags() {
        return tags;
    }

    public String getPseudo() {
        return pseudo;
    }
    public DtoNew(){

    }
}
