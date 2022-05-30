import java.util.ArrayList;
import java.util.List;

public class Controlador{
     
    public static void main(String[] args) {
        List<Livro> livros = new ArrayList<Livro>();
        Double opcao= 0.0;
        String[] input;
        int codigo=0;

        while(opcao != 4){
            System.console().printf("\nDigite a opção que deseja: \n1- Consultar um registro\n2- Inserir um registro\n3- Deletar um registro\n4- Sair\n");
            input = System.console().readLine().split(" ");
            opcao= Double.parseDouble(input[0]);

            if(opcao==1){
                //Implementação da consulta
            }
            else if(opcao==2){
                codigo++;
                System.console().printf("Digite o título:");
                String titulo = System.console().readLine();
                System.console().printf("Digite o autor:");
                String autor = System.console().readLine();
                System.console().printf("Digite a editora:");
                String editora = System.console().readLine();
                System.console().printf("Digite o preço:");
                String[] inputPreco = System.console().readLine().split(" ");
                Double preco = Double.parseDouble(inputPreco[0]);

                Livro novoLivro = new Livro(codigo, titulo, autor, editora, preco);
                livros.add(novoLivro);
                System.console().printf(novoLivro.toString());
            }
            else if(opcao==3){
                //Implementação do delete
            }
            else if(opcao==4){
                System.console().printf("Opção de saída selecionada!\n");
            }
            else{
                System.console().printf("Opção Inválida!\n");
            }
        }  
    }
    
}
