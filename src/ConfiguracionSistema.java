public class ConfiguracionSistema implements RecursoPersistente {
    public void load(){
        System.out.println("Configuracion sistema cargada");
    }
    public void save(){
        System.out.println("Configuracion sistema almacenada");
    }
    public void notificar() {
        System.out.println("Notificación: Configuración del sistema ha sido procesada.");
    }
}
