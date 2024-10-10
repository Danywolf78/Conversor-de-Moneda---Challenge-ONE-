import java.util.Scanner;

public class CambioDeMoneda {
    public static void convertir(String monedaBase, String monedaACambiar, Scanner lectura, ConsultaCambio consulta) {
        double cantidad;
        double cantidadConvertida;
        Moneda monedas = consulta.buscarMoneda(monedaBase, monedaACambiar);
        System.out.println("El valor de la conversion del dia es : 1 " + monedaBase + " = " + monedas.conversion_rate()+" "+monedaACambiar);
        System.out.println("Ingrese la cantidad de " + monedaBase + " a convertir");

        while (true){
            try{
                cantidad = Double.parseDouble(lectura.nextLine());
                if (cantidad <= 0){
                    System.out.println("La cantidad debe ser un número positivo");
                }else{
                    break;
                }
            }catch(NumberFormatException e){
                System.out.println("Por favor, introduzca un número válido");}
        }
        cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println(cantidad + " " + monedaBase + " = " + cantidadConvertida + " " + monedas.target_code());


    }
}
