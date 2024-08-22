public class ConfiguracionUsuario implements RecursoPersistente{
    public void load(){
        System.out.println("Configuracion usuario cargada");
    }
    public void save(){
        System.out.println("Configuracion usuario almacenada");
    }
    public void notificar() {
        System.out.println("Notificación: Configuración de usuario ha sido procesada.");
    }
}
