package com.github.TheDebofNight19;
import com.sun.tracing.dtrace.ProviderAttributes;
import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Tag("Test2")
@DisplayName("TestAnotherJunit")

public class TestAnotherJunit {

    private static final Logger LOG = LoggerFactory.getLogger(TestAnotherJunit.class);

    @BeforeAll
    static void beforeAll(){
        LOG.info("This comes before ALL");
    }

    @BeforeEach
    void beforeEach(){
        LOG.info("This comes before EACH");
    }


    @Test
    @DisplayName("First test")
    void testAnotherMethod1(){
        LOG.info("First another test is complete.");

    }

    @Test
    @DisplayName("Second test")
    void testAnotherMethod2(){
        LOG.info("Second another test is complete.");

    }

    @AfterEach
    void afterEach(){
        LOG.info("This comes after EACH");
    }

    @AfterAll
    static void afterAll(){
        LOG.info("This comes after ALL");
    }

}
