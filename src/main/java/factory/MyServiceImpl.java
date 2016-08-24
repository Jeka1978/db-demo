package factory;

/**
 * Created by Jeka on 24/08/2016.
 */
public class MyServiceImpl<T> implements MyService<Integer> {
    @Override
    @Benchmark
    public void a(Integer integer) {
        System.out.println(integer);
    }

    @Override
    public void b() {
        System.out.println("BBBBbbbbbbb");
    }
}
