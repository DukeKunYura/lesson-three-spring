package com.duke.lessonthreespring.controllers;

import com.duke.lessonthreespring.services.AppIdValidationService;
import com.duke.lessonthreespring.services.RefuseAllService;
import com.duke.lessonthreespring.services.RefuseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class NoController {
    private final RefuseService refuseService;
    private final RefuseAllService refuseAllService;
    private final AppIdValidationService appIdValidationService;

    @GetMapping("/no")
    public String sayNo(String applicationId) {
        if (appIdValidationService.validate(applicationId)) {
            refuseService.refuse(applicationId);
        }
        return "Hey";
    }


    @GetMapping("/no-all")
    public String sayAllNo(String applicationId) {
        refuseAllService.refuse(applicationId);
        return "No for all";
    }
}
