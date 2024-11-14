package lecture_4;

import java.time.LocalDateTime;

public class L4_Example_9 {
    public static void main(String[] args) {
        boolean done = false;
        for(int i = 0; !done; ){
            System.out.println("i: " + i);
            if(i == 10){
                done = true;
            }
            i++;
        }
    }
}
