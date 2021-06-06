package com.jeetprksh.problemsolving.balancedparantheses;

import com.jeetprksh.problemsolving.balancedparantheses.withstack.BalancedParenthesesStack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedParenthesesStackTest {

  @Test
  public void test() {
    BalancedParenthesesStack bp = new BalancedParenthesesStack("{}[]({}");
    assertFalse(bp.isBalanced());
  }

  @Test
  public void testStackPositive() {
    assertTrue(new BalancedParenthesesStack("{}").isBalanced());
  }

  @Test
  public void testStackNegative() {
    assertFalse(new BalancedParenthesesStack("{}[").isBalanced());
  }

}