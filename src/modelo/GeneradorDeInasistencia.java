
package modelo;

import dao.*;
import java.sql.Time;
import java.util.*;
import org.joda.time.DateTime;

public class GeneradorDeInasistencia {
    private AsistenciaDAO servicioDeAsistencia;
    private InasistenciaDAO servicioDeInasistencia;
    private MotivoDeInasistencia motivo;
    private Time horaActual;
    
    public GeneradorDeInasistencia(InasistenciaDAO servicioDeInasistencia, 
            AsistenciaDAO servicioDeAsistencia, MotivoDeInasistencia motivo) {
        
        this.servicioDeAsistencia = servicioDeAsistencia;
        this.servicioDeInasistencia = servicioDeInasistencia;
        this.motivo = motivo;
        horaActual = new Time(new Date().getTime());
    }

    public void evaluar() {
        for (Asistencia asistencia : servicioDeAsistencia.asistenciasDeHoy()) {
            if (asistencia.estaSinFirmar()) {
                Inasistencia inasistencia = 
                        generarInasistenciaAlEmpleado(asistencia.getEmpleado(), 
                        asistencia.getDia());
                servicioDeInasistencia.guardar(inasistencia);
            }
        }
    }
    
    private Inasistencia generarInasistenciaAlEmpleado(Empleado empleado, 
            DateTime dia) {
        return new Inasistencia(empleado, dia, horaActual,motivo);
    }
}