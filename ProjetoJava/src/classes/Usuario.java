
package classes;

import java.util.ArrayList;


public class Usuario {
    
     public static ArrayList <Usuario> listaUsers = new ArrayList<>();
     private int id;
     private String nome;
     private String email;
     private String senha;
     private double carteira;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public double getCarteira() {
        return carteira;
    }

    public void setCarteira(double carteira) {
        this.carteira = carteira;
    }
    
   public void cadastrar(String nome,String email,String senha){
       this.setNome(nome);
       this.setEmail(email);
       this.setSenha(senha);
       Usuario.listaUsers.add(this);
   } 
       
    
}
