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
        updateDisplay();
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
       updateDisplay();
    }

    /**
     * Fija unas horas y unos minutos dados
     */
    public void setTime(int newHours, int newMinutes)
    {
        hours.setValue(newHours);
        minutes.setValue(newMinutes);
        updateDisplay();
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
      if (minutes.getValue() == 0){
          hours.increment(); 
        }
      updateDisplay();
    }
    /**
     * Actualiza el atributo display
     */
     private void updateDisplay(){
         if(hours.getValue() > 12 && hours.getValue() > 0){
             int valorHoraam = hours.getValue() - 12;
             hora5c = valorHoraam + ":" + minutes.getDisplayValue() + "pm";
         }
         else if (hours.getValue() == 12){
             hora5c = hours.getDisplayValue() + ":" + minutes.getDisplayValue() + "pm";
            }
         else if (hours.getValue() == 0){
             int valorHoraam = hours.getValue() + 12;
             hora5c = valorHoraam + ":" + minutes.getDisplayValue() + "am";
            }
         else{
             hora5c = hours.getDisplayValue() + ":" + minutes.getDisplayValue() + "am";
         }
    }
}
