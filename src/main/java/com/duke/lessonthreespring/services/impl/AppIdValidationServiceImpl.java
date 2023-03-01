package com.duke.lessonthreespring.services.impl;

import com.duke.lessonthreespring.services.AppIdValidationService;

public class AppIdValidationServiceImpl implements AppIdValidationService {
    @Override
    public boolean validate(String applicationId) {
        return applicationId.length() <= 4;
    }
}
