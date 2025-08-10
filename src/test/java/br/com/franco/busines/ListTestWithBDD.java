package br.com.franco.busines;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;
import static org.mockito.BDDMockito.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.is;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ListTestWithBDD {

  List list;

  @BeforeEach
  void setUp(){
    list = mock(List.class);
  }
  
  @Test
  void testMockingList_When_SizeIsCalled_ShouldReturn10(){
    // Given ; Arrange
    given(list.size()).willReturn(10);
    // When ; Act 
    var actual = list.size();
    // Then ; Assert

    assertThat(actual , is(10));
  }

    @Test
  void testMockingList_When_SizeIsCalled_ShouldReturn1MultiplesValues(){
    // Given ; Arrange
    when(list.size()).thenReturn(10).thenReturn(20).thenReturn(30);
    // When ; Act 
    // Then ; Assert

    assertEquals(10, list.size());
    assertEquals(20, list.size());
    assertEquals(30, list.size());
     assertEquals(30, list.size());
  }
  @Test
  void testMockingList_When_GetIsCalled_ShouldReturnFranco(){
    // Given ; Arrange
    when(list.get(0)).thenReturn("Franco");
    // When ; Act 
    // Then ; Assert
    assertEquals("Franco", list.get(0));
    assertNull(list.get(1));
  }

  @Test
  void testMockingList_When_GetIsCalledWithArgumentMatcher_ShouldReturnFranco(){
    // Given ; Arrange
    when(list.get(anyInt())).thenReturn("Franco");
    // When ; Act 
    // Then ; Assert
    assertEquals("Franco", list.get(anyInt()));
    assertEquals("Franco", list.get(1000));
    assertEquals("Franco", list.get(1001));
    
  }

    @Test
  void testMockingList_When_ThrowsAnException(){
    // Given ; Arrange
    when(list.get(anyInt())).thenThrow(new RuntimeException("Invalid argument"));
    // When ; Act 
    // Then ; Assert
    assertThrows(
      RuntimeException.class,
     ()-> list.get(anyInt()) ,
      ()-> "Should have Throw an Run Time Exception");
    
  }
}
