package Persistence;

import java.sql.*;
import Domaine.News;
import Dto.DtoNew;
import Dto.DtoNewsReporter;


public class NewsDAO {

    public DtoNew read(int id) throws SQLException, ClassNotFoundException {
        DtoNew news = new DtoNew();
        ConnectDB connectDB = new ConnectDB();
        Connection cx = connectDB.connection();
        PreparedStatement stmt = cx.prepareStatement("Select pseudo,titre,contenu,date_news,tag from news,reporter,tags,news_tags Where news.id_reporter = reporter.id and news.id = news_tags.id_news and  tags.id = news_tags.id_tag and  news.id = ?");
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            String pseudo = rs.getString(1);
            String titre = rs.getString(2);
            String contenu = rs.getString(2);
            Date dateNews = rs.getDate(4);
            String tags = rs.getString(1);
            //a modifier sur la couche superieur ( dans le main)
            //System.out.println("Titre :" + titre + '\n');
            //System.out.println("Contenu :" + contenu + '\n');
            //System.out.println("Date:" + dateNews + '\n');
            //System.out.println("Pseudo:" + pseudo + '\n');
            //System.out.println("tags:" + tags + '\n');
            news.setTitre(titre);
            news.setPseudo(pseudo);
            news.setContenu(contenu);
            news.setDate(dateNews);
            news.setTags(tags);

        }
        cx.close();
        return news;


    }

    public void insert(News news) throws SQLException, ClassNotFoundException {
        ConnectDB connectDB = new ConnectDB();
        Connection cx = connectDB.connection();
        PreparedStatement stmt = cx.prepareStatement("Insert into news (id_reporter,titre,contenu,date_news) values (?,?,?,?)");
        stmt.setInt(1, news.id_reporter);
        stmt.setString(2, news.titre);
        stmt.setString(3, news.contenu);
        stmt.setDate(4, news.date);
        int rs = stmt.executeUpdate();
        cx.close();
    }

    //Construteur DtoNewsReporter
    //creer mon objet Dto
    public DtoNewsReporter Dto(int id) throws SQLException, ClassNotFoundException {
        DtoNewsReporter news = new DtoNewsReporter();
        ConnectDB connectDB = new ConnectDB();
        Connection cx = connectDB.connection();
        PreparedStatement stmt = cx.prepareStatement("Select pseudo,titre,contenu,date_news,tag from news,reporter,tags,news_tags Where news.id_reporter = reporter.id and news.id = news_tags.id_news and  tags.id = news_tags.id_tag and  news.id = ?");
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            String pseudo = rs.getString(1);
            String titre = rs.getString(2);
            String contenu = rs.getString(2);
            Date dateNews = rs.getDate(4);
            int id_reporter = rs.getInt(5);
            news.setPseudo(pseudo);
            news.setTitre(titre);
            news.setContenu(contenu);
            news.setDate(dateNews);
            news.setId_reporter(id_reporter);

        }
        cx.close();
        return news;
    }
}


