package br.com.franco;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.Random.class)
public class MethodOrdenRandolyTest {
  
  @Test
  void testA(){
    System.out.println("Rodando teste A");
  }
   @Test
  void testB(){
    System.out.println("Rodando teste B");
  }
   @Test
  void testC(){
    System.out.println("Rodando teste C");
  }
   @Test
  void testD(){
    System.out.println("Rodando teste D");
  }
}
