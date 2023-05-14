import Model.SmartCamera;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestSmartCamera {

    @Test
    void testgetResolucao() {
        SmartCamera smartCam = new SmartCamera("cam","(1280x720)",3,4);
        assertEquals("(1280x720)", smartCam.getResolucao());
    }

    @Test
    void testsetResolucao() {
        SmartCamera cam = new SmartCamera("cam","(1280x720)",3,4);
        cam.setResolucao("(1920x1080)");
        assertEquals("(1920x1080)", cam.getResolucao());
    }

    @Test
    void testgetTamanho() {
        SmartCamera smartCam = new SmartCamera("cam","(1280x720)",3,4);
        assertEquals(3, smartCam.getTamanho());
    }

    @Test
    void testsetTamanho() {
        SmartCamera cam = new SmartCamera("cam","(1280x720)",3,4);
        cam.setTamanho(3);
        assertEquals(3, cam.getTamanho());
    }

    @Test
    void testturnCameraOn() {
        SmartCamera cam = new SmartCamera("cam","(1280x720)",3,4);
        cam.turnCameraOn();
        assertTrue(cam.getModo());
    }

    @Test
    void testturnCameraOff() {
        SmartCamera cam = new SmartCamera("cam",true,"(1280x720)",3,4.5);
        cam.turnCameraOff();
        assertFalse(cam.getModo());
    }

    @Test
    void testconsumoDiario() {
        SmartCamera cam = new SmartCamera("cam",true,"(1280x720)",3,4.5);

        assertEquals(2764800, cam.consumoDiario());
    }

    @Test
    void testparseSmartCamera() {
    }

    @Test
    void testToString() {
        SmartCamera cam = new SmartCamera("cam","(1280x720)",3,4.5);
        assertEquals("ID: cam\n\tOn: false;\n\tConsumo Base: 4.5;\n\tTamanho: 3.0Mb ; \tResolução: (1280x720);\n",
                cam.toString());
        SmartCamera camera = new SmartCamera(cam);
        assertEquals("ID: cam\n\tOn: false;\n\tConsumo Base: 4.5;\n\tTamanho: 3.0Mb ; \tResolução: (1280x720);\n",
                camera.toString());
    }

    @Test
    void testEquals() {
        SmartCamera camera1 = new SmartCamera("cam1", true, "1920x1080", 4.5, 2.0);
        SmartCamera camera2 = new SmartCamera("cam1", true, "1920x1080", 4.5, 2.0);

        assertTrue(camera1.equals(camera2));
    }

    @Test
    void testClone() {
        SmartCamera cam = new SmartCamera("cam1", true, "1920x1080", 4.5, 2.0);

        assertTrue(cam.equals(cam.clone()));
    }
}