import java.util.Iterator;
import java.util.Vector;

public class Configuration {
    private Vector<RecursoPersistente> persistentes = new Vector<>();
    private Vector<RecursoSoloLectura> soloLectura = new Vector<>();

    public void cargarConfiguracion() {
        persistentes.add(new ConfiguracionSistema());
        persistentes.add(new ConfiguracionUsuario());
        soloLectura.add(new ConfiguracionHoraria());

        for (RecursoPersistente recurso : persistentes) {
            recurso.load();
            if (recurso instanceof Inotificable) {
                ((Inotificable) recurso).notificar();
            }
        }
        for (RecursoSoloLectura recurso : soloLectura) {
            recurso.load();
            if (recurso instanceof Inotificable) {
                ((Inotificable) recurso).notificar();
            }
        }
    }

    public void salvarConfiguracion() {
        for (RecursoPersistente recurso : persistentes) {
            recurso.save();
            if (recurso instanceof Inotificable) {
                ((Inotificable) recurso).notificar();
            }
        }
    }
}


