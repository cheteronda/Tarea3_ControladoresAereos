
package tarea03;
import java.lang.Object;
import libtarea3.Aeronave;
import libtarea3.Aeropuerto;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
// ------------------------------------------------------------
//                   Clase Controlador
// ------------------------------------------------------------
/**
 * <p>
 * Clase que representa al <strong>controlador</strong>,
 * que será la clase que utilizaremos y donde se escribirán las diferentes 
 * operaciones en aeronaves y aeropuertos que se nos pide en 
 * el enunciado de la tarea.</p>
 *
 * @author Morales Garcia Alfonso
 */
public class Controlador {
    public static void main(String[] args) {
        
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        Aeropuerto aeropuertoBarcelona;
        Aeropuerto aeropuertoMadrid;
        Aeropuerto aeropuertoGranada;
        
        Aeronave Avion1;
        Aeronave Avion2;
        Aeronave Avion3;
        
        
       
        
        //----------------------------------------------
        //          Creación de objetos
        //----------------------------------------------
        
       
        
        // Instanciar los 3 aeropuertos: Barcelona, Madrid, Granada.
        System.out.println("-------------------------");
        System.out.println("---CREANDO AEROPUERTOS---");
        System.out.println("-------------------------");
        
        aeropuertoBarcelona = new Aeropuerto("El Prat", "Barcelona");
        aeropuertoMadrid = new Aeropuerto("Barajas", "Madrid");
        aeropuertoGranada = new Aeropuerto("Federico García Lorca", "Granada");
        
        System.out.println();
        System.out.println("**Aeropuertos creados**");
        System.out.println();
        
        System.out.println("-------------------------");
        System.out.println("---CREANDO AERONAVES---");
        System.out.println("-------------------------");
        
        // Instanciar las 3 aeronaves: Avion1, Avion2, Avion3.
        Avion1 = new Aeronave(); //Constructor vacío
        Avion2 = new Aeronave("EC-123", "Boing747");
        Avion3 = new Aeronave("EC-456", "Boing787", aeropuertoMadrid);
        
        System.out.println();
        System.out.println("**Aeronaves creadas**");
        System.out.println();
        
        //----------------------------------------------
        //   Inicio de la secuencia de instrucciones
        //----------------------------------------------
        
        //Formateo de fechas
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        DateTimeFormatter formatoFechaHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String fechaHoraFormateada = fechaHoraActual.format(formatoFechaHora);
       
        System.out.println("-------------------------");
        System.out.println("-Secuencia instrucciones-");
        System.out.println("-------------------------");
        
        //Avion1 despega con velocidad 1500, altitud 1750, rumbo 50 y fechaHora actual
        Avion1.despegar(1500, 1750, 50, fechaHoraFormateada);
        System.out.printf("El Avion1 ha despegado: Velocidad = %d km/h, Altitud = %d m, Rumbo = %dº, Fecha/Hora = %s\n", 1500, 1750, 50, fechaHoraFormateada);
        
        //Avion2 despega con velocidad 1500, altitud 1850 y rumbo 75
        Avion2.despegar(1500, 1850, 75, fechaHoraFormateada);
        System.out.printf("El Avion2 ha despegado: Velocidad = %d km/h, Altitud = %d m, Rumbo = %dº, Fecha/Hora = %s\n", 1500, 1850, 75, fechaHoraFormateada);
        
        //Avion3 despega con velocidad 1500, altitud 1000 y rumbo 180
        Avion3.despegar(1500, 1000, 180, fechaHoraFormateada);
        System.out.printf("El Avion3 ha despegado: Velocidad = %d km/h, Altitud = %d m, Rumbo = %dº, Fecha/Hora = %s\n", 1500, 1000, 180, fechaHoraFormateada);
        
          
        //Comprobar si Avion1 está volando
        System.out.println();  
        boolean avion1Volando = Avion1.isVolando();
        System.out.printf("¿Avión1 está volando? %b\n", avion1Volando);
       
        
        //Mostrar la matrícula del Avion2
        System.out.println();
        String matriculaAvion2 = Avion2.getMatricula();
        System.out.printf("Matrícula Avion2: %s\n", matriculaAvion2);
        
        
        //Mostrar modelo del Avion3
        System.out.println();
        String modeloAvion3 = Avion3.getModelo();
        System.out.printf("Modelo Avion3: %s\n", modeloAvion3);
        
        //Modificar rumbo del Avion2 a 90º y mostrarlo
        System.out.println();
        Avion2.setRumbo(90);
        System.out.printf("Rumbo Avion2: %dº\n", Avion2.getRumbo());
        
        //Avion3 aterriza en el aeropuerto de Barcelona despues de 75 minutos
        System.out.println();
        Avion3.aterrizar(aeropuertoBarcelona, 75);
        System.out.printf("El Avion3 ha aterrizado en el aeropuerto de %s después de 75 minutos.\n", aeropuertoBarcelona.getNombre());
        
        //Avion2 aterriza en el aeropuerto de Madrid despues de 80 minutos
        System.out.println();
        Avion2.aterrizar(aeropuertoMadrid, 80);
        System.out.printf("El Avion2 ha aterrizado en el aeropuerto de %s después de 80 minutos.\n", aeropuertoMadrid.getNombre());
        
        //Comprobar si Avion2 está volando
        System.out.println();
        //Declaramos una variable booleana, para guardar si vuela o no vuela
        boolean avion2Volando = Avion2.isVolando();
        System.out.printf("¿El Avion2 está volando?: %b\n", avion2Volando);
        
        //Modificar altitud del Avion1 a 1250 metros y mostrarlo
        System.out.println();
        Avion1.setAltitud(1250);
        System.out.printf("La nueva altitud del Avion1 es: %dm\n", Avion1.getAltitud());
        
        //Mostrar el tiempo toal de vuelo del Avion2
        System.out.println();
        //Declaramos una variable para almacenar el tiempo de vuelo
        int tiempoVueloAvion2 = Avion2.getTiempoTotalVuelo();
        System.out.printf("El tiempo de vuelo del Avión2 es: %d minutos\n", tiempoVueloAvion2);
        
        //Mostrar el aeropuerto del Avion3
        System.out.println();
        String aeropuertoAvion3 = Avion3.getAeropuerto();
        System.out.printf("El aeropuerto del Avion3 es: %s\n", aeropuertoAvion3);
        
        //Mostrar la fecha y hora de despegue del Avion1
        System.out.println();
        String fechaHoraDespegueAvion1 = Avion1.getFechaHoraDespegue();
        System.out.printf("El último despegue del Avion1 se realizó con fecha: %s\n", fechaHoraDespegueAvion1);
        
        //Avion3 despega con velocidad 860, altitud 1420 y rumbo 270
        System.out.println();
        Avion3.despegar(860, 1420, 270, fechaHoraFormateada);
        System.out.printf("El Avion3 ha despegado: Velocidad = %d km/h, Altitud = %d m, Rumbo = %dº, Fecha/Hora = %s\n", 860, 1420, 270, fechaHoraFormateada);

        //Avion1 aterriza en el aeropuerto de Granada despues de 260 minutos
        System.out.println();
        Avion1.aterrizar(aeropuertoGranada, 260);
        System.out.printf("El Avion1 ha aterrizado en el aeropuerto %s de %s después de 260 minutos \n", aeropuertoGranada.getNombre(), aeropuertoGranada.getCiudad());
        
        //Modificar velocidad del Avion3 a 950km/h y mostrarlo
        System.out.println();
        Avion3.setVelocidad(950);
        System.out.printf("La nueva velocidad del Avion3 es: %dkm/h\n", Avion3.getVelocidad());
        
        //Mostrar el nombre del aeropuerto de Madrid
        System.out.println();
        System.out.printf("El aeropuerto de Madrid se llama: %s\n", aeropuertoMadrid.getNombre());
        
        //Mostrar el número de aeronaves en este momento en el aeropuerto de Granada
        System.out.println();
        //Declaramos una variable para almacenar cuantos aviones hay en el aeropuerto de Granada
        int numeroAvionesAeropuertoGranada = aeropuertoGranada.getNumeroAeronaves();
        System.out.printf("En el aeropuerto de Granada hay: %d avion(es)\n", numeroAvionesAeropuertoGranada);
        
        //Mostrar toda la información del Avion1
        System.out.println();
        System.out.printf("Avion1:%s\n", Avion1.toString());
        
        //Mostrar toda la información del Avion2
        System.out.printf("Avion2:%s\n", Avion2.toString());
        
        //Mostrar toda la información del Avion3
        System.out.printf("Avion3:%s\n", Avion3.toString());
        
        //----------------------------------------------
        //          Llamadas a métodos estáticos
        //----------------------------------------------
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("---Métodos estáticos---");
        System.out.println("-------------------------");
        System.out.println();
        
        //Mostrar el número total de aeronaves volando ahora mismo
        //Declaramos una variable para almacenar las aeronaves que están volando
        int totalAvionesVolando = Aeronave.getNumAeronavesVolando();
        System.out.printf("Número total de aeronaves volando ahora mismo es: %d\n", totalAvionesVolando);
        
        //Mostrar el tiempo total de aeronaves volando en horas
        double totalTiempoVueloAvionesMinutos = Aeronave.getNumHorasVuelo();
        System.out.printf("Tiempo total de aeronaves volando: %.2f horas\n", totalTiempoVueloAvionesMinutos / 60);
        
        //Mostrar el número total de aeronaves
        int totalAeronaves = Aeronave.getNumAeronaves();
        System.out.printf("Numero total de aeronaves es: %d\n", totalAeronaves);

        
        
        
    }
}
