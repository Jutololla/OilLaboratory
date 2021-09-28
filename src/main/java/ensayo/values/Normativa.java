package ensayo.values;

import co.com.sofka.domain.generic.ValueObject;

public class Normativa implements ValueObject<Normativa.Props> {
    private final String codigo;
    private final String descripcion;

    public Normativa(String codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }


    @Override
    public Props value(){
        return new Props(){
            @Override
            public String codigo(){return codigo;}

            @Override
            public String descripcion(){return descripcion;}

        };
    }

    public interface Props{
        String codigo();
        String descripcion();
    }
}
