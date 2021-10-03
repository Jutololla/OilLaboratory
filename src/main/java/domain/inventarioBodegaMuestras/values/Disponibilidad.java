package domain.inventarioBodegaMuestras.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Disponibilidad implements ValueObject<Boolean> {
    private final Boolean value;

    public Disponibilidad(Boolean value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Disponibilidad)) return false;
        Disponibilidad that = (Disponibilidad) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public Boolean value() {
        return value;
    }
}
