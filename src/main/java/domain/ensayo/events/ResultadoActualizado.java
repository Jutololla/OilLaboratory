package domain.ensayo.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.ensayo.values.ResultadoAnalisis;

public class ResultadoActualizado extends DomainEvent {
    private final ResultadoAnalisis resultadoAnalisis;

    public ResultadoActualizado(ResultadoAnalisis resultadoAnalisis){
        super("oillaboratory.domain.ensayo.resultadoactualizado");
        this.resultadoAnalisis=resultadoAnalisis;
    }

    public ResultadoAnalisis getResultadoAnalisis() {
        return resultadoAnalisis;
    }
}
