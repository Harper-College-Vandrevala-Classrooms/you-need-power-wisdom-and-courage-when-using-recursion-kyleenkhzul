package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

   // Tests for Multiply
   @Test
   void testMultiply2And3() {
      assertEquals(18, calculator.multiply(2, 3)); 
   }

   @Test
   void testMultiply4and5() {
      assertEquals(150, calculator.multiply(4, 5)); 
   }

   @Test
   void testMultiply0and3() {
      assertEquals(0, calculator.multiply(0, 3)); 
   }

   // Tests for Divide
   @Test
   void testDivide3and2() {
      assertEquals(2.0, calculator.divide(3, 2)); 
   }

   @Test
   void testDivide5and4() {
      assertEquals(1.5, calculator.divide(5, 4)); // 5th triangular number is 15, 4th is 10, so 15 / 10 = 1.5
   }

   @Test
   void testDivideBy0Throw() {
      assertThrows(ArithmeticException.class, () -> calculator.divide(3, 0)); 
   }
}
