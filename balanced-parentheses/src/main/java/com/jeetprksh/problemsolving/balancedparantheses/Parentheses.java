package com.jeetprksh.problemsolving.balancedparantheses;

import java.util.Optional;

public enum Parentheses {

  CURLY_OPEN('{', true),
  CURLY_CLOSE('}', false),
  SQUARE_OPEN('[', true),
  SQUARE_CLOSE(']', false),
  CIRCLE_OPEN('(', true),
  CIRCLE_CLOSE(')', false);

  private final char parentheses;
  private final boolean isOpen;

  Parentheses(char parentheses, boolean isOpen) {
    this.parentheses = parentheses;
    this.isOpen = isOpen;
  }

  public char getParentheses() {
    return parentheses;
  }

  public boolean isOpen() {
    return isOpen;
  }

  public static Optional<Parentheses> findMatch(char parentheses) {
    for (Parentheses para : Parentheses.values()) {
      if (para.getParentheses() == parentheses)
        return Optional.of(para);
    }
    return Optional.empty();
  }

  public static boolean isOpenClosePair(Parentheses open, Parentheses close) {
    if ((open.getParentheses() == '{' && close.getParentheses() == '}') ||
            open.getParentheses() == '(' && close.getParentheses() == ')' ||
            open.getParentheses() == '[' && close.getParentheses() == ']') {
      return true;
    } else {
      return false;
    }
  }
}
