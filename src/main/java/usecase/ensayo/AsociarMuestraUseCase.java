package usecase.ensayo;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.ensayo.Ensayo;
import domain.ensayo.commands.asociarMuestra;

public class AsociarMuestraUseCase extends UseCase<RequestCommand<asociarMuestra>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<asociarMuestra> asociarMuestraRequestCommand) {
        var command= asociarMuestraRequestCommand.getCommand();
        var ensayo = Ensayo.from(command.getEnsayoId(), retrieveEvents(command.getMuestraId().value()));

        ensayo.asociarMuestra(
                command.getMuestraId(),
                command.getCodigoUN(),
                command.getProcedencia(),
                command.getCliente(),
                command.getFechaRecepcion());

        emit().onResponse(new ResponseEvents(ensayo.getUncommittedChanges()));

    }
}
