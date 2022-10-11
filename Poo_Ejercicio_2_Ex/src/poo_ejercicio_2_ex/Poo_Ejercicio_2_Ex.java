package poo_ejercicio_2_ex;

import Entidad.Tiempo;
import Servicio.ServicioTiempo;

public class Poo_Ejercicio_2_Ex {
    
    public static void main(String[] args) {
        
        ServicioTiempo st = new ServicioTiempo();
        
        Tiempo tiempo = st.crearTiempo();
        st.mostrarTiempo(tiempo);
        
    }
    
}
