package ensayo.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ResultadoAnalisis implements ValueObject<ResultadoAnalisis.Props> {
    private final String unidad;
    private final String value;

    public ResultadoAnalisis(String unidad, String value) {
        this.unidad = unidad;
        this.value = value;
    }

    @Override
    public ResultadoAnalisis.Props value(){
        return new ResultadoAnalisis.Props(){
            @Override
            public String unidad(){ return unidad;}

            @Override
            public String value(){return value;}
        };
    }

    public interface Props{
        String unidad();
        String value();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ResultadoAnalisis)) return false;
        ResultadoAnalisis that = (ResultadoAnalisis) o;
        return Objects.equals(unidad, that.unidad) && Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unidad, value);
    }
}
