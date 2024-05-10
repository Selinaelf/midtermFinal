package chat2;

public class Course {
	String courseName;
    int sectionNumber;
    int totalSections;
    String day;
    String startTime;

    public Course(String courseName, int sectionNumber, int totalSections, String day, String startTime) {
        this.courseName = courseName;
        this.sectionNumber = sectionNumber;
        this.totalSections = totalSections;
        this.day = day;
        this.startTime = startTime;
    }
    public int getTotalSections() {
		return totalSections;
	}
	public void setTotalSections(int totalSections) {
		this.totalSections = totalSections;
	}
	public Course(String startTime) {
    	
    }

    public boolean isSingleSection() {
        return totalSections == 1;
    }
    
    
    
   
    
    
   
	
}
