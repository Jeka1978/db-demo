package springconditionals;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by Evegeny on 30/08/2016.
 */
public class OnDevCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        return System.getenv().get("COMP_TYPE").equalsIgnoreCase("dev");
    }
}
