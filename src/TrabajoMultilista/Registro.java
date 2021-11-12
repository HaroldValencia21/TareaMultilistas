package TrabajoMultilista;

import javax.swing.JOptionPane;

public class Registro {
    public static void main(String[]args){
        Multilista multilista= new Multilista();
        String nombre;
        String carrera;
        int carnet;
        int semestre;
        int opcion=0;
        
        do{
            try{
                opcion=Integer.parseInt(JOptionPane.showInputDialog(""
                        + "            ---Bienvenidos---"
                        + "\n Dijite la opcion que desea realizar."
                        + "\n 1. Ingresar Estudiante."
                        + "\n 2. Mostrar Todos los registros."
                        + "\n 3. Mostrar Esdiantes por Carrera."
                        + "\n 4. Salir"));
                
                switch(opcion){
                    case 1:
                        nombre=JOptionPane.showInputDialog(null, "Ingrese el nombre del estudiante", "Ingresar nombre", JOptionPane.INFORMATION_MESSAGE);
                        carnet=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Numero de carnet", "Ingresar Carnet", JOptionPane.INFORMATION_MESSAGE));
                        semestre=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de Semestre", "Ingresar Semestre", JOptionPane.INFORMATION_MESSAGE));
                        carrera=JOptionPane.showInputDialog("Dijite la carrera");
                        
                        multilista.insertarNodoPadre(carrera);
                        multilista.insertarEstudiante(nombre, carnet, semestre, carrera);
                        break;
                    
                    case 2:
                        multilista.imprirmirMultilista();
                        break;
                    
                    case 3:
                        carrera=JOptionPane.showInputDialog(null, "Dijite el nombre de la carrera: ", "Ingresar Carrera", JOptionPane.INFORMATION_MESSAGE);
                        multilista.imprimirEstudiantes(carrera);
                        break;
                        
                    case 4:
                        JOptionPane.showMessageDialog(null, "Tarea terminada", "Fin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                        
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion invalida");
                          
                }
            }catch(NumberFormatException n){
                JOptionPane.showMessageDialog(null, n.getMessage());
            }
        }while(opcion!= 4);
    }
}
