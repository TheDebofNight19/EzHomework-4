package com.github.TheDebofNight19;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("Test1")
@DisplayName("TestJunit")

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
    @DisplayName("First test")
    void testMethod1(){
        LOG.info("The first test is complete.");

    }

    /**
     * Параметризованный тест, который будет падать на ошибку на третьей итерации
     */

    @ParameterizedTest(name = "#{index} - Testing number = {0}")
    @ValueSource(ints = {22, 33, -1})
    void test_int_arrays_custom_name(int arg) {
        assertTrue(arg > 0);
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
