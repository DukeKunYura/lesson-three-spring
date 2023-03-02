package com.duke.lessonthreespring.controllers;

import com.duke.lessonthreespring.services.AppIdValidationService;
import com.duke.lessonthreespring.services.RefuseAllService;
import com.duke.lessonthreespring.services.RefuseService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;

@ExtendWith(SpringExtension.class)
@WebMvcTest
public class NoControllerIntegrationTest {
    @Autowired
    MockMvc mockMvc;

    @MockBean
    RefuseService refuseService;

    @MockBean
    RefuseAllService refuseAllService;

    @MockBean
    AppIdValidationService appIdValidationService;

    @Test
    void saiNo() throws Exception {
        //assertNotNull(mockMvc);
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/no")
                .queryParam("applicationId", "123"))
                .andReturn();
        String actual = result.getResponse().getContentAsString();
        assertThat(actual).isEqualTo("Hey");
        verify(appIdValidationService).validate(eq("123"));

    }
}
