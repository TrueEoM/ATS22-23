package Model.Tests.HandMade;

import Model.Log;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class TestLog {

    @Test
    public void LogConstructorTest1(){
        Log l = new Log();
        assertNotNull(l);
    }

    @Test
    public void LogConstructorTest2(){
        LocalDateTime now = LocalDateTime.now();
        Log l = new Log(now, false);
        assertFalse(l.getMode());
        assertEquals(l.getDia(), now);
    }

    @Test
    public void LogConstructorTest3(){
        Log l = new Log(LocalDateTime.now(), false);
        Log l2 = new Log(l);

        assertEquals(l2, l);
    }

    @Test
    public void GetDiaTest(){
        LocalDateTime now = LocalDateTime.now();
        Log l = new Log(now, false);

        assertEquals(l.getDia(), now);
    }

    @Test
    public void SetDiaTest(){
        LocalDateTime now = LocalDateTime.now();
        Log l = new Log();
        l.setDia(now);

        assertEquals(l.getDia(), now);
    }

    @Test
    public void GetModeTest(){
        Log l = new Log();

        assertFalse(l.getMode());
    }

    @Test
    public void testEquals()
    {
        Log log = new Log();
        Log log2 = new Log(LocalDateTime.of(2023,4,26,16,46),false);
        assertEquals(log, log);
        assertNotEquals(log2, log);
    }

    @Test
    public void testToString()
    {
        Log log = new Log();
        assertEquals("\tDia: null; \tEstá ligado?: false; ",log.toString());
        log = new Log(LocalDateTime.of(2022,3,25,15,45),false);
        assertEquals("\tDia: 2022-03-25T15:45; \tEstá ligado?: false; ",log.toString());
    }

    @Test
    public void testClone()
    {
        Log log = new Log(LocalDateTime.of(2023,4,26,16,46),false);
        if(!log.equals(log.clone())) System.out.print("Clone Errado");
    }
}
