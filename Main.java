import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Bienvenido a la empresa XYZ");

    String nombreAdmin, correoAdmin, claveAdmin;
    System.out.println("Ingrese el nombre completo del administrador:");
    nombreAdmin = scanner.nextLine();
    System.out.println("Ingrese el correo electrónico del administrador:");
    correoAdmin = scanner.nextLine();
    System.out.println("Ingrese la clave del administrador:");
    claveAdmin = scanner.nextLine();

    Administrador admin = new Administrador(nombreAdmin, correoAdmin, claveAdmin);

    String[] cajeroCodes = new String[4];

    System.out.println("Ingrese los códigos para 4 cajeros:");
    for (int i = 0; i < 4; i++) {
      System.out.print("Código para cajero " + (i + 1) + ": ");
      cajeroCodes[i] = scanner.nextLine();
    }

    admin.setCajeroCodes(cajeroCodes);

    boolean continuar = true;

    while (continuar) {
      System.out.println("Seleccione una opción:");
      System.out.println("1. Ingresar datos de un cajero");
      System.out.println("2. Ingresar datos de un cliente");
      System.out.println("3. Salir");
      int opcion = scanner.nextInt();
      scanner.nextLine();

      switch (opcion) {
        case 1:
          System.out.println("Ingrese el código de cajero:");
          String codigoCajero = scanner.nextLine();

          boolean codigoValido = false;
          for (String codigo : admin.getCajeroCodes()) {
            if (codigo.equals(codigoCajero)) {
              codigoValido = true;
              break;
            }
          }

          if (codigoValido) {
            System.out.println("Acceso concedido al cajero con código: " + codigoCajero);
            System.out.println("Ingrese el nombre completo del cajero:");
            String nombreCajero = scanner.nextLine();
            System.out.println("Ingrese el correo electrónico del cajero:");
            String correoCajero = scanner.nextLine();
            System.out.println("Ingrese la clave del cajero:");
            String claveCajero = scanner.nextLine();

            Cajero cajero = new Cajero(nombreCajero, correoCajero, claveCajero);

            System.out.print("Ingrese el producto a vender: ");
            String producto = scanner.nextLine();
            System.out.print("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();
            cajero.registrarVenta(producto, precio);
          } else {
            System.out.println("Código de cajero no válido. Acceso denegado.");
          }
          break;

        case 2:
          System.out.println("Ingrese el nombre completo del cliente:");
          String nombreCliente = scanner.nextLine();
          System.out.println("Ingrese el correo electrónico del cliente:");
          String correoCliente = scanner.nextLine();
          System.out.println("Ingrese el teléfono de contacto del cliente:");
          String telefonoCliente = scanner.nextLine();
          System.out.println("Ingrese la dirección de contacto del cliente:");
          String direccionCliente = scanner.nextLine();

          Cliente cliente = new Cliente(nombreCliente, correoCliente, telefonoCliente, direccionCliente);
            
          cliente.consultarProductos();

          break;

        case 3:
          continuar = false;
          break;

        default:
          System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
          break;
      }
    }

    scanner.close();
  }
  
}
