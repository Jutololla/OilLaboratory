package domain.inventarioBodegaMuestras.values;

import co.com.sofka.domain.generic.Identity;

public class EstanteId extends Identity {
    public EstanteId(){

    }

    private EstanteId(String id){
        super(id);
    }

    public static EstanteId of(String id){
        return new EstanteId(id);
    }
}
