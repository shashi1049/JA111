package com.shashi;

public interface unitMovement {
	
	public String nextCourse(String current_course);
    public boolean nextCourse(int current_course_marks);
    public String nextCourse(int current_course_marks, String current_course);
    public boolean terminated(int current_course_marks, boolean async);

}
