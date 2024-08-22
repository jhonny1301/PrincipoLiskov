public class ConfiguracionHoraria implements RecursoSoloLectura, Inotificable {
    public void load() {
        System.out.println("Configuracion horaria cargada");
    }

    public void notificar() {
        System.out.println("Notificación: Configuración horaria ha sido cargada.");
    }
}
