package com.duke.lessonthreespring.services.impl;

import com.duke.lessonthreespring.services.RefuseAllService;
import org.springframework.stereotype.Service;

@Service
public class RefuseAllServiceImpl implements RefuseAllService {
    @Override
    public void refuse(String applicationId) {
        System.out.println("I say no for all");
    }
}
