public class ConsultandoArrayMonedas {
    public static String findCurrencyCodeByCountry(CurrencyInfo[] currencies, String country) {
        String lowerCaseCountryName = country.toLowerCase();

        for (CurrencyInfo currency : currencies) {
            if (currency.getCountry().toLowerCase().contains(lowerCaseCountryName)) {
                return currency.getCode();
            }
        }
        return null;
    }
}

    /*
    public CurrencyInfo buscarMoneda()

    String countryName = "A";
    String currencyCode = findCurrencyCodeByCountry(currencies, countryName);

    if (currencyCode != null){
        boolean allowedToConvert = true;
    } else {
        boolean allowedToConvert = false;
    }
*/



