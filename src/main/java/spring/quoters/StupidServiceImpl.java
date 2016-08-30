package spring.quoters;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by Evegeny on 30/08/2016.
 */
@Service
public class StupidServiceImpl implements StupidService {
    @Override
    @PostProxy
    @Transactional
    public void warmCache() {
        System.out.println("cache is warming up");
    }
}
