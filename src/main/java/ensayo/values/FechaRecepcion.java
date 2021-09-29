package ensayo.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;
import java.util.Objects;

public class FechaRecepcion implements ValueObject<Date> {
    private final Date value;

    public FechaRecepcion(Date value) {
        this.value = Objects.requireNonNull(value);
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
    public Date value() {
        return null;
    }
}
