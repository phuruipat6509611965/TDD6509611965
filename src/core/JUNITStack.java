package core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUNITStack {

	@Test
	void testCreateNewStack() {
		Stack<Integer> st = new Stack<>(5);
		
		assertEquals(0, st.getSize());
		assertEquals(true, st.isEmpty());

	}
	
	@Test
	void testPushElemToStack() throws Exception {
		Stack<Integer> st = new Stack<>(5);
		st.push(1);
		
		assertEquals(1, st.getSize());
	}
	
	@Test
	void testLastInFristOut() throws Exception {
		Stack<Integer> st = new Stack<>(5);
		st.push(1);
		st.push(2);
		st.push(3);
		
		assertEquals(3, st.getTop());
		st.pop();
		assertEquals(2, st.getTop());
		st.pop();
		assertEquals(1, st.getTop());	
	}
	
	@Test
	void testPushElementToLimitedSizeStack() throws Exception {
		Stack<Integer> st = new Stack<>(3);
		st.push(1);
		st.push(2);
		st.push(3);
		

		assertThrows(Exception.class,
	            ()->{
	            st.push(4);
	            });
	}
}
