
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
            System.out.println("<------------->");
            System.out.println("3 - Sair: ");
            op = entrada.nextInt();
        
        
        if(op < 0 || op > 6){
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
        }   
            
        }while(op != 3);
    }        
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

