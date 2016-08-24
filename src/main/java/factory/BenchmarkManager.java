package factory;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Jeka on 24/08/2016.
 */
@Getter
@Setter
public class BenchmarkManager implements BenchmarkManagerMBean{
    private boolean enabled;
}
