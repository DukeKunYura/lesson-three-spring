package com.duke.lessonthreespring.controllers;

import com.duke.lessonthreespring.services.RefuseService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoControllerTest {

    @Test
    void sayNo() {
        // given
        String applicationId = "123";
        TestRefuseService refuseService = new TestRefuseService(applicationId);
        NoController noController = new NoController(refuseService, null);

        // when
        noController.sayNo("123");

        // then
        assertTrue(refuseService.isMethodCalled());
    }

    class TestRefuseService implements RefuseService {
        private boolean methodCalled = false;
        private final String applicationId;

        public TestRefuseService(String applicationId) {
            this.applicationId = applicationId;
        }

        @Override
        public void refuse(String applicationId) {
            if (applicationId.equals(this.applicationId)) {
                methodCalled = true;
            }
        }

        public boolean isMethodCalled() {
            return methodCalled;
        }
    }
}