
package projetojava;
import java.util.Scanner;

public class Steam {

    public static void main(String[] args) {
        
        menu(); 
    }
    
    
    public static void menu(){
        int op;
        Scanner entrada = new Scanner(System.in);
        Categoria categoria = new Categoria();
        Jogo jogo = new Jogo();
        
        do{
            System.out.println("- Bem Vindo -\n");
            System.out.println("1 - Cadastrar categoria: ");
            System.out.println("2 - Cadastrar Jogos: ");
            System.out.println("3 - Lista Categorias:");
            System.out.println("<------------->");
            System.out.println("4 - Sair: ");
            op = entrada.nextInt();
        
        
        if(op < 0 || op > 4){
            System.out.println("Opcao invalida!!");
            return;
        }else if (op == 1){
            categoria = new Categoria();
            categoria.cadastrarCategoria();
            Categoria.categorias.add(categoria);
        }else if(op == 2){
            jogo = new Jogo();
            jogo.cadastrarJogo();
            Jogo.listaJogos.add(jogo);
        }else if(op == 3){
            categoria.listarCategorias();
        }   
            
        }while(op != 4);
    }        
}

    
    

