package day7junit;
import static org.junit.Assert.*;

import org.junit.Test;
public class Junit010_basics {
  @Test
public void testBasic()
{
	int val1=10;//key
	int val2=10;//result
	assertEquals(val1,val2);
}

}
