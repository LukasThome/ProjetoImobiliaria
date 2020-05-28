package projetoimob.model.domain;

/**
 *
 * @author thome
 */
public class Enderecos extends Bairros {
    
    private int id__Endereco;
    private String tipo_Logradouro;
    private String logradouro;
    private String numero_Logradouro;
    private String numero_Apartamento;
    private String andar_Apartamento;
    private String bloco_Apartamento;
    private String complemento;
    private String cep;
    private int latitude;
    private int longitude;
    
    //get e set

    public int getId__Endereco() {
        return id__Endereco;
    }

    public void setId__Endereco(int id__Endereco) {
        this.id__Endereco = id__Endereco;
    }

    public String getTipo_Logradouro() {
        return tipo_Logradouro;
    }

    public void setTipo_Logradouro(String tipo_Logradouro) {
        this.tipo_Logradouro = tipo_Logradouro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero_Logradouro() {
        return numero_Logradouro;
    }

    public void setNumero_Logradouro(String numero_Logradouro) {
        this.numero_Logradouro = numero_Logradouro;
    }

    public String getNumero_Apartamento() {
        return numero_Apartamento;
    }

    public void setNumero_Apartamento(String numero_Apartamento) {
        this.numero_Apartamento = numero_Apartamento;
    }

    public String getAndar_Apartamento() {
        return andar_Apartamento;
    }

    public void setAndar_Apartamento(String andar_Apartamento) {
        this.andar_Apartamento = andar_Apartamento;
    }

    public String getBloco_Apartamento() {
        return bloco_Apartamento;
    }

    public void setBloco_Apartamento(String bloco_Apartamento) {
        this.bloco_Apartamento = bloco_Apartamento;
    }
    
    
    
    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }
    
}
