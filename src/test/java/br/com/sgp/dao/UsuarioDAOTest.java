package br.com.sgp.dao;

import br.com.sgp.model.Usuario;
import org.junit.Test;
import static org.junit.Assert.*;

public class UsuarioDAOTest {
    @Test
    public void testAdicionarEListar() {
        UsuarioDAO dao = new UsuarioDAO();
        dao.adicionar(new Usuario("Teste"));
        assertEquals(1, dao.listar().size());
    }
}
