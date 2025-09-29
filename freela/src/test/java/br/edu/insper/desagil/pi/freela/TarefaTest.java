package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TarefaTest {
    private Tarefa t;

    @BeforeEach
    void setUp(){
        t = new Tarefa (1, "oi", null, null);
    }

    @Test
    void constroi(){
        assertEquals(1, t.getId());
        assertEquals(" ",t.getDescricao());
        assertNull(t.getInicio());
        assertNull(t.getFim());
    }

    @Test
    void mudaDescricao(){
        t.setDescricao("descricao");
        assertEquals("descricao", t.getDescricao());
    }

    @Test
    void momentosValidos(){

    }

    @Test
    void momentosInvalidor(){

        }
    }

