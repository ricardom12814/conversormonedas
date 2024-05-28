import java.util.Scanner;

public class Menu {
    public int mostrarMenuConversion(){
        String menuConversion = """
            ****************************************
            Sea bienvenido/a al Conversor de Moneda:
            A continuación seleccione una opcion de conversión:   
                
            1. Dólares a su moneda Local.             
            2. Su moneda Local a Dólares.

            3. Atras.                            
            9. Salir.
            Moneda Local = Argentina -(ARS), Brasil - (BRL), Colombia - (COP), Euro - (EUR), Mexico - (MXN)
            ****************************************
            """;
        System.out.println(menuConversion);
        Scanner opcionConversion = new Scanner(System.in);
        return opcionConversion.nextInt();

    }
    public int mostrarMenuInicial() {
        String menuInicial = """
            ****************************************
            Bienvenido/a
            A continuación seleccione la operación que desea realizar:
                        
            1. Realizar una conversion.
            2. Consultar historial de operaciones.
            9. Salir.
                          
            ****************************************
            """;
        System.out.println(menuInicial);
        Scanner opcion = new Scanner(System.in);
        return opcion.nextInt();
    }

    public int mostrarMenuDolaresAMonedaLocal (){
        String menuDolaresAMonedaLocal = """
            ****************************************
            Conversión de Dólares a su moneda local.
                        
            A continuación seleccione su moneda local:
            1. ARS
            2. BRL
            3. COP
            4. EUR
            5. MXN
                        
            6. Ingresar con otra moneda.
            7. Atras.
            9. Salir.            
            ****************************************
            """;
        System.out.println(menuDolaresAMonedaLocal);
        Scanner opcionDolarAMonedaLocal = new Scanner(System.in);
        String seleccion = opcionDolarAMonedaLocal.nextLine().trim().toLowerCase();

        int seleccionDolarAMonedaLocal = 0;

        if (seleccion.contains("argentina")){
            return seleccionDolarAMonedaLocal = 1;}
        else if (seleccion.contains("ars")){
            return seleccionDolarAMonedaLocal = 1;}
        else if (seleccion.contains("1")){
            return seleccionDolarAMonedaLocal = 1;}

        if (seleccion.contains("brasil")){
            return seleccionDolarAMonedaLocal = 2;}
        else if (seleccion.contains("brl")){
            return seleccionDolarAMonedaLocal = 2;}
        else if (seleccion.contains("2")){
            return seleccionDolarAMonedaLocal = 2;}

        if (seleccion.contains("colombia")){
            return seleccionDolarAMonedaLocal = 3;}
        else if (seleccion.contains("cop")){
            return seleccionDolarAMonedaLocal = 3;}
        else if (seleccion.contains("3")){
            return seleccionDolarAMonedaLocal = 3;}

        if (seleccion.contains("europa")){
            return seleccionDolarAMonedaLocal = 4;}
        else if (seleccion.contains("eur")){
            return seleccionDolarAMonedaLocal = 4;}
        else if (seleccion.contains("4")){
            return seleccionDolarAMonedaLocal = 4;}

        if (seleccion.contains("mexico")){
            return seleccionDolarAMonedaLocal = 5;}
        else if (seleccion.contains("mxn")){
            return seleccionDolarAMonedaLocal = 5;}
        else if (seleccion.contains("5")){
            return seleccionDolarAMonedaLocal = 5;}

        if (seleccion.contains("otra")){
            return seleccionDolarAMonedaLocal = 6;}
        else if (seleccion.contains("6")){
            return seleccionDolarAMonedaLocal = 6;}

        if (seleccion.contains("atras")){
            return seleccionDolarAMonedaLocal = 7;}
        else if (seleccion.contains("7")){
            return seleccionDolarAMonedaLocal = 7;}

        return seleccionDolarAMonedaLocal;
    }

    public int mostrarMenuMonedaLocalADolares () {
        String menuMonedaLocalADolares = """
                ****************************************
                Conversión de su moneda local a Dólares.
                            
                A continuación seleccione su moneda local:
                1. ARS
                2. BRL
                3. COP
                4. EUR
                5. MXN
                    
                6. Ingresar con otra moneda.
                7. Atras.
                9. Salir.
                ****************************************
                """;
        System.out.println(mostrarMenuMonedaLocalADolares());
        Scanner opcion = new Scanner(System.in);
        return opcion.nextInt();
    }

    public double mostrarMenuLeerCantidad () {
        String menuLeerCantidad = """
                ****************************************
                1. Ingrese la cantidad de dinero que quiere convertir.

                9. Salir.
                ****************************************
                """;
        System.out.println(menuLeerCantidad);
        Scanner cantidad = new Scanner(System.in);
        return cantidad.nextDouble();
    }

    public void mostrarResultadoFinal (String monedaBase, String monedaEnConversion, Double resultadoFinal, Double cantidad){
        //String menuResultadoFinal = """
        System.out.println("****************************************\n");
        System.out.println("Resultados de la conversion:\n");
        System.out.println("$ "+cantidad+" "+monedaBase.toUpperCase()+" "+"equivale a: "+"$ "+resultadoFinal+" "+monedaEnConversion.toUpperCase()+"\n");
        System.out.println("9. Salir.\n");
        System.out.println("****************************************\n");
    }

    public String mostrarMenuMonedaAdicional (){
        String menuMostarMonedaAdicional = """
                ****************************************
                Ingrese la moneda para realizar la conversión: 
                
                                
                * ingrese el código iso 4217 o nombre del país.
                * ejemplo: COP - Colombia.
                ****************************************
                """;
        System.out.println(menuMostarMonedaAdicional);
        Scanner seleccion = new Scanner(System.in);
        return seleccion.nextLine();
    }

    public int mostrarMenuNull (){
        String menuNull = """
                ****************************************
                Conversión de Moneda: 
                
                El país / moneda ingresada no ha sido encontrada.
                
                7. Atras.
                9. Salir.
                ****************************************
                """;
        System.out.println(menuNull);
        Scanner opcion = new Scanner(System.in);
        return opcion.nextInt();
    }
}
