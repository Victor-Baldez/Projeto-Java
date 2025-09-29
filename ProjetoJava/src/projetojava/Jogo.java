package projetojava;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Jogo {
    
    
    public static ArrayList<Jogo> listaJogos = new ArrayList<>();
    private int id;
    private String titulo;
    private String descricao;
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
    
    

    public void cadastrarJogo(){
        Scanner entrada = new Scanner(System.in);
        gerarId();
        
        System.out.println("Digite o titulo do jogo: ");
        setTitulo(entrada.nextLine());
        
        System.out.println("Digite a descricao do jogo: ");
        setDescricao(entrada.nextLine());
        
        System.out.println("Digite o preco do jogo: ");
        setPreco(entrada.nextDouble());
        entrada.nextLine();
        
        System.out.println("Digite a desenvolvedora do jogo: ");
        setDesenvolvedora(entrada.nextLine());
        
        System.out.println("Digite a data de lançamento (formato dd/MM/yyyy): ");
        String dataStr = entrada.nextLine();
        //vi no canal do gustavo guanabara esse metodo de validar a data meio complicado mas mais eficiente
        try {
            Date data = new java.text.SimpleDateFormat("dd/MM/yyyy").parse(dataStr);
            // aqui ele pega a string dataStr e tenta transformar num date usando o formato dia/mês/ano tipo 25/12/2025
            setDataLancamento(data);
        } catch (Exception e) {
            //deu ruim em algum ponto ali em cima string nula, formato errado cai aqui.
            System.out.println("Formato de data invalido!");
            setDataLancamento(new Date());
            // pra não parar tudo coloca a data atual agora como valor padrão
        }
        
        
        //ta bugado na hora de selecionar a categoria nao conseguir fazer funcionar :(
        System.out.println("Selecionar categoria:");
        categoria.listarCategorias(); // tenho quase certeza que estou fazendo isso errado
        if (!Categoria.categorias.isEmpty()) { 
    // verifica se a lista de categorias mão está vazia porque né, pedir código sem ter nada seria meio triste kkkk

    System.out.println("Digite o código da categoria: "); 

    int codigoCategoria = entrada.nextInt(); 
    for (int i = 0; i < Categoria.categorias.size(); i++) {
        if (Categoria.categorias.get(i).getCodigo() == codigoCategoria) { 
            // se o código da categoria atual for igual ao que o usuário digitou
            setCategoria(Categoria.categorias.get(i)); 
            // então essa é a escolhida define ela aqui
            break; 
            // e já sai do loop porque achou o que queria
        }
    }
    } 
        System.out.println("Jogo cadastrado com sucesso!");
        


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