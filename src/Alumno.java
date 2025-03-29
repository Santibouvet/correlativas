import java.util.List;

public class Alumno {
    private List<Materia> materiasAprobadas;

    public Alumno(List<Materia> materiasAprobadas){
        this.materiasAprobadas=materiasAprobadas;
    }

    public boolean haAprobado(Materia materia){
        if(materiasAprobadas.contains(materia)){
            return true;
        }
    return false;
    }
}
