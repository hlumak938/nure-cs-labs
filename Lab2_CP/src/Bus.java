import java.util.concurrent.Semaphore;

public class Bus implements Runnable {
    private static final Semaphore SEMAPHORE = new Semaphore(2, true);
    private final int busNumber;
    Bus(int busNumber) {
        this.busNumber = busNumber;
    }
    @Override
    public void run()
    {
        try {
            SEMAPHORE.acquire();
            System.out.printf("Bus #%d arrived at the stop.\n", busNumber);
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        SEMAPHORE.release();
        System.out.printf("Bus #%d left the stop.\n", busNumber);
    }
}
