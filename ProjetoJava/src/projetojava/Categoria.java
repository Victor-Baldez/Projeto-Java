
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
         gerarCodigo();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nome da categoria:");
        setNome(entrada.next());
         System.out.println("Categoria cadastrada cojm sucesso!");
    }
     
     public static void listarCategorias() {
        if (categorias.isEmpty()) {
            System.out.println("Nenhuma categoria cadastrada.");
        } else {
            System.out.println("CATEGORIAS CADASTRADAS");
            for (Categoria cat : categorias) {
                System.out.println(cat.getCodigo() + " - " + cat.getNome());
            }
        }
    }
     //ta meio bugado essa funcao, nao sei pq ainda
     public static Categoria buscarCategoriaPorCodigo(int codigo) {
        for (Categoria cat : categorias) {
            if (cat.getCodigo() == codigo) {
                return cat;
            }
        }
        return null;
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
