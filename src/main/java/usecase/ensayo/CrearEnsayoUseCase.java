package usecase.ensayo;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.ensayo.Ensayo;
import domain.ensayo.commands.crearEnsayo;

public class CrearEnsayoUseCase extends  UseCase<RequestCommand<crearEnsayo>, ResponseEvents>{
    @Override
    public void executeUseCase(RequestCommand<crearEnsayo> crearEnsayoRequestCommand) {
     var command= crearEnsayoRequestCommand.getCommand();
     var ensayo = new Ensayo(
             command.getNormativa(),
             command.getEnsayoId()
     );
     emit().onResponse(new ResponseEvents(ensayo.getUncommittedChanges()));
    }
}
