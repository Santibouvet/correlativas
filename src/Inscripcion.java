import java.util.List;

public class Inscripcion {
    private List<Materia> materias;

    public Inscripcion(List<Materia> materias){
        this.materias=materias;
    }

    public boolean aprobada(Alumno alumno) {
        for(Materia materia : materias){
            if (!materia.getCorrelativas().isEmpty()){
                for(Materia correlativa : materia.getCorrelativas()){
                    if(!(alumno.haAprobado(correlativa))){
                        return false;
                    }
                }
            }
        }
    return true;
    }
}





