package sk.kosickaakademia.nebus.rodnecislo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    Task task = new Task();

    @Test
    void scitaj() {
        //Task task = new Task();
        assertEquals(0, task.scitaj(0,0));
        assertEquals(0, task.scitaj(-5,-5));
        assertEquals(15, task.scitaj(10,5));
    }


    @Test
    void jePravouhly() {
        assertTrue(task.jePravouhly(3,4,5));
        assertTrue(task.jePravouhly(5,4,3));
        assertTrue(task.jePravouhly(3,5,4));
        assertTrue(task.jePravouhly(20,48,52));

        assertFalse(task.jePravouhly(2,5,8));
    }

    @Test
    void reverz() {
        assertEquals("AHOJ", task.reverz("JOHA"));
        assertEquals(" ", task.reverz(" "));
        assertEquals("", task.reverz(""));
        assertEquals("KEKS", task.reverz("SKEK"));
        assertEquals("123456789", task.reverz("987654321"));
    }


    @Test
    void scitajCislaOd1Po10() {
        assertEquals(55, task.scitajCislaOd1Po10());
    }

    @Test
    void faktorial() {
        assertEquals(1, task.faktorial(0));
        assertEquals(-1, task.faktorial(-1));
        assertEquals(1, task.faktorial(1));
        assertEquals(6, task.faktorial(3));
        assertEquals(-3628800, task.faktorial(-10));
    }

    @Test
    void zmenRetazecNaMalePismena() {
        assertEquals("ahoj", task.zmenRetazecNaMalePismena("AHOJ"));
        assertEquals("mama", task.zmenRetazecNaMalePismena("MAMA"));
    }
}