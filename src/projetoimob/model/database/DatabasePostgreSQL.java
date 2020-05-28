
package projetoimob.model.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author thome
 */
public class DatabasePostgreSQL{

    private Connection connection;
    
    public Connection conectar()
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            this.connection = DriverManager.getConnection("jdbc:postgresql://","user","passw");
            return this.connection;
        }
        catch(SQLException | ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco MySQL : " + ex);
            return null;
        }
    }
    
    public Connection desconectar(Connection connection)
    {
        try
        {
            connection.close();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Não foi possível desconectar ao banco MySQL : " + ex);
            return null;
        }
        return null;
    }
    
}
