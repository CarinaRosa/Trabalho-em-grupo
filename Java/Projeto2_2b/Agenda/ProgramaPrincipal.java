// Feito por Ana Chaves e Carina Rosa
package Projeto2_2b.Agenda;

import java.util.List;
import java.util.Scanner;

import java.util.ArrayList;
// import java.util.Collections;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        Pessoa contato[] = new Pessoa[1];
              
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

            contato[i].getEmail().put("EmailPrincipal", email1);
            contato[i].getEmail().put("EmailSecundario", email2);

            System.out.printf("\n-------- Telefone --------\n");

            System.out.println("Informe telefone Residencial: ");
            String tell1 = teclado.next();
            System.out.println("Informe telefone Comercial: ");
            String tell2 = teclado.next();
            System.out.println("Informe numero Celular: ");
            String tell3 = teclado.next();
           
            contato[i].getTelefone().put("Residencial", tell1);
            contato[i].getTelefone().put("Comercial", tell2);
            contato[i].getTelefone().put("Celular", tell3);


            System.out.printf("\n-------- Endereço Residencial--------\n");
          
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
        
            String residencial = "\nRua: " + log + ", " + "\nNumero: " + num + ", " +  "\nComplemento: " + comp + ", " + "\nBairro: " + bairro + ", " + "\nCEP: " + cep + ", " + "\nCidade: " + cid;
            
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
            
            String comercial = "\nRua: " + log2 + ", " + "\nNumero: " + num2 + ", " +  "\nComplemento: " + comp2 + ", " + "\nBairro: " + bairro2 + ", " + "\nCEP: " + cep2 + ", " + "\nCidade: " + cid2;

            contato[i].getEndereco().put("Residencial", residencial);
            contato[i].getEndereco().put("Comercial", comercial);
               
        }

        
        System.out.println("\n --------- Lista de Contatos ---------- \n");
        for (int i = 0; i < contato.length; i++) {
            System.out.println(contato[i].toString());
            
        }

        
        // System.out.println("\n---------------ORDENAÇÃO---------------\n");
        // Collections.sort(pessoas);

            
        teclado.close();

        

              
        
    }
}
