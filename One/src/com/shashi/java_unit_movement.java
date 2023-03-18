package com.shashi;

public class java_unit_movement implements unitMovement{

	@Override
	public String nextCourse(String current_course) {
		if(current_course == "JA111") {
			return "SB101";
		}
		if(current_course == "SB101") {
			return "SB201";
		}
		if(current_course == "SB201") {
			return "RJ101";
		}
		if(current_course == "RJ101") {
			return "Placements";
		}
		return "Please provide valid";
	}

	@Override
	public boolean nextCourse(int current_course_marks) {
		if(current_course_marks >= 5) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public String nextCourse(int current_course_marks, String current_course) {
		if(current_course == "JA111") {
			if(current_course_marks >= 5)
				return "SB101";
			else 
				return "JA111";
		}
		else if(current_course == "SB101") {
			if(current_course_marks >= 5)
				return "SB201";
			else 
				return "SB101";
		}
		else if(current_course == "SB201") {
			if(current_course_marks >= 5)
				return "RJ101";
			else 
				return "SB201";
		}
		else {
			if(current_course_marks >= 5)
				return "Placements";
			else 
				return "RJ101";
		}
	}

	@Override
	public boolean terminated(int current_course_marks, boolean async) {
		if(async == false) {
			return false;
		}
		else {
			if(current_course_marks >= 5)
				return false;
			else
				return true;
		}
	}

}
