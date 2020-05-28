/*

 */
package projetoimob.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import projetoimob.model.domain.Cidades;

/**
 *
 * @author thome
 */
public class CidadesDAO {
    
    private Connection connection;
    
    //get e set da conexao
    public Connection getConnection()
    {
        return connection;
    }
    
    public void setConnection(Connection connection)
    {
        this.connection = connection;
    }
    
    //método inserir
    public boolean inserir(Cidades cidades)
    {
        String sql = "INSERT INTO tb_cidades (nome_Cidade, tb_estados_id_Estado) VALUES (?, ?)";
        
        try
        {
            PreparedStatement stmt = connection.prepareStatement(sql);
           
            stmt.setString(1, cidades.getNome_Cidade());
            stmt.setInt(2, cidades.getId_Estado());
        
            stmt.execute();
            
            return true;
        }
        catch(SQLException ex)
        { 
            JOptionPane.showMessageDialog(null, "Não foi possível inserir ao banco: " + ex);
            return false;  
        }
        
    }
    
    //método para alterar
    public boolean alterar(Cidades cidades)
    {
        String sql = "UPDATE tb_cidades SET nome_Cidade = ?, tb_estados_id_Estado = ? WHERE id_Cidade= ?";
        
        try
        {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cidades.getNome_Cidade());
            stmt.setInt(2, cidades.getId_Estado());
            stmt.setInt(3, cidades.getId_Cidade());   

            stmt.execute();
            
            return true;
        }
        catch(SQLException ex)
        { 
            JOptionPane.showMessageDialog(null, "Não foi possível alterar do banco: " + ex);
            return false;  
        }
    }
    
    //método para remover
    public boolean remover(Cidades cidades)
    {
        String sql = "DELETE FROM tb_cidades WHERE id_Cidade = ?";
        
        try
        {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, cidades.getId_Cidade());
            
            stmt.execute();
            
            return true;
        }
        catch(SQLException ex)
        { 
            JOptionPane.showMessageDialog(null, "Não foi possível remover do banco: " + ex);
            return false;  
        }
    }
    
    //método para listar
    public List<Cidades> lista()
    {
        String sql = "SELECT * FROM tb_cidades";
        
        List<Cidades> retorno = new ArrayList<>();
        
        try
        {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet resultado = stmt.executeQuery();
            
            while(resultado.next())
            {
                Cidades cidades = new Cidades();
                cidades.setId_Cidade(resultado.getInt("id_Cidade"));
                cidades.setNome_Cidade(resultado.getString("nome_Cidade"));
                

                //vamos adicionando a liss retorno
                retorno.add(cidades);
            }        
                      
        }
        catch(SQLException ex)
        { 
            JOptionPane.showMessageDialog(null, "Não foi possível listar do banco: " + ex);
              
        }
        
        return retorno;
        
    }
    
    //método para buscar
    public Cidades buscar(Cidades cidades)
    {
        String sql = "SELECT * FROM tb_cidades id = id_Cidade ?";
        
        Cidades retorno = new Cidades();
        
        try
        {
            PreparedStatement stmt = connection.prepareStatement(sql);
                  
            stmt.setInt(1, cidades.getId_Cidade());
            stmt.setString(2, cidades.getNome_Cidade());        
            
            ResultSet resultado = stmt.executeQuery();
            
            if(resultado.next())
            {
                cidades.setId_Cidade(resultado.getInt("id_Cidade"));
                cidades.setNome_Cidade(resultado.getString("nome_Cidade"));
                
                
                retorno = cidades;
            }
            
        }
        catch(SQLException ex)
        { 
            JOptionPane.showMessageDialog(null, "Não foi possível buscar do banco: " + ex);
             
        }
        
        return retorno;
    }
    
    //método para listar cidades e estado pela sigla do estado com inner join
    public List<Cidades> listaCidadesEsatdos()
    {
        String sql = "SELECT cidades.id_Cidade, cidades.nome_Cidade, estados.sigla_Estado, estados.id_Estado"
                + " FROM tb_cidades AS cidades INNER JOIN tb_estados AS estados ON "
                + "cidades.tb_estados_id_Estado = estados.id_Estado";
        
        List<Cidades> retorno = new ArrayList<>();
        
        try
        {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet resultado = stmt.executeQuery();
            
            while(resultado.next())
            {
                Cidades cidades = new Cidades();
                
                cidades.setId_Cidade(resultado.getInt("cidades.id_Cidade"));
                cidades.setNome_Cidade(resultado.getString("cidades.nome_Cidade"));
                cidades.setSigla_Estado(resultado.getString("estados.sigla_Estado"));
                cidades.setId_Estado(resultado.getInt("estados.id_Estado"));
                //vamos adicionando a liss retorno
                retorno.add(cidades);
            }        

        }
        catch(SQLException ex)
        { 
            JOptionPane.showMessageDialog(null, "Não foi possível listar do banco: " + ex);
              
        }
        
        return retorno;
        
    }
    
}
