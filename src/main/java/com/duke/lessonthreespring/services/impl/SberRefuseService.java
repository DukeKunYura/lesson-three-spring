package com.duke.lessonthreespring.services.impl;

import com.duke.lessonthreespring.services.RefuseService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
//@ConditionalOnProperty(name = "workEnvironment", havingValue = "sber")
public class SberRefuseService implements RefuseService {
    @Override
    public void refuse(String applicationId) {
        System.out.println("This is Sber impl: I say No with id = " + applicationId + "!");
    }
}
