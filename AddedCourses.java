package chat2;
import java.util.*;
public class AddedCourses {

	    private ArrayList<String> addedCourseNames;
	 
	    public AddedCourses() {
	        addedCourseNames = new ArrayList<>();
	    }
	 
	    public boolean contains(String courseName) {
	        return addedCourseNames.contains(courseName);
	    }
	 
	    public void addCourseName(String courseName) {
	        addedCourseNames.add(courseName);
	    }
	    public void removeCourseName(String courseName) {
	        addedCourseNames.remove(courseName);
	    }
	

}
