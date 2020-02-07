package Persistence;

import java.sql.*;
import Domaine.News;

public class NewsDAO {

    public void read (int id) throws SQLException, ClassNotFoundException {
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
            System.out.println("Titre :" + titre + '\n');
            System.out.println("Contenu :" + contenu + '\n');
            System.out.println("Date:" + dateNews + '\n');
            System.out.println("Pseudo:" + pseudo + '\n');
            System.out.println("tags:" + tags + '\n');
        }
        cx.close();
    }
        public void insert(News news) throws SQLException, ClassNotFoundException {
            ConnectDB connectDB = new ConnectDB();
            Connection cx = connectDB.connection();
            PreparedStatement stmt = cx.prepareStatement("Insert into news (id_reporter,titre,contenu,date_news) values (?,?,?,?)");
            stmt.setInt(1,news.id_reporter);
            stmt.setString(2,news.titre);
            stmt.setString(3,news.contenu);
            stmt.setDate(4,news.date);
            int rs = stmt.executeUpdate();
        cx.close();
        }
}


