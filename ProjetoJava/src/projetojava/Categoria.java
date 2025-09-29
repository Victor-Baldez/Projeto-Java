
package projetojava;

import java.util.ArrayList;
import java.util.Scanner;


public class Categoria {
    
    public static ArrayList<Categoria> categorias = new ArrayList<>();
    
    private int codigo;
    private String nome;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
     
    public void cadastrarCategoria(){
        Scanner entrada = new Scanner(System.in);

        gerarCodigo();
        System.out.println("Digite o nome da categoria: ");
        setNome(entrada.next());
        System.out.println("Categoria cadastrada com sucesso!");
    
    }
    
    public void gerarCodigo(){
        int ultimaPos;
        int ultimoCod = 0;
        if (categorias.size() == 0){
            ultimaPos = 0;
        }else{
            ultimaPos = categorias.size() - 1;
            ultimoCod = categorias.get(ultimaPos).getCodigo();
        }
        int proxCod = ultimoCod+1;
        setCodigo(proxCod);
    }
    
    
    
    
    
    
    
}
