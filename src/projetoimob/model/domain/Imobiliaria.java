package projetoimob.model.domain;

import java.sql.Date;

/**
 *
 * @author thome
 */
public class Imobiliaria extends PessoaJuridica{
    
    private int id_Imobiliaria;
    private int id_Codigo_Imobiliaria;
    private int numero_Creci;
    
    //contrutor

    
    ///get e set

    public int getId_Imobiliaria() {
        return id_Imobiliaria;
    }

    public void setId_Imobiliaria(int id_Imobiliaria) {
        this.id_Imobiliaria = id_Imobiliaria;
    }

    public int getId_Codigo_Imobiliaria() {
        return id_Codigo_Imobiliaria;
    }

    public void setId_Codigo_Imobiliaria(int id_Codigo_Imobiliaria) {
        this.id_Codigo_Imobiliaria = id_Codigo_Imobiliaria;
    }

    public int getNumero_Creci() {
        return numero_Creci;
    }

    public void setNumero_Creci(int numero_Creci) {
        this.numero_Creci = numero_Creci;
    }
    
}
