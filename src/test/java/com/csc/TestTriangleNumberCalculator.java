package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTriangleNumberCalculator {

  TriangleNumberCalculator calculator;

  @BeforeEach
  void setUp() {
    calculator = new TriangleNumberCalculator();
  }

   // Tests for the value method
   @Test
   void testValueOf0() {
      assertEquals(0, calculator.value(0));
   }

   @Test
   void testValueOf1() {
      assertEquals(1, calculator.value(1));
   }

   @Test
   void testValueOf5() {
      assertEquals(15, calculator.value(5));
   }

   @Test
   void testValueOf10() {
      assertEquals(55, calculator.value(10));
   }
   
   @Test
   void testValueOf15() {
      assertEquals(120, calculator.value(15));
   }

   @Test
   void testValueOf30() {
      assertEquals(465, calculator.value(30));
   }

   @Test
   void testValueOf60() {
      assertEquals(1830, calculator.value(60));
   }

   // Tests for add method
   @Test
   void testAdd1And1() {
      assertEquals(2, calculator.add(1, 1));
   }

   @Test
   void testAdd2And3() {
      assertEquals(9, calculator.add(2, 3));
   }

   @Test
   void testAdd4And2() {
      assertEquals(13, calculator.add(4,2));
   }

   // Tests for subtract method
   @Test
   void testSubtract1And1() {
      assertEquals(0, calculator.subtract(1, 1));
   }

   @Test
   void testSubtract2And3() {
      assertEquals(-3, calculator.subtract(2, 3));
   }

   @Test
   void testSubtract4And2() {
      assertEquals(7, calculator.subtract(4, 2)); 
   }
}
