package com.duke.lessonthreespring.services.impl;

import com.duke.lessonthreespring.services.RefuseService;

public class AlfaRefuseService implements RefuseService {
    @Override
    public void refuse(String applicationId) {
        System.out.println("This is Alfa impl: I say No with id = " + applicationId + "!");
    }
}
