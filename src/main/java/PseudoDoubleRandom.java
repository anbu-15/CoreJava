import java.util.Random;

public class PseudoDoubleRandom {
    public static void main(String[] args) {
        Random random = new Random();
        double min = 5.0;
        double max = 10.0;
      //  double rnn=random.nextDouble();
        //pseudo random values or in between 0.0 to 1.0 (max range should must be <1.0)
//        System.out.println("rnn: in between 0.0 to 1.0  : "+rnn);
        double randomValue = min + (max - min) * random.nextDouble();
//        double ranVal=randomValue-min;
//        System.out.println("ranVal : "+ranVal);
        System.out.println("Random value in range [" + min + ", " + max + "): " + randomValue);
    }
}