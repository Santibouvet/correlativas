import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class tests{

    Materia am1 = new Materia(List.of());
    Materia algebra = new Materia(List.of());
    Materia probabilidad = new Materia(List.of(am1,algebra));
    Materia am2 = new Materia(List.of(am1));


    Alumno fran = new Alumno(List.of(am1));
    Alumno lautaro = new Alumno(List.of(am1,algebra));
    Alumno santino = new Alumno (List.of());

    Inscripcion inscripcionBasicas = new Inscripcion (List.of(am1,algebra));
    Inscripcion inscripcionProbabilidad = new Inscripcion(List.of(probabilidad));
    Inscripcion inscripcionAm2 = new Inscripcion(List.of(am2));
    Inscripcion inscripcionSegundoNivel = new Inscripcion(List.of(am2,probabilidad));

    @Test

    void inscripcionBasica(){
        assertTrue(inscripcionBasicas.aprobada(santino));
    }

    @Test
    void inscripcionProba(){
        assertFalse(inscripcionProbabilidad.aprobada(fran));
        assertTrue(inscripcionProbabilidad.aprobada(lautaro));
    }

    @Test
    void InscripcionAm2(){
        assertTrue(inscripcionAm2.aprobada(fran));
        assertFalse(inscripcionAm2.aprobada(santino));
    }

    @Test
    void InscripcionSegundoNivel(){
        assertTrue(inscripcionSegundoNivel.aprobada(lautaro));
        assertFalse(inscripcionSegundoNivel.aprobada(fran));
        assertFalse(inscripcionSegundoNivel.aprobada(santino));
    }
}

