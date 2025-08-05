package br.com.franco;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MethodOrderByOrder {
  
  @Test
  @Order(3)
  void testA(){
    System.out.println("Rodando teste A");
  }
   @Test
   @Order(2)
  void testB(){
    System.out.println("Rodando teste B");
  }
   @Test
   @Order(1)
  void testC(){
    System.out.println("Rodando teste C");
  }
   @Test
    @Order(4)
  void testD(){
    System.out.println("Rodando teste D");
  }
}
