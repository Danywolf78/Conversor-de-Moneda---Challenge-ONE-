import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCambio {

    public Moneda buscarMoneda(String monedaBase, String monedaACambiar)  {

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/c0b350ab31cd7035724dc2a4/pair/"+ monedaBase +"/"+ monedaACambiar);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try{
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        }
        catch (Exception e) {
            throw new RuntimeException("Ocurrió un error inesperado");
        }





    }
}
