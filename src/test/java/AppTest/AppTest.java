package AppTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotEquals;

class AppTest {
    @DisplayName("Making sure it prints Hi Larry Sprinkle!")
    @Test
    void testHiFriend() {
        assertEquals("Hi Larry Sprinkle!", HiFriend.hi());
    }

    @Test
    @DisplayName("Making sure this returns the String")
    void response1Test() {
    assertEquals("Your first response is I am fine", HiThere.yourResponse1("I am fine"));
    }

    @Test
    @DisplayName("Making sure this returns the String")
    void response2Test() {
    assertEquals("Your second response is Looking forward to a vacation", HiThere.yourResponse2("Looking forward to a vacation"));
    }

    @Test
    @DisplayName("Making sure this returns the integer")
    void integerTest() {
    assertEquals("Your integer response is 10", VariableInputs.yourInteger(10));
    }    

    @Test
    @DisplayName("Making sure this returns the double")
    void doubleTest() {
    assertEquals("Your double response is 10.7544", VariableInputs.yourDouble(10.7544));
    }    

    @Test
    @DisplayName("Making sure this returns the boolean")
    void booleanTest() {
    assertEquals("Your boolean response is true", VariableInputs.yourBoolean(true));
    }    
}