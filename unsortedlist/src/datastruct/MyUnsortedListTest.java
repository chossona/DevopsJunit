package datastruct;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyUnsortedListTest {

	@Test
	void testConstructeur() {
		MyUnsortedList<Integer> myList = new MyUnsortedList<Integer>();
		
		assertEquals(myList.size(),0);
		assertTrue(myList.isEmpty());
	}
	
	@Test
	void testAppendPopLast() {
		MyUnsortedList<Integer> myList = new MyUnsortedList<Integer>();
		myList.append(2);
		myList.append(1);
		
		assertFalse(myList.isEmpty());
		assertEquals(myList.popLast(),1); 
		assertEquals(myList.size(),1);
	}
	
	@Test
	void testPrependPop() {
		MyUnsortedList<Integer> myList = new MyUnsortedList<Integer>();
		myList.append(2);
		myList.append(1);
		myList.prepend(5);
		
		assertFalse(myList.isEmpty());
		assertEquals(myList.pop(),5);
		assertEquals(2,myList.size()); 
	}
	
	@Test
	void testInsertRemove() {
		MyUnsortedList<Integer> myList = new MyUnsortedList<Integer>();
		myList.append(1);
		myList.append(2);
		myList.append(3);
		myList.insert(5, 3);
		
		assertFalse(myList.isEmpty());
		assertEquals(myList.remove(3),5); 
		assertEquals(3,myList.size());
	}
	
	@Test
	void testException(){
		MyUnsortedList<Integer> myList = new MyUnsortedList<Integer>();
		myList.append(1);
		
		assertFalse(myList.isEmpty());
		assertThrows(IndexOutOfBoundsException.class , () -> {
			myList.remove(3);
		  });
		assertEquals(1,myList.size());
	}
	
	@Test
	void testExceptionEmpty(){
		MyUnsortedList<Integer> myList = new MyUnsortedList<Integer>();
		
		assertTrue(myList.isEmpty());
		assertThrows(EmptyListException.class , () -> {
			myList.pop();
		  });
		assertEquals(0,myList.size());
	}
	
	@Test
	void testExceptionEmpty2(){
		MyUnsortedList<Integer> myList = new MyUnsortedList<Integer>();
		
		assertTrue(myList.isEmpty());
		assertThrows(EmptyListException.class , () -> {
			myList.popLast();
		  });
		assertEquals(0,myList.size());
	}

}
