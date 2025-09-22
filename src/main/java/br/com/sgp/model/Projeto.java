package br.com.sgp.model;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private String nome;
    private String descricao;
    private String dataInicio;
    private String dataFimPrevista;
    private String status;
    private Usuario gerente;
    private List<Equipe> equipes;

    public Projeto(String nome, String descricao, String dataInicio, String dataFimPrevista, String status, Usuario gerente) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFimPrevista = dataFimPrevista;
        this.status = status;
        this.gerente = gerente;
        this.equipes = new ArrayList<>();
    }

    public void addEquipe(Equipe equipe) {
        this.equipes.add(equipe);
    }

    @Override
    public String toString() {
        return "Projeto: " + nome + " (" + status + ") - Gerente: " + gerente.getNome();
    }
}
