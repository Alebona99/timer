package timerutils;

import java.util.concurrent.TimeUnit;

/**
 * Class Utility per Timer
 */
public final class TimerUtils {


    /**
     * Varibili private
     * initTime è l'inizio del timer
     * finTime è la fine del timer
     */
    private static long initTime;
    private static long finTime;


    /**
     * Metodo che fa partire il timer
     */
    public static void start(){
        initTime = System.nanoTime();

    }


    /**
     * Metodo che fa finire il timer
     */
    public static void end(){
        finTime = System.nanoTime();
    }


    /**
     * Metodo che resetta il timer
     */
    public static void reset(){
        initTime = System.nanoTime();
        finTime = 0;
    }


    /**
     * Metodo per il calcolo del tempo trascorso in millisecondi
     * @return Il valore del tempo trascorso dalla partenza del timer alla sua fine
     */
    public static double elapsedTime(){
        long total = finTime - initTime;
        long time = TimeUnit.NANOSECONDS.convert(total, TimeUnit.MILLISECONDS);
        return (double)time;
    }

}
