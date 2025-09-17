package projetojava;

import java.util.ArrayList;
import java.util.Scanner;


public class Jogo {
    
    
    private ArrayList<Jogo> ListaJogo = new ArrayList<>();
    private int id;
    private String titulo;
    private String descricao;
    private double preco;
    private String dataLancamento;
    private String desenvolvedora;

    public void cadastrarJogo(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Painel de Cadastro");
        System.out.println("Titulo do jogo:");
        setTitulo(entrada.next());
        System.out.println("Descricao:");
        setDescricao(entrada.next());
        System.out.println("Desenvolvedor:");
        setDesenvolvedora(entrada.next());
        System.out.println("Data de lançamento:");
        setDataLancamento(entrada.next());
        System.out.println("Preço:");
        setPreco(entrada.nextDouble());
    }

    public ArrayList<Jogo> getListaJogo() {
        return ListaJogo;
    }

    public void setListaJogo(ArrayList<Jogo> ListaJogo) {
        this.ListaJogo = ListaJogo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getDesenvolvedora() {
        return desenvolvedora;
    }

    public void setDesenvolvedora(String desenvolvedora) {
        this.desenvolvedora = desenvolvedora;
    }
    
    
}
