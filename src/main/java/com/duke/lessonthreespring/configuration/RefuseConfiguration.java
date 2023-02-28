package com.duke.lessonthreespring.configuration;

import com.duke.lessonthreespring.services.RefuseService;
import com.duke.lessonthreespring.services.impl.MockRefuseService;
import com.duke.lessonthreespring.services.impl.SberRefuseService;
import com.duke.lessonthreespring.services.impl.AlfaRefuseService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"lessonthreespring"})
public class RefuseConfiguration {
//    @Value("${testEnvironment}")
//    private String testEnvironment;
////    @Bean
//    public RefuseService refuseService() {
//        switch (testEnvironment) {
//            case "test":
//                return new MockRefuseService();
//            case "sber":
//                return new SberRefuseService();
//            case "alfa":
//                return new AlfaRefuseService();
//        }
//        throw new IllegalArgumentException();
//    }
}
