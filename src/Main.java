import Domaine.News;
import Persistence.NewsDAO;
import Persistence.ReporterDAO;

import java.sql.Date;
import java.sql.SQLException;

public class Main {
    public  static void main(String[] args) throws SQLException, ClassNotFoundException{
        ReporterDAO reporterDAO = new ReporterDAO();
        reporterDAO.read(2);
        NewsDAO newsDAO = new NewsDAO();
        newsDAO.read(1);
        News news = new News("toto","tototata",new Date(1212580300),1);
        NewsDAO newsDAO1 = new NewsDAO();
        newsDAO1.insert(news);

    }
}
