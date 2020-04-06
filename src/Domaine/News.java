package Domaine;

import java.sql.Date;

        public class News {
                public String titre;
                public String contenu;
                public Date date;
                public int id_reporter;
                public int id;

                public News(String titre,String contenu,Date date, int id_reporter){
                        this.titre = titre;
                        this.contenu = contenu;
                        this.date = date;
                        this.id_reporter = id_reporter;

                }

}
