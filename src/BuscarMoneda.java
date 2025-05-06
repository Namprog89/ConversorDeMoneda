

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;




public class BuscarMoneda {

    public Moneda buscarMonedaAPI(String monedabase, String monedaconversion) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/a9be219fcfd0e387b6c9b572/pair/" + monedabase + "/" + monedaconversion);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);

        } catch (Exception e) {
            throw new RuntimeException("Moneda no Encontrada");
        }

    }

}
