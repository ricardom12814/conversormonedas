import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        int opcion = 0;
        int opcionConversion = 0;
        int opcionMonedaLocal = 0;
        double cantidad = 0;
        double resultadoFinal = 0;
        //String seleccion = "A";
        //Scanner lectura = new Scanner(System.in);
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
                                    ParametrosConversion parametrosConversion = consultaMoneda.busquedaMoneda(monedaBase.toUpperCase());  //acá estoy pasando los datos a conversor para obtener la tasa de conversion.
                                    Double tasaDeConversion = parametrosConversion.getConversionRate(monedaEnConversion.toUpperCase());  //la variable tasaDeConversion se carga con el valor entregado por getConversionRate
                                    //System.out.println(tasaDeConversion);
                                    cantidad = menu.mostrarMenuLeerCantidad();
                                    resultadoFinal = calculos.calculoConversion(tasaDeConversion, cantidad);
                                    //System.out.println(resultadoFinal);
                                    menu.mostrarResultadoFinal(monedaBase, monedaEnConversion, resultadoFinal, cantidad);
                                    break;
                                case 2:
                                    monedaBase = "usd";
                                    monedaEnConversion = "brl";
                                    parametrosConversion = consultaMoneda.busquedaMoneda(monedaBase.toUpperCase());  //acá estoy pasando los datos a conversor para obtener la tasa de conversion.
                                    tasaDeConversion = parametrosConversion.getConversionRate(monedaEnConversion.toUpperCase());  //la variable tasaDeConversion se carga con el valor entregado por getConversionRate
                                    //System.out.println(tasaDeConversion);
                                    cantidad = menu.mostrarMenuLeerCantidad();
                                    resultadoFinal = calculos.calculoConversion(tasaDeConversion, cantidad);
                                    //System.out.println(resultadoFinal);
                                    menu.mostrarResultadoFinal(monedaBase, monedaEnConversion, resultadoFinal, cantidad);
                                    break;
                                case 3:
                                    monedaBase = "usd";
                                    monedaEnConversion = "cop";
                                    parametrosConversion = consultaMoneda.busquedaMoneda(monedaBase.toUpperCase());  //acá estoy pasando los datos a conversor para obtener la tasa de conversion.
                                    tasaDeConversion = parametrosConversion.getConversionRate(monedaEnConversion.toUpperCase());  //la variable tasaDeConversion se carga con el valor entregado por getConversionRate
                                    //System.out.println(tasaDeConversion);
                                    cantidad = menu.mostrarMenuLeerCantidad();
                                    resultadoFinal = calculos.calculoConversion(tasaDeConversion, cantidad);
                                    //System.out.println(resultadoFinal);
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
                                    //System.out.println(seleccion);
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
                                    System.out.println("Opción no válida: ");
                            }

                        default:
                            System.out.println("Opción no válida: ");
                    }
            }
        }
    }
}


/*
        //System.out.println(opcion);
        //System.out.println("tipo de dato de la variable opcion: " +  ((Object)opcion).getClass().getSimpleName());
        //confirmando el tipo de dato opcion = integer,

            if (opcion == 1) {
                //System.out.println("la opcion 1 fue elegida");
                opcionConversion = menu.mostrarMenuConversion();
                //System.out.println(opcion);
                switch (opcion) {

                    case 1:

                        //System.out.println("la opcion 1.1 fue elegida");
                        opcion = menu.mostrarMenuDolaresAMonedaLocal();
                        String monedaBase = "usd";
                        String monedaEnConversion = "ars";
                        ParametrosConversion parametrosConversion = consultaMoneda.busquedaMoneda(monedaBase.toUpperCase());  //acá estoy pasando los datos a conversor para obtener la tasa de conversion.
                        Double tasaDeConversion = parametrosConversion.getConversionRate(monedaEnConversion.toUpperCase());  //la variable tasaDeConversion se carga con el valor entregado por getConversionRate
                        //System.out.println(tasaDeConversion);
                        cantidad = menu.mostrarMenuLeerCantidad();
                        resultadoFinal = calculos.calculoConversion(tasaDeConversion, cantidad);
                        //System.out.println(resultadoFinal);
                        menu.mostrarResultadoFinal(monedaBase, monedaEnConversion, resultadoFinal, cantidad);
                        break;


                        //calcular conversion con otras monedas ingresando el nombre

                        opcion = menu.mostrarMenuDolaresAMonedaLocal();
                        String monedaBase = "usd";
                        if (opcion == 6){
                            //System.out.println("Opcion 6 ");
                            seleccion = menu.mostrarMenuMonedaAdicional();
                            //System.out.println(seleccion);
                            String country = seleccion;
                            String currencyCode = ConsultandoArrayMonedas.findCurrencyCodeByCountry(currencies, country);
                            if (currencyCode != null){
                                boolean allowedToConvert = true;
                                ParametrosConversion parametrosConversion = consultaMoneda.busquedaMoneda(monedaBase.toUpperCase());
                                Double tasaDeConversion = parametrosConversion.getConversionRate(currencyCode.toUpperCase());
                                cantidad = menu.mostrarMenuLeerCantidad();
                                resultadoFinal = calculos.calculoConversion(tasaDeConversion, cantidad);
                                menu.mostrarResultadoFinal(monedaBase, currencyCode, resultadoFinal, cantidad);
                            }
                            } else {
                                boolean allowedToConvert = false;
                                menu.mostrarMenuNull();
                            }


                            ParametrosConversion parametrosConversion = consultaMoneda.busquedaMoneda(monedaBase.toUpperCase());
                            Double tasaDeConversion = parametrosConversion.getConversionRate(currencyCode.toUpperCase());
                            cantidad = menu.mostrarMenuLeerCantidad();
                            resultadoFinal = calculos.calculoConversion(tasaDeConversion, cantidad);
                            menu.mostrarResultadoFinal(monedaBase, currencyCode, resultadoFinal, cantidad);
                        }





                    //} else if (opcion == 2) {
                    case 2:
                        opcion = menu.mostrarMenuDolaresAMonedaLocal();
                        String monedaBase = "usd";
                        String monedaEnConversion = "brl";
                        ParametrosConversion parametrosConversion = consultaMoneda.busquedaMoneda(monedaBase.toUpperCase());
                        Double tasaDeConversion = parametrosConversion.getConversionRate(monedaEnConversion.toUpperCase());
                        cantidad = menu.mostrarMenuLeerCantidad();
                        resultadoFinal = calculos.calculoConversion(tasaDeConversion, cantidad);
                        menu.mostrarResultadoFinal(monedaBase, monedaEnConversion, resultadoFinal, cantidad);
                        break;


                    case 3:  //(opcion == 3) {
                        opcion = menu.mostrarMenuDolaresAMonedaLocal();
                        monedaBase = "usd";
                        monedaEnConversion = "cop";
                        parametrosConversion = consultaMoneda.busquedaMoneda(monedaBase.toUpperCase());
                        tasaDeConversion = parametrosConversion.getConversionRate(monedaEnConversion.toUpperCase());
                        cantidad = menu.mostrarMenuLeerCantidad();
                        resultadoFinal = calculos.calculoConversion(tasaDeConversion, cantidad);
                        menu.mostrarResultadoFinal(monedaBase, monedaEnConversion, resultadoFinal, cantidad);
                        break;


                    //else if (opcion == 4) {
                    case 4:
                        opcion = menu.mostrarMenuDolaresAMonedaLocal();
                        monedaBase = "usd";
                        monedaEnConversion = "eur";
                        parametrosConversion = consultaMoneda.busquedaMoneda(monedaBase.toUpperCase());
                        tasaDeConversion = parametrosConversion.getConversionRate(monedaEnConversion.toUpperCase());
                        cantidad = menu.mostrarMenuLeerCantidad();
                        resultadoFinal = calculos.calculoConversion(tasaDeConversion, cantidad);
                        menu.mostrarResultadoFinal(monedaBase, monedaEnConversion, resultadoFinal, cantidad);
                        break;


                    //} else if (opcion == 5) {
                    case 5:
                        opcion = menu.mostrarMenuDolaresAMonedaLocal();
                        monedaBase = "usd";
                        monedaEnConversion = "mxn";
                        parametrosConversion = consultaMoneda.busquedaMoneda(monedaBase.toUpperCase());
                        tasaDeConversion = parametrosConversion.getConversionRate(monedaEnConversion.toUpperCase());
                        cantidad = menu.mostrarMenuLeerCantidad();
                        resultadoFinal = calculos.calculoConversion(tasaDeConversion, cantidad);
                        menu.mostrarResultadoFinal(monedaBase, monedaEnConversion, resultadoFinal, cantidad);
                        break;




                    default:
                        System.out.println("opcion no valida default");
                        break;
                }
            } else {
                System.out.println("opcion no valida else");
            }
        }
    }

 */


