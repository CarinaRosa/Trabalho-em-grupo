package Projeto2_2b.Agenda;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
// import java.util.Collections;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        Pessoa contato[] = new Pessoa[1];
        // Pessoa email;
        // Pessoa telefone;
        // Pessoa endereco;
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < contato.length; i++) {

            System.out.printf("\n-------- Contato --------\n");

            System.out.println("Nome: ");
            String nome = teclado.next();
            System.out.println("RG: ");
            String rg = teclado.next();
            System.out.println("Data de Nascimento: ");
            String data = teclado.next(); 

            contato[i] = new Pessoa(nome, rg, data);


            System.out.printf("\n-------- Email --------\n");

            System.out.println("Informe o email principal: ");
            String email1 = teclado.next();
            System.out.println("Informe o email secundario: ");
            String email2 = teclado.next();

            Pessoa e = new Pessoa(nome, rg, data);
            e.getEmail().put("Email principal", email1);
            e.getEmail().put("Email secundario", email2);


            System.out.printf("\n-------- Telefone --------\n");

            System.out.println("Informe telefone Residencial: ");
            String tell1 = teclado.next();
            System.out.println("Informe telefone Comercial: ");
            String tell2 = teclado.next();
            System.out.println("Informe numero Celular: ");
            String tell3 = teclado.next();

            Pessoa t = new Pessoa(nome, rg, data);
            t.getTelefone().put("Residencial", tell1);
            t.getTelefone().put("Comercial", tell2);
            t.getTelefone().put("Celular", tell3);


            System.out.printf("\n-------- Endereço Residencial--------\n");

            /*Pessoa residencial[] = new Pessoa[6];
            for (int j = 0; j < residencial.length; j++) {                
                System.out.println("Logradouro: ");
                residencial[0] = teclado.next();
                System.out.println("Numero: ");
                residencial[1] = teclado.nextInt();
                System.out.println("Complemento: ");
                residencial[2] = teclado.next();
                System.out.println("Bairro: ");
                residencial[3] = teclado.next();
                System.out.println("CEP: ");
                residencial[4] = teclado.next();
                System.out.println("Cidade: ");
                residencial[5] = teclado.next();
            }*/

            System.out.println("Logradouro: ");
            String log = teclado.next();
            System.out.println("Numero: ");
            int num = teclado.nextInt();
            System.out.println("Complemento: ");
            String comp = teclado.next();
            System.out.println("Bairro: ");
            String bairro = teclado.next();
            System.out.println("CEP: ");
            String cep = teclado.next();
            System.out.println("Cidade: ");
            String cid = teclado.next();

            String residencial = log + num + comp + bairro + cep + cid;

            System.out.printf("\n-------- Endereço Comercial--------\n");

            System.out.println("Logradouro: ");
            String log2 = teclado.next();
            System.out.println("Numero: ");
            int num2 = teclado.nextInt();
            System.out.println("Complemento: ");
            String comp2 = teclado.next();
            System.out.println("Bairro: ");
            String bairro2 = teclado.next();
            System.out.println("CEP: ");
            String cep2 = teclado.next();
            System.out.println("Cidade: ");
            String cid2 = teclado.next();

            String comercial = log2 + num2 + comp2 + bairro2 + cep2 + cid2;

            Pessoa end = new Pessoa(nome, rg, data);
            end.getEndereco().put("Residencial", residencial);
            end.getEndereco().put("Comercial", comercial);
        }

        System.out.println("\n --------- Lista de Contatos ---------- \n");
        for (int i = 0; i < contato.length; i++) {
            System.out.println(contato[i].toString());
            
        }
        
        teclado.close();

        // pessoas.add(new Pessoa("Carina", "13442255-3", "10/11/1997", "Rua Huehue", 123, "casa", "Legal", "81444-333", "Paranagua"));

        // pp.add(new Endereco("Rua Huehue", 123, "casa", "Legal", "81444-333", "Paranagua"));

        // for (Pessoa p : pessoas) {
        //     System.out.println(p);
        // }
        // System.out.println("\n---------------ORDENAÇÃO---------------\n");
        // Collections.sort(pessoas);
        
        // // Pessoa p = new Pessoa("Carina", "13442255-3", "10/11/1997", "Rua Huehue", 123, "casa", "Legal", "81444-333", "Paranagua");
        // p.getEmail().put("Email principal", "carina@gmail.com");
        // p.getEmail().put("Email secundario", "carina_2@gmail.com");

        // p.getTelefone().put("Residencial", "41 3333-3333");
        // p.getTelefone().put("Comercial", "41 3222-3222");
        // p.getTelefone().put("celular", "41 99999-8888");

        // p.getEndereco().put("Residencial", "Casa");
        // p.getTelefone().put("Comercial", "Trabalho");

        // Endereco end = new Endereco("Rua Huehue", 123, "casa", "Legal", "81444-333", "Paranagua");

        // end.getLogradouro();
        // end.getNumero();
        // end.getComplemento();
        // end.getBairro();
        // end.getCep();
        // end.getCidade();

        // for (Endereco e : pessoas) {
        //     System.out.println(e);
        // }

        // System.out.println("\n---------------ORDENAÇÃO---------------\n");
        // Collections.sort(pessoas);

        
        // System.out.printf("Email: %s;\nTelefone: %s;\nEndereço: %s", p.getEmail().get("Email principal"), p.getTelefone().get("celular"), p.getEndereco().get("Casa"));

              
        
    }
}
