package com.lib_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.lib.StudentAttendanceRecord2;

public class StudentAttendanceRecord2Test {

  private StudentAttendanceRecord2 solution;

  @BeforeEach
  public void setUp() {
    this.solution = new StudentAttendanceRecord2();
  }

  @Test
  public void testExampleI() {
    final int actual = this.solution.checkRecord(2);
    final int expected = 8;
    assertEquals(expected, actual);
  }

  @Test
  public void testExampleII() {
    final int actual = this.solution.checkRecord(1);
    final int expected = 3;
    assertEquals(expected, actual);
  }

  @Test
  public void testExampleIII() {
    final int actual = this.solution.checkRecord(10101);
    final int expected = 183236316;
    assertEquals(expected, actual);
  }

}
