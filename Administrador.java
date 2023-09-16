class Administrador extends Usuario {
    private String claveAdministrador;
    private String[] cajeroCodes;
    private String[] cajeroNames; 

    public Administrador(String nombreCompleto, String correoElectronico, String claveAdministrador) {
        super(nombreCompleto, correoElectronico, 1);
        this.claveAdministrador = claveAdministrador;
    }

    public void asignarCodigoAPerfil() {
        System.out.println("Asignando código a un perfil.");
    }

    public void setCajeroCodes(String[] cajeroCodes) {
        this.cajeroCodes = cajeroCodes;
    }

    public void setCajeroNames(String[] cajeroNames) {
        this.cajeroNames = cajeroNames;
    }

    public String[] getCajeroCodes() {
        return cajeroCodes;
    }

    public String[] getCajeroNames() {
        return cajeroNames;
    }

    public void mostrarContenido() {
        super.mostrarContenido();
        System.out.println("Perfil: Administrador");
    }
}
