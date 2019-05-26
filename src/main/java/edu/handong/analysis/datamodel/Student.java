package edu.handong.analysis.datamodel;
import java.util.ArrayList;
import java.util.HashMap;

public class Student {
		
		private String studentId;
		private ArrayList<Course> coursesTaken;
		private HashMap<String,Integer>semestersByYearAndSemester;
		
	
	public String getStudentId() {
			return studentId;
	}
	
	public void setStudentId(String studentId) {
			this.studentId = studentId;
	}
		
	public Student(String studentId) {
			this.studentId = studentId;
			this.coursesTaken = new ArrayList<Course>();
			this.semestersByYearAndSemester = new HashMap<String, Integer>();
	}
	
	public void addCourse(Course newRecord) {
			coursesTaken.add(newRecord);
	}
	
	public HashMap<String, Integer> getSemestersByYearAndSemester(){
			semestersByYearAndSemester = new HashMap<String, Integer>();
			int count = 1;
			
			for(int i = 0; i < coursesTaken.size(); i++) {
				String yearAndSemester = String.valueOf(coursesTaken.get(i).getYearTaken())+"-"+ String.valueOf(coursesTaken.get(i).getSemesterCourseTaken());
				semestersByYearAndSemester.put(yearAndSemester, count++);
			}
			return semestersByYearAndSemester;
			
			
	}
	
	public int getNumCourseInNthSemester(int semester) {
			int count = 0;
			
			for(int i = 0; i < coursesTaken.size(); i++) {
				String yearAndSemester = String.valueOf(coursesTaken.get(i).getYearTaken())+"-"+ String.valueOf(coursesTaken.get(i).getSemesterCourseTaken());
				
				if(semester == getSemestersByYearAndSemester().get(yearAndSemester)) {
					count++;
				}
				return count;
	}
			return count;
	
}
	
}
