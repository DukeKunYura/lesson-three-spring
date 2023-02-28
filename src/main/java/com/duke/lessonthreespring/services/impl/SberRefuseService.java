package com.duke.lessonthreespring.services.impl;

import com.duke.lessonthreespring.services.RefuseService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class SberRefuseService implements RefuseService {
    @Override
    public void refuse(String applicationId) {
        System.out.println("This is Sber impl: I say No with id = " + applicationId + "!");
    }
}
