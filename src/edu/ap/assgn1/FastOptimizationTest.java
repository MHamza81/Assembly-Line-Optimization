package edu.ap.assgn1;

import static org.junit.Assert.*;

import org.junit.Test;

public class FastOptimizationTest {

	@Test
	public void testMinimized_path() {
		int[] a1={7,9,3,4,8,4,5},a2={8,5,6,4,5,7,9},t1={2,3,1,3,4,3},t2={2,1,2,2,1,1};
		int e1=2,e2=4,x1=3,x2=3;
		FastOptimization f = new FastOptimization();
		int time = f.minimized_path(a1, a2, t1, t2, e1, e2, x1, x2);
		//assertTrue(time == 38);
	
	}

}
