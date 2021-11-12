package TrabajoMultilista;
public class Estudiante {
    private String nombre;
    private String carrera;
    private int carnet;
    private int semestre;
    private Estudiante abajo;

    public Estudiante(String nombre, String carrera, int carnet, int semestre) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.carnet = carnet;
        this.semestre = semestre;
        this.abajo = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public Estudiante getAbajo() {
        return abajo;
    }

    public void setAbajo(Estudiante abajo) {
        this.abajo = abajo;
    }
    
    
        
        
}
