import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Utils {
    static final Scanner scanner = new Scanner(System.in);
    static final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
    public static void print(String sentence) {
        System.out.println(sentence);
    }
    public static double doubleScanner() {
        try {
            return scanner.nextDouble();
        } catch (Exception e) {
            print("Invalid input");
            scanner.nextLine();
        }
        return 0;
    }

    public static int intScanner() {
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            print("Invalid input");
            scanner.nextLine();
        }
        return 0;
    }

    public static void schedule (int duration) {
        CountDownLatch latch = new CountDownLatch(1);
        print(new StringBuilder()
                .append("Please wait")
                .append("\n")
                .append("...")
                .append("\n")
                .toString());
        if(duration >= 20) {
            duration = 20;
            scheduler.schedule(() -> {
                print("Done.");
                latch.countDown();
            }, duration, TimeUnit.SECONDS);
        } else if (duration == 0) {
            print("Done.");
            latch.countDown();
        }

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        scheduler.shutdown();
    }

    public static void welcome(){
        Utils.print("What do you want to do ?");
    }

    public static void notImplemented() {
        print("Not implemented yet.");
    }

    public static void quit() {
        Utils.print("See you later !");
    };
}
