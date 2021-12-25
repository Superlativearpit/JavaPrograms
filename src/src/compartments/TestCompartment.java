package src.compartments;
import java.util.Random;

public class TestCompartment {
    public static void main(String[] args) {
        Compartment b[] = new Compartment[10];
        int randomNumber = 0;
        for(int i = 0; i < 10; i++) {
            Random rd = new Random();
            randomNumber = rd.nextInt();

            if(randomNumber < 0) {
                randomNumber = (randomNumber % 4) * -1;

            } else {
                randomNumber = randomNumber % 4;
            }
            switch (randomNumber) {
                case 0: {
                    b[i] = new First();
                    break;
                }
                case 1: {
                    b[i] = new Ladies();
                    break;
                }
                case 2: {
                    b[i] = new General();
                    break;
                }
                case 3: {
                    b[i] = new Luggage();
                    break;
                }
            }
            System.out.println("Object "+ (i+1) + "=  " );
            b[i].notice();
        }
    }
}
