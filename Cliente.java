class Cliente extends Usuario {
    private String telefonoContacto;
    private String direccionContacto;

    public Cliente(String nombreCompleto, String correoElectronico, String telefonoContacto, String direccionContacto) {
        super(nombreCompleto, correoElectronico, 3);
        this.telefonoContacto = telefonoContacto;
        this.direccionContacto = direccionContacto;
    }

  public void consultarProductos() {
        System.out.println("Consultando productos disponibles.");
    }

    public void mostrarContenido() {
        super.mostrarContenido();
        System.out.println("Perfil: Cliente");
    }
}
