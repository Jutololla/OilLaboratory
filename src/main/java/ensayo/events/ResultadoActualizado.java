package ensayo.events;

import co.com.sofka.domain.generic.DomainEvent;
import ensayo.values.ResultadoAnalisis;

public class ResultadoActualizado extends DomainEvent {
    private final ResultadoAnalisis resultadoAnalisis;

    public ResultadoActualizado(ResultadoAnalisis resultadoAnalisis){
        super("oillaboratory.ensayo.resultadoactualizado");
        this.resultadoAnalisis=resultadoAnalisis;
    }

    public ResultadoAnalisis getResultadoAnalisis() {
        return resultadoAnalisis;
    }
}
