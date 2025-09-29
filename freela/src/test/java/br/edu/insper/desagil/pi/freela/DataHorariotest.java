package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataHorariotest {
    private DataHorario h;
    private Data d;

    @BeforeEach
    void setUp(){
        h = new DataHorario(0, 0, d);
        d = new Data (1970, 1, 1);

    }

    @Test
    void constroi(){
        assertEquals(0, h.getHora());
        assertEquals(0, h.getMinuto());
    }

    @Test
    void horarioBaixo(){
        assertEquals(0, h.getHora());
        assertEquals(0, h.getMinuto());
    }

    @Test
    void horarioAlto(){
        assertEquals(23, h.getHora());
        assertEquals(59, h.getMinuto());

    }
}
