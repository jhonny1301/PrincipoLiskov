import java.util.Iterator;
import java.util.Vector;

/*public class Configuration {
    Vector<RecursoPersistente> conf = new Vector<RecursoPersistente>();

    public void cargarConfiguracion() {
        conf.add(new ConfiguracionSistema());
        conf.add(new ConfiguracionUsuario());
        conf.add(new ConfiguracionHoraria());

        for (Iterator<RecursoPersistente> i = conf.iterator(); i.hasNext(); )
            i.next().load();
    }

    public void salvarConfiguracion() {
        for (Iterator<RecursoPersistente> i = conf.iterator(); i.hasNext(); )
            i.next().save();
    }
}*/

public class Configuration {
    private Vector<RecursoPersistente> persistentes = new Vector<>();
    private Vector<RecursoSoloLectura> soloLectura = new Vector<>();

    public void cargarConfiguracion() {
        persistentes.add(new ConfiguracionSistema());
        persistentes.add(new ConfiguracionUsuario());
        soloLectura.add(new ConfiguracionHoraria());

        for (RecursoPersistente recurso : persistentes) {
            recurso.load();
        }
        for (RecursoSoloLectura recurso : soloLectura) {
            recurso.load();
        }
    }

    public void salvarConfiguracion() {
        for (RecursoPersistente recurso : persistentes) {
            recurso.save();
        }
    }
}



