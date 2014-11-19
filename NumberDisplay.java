
/**
 * Write a description of class NumberDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberDisplay
{
    // instance variables - replace the example below with your own
    private int display;
    // numero al que no puede llegar el limite
    private int limitDisplay;

    /**
     * Constructor for objects of class NumberDisplay
     */
    public NumberDisplay(int limit)
    {
        // initialise instance variables
        display = 0;
        limitDisplay = limit;
    }

    /**
     * Modifica display.
     */
    public void setValue(int newDisplay)
    {
        // put your code here
        if ((newDisplay < limitDisplay) && (newDisplay >= 0)){
            display = newDisplay;
        }
        else {
            System.out.println("El valor supera el limite");
        }
    }
    
    /**
     * Devuelve el valor del display
     */
    public String getDisplayValue ()
    { String display2;
      if (display > 9) 
      {
          display2 = "" + display;
      }
      else 
      { 
          display2 = "0" + display;
      }
      return display2;
    }
    
    /**
     * Devuelve el valor del diplay como entero
     */
    public int getValue()
    {
        return display;
    }
    
    /**
     * Metodo que incrementa en 1 el diplay.
     */
    public void increment ()
    {
        if (display<(limitDisplay-1))
        {
            display = display+1;
        }
        else
        {
            display = 0;
        }
        
    }
}
