package ensayo.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CodigoUN implements ValueObject<String> {

    private final String value;

    public CodigoUN(String value) {
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
        if (!(o instanceof CodigoUN)) return false;
        CodigoUN codigoUN = (CodigoUN) o;
        return value.equals(codigoUN.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
