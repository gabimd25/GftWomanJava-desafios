import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controlador{
     
    public static void main(String[] args) {
        List<Livro> livros = new ArrayList<Livro>();
        Scanner scan = new Scanner(System.in);
        int opcao=0;
        int codigo=0;

        while(opcao != 4){
            System.console().printf("\nDigite a opção que deseja: \n1- Consultar um registro\n2- Inserir um registro\n3- Deletar um registro\n4- Sair\n");
            opcao = scan.nextInt();
            scan.nextLine();
            if(opcao==1){
                System.console().printf("Digite o título:");
                String tituloBusca = scan.nextLine();
                for (Livro livro : livros) {
                    if(livro.getTitulo().equals(tituloBusca)){
                        System.console().printf(livro.toString()+"\n");
                    }
                }
            }
            else if(opcao==2){
                codigo++;
                System.console().printf("Digite o título:");
                String titulo = scan.nextLine();
                System.console().printf("Digite o autor:");
                String autor = scan.nextLine();
                System.console().printf("Digite a editora:");
                String editora = scan.nextLine();
                System.console().printf("Digite o preço:");
                Double preco = scan.nextDouble();
                //scan.nextLine(); // limpar o buffer

                Livro novoLivro = new Livro(codigo, titulo, autor, editora, preco);
                livros.add(novoLivro);
                System.console().printf(novoLivro.toString());
            }
            else if(opcao==3){                
                System.console().printf("Digite o código:");
                int codigoDelete = scan.nextInt();
                System.console().printf("teste");
                //scan.nextLine(); // limpar o buffer
                for(Livro livro : livros) {
                    int cod = livro.getCodigo();                    
                    if(cod == codigoDelete){
                        livros.remove(livro);
                        break;
                    }
                }
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
