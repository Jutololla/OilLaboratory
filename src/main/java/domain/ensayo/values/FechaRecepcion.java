package domain.ensayo.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class FechaRecepcion implements ValueObject<LocalDate> {
    private final LocalDate value;

    public FechaRecepcion(LocalDate value) {
        this.value=value;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FechaRecepcion)) return false;
        FechaRecepcion that = (FechaRecepcion) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public LocalDate value() {
        return value;
    }
}
