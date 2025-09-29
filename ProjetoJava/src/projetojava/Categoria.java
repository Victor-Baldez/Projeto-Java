
package projetojava;

import java.util.ArrayList;
import java.util.Scanner;


public class Categoria {
    Scanner entrada = new Scanner(System.in);
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
        System.out.println("Digite o nome da categoria: ");
        setNome(entrada.next());
        System.out.println("Categoria cadastrada com sucesso!");
    
    }
    
    public void listarCategorias(){
    if(categorias.isEmpty()){
        System.out.println("Nenhuma categoria cadastrada!");
    }else{
        System.out.println("Categorias cadastradas:");
        for(int i = 0; i < categorias.size(); i++){
            Categoria cat = categorias.get(i);
            System.out.println("Codigo: " + cat.getCodigo() + " - Nome: " + cat.getNome());
        }
    }
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
    /*
    public String selecionarCat(){
        Scanner entrada = new Scanner(System.in);
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
