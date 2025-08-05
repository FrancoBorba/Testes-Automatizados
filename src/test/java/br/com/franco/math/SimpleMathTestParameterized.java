package br.com.franco.math;


import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Test Math operation in Simple Math")
public class SimpleMathTestParameterized {
//We are reusing the SimpleMath class for the study of automated tests now parameterizing them

  SimpleMath math;
  
    @BeforeEach
   void BeforeEachMethod(){
        System.out.println("Usando BeforeEach");
      math = new SimpleMath();
  }


  @ParameterizedTest
 // @MethodSource("testDivisionInputParameters")
 // @MethodSource() // If it is the same name, you do not need to pass it as a parameter.

 /*  @CsvSource({ //A CSV (Comma Separated Values) file is a plain text file format used to store tabular data, such as spreadsheets or databases
     "6.2 , 2 , 3.1",
    "71 , 14 , 5.07",
    "18.D , 3.1 , 5.90"
  }
  )*/
  @CsvFileSource(resources = "/testDivision.csv")
  void testDivision(Double firstNumber , Double secondNumber , Double expected){
  
   
    Double actual = math.division(firstNumber, secondNumber);
  
    //Expected value and result
    // Pass a log as a parameter that only appears in case of error
    Assertions.assertEquals(expected, actual , 2D, () -> firstNumber + "/" + secondNumber + "did not produces: " + expected);

   // Assertions.assertNotNull(actual); 
  }

  @ParameterizedTest
  @ValueSource(strings = {"Franco" , "Caio" , "Davi" , "José"} )
  public void testValueSource(String firstName){
    System.out.println(firstName);
    assertNotNull(firstName);
  }

  public static Stream<Arguments> testDivision(){
    return Stream.of(
      Arguments.of(6.2D , 2D , 3.1D),
      Arguments.of(71D , 14D , 5.07D),
      Arguments.of(18.3D , 3.1D , 5.90D)
    );
  }
 
  
}
