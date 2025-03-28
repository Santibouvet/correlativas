import java.util.List;

public class Inscripcion {
    Alumno alumno;
    public List<Materia> materias;


    public boolean aprobada() {

        for (Materia materia : materias) {
            for(Materia correlativa : materia.getCorrelativas())
                if (!(alumno.haAprobado(materia))){
                return false;
            }
        }
        return true;
        }

    }



