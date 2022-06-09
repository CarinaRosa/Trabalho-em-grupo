package Projeto2_2b.Agenda;


// import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Pessoa{
    private String nome;
    private String rg;
    private String data;
    private Map<String, String> email;
    private Map<String, String> telefone;
    private Map<String, String> endereco;

    public Pessoa(String nome, String rg, String data){
        this.nome = nome;
        this.data = data;
        this.rg = rg;

        this.email = new HashMap<String, String>();
        this.telefone = new HashMap<String, String>();
        this.endereco = new HashMap<String, String>();
        
    }

    @Override
    public String toString(){
        return String.format("Nome: %s; RG: %s; Data de nascimento: %s; Email: %s", nome, rg, data, p.getEmail().get("Email principal"), p.getTelefone().get("celular"), p.getEndereco().get(""));
    }

    public Map<String, String> getEmail() {
        return email;
    }
    public Map<String, String> getEndereco(String logradouro, int numero, String complemento, String bairro, String cep,
    String cidade) {
        return endereco;
    }
    public Map<String, String> getTelefone() {
        return telefone;
    }

}