import java.util.Scanner;
class Usuario {
    protected String nombreCompleto;
    protected String correoElectronico;
    protected int codigoPerfil;

    public Usuario(String nombreCompleto, String correoElectronico, int codigoPerfil) {
        this.nombreCompleto = nombreCompleto;
        this.correoElectronico = correoElectronico;
        this.codigoPerfil = codigoPerfil;
    }
    public void mostrarContenido() {
        System.out.println("Nombre: " + nombreCompleto);
        System.out.println("Correo Electrónico: " + correoElectronico);
    }
}
  
