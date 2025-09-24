
package projetojava;
import java.util.Scanner;

public class Steam {

    public static void main(String[] args) {
        
        menu(); 
    }
    
    
    public static void menu(){
        int op;
        
        Categoria categoria = new Categoria();
        do{
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bem Vindo!!/n");
        System.out.println("1 - Cadastrar categoria");
        System.out.println("2 - Cadastrar Jogos");
        System.out.println("3 - Sair");
        op = entrada.nextInt();
        if(op < 0 && op > 3){
            System.out.println("Opcao invalida!!");
            return;
        }else{
            
            if (op == 1){
                categoria = new Categoria();
                categoria.cadastrarCategoria();
                Categoria.categorias.add(categoria);
            }
            else if(op == 2){
                Jogo jogo = new Jogo();
                jogo.cadastrarJogo();
            }
        }
    }while(op != 3);
    
    
    }
    
    
}
