package br.com.franco.math;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import java.util.Random;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class ArrayCompareTest {

  static int[] array;

  @BeforeAll()
  static void randomArray(){
    Random random = new Random();
    array = new int[5];

    for(int i = 0 ; i < 5 ; i++){
      array[i] = random.nextInt(10);
    }

  }
  
  @Test
  void testSort(){
    int actual [] = array; // desordenado
    int expected[] = array;
    Arrays.sort(expected); // ordenado
    assertArrayEquals(expected, actual);
  }

    @Test
    @Timeout(1) // 1 segundo para executar
    void testSortPerfomarce(){
    int actual [] = array; // desordenado
    int expected[] = array;

    // Apenas para gastar tempo
    for(int i = 0 ; i < Integer.MAX_VALUE ; i++){
      expected[0] = i;
          Arrays.sort(expected); // ordenado
    }

    assertArrayEquals(expected, actual);
  }
}
