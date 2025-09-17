
package projetojava;
import java.util.Scanner;

public class ProjetoJava {

    public static void main(String[] args) {
        
        
        
    }
    
    
    public void menu(){
        int op;
        do{
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bem Vindo!!/n");
        System.out.println("1 - Cadastrar categoria");
        System.out.println("2 - Cadastrar Jogos");
        System.out.println("3 - Comprar Jogo");
        System.out.println("4 - Relatorios");
        System.out.println("5 - Sair");
        op = entrada.nextInt();
        if(op < 0 && op > 5){
            System.out.println("Opcao invalida!!");
            return;
        }
       
        
        
    }while(op != 5);
    
    
    
    }
    
    
}
