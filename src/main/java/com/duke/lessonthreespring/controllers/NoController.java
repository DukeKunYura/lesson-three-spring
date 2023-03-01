package com.duke.lessonthreespring.controllers;

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
    @GetMapping("/no")
    public String sayNo(String applicationId){
        validateApplicationId(applicationId);
        refuseService.refuse(applicationId);
        return "Hey";
    }

    private static void validateApplicationId(String applicationId) {
        if (applicationId.length() > 4) {
            throw new IllegalArgumentException("length should be 4 or less");
        }
    }

    @GetMapping("/no-all")
    public String sayAllNo(String applicationId){
        refuseAllService.refuse(applicationId);
        return "No for all";
    }
}
