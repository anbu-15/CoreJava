import java.util.Random;

class Helloo
{
    public void forInsta(String opened) throws InterruptedException
    {
        System.out.println(opened+" insta page opened ");
        Thread.sleep(500);
        System.out.println(opened+" insta page closed ");
    }
    public void forSnap(String opened) throws InterruptedException
    {
        System.out.println(opened+" snap page opened ");
        Thread.sleep(500);
        System.out.println(opened+" snap page closed ");
    }
}
public class ThreadUsingLamdaExpression {
    static String[] instaOptions={"Stories","Messages","Edit Profile"};
    static String[] snapOptions={"Stories","Messages","Edit Profile"};
    public static void main(String[] args) {
        Helloo h=new Helloo();

        Random r=new Random();
        Runnable insta=()->{
            try {
                h.forInsta(instaOptions[r.nextInt(instaOptions.length)]);
            }
            catch(InterruptedException e)
            {
                e.getMessage();
            }
        };
        Runnable snap=()->{
            try {
                h.forSnap(snapOptions[r.nextInt(snapOptions.length)]);
            }
            catch (InterruptedException e)
            {
                e.getMessage();
            }
        };

       Thread ins=new Thread(insta);
       Thread sna=new Thread(snap);

        ins.start();
        sna.start();
    }
}
