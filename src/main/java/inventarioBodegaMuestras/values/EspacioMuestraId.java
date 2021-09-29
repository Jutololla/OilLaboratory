package inventarioBodegaMuestras.values;

import co.com.sofka.domain.generic.Identity;
import ensayo.values.MuestraId;

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
