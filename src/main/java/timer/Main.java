package timer;

import timerutils.TimerUtils;

public class Main {

    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.start();

        for (int i = 0; i<7000; i++){
            int a = 1 +1;
        }
        timer.end();

        //System.out.println(timer.getInitTime());
        //System.out.println(timer.getFinTime());

        //Vedo il tempo trascorso
        System.out.println("Tempo trascorso dopo il for: " + timer.elapsedTime());

        //reset del timer
        timer.reset();
        timer.end();
        System.out.println("Tempo trascorso dopo il reset: " + timer.elapsedTime());

    }
}
