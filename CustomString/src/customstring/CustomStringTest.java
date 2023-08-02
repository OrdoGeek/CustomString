package customstring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomStringTest {

	//declare custom string for testing
	CustomString myCustomString;
	
	@BeforeEach
	void setUp() throws Exception {
		//initialize custom string for testing
		this.myCustomString = new CustomString();
	}

	@Test
	void testGetString() {
		//string should be null to start, before setting it
		assertNull(this.myCustomString.getString());
				
		this.myCustomString.setString("hello");
		assertEquals("hello", this.myCustomString.getString());
		
		// TODO write at least 3 additional test cases		
		this.myCustomString.setString("Luis Miguel");
		assertEquals("Luis Miguel", this.myCustomString.getString());
		
		this.myCustomString.setString("Buenas");
		assertEquals("Buenas", this.myCustomString.getString());
		
		this.myCustomString.setString("Programming in Java");
		assertEquals("Programming in Java", this.myCustomString.getString());
		
	}

	@Test
	void testSetString() {
		//string should be null to start, before setting it
		assertNull(this.myCustomString.getString());
		
		this.myCustomString.setString("Good-bye!");
		assertEquals("Good-bye!", this.myCustomString.getString());
		
		// TODO write at least 3 additional test cases
		this.myCustomString.setString("God is Good!");
		assertEquals("God is Good!", this.myCustomString.getString());
		
		this.myCustomString.setString("El TEMACH");
		assertEquals("El TEMACH", this.myCustomString.getString());
		
		this.myCustomString.setString("Colombia is amazing");
		assertEquals("Colombia is amazing", this.myCustomString.getString());
	}

	@Test
	void testRemove() {
		assertEquals("", this.myCustomString.remove(""));
		
		this.myCustomString.setString(null);
		assertEquals("", this.myCustomString.remove(""));
		
		this.myCustomString.setString("my lucky numbers are 6, 8, and 19.");
		assertEquals("my lucky numbes e 6, 8, nd 19.", this.myCustomString.remove("ra6"));
		
		// TODO write at least 3 additional test cases
		this.myCustomString.setString("Arturo98 y 09 jajaja");
		assertEquals("tuo98 y 09 jjj", this.myCustomString.remove("ra8"));
		
		this.myCustomString.setString("I do not have lucky numbers");
		assertEquals("I do no have lcky nmbers", this.myCustomString.remove("ugt2"));
		
		this.myCustomString.setString("Meine mutte und mein bruder");
		assertEquals("eine tte nd ein de", this.myCustomString.remove("brumo0"));
	}

	@Test
	void testReverse() {
		assertEquals("", this.myCustomString.reverse(""));
		
		this.myCustomString.setString(null);
		assertEquals("", this.myCustomString.reverse(""));
		
		this.myCustomString.setString("abc, XYZ; 123.");
		assertEquals("aBC, xyz; 123.", this.myCustomString.reverse("bcdxyz@3210."));
		
		// TODO write at least 3 additional test cases
		this.myCustomString.setString("abc, XYZ; 123.");
		assertEquals("aBc, xYz; 123.", this.myCustomString.reverse("bdxz@6."));
		
		assertEquals("AbC, XyZ; 123.", this.myCustomString.reverse("yac"));
		
		assertEquals("aBC, XYZ; 123.", this.myCustomString.reverse("bcd"));
	}

	@Test
	void testFilterLetters() {
		assertEquals("", this.myCustomString.filterLetters('E', false));
		
		this.myCustomString.setString(null);
		assertEquals("", this.myCustomString.filterLetters('E', false));
		
		// TODO write at least 3 additional test cases
		this.myCustomString.setString("HelloLoKA");
		assertEquals("", this.myCustomString.filterLetters('9', true));
		
		assertEquals("HlloLoK", this.myCustomString.filterLetters('f', false));
		
		assertEquals("HelloLoKA", this.myCustomString.filterLetters('p', true));
		
	}

}
