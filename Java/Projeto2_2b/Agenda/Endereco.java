package Projeto2_2b.Agenda;

public class Endereco{
    
    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String cep;
    private String cidade;

    
    public Endereco(String logradouro, int numero,String complemento, String bairro, String cep, String cidade){
               
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
    }

    //getters
    public String getLogradouro() {
        return logradouro;
    }
    public int getNumero() {
        return numero;
    }
    public String getComplemento() {
        return complemento;
    }
    public String getBairro() {
        return bairro;
    }
    public String getCep() {
        return cep;
    }
    public String getCidade() {
        return cidade;
    }

    //setters
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    // @Override
    // public int compareTo(Endereco o) {
    //     return this.bairro.compareTo(o.bairro);
    // }

    // implements Comparable<Endereco>
    //@Override
    // public int compareTo(Endereco o) {
    //     return this.nome.compareTo(o.nome);
    // }

    
}
