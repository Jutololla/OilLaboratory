package domain.ensayo.values;

import co.com.sofka.domain.generic.Identity;

public class EnsayoId extends Identity {
    public EnsayoId(){
        super();
    }

    public EnsayoId(String id){
        super(id);
    }

    public static EnsayoId of(String id){
        return new EnsayoId(id);
    }
}
