class Cajero extends Usuario {
    private String claveCajero;

    public Cajero(String nombreCompleto, String correoElectronico, String claveCajero) {
        super(nombreCompleto, correoElectronico, 2);
        this.claveCajero = claveCajero;
    }

   public void registrarVenta(String producto, double precio) {
        System.out.println("Registrando venta de " + producto + " por $" + precio);
    }
    public void mostrarContenido() {
        System.out.println("Perfil: Cajero");
        System.out.println("Clave de Cajero: " + claveCajero);
    }
}
