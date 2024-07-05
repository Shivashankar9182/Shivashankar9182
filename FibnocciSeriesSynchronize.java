//Demonstration of a program using synchronization to print fibnacci sereies
class SyncFibnocci {
    int num = 0;
    int num1 = 1;

    public SyncFibnocci(int num, int num1) {
        super();
        this.num = num;
        this.num1 = num1;
    }

    synchronized void series() {
        // This method generates Fibonacci numbers and prints them
        // until num1 reaches 20.
        for (; num1 < 20;) {
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(num + "\n" + num1);
            num = num + num1;
            num1 = num1 + num;
        }
        System.out.println("--------");
    }
}

class FibnocciSeriesSynchronize extends Thread {
    SyncFibnocci ae;

    public FibnocciSeriesSynchronize(SyncFibnocci ae) {
        super();
        this.ae = ae;
    }

    public void run() {
        ae.series(); // Start generating Fibonacci series
    }

    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        SyncFibnocci sf = new SyncFibnocci(x, y);

        // Create three threads to run the series concurrently
        FibnocciSeriesSynchronize fss = new FibnocciSeriesSynchronize(sf);
        fss.start();
        FibnocciSeriesSynchronize fss1 = new FibnocciSeriesSynchronize(sf);
        fss1.start();
        FibnocciSeriesSynchronize fss2 = new FibnocciSeriesSynchronize(sf);
        fss2.start();
    }
}
