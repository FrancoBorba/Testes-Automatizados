package br.com.franco.mockito;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.arrayContaining;
import static org.hamcrest.Matchers.arrayWithSize;
import static org.hamcrest.Matchers.emptyOrNullString;
import static org.hamcrest.Matchers.emptyString;
import static org.hamcrest.Matchers.everyItem;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThan;


import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class HamcrestTestMatchers {
  

  @Test
  void testHamcrestTestMatchers(){

    // Given

    List<Integer> scores = Arrays.asList(99,100,101,105);

    assertThat(scores, hasSize(4));
    assertThat(scores, hasItems(99,100));
    assertThat(scores, everyItem(greaterThan(98))); // All numbers are biggest 98
    assertThat(scores, everyItem(lessThan(106))); // All numbers are lower 106

  
  }

  @Test
  void testStringWithHamcrest(){
    // Given
    String empityString = "";


    assertThat(empityString, is(emptyString()));

    assertThat(null, is(emptyOrNullString()));


  }

   @Test
  void testArrayWithHamcrest(){
    // Given
    Integer myArray [] = {1,2,3,4};

    assertThat(myArray  , arrayWithSize(4));
    assertThat(myArray, arrayContaining(1,2,3,4));




  }
}
