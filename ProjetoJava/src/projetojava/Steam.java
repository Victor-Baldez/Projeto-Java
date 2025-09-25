
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
        
        //fiz mais opções 
        System.out.println("Bem Vindo!!\n");
        System.out.print("- Voce e usuario ou densenvolvedor na Steam?\n");
        System.out.println("- Digite (1) para Desenvolvedor:\n- Digite (2) para Usuario:");
        System.out.println("- Sair (6): ");
        op = entrada.nextInt();
        
        if(op < 0 && op > 6){
            System.out.println("Opcao invalida!!");
            return;
        }else{
            
            //para o dev
            if(op == 1){
                System.out.println("- Aqui estao as opcoes do desenvolvedor:");
                System.out.println("3 - Cadastrar categoria: ");
                System.out.println("4 - Cadastrar Jogos: ");
                System.out.println("<------------->");
                System.out.println("6 - Sair: ");
                op = entrada.nextInt();
                if (op == 3){
                    categoria = new Categoria();
                    categoria.cadastrarCategoria();
                    Categoria.categorias.add(categoria);
                }else if(op == 4){
                    Jogo jogo = new Jogo();
                    jogo.cadastrarJogo();
               }
                //para o user
            }else if(op == 2){
                System.out.println("- Aqui estao as opcoes de usuario:");
                System.out.println("5 - Comprar Jogos: ");
                System.out.println("<------------->");
                System.out.println("6 - Sair: ");
                op = entrada.nextInt();
                if(op == 5){
                   //comprar jogos função futura 
                }  
            }else{
                System.out.println("Voce saiu da Steam.");
            }
           
            
        }
    }while(op != 6);
    
    
    }
    
    //lista as categorias
        //a pessoa digita o codigo referente a categoria
        //vc acha o nome
        //cadastra o jogo passando como parametro a categoria
    
    // tem que arrumar isso pra poder selecionar categoria
    //*acho que tem que colocar dentro do main*
    // pra rodar certinho tem que comentar essa parte kkkkk!
    /*
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
        
        
        
    }*/
}
