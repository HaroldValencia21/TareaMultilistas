package TrabajoMultilista;

import javax.swing.JOptionPane;

public class Multilista {
    private NodoPadre inicio;
    private NodoPadre fin;
    
    public Multilista(){
        inicio=null;
        fin=null;
        
    }
    public boolean listaVacia(){
        if(inicio==null){
            return true;
        }else{
            return false;
        }
    }
    public void insertarNodoPadre(String inf){
        NodoPadre actual=new NodoPadre(inf);
        try{
            if(listaVacia()){
                inicio=actual;
                fin=actual;
            }else{
                fin.setSiguiente(actual);
                fin=actual;
            }
        }
        catch(NumberFormatException n){
            JOptionPane.showMessageDialog(null, "Error"+n.getMessage());
        }
    }
    public NodoPadre buscarNodoPadre(String inf){
        NodoPadre nodoPadre = inicio;
            while(nodoPadre!= null){
                if(nodoPadre.getCarrera().equalsIgnoreCase(inf)){
                    return nodoPadre;
                
                }
                nodoPadre=nodoPadre.getSiguiente();
            }
            return null;
    }
    public void insertarEstudiante(String nombre, int carnet, int semestre, String carrera){
        try{
            NodoPadre p =buscarNodoPadre(carrera);
            if(p != null){
                Estudiante nodoHijo = p.getAbajo();
                
                Estudiante nodoHijoNuevo = new Estudiante(nombre, carrera, carnet, semestre);
                
                //validacion que no tenga hijos
                if(p.getAbajo()==null){
                    p.setAbajo(nodoHijoNuevo);
                    
                }else{//si hay un hijo se lo agregara al final 
                    while(nodoHijo.getAbajo()!=null){
                        nodoHijo= nodoHijo.getAbajo();
                    }
                    nodoHijo.setAbajo(nodoHijoNuevo);
                }
                
            }else{
                JOptionPane.showMessageDialog(null, "Error NO existe la carrera: "+carrera);
            }
        }catch(NumberFormatException n){
            JOptionPane.showMessageDialog(null, "Error"+ n.getMessage());
        }    
    }
    public void imprirmirMultilista (){
        if(listaVacia()){
            JOptionPane.showMessageDialog(null, "La lista esta vacia, No se han encontrado Registros",
                    "No se han encontrado Registro", JOptionPane.INFORMATION_MESSAGE);
            
        }else{
            NodoPadre p = inicio;
            while(p != null){
                Estudiante nodoHijo = p.getAbajo();
                
                if(nodoHijo !=null){
                    System.out.println(" Carrera: "+p.getCarrera());
                    while(nodoHijo != null){
                        System.out.println(" Carnet: "+nodoHijo.getCarnet()+"- Nombre: "+ nodoHijo.getNombre()+"- Semestre: "+nodoHijo.getSemestre());
                        nodoHijo= nodoHijo.getAbajo();
                    }
                    p=p.getSiguiente();
                }
            }
        }
    
    }
    public void imprimirEstudiantes(String inf){
        if(listaVacia()){
            JOptionPane.showMessageDialog(null, "La lista esta vacia, No se han encontrado Registros",
                    "No se han encontrado Registro", JOptionPane.INFORMATION_MESSAGE);
            
        }else{
            NodoPadre hijos=buscarNodoPadre(inf);
            if(hijos!=null){
                System.out.println(" Carrera: "+ hijos.getCarrera());
                Estudiante nodoHijo=hijos.getAbajo();
                if(nodoHijo !=null){
                    while(nodoHijo != null){
                        System.out.println(" Carnet :"+ nodoHijo.getCarnet()+"- Nombre: "+nodoHijo.getNombre()+"- Semestre: "+nodoHijo.getSemestre());
                        nodoHijo= nodoHijo.getAbajo();
                        
                    }hijos=hijos.getSiguiente();
                }
            }else{
                JOptionPane.showMessageDialog(null, "No existe la carrera"+inf);
            }
        }
    }
    
}
