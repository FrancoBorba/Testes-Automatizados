package br.com.franco.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class SpyTest {
  
  @Test
  void test(){
    // Given ; Arrange
    List<String> mockArrayList = spy(ArrayList.class);

    // When ; Act & Then ; Assert

    assertEquals(0,mockArrayList.size());

    when(mockArrayList.size()).thenReturn(5);
    mockArrayList.add("Test");

    assertEquals(5,mockArrayList.size());

  }

    @Test
  void testV2(){
    // Given ; Arrange
    List<String> spyArrayList = spy(ArrayList.class);

    // When ; Act & Then ; Assert

    assertEquals(0,spyArrayList.size());

 
    spyArrayList.add("Test");
    assertEquals(1,spyArrayList.size());
    spyArrayList.remove("Test");

    assertEquals(0,spyArrayList.size());

  }

     @Test
  void testV3(){
    // Given ; Arrange
    List<String> spyArrayList = spy(ArrayList.class);

    // When ; Act & Then ; Assert

    assertEquals(0,spyArrayList.size());

   when(spyArrayList.size()).thenReturn(5);
   spyArrayList.add("Test");

    assertEquals(5,spyArrayList.size());

  }

      @Test
     void testV4(){
    // Given ; Arrange
    List<String> spyArrayList = spy(ArrayList.class);

    // When ; Act & Then ; Assert

    spyArrayList.add("Test");
    
    verify(spyArrayList).add("Test");



  }
}
