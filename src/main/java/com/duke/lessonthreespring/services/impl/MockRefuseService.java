package com.duke.lessonthreespring.services.impl;

import com.duke.lessonthreespring.services.RefuseService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
//@ConditionalOnProperty(name = "workEnvironment", havingValue = "test")
public class MockRefuseService implements RefuseService {
    @Override
    public void refuse(String applicationId) {
        System.out.println("This is TEST impl: I say No with id = " + applicationId + "!");
    }
}
