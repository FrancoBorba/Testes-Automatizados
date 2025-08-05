package br.com.franco.math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class DemoRepeatedTest {
  
    SimpleMath math;
  
    @BeforeEach
   void BeforeEachMethod(){
        System.out.println("Usando BeforeEach");
      math = new SimpleMath();
  }

   @RepeatedTest(value = 3 , name = "{displayName}. Repetition"  
    + "{currentRepetition} of {totalRepetitions}")
 // @Disabled()
  @DisplayName("Test division by zero")
  void testDivision_When_FirstNumberIsDividedByZero_ShouldThrowArithmeticException(
    RepetitionInfo repetitionInfo ,
    TestInfo testInfo
  ){

    System.out.println("Running: " +  testInfo.getTestMethod().get().getName());
    System.out.println("Repetionf info N " + repetitionInfo.getCurrentRepetition());
    // Given
    Double firstNumber = 6.2D;
    Double secondNumber = 0D;

    var expectedMessage = "Impossible to divide by zero!";
      // When & Then
    ArithmeticException actual = assertThrows(ArithmeticException.class, ()-> {
      math.division(firstNumber, secondNumber);
    }, () -> "Division by zero shoul throw am ArithmeticException");
   
    assertEquals(expectedMessage, actual.getMessage());

  }

}
