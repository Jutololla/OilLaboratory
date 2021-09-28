package ensayo;

import co.com.sofka.domain.generic.AggregateEvent;
import ensayo.values.AnalistaId;
import ensayo.values.Nombre;

import java.util.Objects;

public class Analista extends AggregateEvent<AnalistaId> {
    private Nombre nombre;
    public Analista(Nombre nombre) {
        super(new AnalistaId());
        this.nombre=nombre;
    }

    public void actualizarNombre(Nombre nombre){
        this.nombre= Objects.requireNonNull(nombre);
    }

    public Nombre Nombre() {
        return nombre;
    }
}
