package com.duke.lessonthreespring.services.impl;

import com.duke.lessonthreespring.services.RefuseService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name = "workEnvironment", havingValue = "alfa")
public class AlfaRefuseService implements RefuseService {
    @Override
    public void refuse(String applicationId) {
        System.out.println("This is Alfa impl: I say No with id = " + applicationId + "!");
    }
}
