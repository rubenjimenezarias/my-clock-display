/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class newClockDisplay
{
    // instance variables - replace the example below with your own
    private NumberDisplay hours;
    private NumberDisplay minutes;
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
        if (newHours < 24 && newHours >= 0){
            hours.setValue(newHours);
        }
        else {
            System.out.println("La hora debe de ser entre 0 y 23");
        }
        if (newMinutes < 60 && newMinutes >= 0){
            minutes.setValue(newMinutes);
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
        return hora5c;
    }
    
    /**
     * Avanzar un minuto el reloj
     */
    public void timeTick(){
      minutes.increment();
    }  
}
