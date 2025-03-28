import java.util.List;

public class Alumno {
    public List<Materia> materiasAprobadas;

    public boolean haAprobado(Materia materia){
        if(materiasAprobadas.contains(materia)){
            return true;
        }
    return false;
    }
}
