
package projetoimob.model.database;

import java.sql.Connection;

        
/**
 *
 * @author thome
 */
public class DatabaseFactory {
    
    //metodo para escolher o tipo de banco de dados, neste caso podera optar por MySQL ou PostGreSQL
    
    public static Database getDatabase(String nome)
    {
        if (nome.equals("postgresql"))
        {
            return (Database) new DatabasePostgreSQL();
        }
        else if(nome.equals("mysql")){
            
            return (Database) new DatabaseMySQL() {
                @Override
                public void desconectar(Connection conn) {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            };
        }
        return null;
    
    }
}
