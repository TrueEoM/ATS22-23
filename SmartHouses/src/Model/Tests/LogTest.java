package Model.Tests;
import Model.Log;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class LogTest 
{
    public LogTest()
    {}

    @org.junit.jupiter.api.BeforeEach
    public void setUp()
    {}

    @org.junit.jupiter.api.AfterEach
    public void tearDown()
    {}

    @Test
    public void testConstrutor()
    {
        Log log = new Log();
        assertNotNull(log);
        log = new Log(LocalDateTime.of(2022,3,25,15,45),false);
        assertNotNull(log);
        Log log2 = new Log(log);
        assertNotNull(log2);
    }

    @Test
    public void testGetDia()
    {
        Log log = new Log();
        assertNull(log.getDia());
        log = new Log(LocalDateTime.of(2022,3,25,15,45),false);
        assertEquals(LocalDateTime.of(2022,3,25,15,45),log.getDia());
        Log log2 = new Log(log);
        assertEquals(LocalDateTime.of(2022,3,25,15,45),log2.getDia());
    }

    @Test
    public void testSetDia()
    {
        Log log = new Log();
        log.setDia(LocalDateTime.of(2022,3,25,15,45));
        assertEquals(LocalDateTime.of(2022,3,25,15,45),log.getDia());
        log = new Log(LocalDateTime.of(2023,4,26,16,46),false);
        log.setDia(LocalDateTime.of(2022,3,25,15,45));
        assertEquals(LocalDateTime.of(2022,3,25,15,45),log.getDia());
        Log log2 = new Log(log);
        log.setDia(LocalDateTime.of(2022,3,25,15,45));
        assertEquals(LocalDateTime.of(2022,3,25,15,45),log2.getDia());
    }

    //teste alterado nas assertions
    @Test
    public void testGetMode()
    {
        Log log = new Log();
        assertNull(log.getDia());
        assertFalse(log.getMode());
        log = new Log(LocalDateTime.of(2023,4,26,16,46),false);
        assertEquals(false,log.getMode());
        Log log2 = new Log(log);
        assertEquals(false,log2.getMode());
    }
    //teste alterado no codigo fonte, usar Object.equals(a,b) em vez de a.equals(b) para evitar nullPointerException
    @Test
    public void testEquals()
    {
        Log log = new Log();
        Log log2 = new Log(LocalDateTime.of(2023,4,26,16,46),false);
        if(log.equals(log2)) System.out.print("Equals Errado");
        if(!log.equals(log)) System.out.print("Equals Errado");
    }

    //erro com a maneira de como eles estavam a escrever o teste(sem tabs) e nao usaram formatador para imprimir o
    //dateTime
    @Test
    public void testToString() 
    {
        Log log = new Log();
        assertEquals("\tDia: ;\tEstá ligado?: false;",log.toString());
        log = new Log(LocalDateTime.of(2022,3,25,15,45),false);
        System.out.println(log.toString());
        assertEquals("\tDia: 2022-03-25 15:45;\tEstá ligado?: false;",log.toString());
    }
    
    @Test
    public void testClone() 
    {
        Log log = new Log(LocalDateTime.of(2023,4,26,16,46),false);
        if(!log.equals(log.clone())) System.out.print("Clone Errado");
    }
}

