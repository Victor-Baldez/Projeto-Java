package classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Jogo {
    
    
    public static ArrayList<Jogo> listaJogos = new ArrayList<>();
    private int id;
    private String nome;
    private double preco;
    private Date dataLancamento;
    private String desenvolvedora;
    private Categoria categoria;

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

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getDesenvolvedora() {
        return desenvolvedora;
    }

    public void setDesenvolvedora(String desenvolvedora) {
        this.desenvolvedora = desenvolvedora;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    public void venderJogo(){
    
    }
    
    public void cadastrarJogo(){
    
    }
    


    public void gerarId(){
        int ultimoId = 0;
        if (!listaJogos.isEmpty()) {
            int ultimaPos = listaJogos.size() - 1;
            ultimoId = listaJogos.get(ultimaPos).getId();
        }
        setId(ultimoId + 1);
    }
}    