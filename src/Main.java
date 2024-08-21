public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la clase Configuracion
        Configuration configuracion = new Configuration();

        // Cargar la configuración
        configuracion.cargarConfiguracion();

        // Almacenar la configuración
        configuracion.salvarConfiguracion();
    }
}
