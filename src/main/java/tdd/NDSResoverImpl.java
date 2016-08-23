package tdd;

import lombok.SneakyThrows;

/**
 * Created by Jeka on 23/08/2016.
 */
public class NDSResoverImpl implements NDSResolver {
    @Override
    @SneakyThrows
    public double getNDS() {
        Thread.sleep(5000);
        return 0.17;
    }
}
