import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        int opcion = 0;
        int opcionConversion = 0;
        int opcionMonedaLocal = 0;
        double cantidad = 0;
        double resultadoFinal = 0;
        CurrencyInfo[] currencies = CurrencyInfo.CurrencyArray();
        ConsultandoArrayMonedas consultandoArrayMonedas = new ConsultandoArrayMonedas();
        ConsultaMoneda consultaMoneda = new ConsultaMoneda();
        Calculos calculos = new Calculos();
        String seleccion = "";

        while (opcion != 9) {
            Menu menu = new Menu();
            opcion = menu.mostrarMenuInicial();

            switch (opcion) {
                case 1:
                    opcionConversion = menu.mostrarMenuConversion();
                    switch (opcionConversion) {
                        case 1:
                            opcionMonedaLocal = menu.mostrarMenuDolaresAMonedaLocal();
                            switch (opcionMonedaLocal) {
                                case 1:
                                    String monedaBase = "usd";
                                    String monedaEnConversion = "ars";
                                    ParametrosConversion parametrosConversion = consultaMoneda.busquedaMoneda(monedaBase.toUpperCase());
                                    Double tasaDeConversion = parametrosConversion.getConversionRate(monedaEnConversion.toUpperCase());
                                    cantidad = menu.mostrarMenuLeerCantidad();
                                    resultadoFinal = calculos.calculoConversion(tasaDeConversion, cantidad);
                                    menu.mostrarResultadoFinal(monedaBase, monedaEnConversion, resultadoFinal, cantidad);
                                    break;
                                case 2:
                                    monedaBase = "usd";
                                    monedaEnConversion = "brl";
                                    parametrosConversion = consultaMoneda.busquedaMoneda(monedaBase.toUpperCase());
                                    tasaDeConversion = parametrosConversion.getConversionRate(monedaEnConversion.toUpperCase());
                                    cantidad = menu.mostrarMenuLeerCantidad();
                                    resultadoFinal = calculos.calculoConversion(tasaDeConversion, cantidad);
                                    menu.mostrarResultadoFinal(monedaBase, monedaEnConversion, resultadoFinal, cantidad);
                                    break;
                                case 3:
                                    monedaBase = "usd";
                                    monedaEnConversion = "cop";
                                    parametrosConversion = consultaMoneda.busquedaMoneda(monedaBase.toUpperCase());
                                    tasaDeConversion = parametrosConversion.getConversionRate(monedaEnConversion.toUpperCase());
                                    cantidad = menu.mostrarMenuLeerCantidad();
                                    resultadoFinal = calculos.calculoConversion(tasaDeConversion, cantidad);
                                    menu.mostrarResultadoFinal(monedaBase, monedaEnConversion, resultadoFinal, cantidad);
                                    break;
                                case 4:
                                    System.out.println("Opción no habilitada");
                                    break;
                                case 5:
                                    System.out.println("Opción no habilitada");
                                    break;
                                case 6:
                                    seleccion = menu.mostrarMenuMonedaAdicional();
                                    String country = seleccion;
                                    String currencyCode = ConsultandoArrayMonedas.findCurrencyCodeByCountry(currencies, country);
                                    if (currencyCode != null) {
                                        boolean allowedToConvert = true;
                                        monedaBase = "usd";
                                        monedaEnConversion = currencyCode;
                                        parametrosConversion = consultaMoneda.busquedaMoneda(monedaBase.toUpperCase());
                                        tasaDeConversion = parametrosConversion.getConversionRate(currencyCode.toUpperCase());
                                        cantidad = menu.mostrarMenuLeerCantidad();
                                        resultadoFinal = calculos.calculoConversion(tasaDeConversion, cantidad);
                                        menu.mostrarResultadoFinal(monedaBase, currencyCode, resultadoFinal, cantidad);
                                    } else {
                                        boolean allowedToConvert = false;
                                        menu.mostrarMenuNull();
                                        break;
                                    }
                                    break;
                                default:
                                    System.out.println("Opción no válida: opcionMonedaLocal");
                            }
                        case 2:
                            opcionMonedaLocal = menu.mostrarMenuDolaresAMonedaLocal();
                            switch (opcionMonedaLocal) {
                                case 1:
                                    String monedaEnConversion = "usd";
                                    String monedaBase  = "ars";
                                    ParametrosConversion parametrosConversion = consultaMoneda.busquedaMoneda(monedaBase.toUpperCase());
                                    Double tasaDeConversion = parametrosConversion.getConversionRate(monedaEnConversion.toUpperCase());
                                    cantidad = menu.mostrarMenuLeerCantidad();
                                    resultadoFinal = calculos.calculoConversion(tasaDeConversion, cantidad);
                                    menu.mostrarResultadoFinal(monedaBase, monedaEnConversion, resultadoFinal, cantidad);
                                    break;
                                case 2:
                                    monedaEnConversion = "usd";
                                    monedaBase = "brl";
                                    parametrosConversion = consultaMoneda.busquedaMoneda(monedaBase.toUpperCase());
                                    tasaDeConversion = parametrosConversion.getConversionRate(monedaEnConversion.toUpperCase());
                                    cantidad = menu.mostrarMenuLeerCantidad();
                                    resultadoFinal = calculos.calculoConversion(tasaDeConversion, cantidad);
                                    menu.mostrarResultadoFinal(monedaBase, monedaEnConversion, resultadoFinal, cantidad);
                                    break;
                                case 3:
                                    monedaEnConversion  = "usd";
                                    monedaBase = "cop";
                                    parametrosConversion = consultaMoneda.busquedaMoneda(monedaBase.toUpperCase());
                                    tasaDeConversion = parametrosConversion.getConversionRate(monedaEnConversion.toUpperCase());
                                    cantidad = menu.mostrarMenuLeerCantidad();
                                    resultadoFinal = calculos.calculoConversion(tasaDeConversion, cantidad);
                                    menu.mostrarResultadoFinal(monedaBase, monedaEnConversion, resultadoFinal, cantidad);
                                    break;
                                case 4:
                                    System.out.println("Opción no habilitada");
                                    break;
                                case 5:
                                    System.out.println("Opción no habilitada");
                                    break;
                                case 6:
                                    seleccion = menu.mostrarMenuMonedaAdicional();
                                    String country = seleccion;
                                    String currencyCode = ConsultandoArrayMonedas.findCurrencyCodeByCountry(currencies, country);
                                    if (currencyCode != null) {
                                        boolean allowedToConvert = true;
                                        monedaBase = currencyCode;
                                        monedaEnConversion  = "usd";
                                        parametrosConversion = consultaMoneda.busquedaMoneda(monedaBase.toUpperCase());
                                        tasaDeConversion = parametrosConversion.getConversionRate(monedaEnConversion.toUpperCase());
                                        cantidad = menu.mostrarMenuLeerCantidad();
                                        resultadoFinal = calculos.calculoConversion(tasaDeConversion, cantidad);
                                        menu.mostrarResultadoFinal(monedaBase, monedaEnConversion, resultadoFinal, cantidad);

                                    } else {
                                        boolean allowedToConvert = false;
                                        menu.mostrarMenuNull();
                                        break;
                                    }
                                    break;
                                default:
                                    System.out.println("Opción no válida: opcionMonedaLocal");
                            }
                        default:
                            System.out.println("Opción no válida: opcionConversion ");
                    }
            }
        }
    }
}


