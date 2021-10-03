package domain.ensayo.commands;

import co.com.sofka.domain.generic.Command;
import domain.ensayo.values.ResultadoAnalisis;

public class actualizarResultados extends Command {

    private final ResultadoAnalisis resultadoAnalisis;

    public actualizarResultados(ResultadoAnalisis resultadoAnalisis) {
        this.resultadoAnalisis = resultadoAnalisis;
    }

    public ResultadoAnalisis getResultadoAnalisis() {
        return resultadoAnalisis;
    }
}
