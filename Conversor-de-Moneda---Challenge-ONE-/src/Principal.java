
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaCambio consulta= new ConsultaCambio();
        int opcion = 0;
        EXTERNA:

        while (true) {
                      System.out.println("***************************************************");
            System.out.println("******** Bienvenido al Conversor de monedas *******");
            System.out.println("******** Conversiones de monedas disponibles ********\n");
            System.out.println("1) Dolares Americanos a Pesos Argentinos \n" +
                    "2) Pesos Argeninos a Dolares Americanos \n" +
                    "3) Dolares Americanos a Reales Brasileños \n" +
                    "4) Reales Brasileños a Dolares Americanos \n" +
                    "5) Dolares Americanos a Pesos Colombianos \n" +
                    "6) Pesos Colombianos a Dolares Americanos \n" +
                    "7) Salir "   );
            System.out.println("   Seleccione una opcion de cambio: ");
            try {
                opcion = lectura.nextInt();
                lectura.nextLine();
            }catch (NumberFormatException | InputMismatchException e){
               System.out.println("Por favor introduzca un valor númerico "+ e.getMessage());
                lectura.nextLine();
                continue;
            }

                switch (opcion) {
                case 1:
                    CambioDeMoneda.convertir("USD", "ARS", lectura, consulta);
                    break;
                case 2:
                    CambioDeMoneda.convertir("ARS", "USD", lectura, consulta);
                    break;
                case 3:
                    CambioDeMoneda.convertir("USD", "RSD", lectura, consulta);
                    break;
                case 4:
                    CambioDeMoneda.convertir("RSD", "USD", lectura, consulta);
                    break;
                case 5:
                    CambioDeMoneda.convertir("USD", "COP", lectura, consulta);
                    break;
                case 6:
                    CambioDeMoneda.convertir("COP", "USD", lectura, consulta);
                    break;
                case 7:
                    System.out.println("Gracias por utilizar el conversor de monedas");

                    break EXTERNA;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción del menú.");}



          }



    }
}
