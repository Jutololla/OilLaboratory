package inventarioBodegaMuestras.values;

import co.com.sofka.domain.generic.Identity;

public class InventarioBodegaMuestrasId extends Identity {
    public InventarioBodegaMuestrasId(){

    }

    private InventarioBodegaMuestrasId(String id){
        super(id);
    }

    public static InventarioBodegaMuestrasId of(String id){
        return new InventarioBodegaMuestrasId(id);
    }
}
