import java.util.Map;

//este record tiene el mismo formato que la información obtenida de la api en formato json.

public record ParametrosConversion(
        String result,
        String documentation,
        String terms_of_use,
        long time_last_update_unix,
        String time_last_update_utc,
        long time_next_update_unix,
        String time_next_update_utc,
        String base_code,
        //Map para mapear y acceder a la lista con las tasas de conversion.
        Map<String, Double> conversion_rates) {

    public Double getConversionRate(String monedaEnConversion) {
        return conversion_rates.get(monedaEnConversion);
    }

}
