package ensayo.values;

import co.com.sofka.domain.generic.Identity;

public class MuestraId extends Identity {
    public MuestraId(){

    }

    private MuestraId(String id){
        super(id);
    }

    public static MuestraId of(String id){
        return new MuestraId(id);
    }
}
