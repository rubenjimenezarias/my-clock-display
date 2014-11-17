
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    // instance variables - replace the example below with your own
    private int horas;
    private int minutos;

    /**
     * Constructor for objects of class ClockDisplay
     */
    public ClockDisplay()
    {
        // initialise instance variables
        horas = 0;
        minutos = 0;
    }

    /**
     * Fija unas horas y unos minutos dados
     */
    public void setTime(int newHours, int newMinutes)
    {
        if (newHours < 24 && newHours >= 0){
            horas = newHours;
        }
        else {
            System.out.println("La hora debe de ser entre 0 y 23");
        }
        if (newMinutes < 60 && newMinutes >= 0){
            minutos = newMinutes;
        }
        else {
            System.out.println("Los minutos debe de ser entre 0 y 59");
        }
    }
    
    /**
     * Devuelve una cadena de 5 caracteres mostrando la hora y los minutos actuales separados por puntos
     */
    public String getTime()
    {
        String time = "";
        if (horas < 10) {
            time = "0" + horas;
        }
        else {
            time = "" + horas;
        }
        time = time + ":";
        if (minutos < 10) {
            time = time + "0" + minutos;
        }
        else {
            time = time + minutos;
        }
        
        return time;
    }
    
    /**
     * Avanzar un minuto el reloj
     */
    public void timeTick(){
        if (minutos < 59) {
            minutos = minutos + 1;
        }
        else {
            minutos = 0;
            if (horas < 23) {
                horas = horas + 1;
            }
            else {
                horas = 0;
            } 
        }
    }
}
