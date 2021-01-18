import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sk.kosickaakademia.nebus.rodnecislo.Task;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    private Task task = new Task();
    private int[] pole = {4,5};
    @Test
    void scitaj() {
        //Task task = new Task();
        assertEquals(0, task.scitaj(0,0));
        assertEquals(-10, task.scitaj(-5,-5));
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

    @Test
    void terminovanyVklad() {
        assertEquals(1104.08, task.terminovanyVklad(1000, 5, 2, false));
        assertEquals(1100, task.terminovanyVklad(1000, 1, 10, false));
        assertEquals(1080, task.terminovanyVklad(1000, 1, 10, true));
        assertEquals(1331, task.terminovanyVklad(1000, 3, 10, false));
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void priceForTransport() {
        assertEquals(0, task.priceForTransport(0,5,5));
        assertEquals(1, task.priceForTransport(100,1,1));
        assertEquals(34.2, task.priceForTransport(456,5,1.5));
        assertEquals(30.94, task.priceForTransport(450,5.5,1.25));
    }

    @Test
    void max() {
        assertEquals(5,task.max(pole));
    }

    @Test
    void isPalindrom() {
        assertTrue(task.isPalindrom(121));
    }

    @Test
    void isPalindromm() {
    }

    @Test
    void slovoOdZadu() {
        assertEquals("AMAM", task.slovoOdZadu("MAMA"));
        assertEquals("AMAM", task.slovoOdZadu("MAMA"));
    }

    @Test
    void objemKuzela() {
        assertEquals(0, task.objemKuzela(0,5));
        assertEquals(0, task.objemKuzela(2,0));
        assertEquals(20.94, task.objemKuzela(2,5));
    }
}