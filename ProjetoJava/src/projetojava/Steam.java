
package projetojava;
import java.util.Scanner;

public class Steam {

    public static void main(String[] args) {
        
        menu(); 
    }
    
    
    public static void menu(){
        int op;
        String op2;
        
        Categoria categoria = new Categoria();
        do{
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bem Vindo!!/n");
        System.out.print("@ - Você é usuário ou densenvolvedor?");
        op = entrada.nextInt();
        /*op2 = entrada.nextString();
        
        if(op2 == true){
           if(op2){
              System.out.println("1 - Cadastrar categoria");
              System.out.println("2 - Cadastrar Jogos");
              System.out.println("4 - Sair");  
           }
           
        }
        */
        System.out.println("3 - Comprar Jogos");
        System.out.println("4 - Sair");
        
        
        else if(op < 0 && op > 4){
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
    }while(op != 4);
    
    
    }
    
    //lista as categorias
        //a pessoa digita o codigo referente a categoria
        //vc acha o nome
        //cadastra o jogo passando como parametro a categoria
    
    public static String selecionarCat(){
        String catSel = "";
        System.out.println("Selecione o código da categoria");
        for (int i = 0; i < Categoria.categorias.size(); i++) {
            Categoria.categorias.get(i).listarCategorias();
        }
        
        int codCatSel = entrada.nextInt();
        for (int i = 0; i < Categoria.categorias.size(); i++) {
            if ( Categoria.categorias.get(i).getCodigo() == codCatSel){
                catSel = Categoria.categorias.get(i).getNome();
            }
        }
        
        return catSel;
        
        
        
    }
}
