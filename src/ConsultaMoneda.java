import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {
    public ParametrosConversion busquedaMoneda(String tasaConversion) throws IOException, InterruptedException {

        //Proceso de conexión con con la api

        String key = "0aadc9333740aba9ffee9185";
        String direccion = "https://v6.exchangerate-api.com/v6/"+key+"/latest/"+tasaConversion;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            // siguiente linea: retorna response.body convertida como clase que concuerda
            // con ParametrosConversion (info json obtenida de la api.)
            return new Gson().fromJson(response.body(), ParametrosConversion.class);
        } catch (IOException e){
            throw new RuntimeException("No fue posible realizar la conversión.");
        }
    }
}

