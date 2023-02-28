package com.duke.lessonthreespring.controllers;

import com.duke.lessonthreespring.services.RefuseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class NoController {
    private final RefuseService refuseService;
    @GetMapping("/no")
    public String sayNo(String applicationId){
        refuseService.refuse(applicationId);
        return "Hey";
    }
}
