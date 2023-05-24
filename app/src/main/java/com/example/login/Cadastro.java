package com.example.login;

public class Cadastro {
    private String nome_completo;
    private String email;
    private String senha_cod;

    public Cadastro(String nome_completo, String email, String senha_cod){
        this.nome_completo = nome_completo;
        this.email = email;
        this.senha_cod = senha_cod;
    }
    public String getEmail() {
        return this.email;
    }
    public String getSenha_cod(){
        return this.senha_cod; 
    }
    public String getNome_completo(){
        return this.nome_completo;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setNome_completo(String nome_completo){
        this.nome_completo = nome_completo;
    }
    public void setSenha_cod(String senha){
        this.senha_cod = senha;
    }
}
