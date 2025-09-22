package br.com.sgp;

import br.com.sgp.model.Usuario;
import br.com.sgp.model.Projeto;
import br.com.sgp.model.Equipe;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de Gestão de Projetos iniciado...");
        
        Usuario gerente = new Usuario("Vinicius Ferreira", "12345678900", "vinicius@email.com", "Gerente", "vinicius", "1234");
        Projeto projeto = new Projeto("Sistema X", "Sistema para gestão de projetos", "01/10/2025", "31/12/2025", "Planejado", gerente);
        Equipe equipe = new Equipe("Equipe Alpha", "Equipe de desenvolvimento");
        
        equipe.addMembro(gerente);
        projeto.addEquipe(equipe);
        
        System.out.println(projeto);
    }
}
