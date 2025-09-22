package br.com.sgp.model;

public class Usuario {
    private String nome;
    private String cpf;
    private String email;
    private String cargo;
    private String login;
    private String senha;

    public Usuario(String nome, String cpf, String email, String cargo, String login, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.cargo = cargo;
        this.login = login;
        this.senha = senha;
    }

    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getEmail() { return email; }
    public String getCargo() { return cargo; }
    public String getLogin() { return login; }
    public String getSenha() { return senha; }

    @Override
    public String toString() {
        return "Usuário: " + nome + " (" + cargo + ")";
    }
}
