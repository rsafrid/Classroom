import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import otherclasses.Classroom;
import otherclasses.Student;

public class ClassroomTest {
	ArrayList<Student> studentList = new ArrayList<Student>();
	Classroom c = new Classroom("Kvalit17", "Fall 17", studentList);
	

	@Test
	public void testGetAndSetClassroomName() {
		c.setClassroomName("Kvalit17");
		assertEquals(c.getClassroomName(),"Kvalit17");
	}

	@Test
	public void testGetAndSetClassroomTerm() {
		c.setClassroomTerm("Summer 17");
		assertEquals(c.getClassroomTerm(),"Summer 17");
	}
	
	@Test
	public void testGetAndSetStudent() {
		ArrayList<Student> temp = new ArrayList<Student>();
		Student s = new Student("Susanne","Fridh", 51, 'F' );
		temp.add(s);
		
		c.setStudents(temp);
		assertEquals(c.getStudents(), temp);
		
	}
	
	@Test
	public void testGetAndSetAddStudent() {
		ArrayList<Student> temp = new ArrayList<Student>();
		Student s = new Student("Senna","Kjellén", 12, 'F' );
		temp.add(s);
		
		c.addANewStudent(s);
		System.out.println(c.getStudents());
		System.out.println(temp);
		assertEquals(c.getStudents(), temp);
		
	}
	
	@Test
	public void testPrintFullRElatory() {
		Student s = new Student("Senna","Kjellén", 12, 'F' );
		c.addANewStudent(s);
		c.printFullRelatory();
	}
	
	@Test
	public void testremoveAStudent() {
		Student s = new Student("Senna","Kjellén", 12, 'F' );
		c.addANewStudent(s);
		c.removeAStudent("non-existing student");
		c.removeAStudent("Senna");
	}
}
