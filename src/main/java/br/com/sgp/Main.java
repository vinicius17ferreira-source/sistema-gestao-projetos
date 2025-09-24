package br.com.sgp;

import br.com.sgp.dao.*;
import br.com.sgp.model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        ProjetoDAO projetoDAO = new ProjetoDAO();
        EquipeDAO equipeDAO = new EquipeDAO();

        System.out.println("=== Sistema de Gestão de Projetos ===");
        System.out.println("1 - Cadastrar Usuário");
        System.out.println("2 - Listar Usuários");
        System.out.println("0 - Sair");

        int opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao) {
            case 1:
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                usuarioDAO.adicionar(new Usuario(nome));
                System.out.println("Usuário cadastrado!");
                break;
            case 2:
                usuarioDAO.listar().forEach(u -> System.out.println(u.getNome()));
                break;
            default:
                System.out.println("Saindo...");
        }
    }
}
