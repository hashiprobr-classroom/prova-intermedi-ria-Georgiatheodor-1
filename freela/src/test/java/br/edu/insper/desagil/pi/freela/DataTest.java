package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataTest {
    private Data d;

    @BeforeEach
    void setUp(){
        d = new Data(2000,2, 2 );
    }

    @Test
    void constroi (){
        assertEquals(1970,d.getAno());
        assertEquals(1,d.getMes());
        assertEquals(1, d.getDia());
    }

    @Test
    void dataBaixa(){
        //d.setData(1969, 0, 0);
        assertEquals(1970,d.getAno());
        assertEquals(1, d.getMes());
        assertEquals(1, d.getDia());
    }

    @Test
    void dataAlta(){
       // d.setData(2071,13,32);
        assertEquals(2070,d.getAno());
        assertEquals(12, d.getMes());
        assertEquals(31, d.getDia());
    }
}
