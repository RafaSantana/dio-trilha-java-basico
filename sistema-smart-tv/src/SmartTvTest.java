import org.junit.Test;
import static org.junit.Assert.*;

public class SmartTvTest {

    @Test
    public void testMudarCanal() {
        SmartTv tv = new SmartTv();
        tv.mudarCanal(10);
        assertEquals(10, tv.canal);
    }

    @Test
    public void testMudarCanalInvalido() {
        SmartTv tv = new SmartTv();
        tv.mudarCanal(60);
        assertEquals(1, tv.canal);
    }

    @Test
    public void testAumentarCanal() {
        SmartTv tv = new SmartTv();
        tv.mudarCanal(49);
        tv.aumentarCanal();
        assertEquals(50, tv.canal);
    }

    @Test
    public void testAumentarCanalMaximo() {
        SmartTv tv = new SmartTv();
        tv.mudarCanal(50);
        tv.aumentarCanal();
        assertEquals(1, tv.canal);
    }

    @Test
    public void testDiminuirCanal() {
        SmartTv tv = new SmartTv();
        tv.mudarCanal(5);
        tv.diminuirCanal();
        assertEquals(4, tv.canal);
    }

    @Test
    public void testDiminuirCanalMinimo() {
        SmartTv tv = new SmartTv();
        tv.mudarCanal(1);
        tv.diminuirCanal();
        assertEquals(50, tv.canal);
    }

    @Test
    public void testAumentarVolume() {
        SmartTv tv = new SmartTv();
        tv.aumentarVolume();
        assertEquals(26, tv.volume);
    }

    @Test
    public void testAumentarVolumeMaximo() {
        SmartTv tv = new SmartTv();
        tv.volume = 100;
        tv.aumentarVolume();
        assertEquals(100, tv.volume);
    }

    @Test
    public void testDiminuirVolume() {
        SmartTv tv = new SmartTv();
        tv.volume = 5;
        tv.diminuirVolume();
        assertEquals(4, tv.volume);
    }

    @Test
    public void testDiminuirVolumeMinimo() {
        SmartTv tv = new SmartTv();
        tv.volume = 1;
        tv.diminuirVolume();
        assertEquals(0, tv.volume);
    }

    @Test
    public void testLigarTv() {
        SmartTv tv = new SmartTv();
        tv.ligar();
        assertTrue(tv.ligada);
    }

    @Test
    public void testDesligarTv() {
        SmartTv tv = new SmartTv();
        tv.desligar();
        assertFalse(tv.ligada);
    }
}