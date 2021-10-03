package domain.ensayo.values;

import co.com.sofka.domain.generic.Identity;

public class AnalistaId extends Identity  {
    public AnalistaId(){

    }

    private AnalistaId(String id){
        super(id);
    }

    public static AnalistaId of(String id){
        return new AnalistaId(id);
    }
}
