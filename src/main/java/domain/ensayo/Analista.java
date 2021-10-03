package domain.ensayo;

import co.com.sofka.domain.generic.Entity;
import domain.ensayo.values.AnalistaId;
import domain.ensayo.values.Nombre;

import java.util.Objects;

public class Analista extends Entity<AnalistaId> {
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
