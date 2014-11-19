/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class newClockDisplay
{
    // Un objeto NumberDisplay que nos guarda la hora
    private NumberDisplay hours;
    // Un objeto NumberDisplay que nos guarda los minutos
    private NumberDisplay minutes;
    // Un objeto String que nos guarda la hora con 5 caracteres
    private String hora5c;

    /**
     * Constructor for objects of class ClockDisplay
     */
    public newClockDisplay()
    {
        // initialise instance variables
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        hora5c = hours.getDisplayValue() + ":" + minutes.getDisplayValue();
    }
    
      /**
     * Constructor for objects of class ClockDisplay
     */
    public newClockDisplay(int newHours, int newMinutes)
    {
        // initialise instance variables
       hours = new NumberDisplay(24);
       minutes = new NumberDisplay(60);
       hours.setValue(newHours);
       minutes.setValue(newMinutes);
       hora5c = hours.getDisplayValue() + ":" + minutes.getDisplayValue();
    }

    /**
     * Fija unas horas y unos minutos dados
     */
    public void setTime(int newHours, int newMinutes)
    {
        hours.setValue(newHours);
        minutes.setValue(newMinutes);
        hora5c = hours.getDisplayValue() + ":" + minutes.getDisplayValue();
    }
    
    /**
     * Devuelve una cadena de 5 caracteres mostrando la hora y los minutos actuales separados por puntos
     */
    public String getTime()
    {
        return hora5c;
    }
    
    /**
     * Avanzar un minuto el reloj
     */
    public void timeTick(){
      minutes.increment();
    }  
}
