package ensayo.values;

import co.com.sofka.domain.generic.ValueObject;

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
}
