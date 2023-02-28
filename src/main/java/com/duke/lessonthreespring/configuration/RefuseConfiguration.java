package com.duke.lessonthreespring.configuration;

import com.duke.lessonthreespring.services.RefuseService;
import com.duke.lessonthreespring.services.impl.MockRefuseService;
import com.duke.lessonthreespring.services.impl.SberRefuseService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"lessonthreespring"})
public class RefuseConfiguration {
    @Value("${testEnvironment}")
    private boolean testEnvironment;
    @Bean
    public RefuseService refuseService() {
        if (testEnvironment) {
            return new MockRefuseService();
        } else {
            return new SberRefuseService();
        }
    }
}
