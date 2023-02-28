package com.duke.lessonthreespring.services.impl;

import com.duke.lessonthreespring.services.RefuseService;
import org.springframework.stereotype.Service;

//@Service задан вручную в конфигурации
public class SberRefuseService implements RefuseService {
    @Override
    public void refuse(String applicationId) {
        System.out.println("This is Alfa impl: I say No with id = " + applicationId + "!");
    }
}
