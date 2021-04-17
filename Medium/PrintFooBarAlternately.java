public class PrintFooBarAlternately { }
class FooBar {
    private int n;
    private boolean b = false;
    private Runnable pb;

    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        Thread.sleep(3);
        for (int i = 0; i < n; i++) {

            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            pb.run();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        pb = printBar;
        while (b) {
            for (int i = 0; i < n; i++) {

                // printBar.run() outputs "bar". Do not change or remove this line.
                printBar.run();
            }
        }
    }
}
