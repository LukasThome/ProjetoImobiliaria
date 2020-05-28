package projetoimob.model.domain;

/**
 *
 * @author thome
 */
public class Cidades extends Estados {
    
    //atributos
    private int id_Cidade;
    private String nome_Cidade;
    
    
    
    //get e set
    public int getId_Cidade() {
        return id_Cidade;
    }

    public void setId_Cidade(int id_Cidade) {
        this.id_Cidade = id_Cidade;
    }

    public String getNome_Cidade() {
        return nome_Cidade;
    }

    public void setNome_Cidade(String nome_Cidade) {
        this.nome_Cidade = nome_Cidade;
    }

  
    
}
