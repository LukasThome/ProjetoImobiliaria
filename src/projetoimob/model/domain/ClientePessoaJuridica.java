/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoimob.model.domain;

/**
 *
 * @author thome
 */
public class ClientePessoaJuridica extends PessoaJuridica {
    
    private int id_ClientePJ;
    private int id_Codigo_ClientePJ;
    private String status_Comprador;
    private String status_Vendedor;
    private String status_Locatario;
    private String status_Locador;
    
    //construtor

    
    //get e set

    public int getId_ClientePJ() {
        return id_ClientePJ;
    }

    public void setId_ClientePJ(int id_ClientePJ) {
        this.id_ClientePJ = id_ClientePJ;
    }

    public int getId_Codigo_ClientePJ() {
        return id_Codigo_ClientePJ;
    }

    public void setId_Codigo_ClientePJ(int id_Codigo_ClientePJ) {
        this.id_Codigo_ClientePJ = id_Codigo_ClientePJ;
    }

    public String getStatus_Comprador() {
        return status_Comprador;
    }

    public void setStatus_Comprador(String status_Comprador) {
        this.status_Comprador = status_Comprador;
    }

    public String getStatus_Vendedor() {
        return status_Vendedor;
    }

    public void setStatus_Vendedor(String status_Vendedor) {
        this.status_Vendedor = status_Vendedor;
    }

    public String getStatus_Locatario() {
        return status_Locatario;
    }

    public void setStatus_Locatario(String status_Locatario) {
        this.status_Locatario = status_Locatario;
    }

    public String getStatus_Locador() {
        return status_Locador;
    }

    public void setStatus_Locador(String status_Locador) {
        this.status_Locador = status_Locador;
    }
    
            
    
}
