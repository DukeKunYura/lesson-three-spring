package com.duke.lessonthreespring.services.impl;

import com.duke.lessonthreespring.services.RefuseAllService;
import com.duke.lessonthreespring.services.RefuseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class RefuseAllServiceImpl implements RefuseAllService {
    public final Collection<RefuseService> refuseServices;
    @Override
    public void refuse(String applicationId) {
        for (RefuseService refuseService : refuseServices) {
            refuseService.refuse(applicationId);
        }
        System.out.println("I say no for all");
    }
}
