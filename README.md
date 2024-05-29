## Indice

### Conversor de Monedas - Reto AluraLatam

![](https://github.com/ricardom12814/conversormonedas/blob/master/Imagen%20de%20fondo.jpg)

### Descripción del proyecto

* Este es un proyecto desarrollado en Java que se encarga de realizar la conversión entre las monedas de diferentes países, consultando una API que permite obtener la taza de conversión correspondiente siempre actualizada.

### Características de la aplicación

* Este conversor de monedas permite al usuario seleccionar entre convertir su moneda local a dólares americanos (USD) o en sentido contrario de dólares americanos (USD) a su moneda local. 
Inicialmente permite operar con 5 monedas locales "peso argentino, real brasileño, peso colombiano, euro, peso mexicano" sin embargo al seleccionar la opción "Ingresar con otra moneda" se puede realizar la conversión ingresando el nombre del país correspondiente (requerido que el nombre del país esté en español).
Una herramienta que permite conocer la fecha en que se realiza la conversión está en desarrollo, al igual que una herramienta que permite consultar el historial de conversiones realizadas por el usuario.

* API:
  
  ![](https://github.com/ricardom12814/conversormonedas/blob/master/ExchangeRate_API.jpg)


### Uso.

1. Menú inicial:
   
            ****************************************
            Bienvenido/a
            A continuación seleccione la operación que desea realizar:
                        
            1. Realizar una conversion.
            2. Consultar historial de operaciones.
            9. Salir.
                          
            ****************************************
   
2. Menú de Converion:

            ****************************************
            Sea bienvenido/a al Conversor de Moneda:
            A continuación seleccione una opcion de conversión:   
                
            1. Dólares a su moneda Local.             
            2. Su moneda Local a Dólares.

            3. Atras.                            
            9. Salir.
            Moneda Local = Argentina -(ARS), Brasil - (BRL), Colombia - (COP), Euro - (EUR), Mexico - (MXN)
            ****************************************

3. Menú de conversión de dólares americanos a moneda local:
   
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

4. Menú de conversión de moneda local a dólares americanos:
  
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

5. Menú de conversión de una moneda adicional:

            ****************************************
            Ingrese la moneda para realizar la conversión: 
                
                                
            * ingrese el código iso 4217 o nombre del país.
            * ejemplo: COP - Colombia.
            ****************************************

6. Menú para ingreso de la cantidad de dinero a convertir:

             ****************************************
             1. Ingrese la cantidad de dinero que quiere convertir.
   
             9. Salir.
             ****************************************

7. Menú para mostrar el resultado final:

* ejemplo convirtiendo dólares americanos USD a pesos colombianos COP.
  
             ****************************************
             Resultados de la conversion:
             $ cantidad de dinero a convertir en USD equivale a: $ cantidad resultado de la conversión en pesos colombianos.
  
             9. Salir
             ****************************************

### Estado del proyecto

El proyecto sigue en desarrollo y otras funcionalidades serán añadidas pronto.

* El proyecto se encuentra en construcción, se han construido y probado los principales módulos:
* Obtener la taza de conversión consultando la API.
* Calcular la cantidad final de una moneda equivalente a otra moneda.
* Desplegar los menús que guían la interacción del usuario.
* Obtener el código de una moneda ingresando el nombre del país en español. 
* Crear el flujo que permite desplegar correctamente condicionales If,While,Switch. (en revisión).
* Habilitar una opción que permite consultar el historial de conversiones. (en desarrollo)


      

