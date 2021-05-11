package timer;

public class Timer {

    /**
     * Varibili private
     * initTime è l'inizio del timer
     * finTime è la fine del timer
     */
    private long initTime;
    private long finTime;

    /**
     * Costruttore di default
     */
    public Timer(){ }


    /**
     * Metodo che fa partire il timer
     */
    public void start(){
        initTime = System.nanoTime();

    }


    /**
     * Metodo che fa finire il timer
     */
    public void end(){
        finTime = System.nanoTime();
    }


    /**
     * Metodo che resetta il timer
     */
    public void reset(){
        initTime = System.nanoTime();
        finTime = 0;
    }


    /**
     * Metodo per il calcolo del tempo trascorso
     * @return Il valore del tempo trascorso dalla partenza del timer alla sua fine
     */
    public long elapsedTime(){
        return this.finTime - this.initTime;
    }


    /**
     * Getter per initTime
     * @return Il suo valore
     */
    public long getInitTime() {
        return initTime;
    }

    /**
     * Getter per finTime
     * @return IL suo valore
     */
    public long getFinTime() {
        return finTime;
    }


}
