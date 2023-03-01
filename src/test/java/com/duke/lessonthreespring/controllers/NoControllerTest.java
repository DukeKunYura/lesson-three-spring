package com.duke.lessonthreespring.controllers;

import com.duke.lessonthreespring.services.RefuseService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class NoControllerTest {

    @Mock
    RefuseService refuseServiceMock;

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

    @InjectMocks
    NoController noController;

    @Test
    void applicationIdIsAtMock4InLength() {
        assertNotNull(refuseServiceMock);

        assertThrows(IllegalArgumentException.class,
                () -> noController.sayNo("12345"));
    }

    @Test
    void mockitoSayNo() {
        assertNotNull(refuseServiceMock);
        noController.sayNo("123");

        verify(refuseServiceMock).refuse(eq("123"));
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