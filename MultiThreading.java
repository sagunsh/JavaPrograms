public class MultiThreading extends Thread{
    private Thread t;
    private String name;

    MultiThreading(String name) {
        this.name = name;
        System.out.println("Creating thread " + name);
    }

    public void run() {
        System.out.println("Running thread " + name);
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Thread " + name + ", Counting " + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + name + " is interrupted");
        }
        System.out.println("Exiting Thread " + name);
    }

    public static void main(String[] args) {
        MultiThreading first = new MultiThreading("First");
        first.start();
        MultiThreading second = new MultiThreading("Second");
        second.start();
    }
}