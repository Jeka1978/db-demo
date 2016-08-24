package factory;

/**
 * Created by Jeka on 24/08/2016.
 */
public class BenchmarkPowerCleaner implements Cleaner {
    @InjectByType
    private PowerCleaner powerCleaner;

    @Override
    public void clean() {
        long start = System.nanoTime();
        powerCleaner.clean();
        long end = System.nanoTime();
        System.out.println(end-start);
    }
}
