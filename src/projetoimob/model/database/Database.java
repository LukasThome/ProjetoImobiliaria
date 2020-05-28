
package projetoimob.model.database;

import java.sql.Connection;

/**
 *
 * @author thome
 */
public interface Database {
    //metodo de conexao
    public Connection conectar();
    //metodo de desconectr
    public void desconectar(Connection conn);
    
    
    
}
