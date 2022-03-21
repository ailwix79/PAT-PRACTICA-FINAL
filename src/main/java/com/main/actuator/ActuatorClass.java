package com.main.actuator;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

@Component
public class ActuatorClass extends AbstractHealthIndicator {
    
    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        builder.up();
    }
}
