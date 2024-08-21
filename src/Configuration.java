import java.util.Iterator;
import java.util.Vector;

public class Configuration {
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
}