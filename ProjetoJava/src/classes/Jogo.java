package classes;

import java.time.LocalDate;
import java.util.ArrayList;



public class Jogo { 
    
    
    public static ArrayList<Jogo> listaJogos = new ArrayList<>();
    private int id;
    private String nome;
    private double preco;
    private LocalDate dataLancamento;
    private String desenvolvedora;
    private String categoria;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getDesenvolvedora() {
        return desenvolvedora;
    }

    public void setDesenvolvedora(String desenvolvedora) {
        this.desenvolvedora = desenvolvedora;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public void venderJogo(){
    
    }
    
    public void cadastrarJogo(String nome, double preco, LocalDate data, String desenvolvedora, String categoria){
        setNome(nome);
        setPreco(preco);
        setDataLancamento(data);
        setDesenvolvedora(desenvolvedora);
        setCategoria(categoria);
        Jogo.listaJogos.add(this);
    }// Higor é top kkkkk
    


    public void gerarId(){
        int ultimoId = 0;
        if (!listaJogos.isEmpty()) {
            int ultimaPos = listaJogos.size() - 1;
            ultimoId = listaJogos.get(ultimaPos).getId();
        }
        setId(ultimoId + 1);
    }
    
   
}    