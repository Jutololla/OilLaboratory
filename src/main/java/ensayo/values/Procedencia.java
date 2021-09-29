package ensayo.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Procedencia implements ValueObject<String> {
    private final String value;

    public Procedencia(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("El objeto de valor no puede estar vacio");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Procedencia)) return false;
        Procedencia that = (Procedencia) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String value() {
        return null;
    }
}
