package com.github.TheDebofNight19;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestJunit {

    private static final Logger LOG = LoggerFactory.getLogger(TestJunit.class);

    @Test
    void testMethod1(){
        LOG.info("The test is complete.");

    }
}
