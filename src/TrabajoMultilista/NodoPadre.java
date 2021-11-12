package TrabajoMultilista;
public class NodoPadre {
    private String carrera;
    private NodoPadre siguiente;
    private Estudiante abajo;

    public NodoPadre(String carrera) {
        this.carrera = carrera;
        this.siguiente = null;
        this.abajo = null;
    }


    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public NodoPadre getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPadre siguiente) {
        this.siguiente = siguiente;
    }

    public Estudiante getAbajo() {
        return abajo;
    }

    public void setAbajo(Estudiante abajo) {
        this.abajo = abajo;
    }
    
        

}
