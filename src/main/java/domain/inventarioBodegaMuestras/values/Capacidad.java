package domain.inventarioBodegaMuestras.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Capacidad implements ValueObject<Integer> {
    private final Integer value;

    public Capacidad(Integer value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Capacidad)) return false;
        Capacidad capacidad = (Capacidad) o;
        return Objects.equals(value, capacidad.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public Integer value() {
        return value;
    }
}
