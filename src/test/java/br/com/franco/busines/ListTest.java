package br.com.franco.busines;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ListTest {

  List list;

  @BeforeEach
  void setUp(){
    list = mock(List.class);
  }
  
  @Test
  void testMockingList_When_SizeIsCalled_ShouldReturn10(){
    // Given ; Arrange
    when(list.size()).thenReturn(10);
    // When ; Act 
    var actual = list.size();
    // Then ; Assert

    assertEquals(10, actual);
  }

    @Test
  void testMockingList_When_SizeIsCalled_ShouldReturn1MultiplesValues(){
    // Given ; Arrange
    given(list.size()).willReturn(10).willReturn(20).willReturn(30);
    // When ; Act 
    // Then ; Assert

    assertThat(list.size(), is(10));
    assertThat(list.size(), is(20));
    assertThat(list.size(), is(30));
    assertThat(list.size(), is(30));
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
    given(list.get(anyInt())).willReturn("Franco");
    // When ; Act 
    // Then ; Assert
    assertThat( list.get(anyInt()),is("Franco"));
    assertThat(list.get(1000), is("Franco") );
    assertThat(list.get(1001),is("Franco") );
    
  }

    @Test
  void testMockingList_When_ThrowsAnException(){
    // Given ; Arrange
    given(list.get(anyInt())).willThrow(new RuntimeException("Invalid argument"));
    // When ; Act 
    // Then ; Assert
    assertThrows(
      RuntimeException.class,
     ()-> list.get(anyInt()) ,
      ()-> "Should have Throw an Run Time Exception");
    
  }
}
