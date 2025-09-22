package projetojava;

import java.util.ArrayList;
import java.util.Scanner;


public class Jogo {
    
    
    private static ArrayList<Jogo> listaJogos = new ArrayList<>();
    private int id;
    private String titulo;
    private String descricao;
    private double preco;
    private String dataLancamento;
    private String desenvolvedora;

    public void cadastrarJogo(){
        Jogo jogo = new Jogo();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Painel de Cadastro");
        System.out.println("Titulo do jogo:");
        jogo.setTitulo(entrada.nextLine());
        System.out.println("Descricao:");
        jogo.setDescricao(entrada.nextLine());
        System.out.println("Desenvolvedor:");
        jogo.setDesenvolvedora(entrada.nextLine());
        System.out.println("Data de lançamento:");
        jogo.setDataLancamento(entrada.nextLine());
        System.out.println("Preço:");
        jogo.setPreco(entrada.nextDouble());
        entrada.nextLine();
        listaJogos.add(jogo);
        System.out.println("Jogo Adicionado com Sucesso!!!");
        
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
