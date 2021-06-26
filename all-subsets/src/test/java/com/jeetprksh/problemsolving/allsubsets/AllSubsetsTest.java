package com.jeetprksh.problemsolving.allsubsets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AllSubsetsTest {

  @Test
  public void findSubsetTest() {
    AllSubsets allSubsets = new AllSubsets();
    allSubsets.findSubsets(new int[]{1,2});
  }

}
