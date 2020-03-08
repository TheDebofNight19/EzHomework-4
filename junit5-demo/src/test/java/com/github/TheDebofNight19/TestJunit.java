package com.github.TheDebofNight19;
import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestJunit {

    private static final Logger LOG = LoggerFactory.getLogger(TestJunit.class);

    @BeforeAll
    static void beforeAll(){
        LOG.info("This comes before ALL");
    }

    @BeforeEach
    void beforeEach(){
        LOG.info("This comes before EACH");
    }

    @Test
    void testMethod1(){
        LOG.info("The first test is complete.");

    }

    @Test
    void testMethod2(){
        LOG.info("The second test is complete.");

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
