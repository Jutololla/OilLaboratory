package domain.ensayo;

import co.com.sofka.domain.generic.EventChange;
import domain.ensayo.events.*;

public class EnsayoChange extends EventChange {

    public EnsayoChange(Ensayo ensayo){

        apply((EnsayoCreado event) ->{
            ensayo.normativa=event.getNormativa();
        });

        apply((MuestraAsociado event) ->{
            ensayo.muestra=new Muestra(
                    event.getMuestraId(),
                    event.getCodigoUN(),
                    event.getProcedencia(),
                    event.getCliente(),
                    event.getFechaRecepcion());
        });
//        apply((AnalistaAsociado event) ->{
//            ensayo.analista.actualizarNombre(event.getNombre());
//        });
//
//        apply((ClienteMuestraActualizado event) ->{
//            ensayo.muestra.actualizarCliente(event.getCliente());
//        });
//
//        apply((CodigoUNMuestraActualizado event) ->{
//            ensayo.muestra.actualizarCodigoUN(event.getCodigoUN());
//        });
//
//
//        apply((FechaAnalisisActualizado event) ->{
//            ensayo.fechaAnalisis=event.getFechaAnalisis();
//        });
//
//        apply((FechaRecepcionMuestraActualizado event) ->{
//            ensayo.muestra.actualizarFechaRecepcion(event.getFechaRecepcion());
//        });
//
//
//        apply((ProcedenciaMuestraActualizado event) ->{
//            ensayo.muestra.actualizarProcedencia(event.getProcedencia());
//        });
//
//        apply((ResultadoActualizado event) ->{
//            ensayo.resultadoAnalisis=event.getResultadoAnalisis();
//        });
    }
}
