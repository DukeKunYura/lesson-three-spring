package com.duke.lessonthreespring.services.impl;

import com.duke.lessonthreespring.services.RefuseService;
import org.springframework.stereotype.Service;

//@Service задан вручную в конфигурации
public class MockRefuseService implements RefuseService {
    @Override
    public void refuse(String applicationId) {
        System.out.println("This is TEST impl: I say No with id = " + applicationId + "!");
    }
}
