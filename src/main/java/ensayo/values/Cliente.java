package ensayo.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Cliente implements ValueObject<String> {

    private final String value;

    public Cliente(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("El objeto de valor no puede estar vacio");
        }
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente)) return false;
        Cliente cliente = (Cliente) o;
        return value.equals(cliente.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
