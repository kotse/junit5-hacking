package presentation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.fail;

class JUnit5Talk {

    @DisplayName("About me")
    @ParameterizedTest(name = "{0}")
    @ValueSource(strings = {
            "Using Java for >10 years",
            "Strong interest in unit testing and test automation",
            "Writing: kgolev.com",
            "Twitter: @kotseto"
    })
    void aboutMe() {

    }

    @DisplayName("Facts about JUnit 4")
    @ParameterizedTest(name = "{0}")
    @ValueSource(strings = {
            "Released in 2006",
            "12 minor versions",
            "Slow development over the years",
            "Java evolved",
            "Other test frameworks evolved"
    })
    void junit4Facts() {

    }

    @DisplayName("Tool Integration")
    @ParameterizedTest(name = "{0}")
    @ValueSource(strings = {
            "Not taken into account during initial JUnit development",
            "IDEs and build tools found “ways” to integrate",
            "Brittle, obstacle for development"
    })
    void toolIntegration() {
        fail("");
    }

    @DisplayName("JUnit 5 goal")
    @ParameterizedTest(name = "{0}")
    @ValueSource(strings = {
            "Provide official integration API",
            "Design for extensibility",
            "Keep up with the changes in Java and other frameworks"
    })
    void junit5Goal() {
    }


    @DisplayName("Some extensions points")
    @ParameterizedTest(name = "{0}")
    @ValueSource(strings = {
            "ExecutionCondition",
            "ParameterResolver",
            "TestInstancePostProcessor",
            "BeforeAllCallback",
            "BeforeEachCallback",
            "BeforeTestExecutionCallback",
            "AfterTestExecutionCallback",
            "AfterEachCallback",
            "AfterAllCallback",
            "TestExecutionExceptionHandler"
    })
    void extensionPoints() {
    }

    @DisplayName("Other features")
    @ParameterizedTest(name = "{0}")
    @ValueSource(strings = {
            "Composite annotation support",
            "Dynamic tests",
            "Tagging",
            "Repeated tests",
            "etc"
    })
    void otherFeatures() {
    }

}