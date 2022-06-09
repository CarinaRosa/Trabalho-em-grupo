package Projeto2_2b.Agenda;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Pessoa{
    private String nome;
    private String rg;
    private Date data;
    private Map<String, String> email;
    private Map<String, String> telefone;
    private Map<String, String> endereco;

    public Pessoa(String nome, String rg, Date data){
        this.nome = nome;
        this.data = data;
        this.rg = rg;

        this.email = new HashMap<String, String>();
        this.telefone = new HashMap<String, String>();
        this.endereco = new HashMap<String, String>();
    }
}