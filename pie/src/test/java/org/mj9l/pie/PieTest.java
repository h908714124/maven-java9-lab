package org.mj9l.pie;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.mj9l.cherry.Cherry;

public class PieTest {

  @Test
  public void testModule() {
    assertTrue(Cherry.class.getModule().isNamed());
    assertEquals("org.mj9l.cherry", Cherry.class.getModule().getName());
  }
}
