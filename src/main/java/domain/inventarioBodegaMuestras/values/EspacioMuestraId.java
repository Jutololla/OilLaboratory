package domain.inventarioBodegaMuestras.values;

import co.com.sofka.domain.generic.Identity;

public class EspacioMuestraId extends Identity {
    public EspacioMuestraId(){

    }

    private EspacioMuestraId(String id){
        super(id);
    }

    public static EspacioMuestraId of(String id){
        return new EspacioMuestraId(id);
    }
}
