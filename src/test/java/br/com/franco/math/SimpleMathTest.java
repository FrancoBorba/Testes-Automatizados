package br.com.franco.math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test Math operation in Simple Math")
public class SimpleMathTest {

  SimpleMath math;

  @BeforeAll
  static void setup(){
    System.out.println("Usando Before All");
  }

  
  @AfterAll
  static void cleanup(){
    System.out.println("Usando After All");
  }

  @BeforeEach
   void BeforeEachMethod(){
        System.out.println("Usando BeforeEach");
      math = new SimpleMath();
  }

  
  @AfterEach
   void AfterEachMethod(){
         System.out.println("Usando After Each");
  }
  
  // test[System under test]_[Condition or State change]_[Expect Result]
  @Test
  @DisplayName("Test 6.2 + 2 = 8.2")
  void testSum(){
    // Given
   
    Double firstNumber = 6.2D;
    Double secondNumber = 2D;
    Double expected = 8.2D;

  // when 
    Double actual = math.sum(6.2D, 2D);
   
    //Expected value and result
    // Pass a log as a parameter that only appears in case of error
    // Then
    Assertions.assertEquals(expected, actual , () -> firstNumber + "+" + secondNumber + "did not produces: " + expected);
  }

  @Test
  @DisplayName("Test 6.2 - 2 = 4.2")
  void testSubtraction(){
    
    Double firstNumber = 6.2D;
    Double secondNumber = 2D;
    Double actual = math.subtraction(firstNumber, secondNumber);
    Double expected = 4.2D;
    //Expected value and result
    // Pass a log as a parameter that only appears in case of error
    Assertions.assertEquals(expected, actual , () -> firstNumber + "-" + secondNumber + "did not produces: " + expected);
    Assertions.assertNotNull(actual); 
  }

  @Test
  @DisplayName("Test 6.2 * 2 = 12.4")
  void testMultilication(){
  
    Double firstNumber = 6.2D;
    Double secondNumber = 2D;
    Double actual = math.multiplication(firstNumber, secondNumber);
    Double expected = 12.4D;
    //Expected value and result
    // Pass a log as a parameter that only appears in case of error
    Assertions.assertEquals(expected, actual , () -> firstNumber + "*" + secondNumber + "did not produces: " + expected);
    Assertions.assertNotNull(actual); 
  }

  @Test
  @DisplayName("Test 6.2 / 2 = 3.1")
  void testDivision(){
  
    Double firstNumber = 6.2D;
    Double secondNumber = 2D;
    Double actual = math.division(firstNumber, secondNumber);
    Double expected = 3.1D;
    //Expected value and result
    // Pass a log as a parameter that only appears in case of error
    Assertions.assertEquals(expected, actual , () -> firstNumber + "/" + secondNumber + "did not produces: " + expected);

    Assertions.assertNotNull(actual); 
  }

  @Test
 // @Disabled()
  @DisplayName("Test division by zero")
  void testDivision_When_FirstNumberIsDividedByZero_ShouldThrowArithmeticException(){
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

  @Test
  @DisplayName("Test (6.2 + 2) = 4.1")
  void testMean(){
    Double firstNumber = 6.2D;
    Double secondNumber = 2D;
    Double actual = math.mean(firstNumber, secondNumber);
    Double expected = 4.1D;
    //Expected value and result
    // Pass a log as a parameter that only appears in case of error
    Assertions.assertEquals(expected, actual , () -> "(" + firstNumber + "+" + secondNumber + ")/2 did not produces: " + expected);
    Assertions.assertNotNull(actual); 
  }

  
  @Test
   @DisplayName("Test square root of 64 = 8 ")
  void testSquareRoot(){

    Double firstNumber = 64D;
    Double actual = math.squareRoot(firstNumber);
    Double expected = 8D;
    //Expected value and result
    // Pass a log as a parameter that only appears in case of error
    Assertions.assertEquals(expected, actual , () -> firstNumber + "+" + "did not produces: " + expected);
    Assertions.assertNotNull(actual); 
  }

  
}
