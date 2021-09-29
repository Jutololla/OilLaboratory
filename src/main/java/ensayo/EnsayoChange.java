package ensayo;

import co.com.sofka.domain.generic.EventChange;
import ensayo.events.*;

public class EnsayoChange extends EventChange {

    public EnsayoChange(Ensayo ensayo){

        apply((AnalistaAsociado event) ->{
            ensayo.analista.actualizarNombre(event.getNombre());
        });

        apply((ClienteMuestraActualizado event) ->{
            ensayo.muestra.actualizarCliente(event.getCliente());
        });

        apply((CodigoUNMuestraActualizado event) ->{
            ensayo.muestra.actualizarCodigoUN(event.getCodigoUN());
        });

        apply((EnsayoCreado event) ->{
            ensayo.normativa=event.getNormativa();
        });

        apply((FechaAnalisisActualizado event) ->{
            ensayo.fechaAnalisis=event.getFechaAnalisis();
        });

        apply((FechaRecepcionMuestraActualizado event) ->{
            ensayo.muestra.actualizarFechaRecepcion(event.getFechaRecepcion());
        });

        apply((MuestraAsociado event) ->{
            ensayo.muestra.actualizarAtributos(event.getCodigoUN(),
                    event.getProcedencia(),
                    event.getCliente(),
                    event.getFechaRecepcion());
        });

        apply((ProcedenciaMuestraActualizado event) ->{
            ensayo.muestra.actualizarProcedencia(event.getProcedencia());
        });

        apply((ResultadoActualizado event) ->{
            ensayo.resultadoAnalisis=event.getResultadoAnalisis();
        });
    }
}
