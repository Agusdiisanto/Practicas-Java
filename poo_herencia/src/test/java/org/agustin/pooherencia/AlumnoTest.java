package org.agustin.pooherencia;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AlumnoTest {

    private Alumno alumno1;

    @BeforeEach
    void setUp() {
        alumno1 = new Alumno();
    }

    @Test
    void unAlumnoTieneUnNombre() {
        alumno1.setNombre("Agustin");
        Assertions.assertEquals("Agustin",alumno1.getNombre());
    }

    @Test
    void unAlumnoTieneUnApellido() {
        alumno1.setApellido("DiSanto");
        Assertions.assertEquals("DiSanto", alumno1.getApellido());
    }

    @Test
    void unAlumnoTieneUnNombreYApellido(){
        Alumno alumnoTemporal = new Alumno("Agustin", "Di Santo");
        Assertions.assertEquals("Agustin",alumnoTemporal.getNombre());
        Assertions.assertEquals("Di Santo", alumnoTemporal.getApellido());
    }

    @Test
    void cuandoUnAlumnoTieneUnPromedioInferiorA4EstaDesaprobado(){
        Alumno alumnoTemporal = new Alumno("Agustin","Di Santo", 18,"UNQ",2,1,3);
        Assertions.assertTrue(alumnoTemporal.getEstaDesaprobado());
    }

    @Test
    void cuandoUnAlumnoTieneUnPromedioSuperiorA7EstaPromocionado(){
        Alumno alumnoTemporal = new Alumno("Agustin","Di Santo", 18, "UNQ", 10,9,6);
        Assertions.assertTrue(alumnoTemporal.getEstaPromocionado());
    }

}
