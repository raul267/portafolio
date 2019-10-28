
package controller;

import java.util.Random;

public class IDFactory {
    static Random random = new Random(System.currentTimeMillis());
    public static int generate(){
        int id_random = random.nextInt();
        if(id_random < 0) id_random = id_random *-1;
        return id_random;
    }
}
