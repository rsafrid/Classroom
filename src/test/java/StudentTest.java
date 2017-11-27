import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Student;

public class StudentTest {
	Student s = new Student("Rafael", "Silva", 31, 'M');
	Student s2 = new Student("Rafael", "Silva", 31, 'M', 7.7,7.7,7.7);

	@Test
	public void testSetAndGetFirstName() {
		s.setFirstName("Rafael2");
		assertEquals(s.getFirstName().equals("Rafael2"), true);
		
	}
	@Test
	public void testSetAndGetLastName() {
		s.setLastName("Silva2");
		assertEquals(s.getLastName().equals("Silva2"),true);
	}
	
	@Test
	public void testSetAndGetGender() {
		s.setGender('M');
		assertEquals(s.getGender()=='M',true);
	}
	
	
	@Test
	public void testSetAndGetAge() {
		s.setAge(25);
		assertEquals(s.getAge()== 25,true);
	}
	
	@Test
	public void testSetAndGetFirstGrade() {
		s.setFirstGrade(7.7);
		assertEquals(s.getFirstGrade()==7.7,true);
	}

	@Test
	public void testSetAndGetSecondGrade() {
		s.setSecondGrade(7.7);
		assertEquals(s.getSecondGrade()==7.7,true);
	}
	
	@Test
	public void testSetAndGetThirdGrade() {
		s.setThirdGrade(7.7);
		assertEquals(s.getThirdGrade()==7.7,true);
	}

	@Test
	public void testSetAndGetAverage() {
		s.setAverageGrade(5.0);
		s.setFirstGrade(5.0);
		s.setSecondGrade(5.0);
		s.setThirdGrade(5.0);
		assertEquals(s.getAverageGrade()==5.0,true);
	}
	
	@Test
	public void testCalculateAverage() {
		s.setSecondGrade(5.0);
		s.setThirdGrade(5.0);
		double result = s.calculateAverage(5.0);
		assertEquals(s.getAverageGrade()==result,true);
		// assertEquals((s.getAverageGrade()==result) && (result == 5.0),true);
	}

	@Test
	public void testCalculateAverageWithNoParam() {
		s.setFirstGrade(5.0);
		s.setSecondGrade(5.0);
		s.setThirdGrade(5.0);
		s.calculateAverage();
		assertEquals((s.getAverageGrade()==5.0), true);
		// assertEquals((s.getAverageGrade()==result) && (result == 5.0),true);
	}
	
	@Test
	public void testCalculateAverageWithAllParam() {
		s.calculateAverage(5.0,5.0,5.0);
		assertEquals(s.getAverageGrade()==5.0, true);
	}
		

	@Test
	public void testHasClearedTheCourse() {
		s.setAverageGrade(6.0);
		assertEquals(s.hasClearedTheCourse(), true);
		
		s.setAverageGrade(5.0);
		assertEquals(s.hasClearedTheCourse(), false);
	}
	
	@Test
	public void testToString() {
		s.setFirstGrade(5.0);
		s.setSecondGrade(5.0);
		s.setThirdGrade(5.0);
		System.out.println(s.toString());
	
		String expected = "The student has not cleared the course";
		assertEquals(s.toString().contains(expected),true);
		
		s.setFirstGrade(7.0);
		s.setSecondGrade(7.0);
		s.setThirdGrade(7.0);
		System.out.println(s.toString());
	
		String expected2 = "The student has cleared the course";
		assertEquals(s.toString().contains(expected2),true);
	}
}

