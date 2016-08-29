package springannotations.qualifiers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Evegeny on 29/08/2016.
 */
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
@Repository
@Autowired
public @interface DBRepo {
    DBType value();
}
