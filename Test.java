package chat2;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst = new BinarySearchTree();
        Course[] courses = {
        		//default values for creating every node 
        		new Course("", 0, 0, "","8.30"),
 	            new Course("", 0, 0, "","9.30"),
 	            new Course("", 0, 0, "","10.30"),
 	            new Course("", 0, 0, "","11.30"),
 	            new Course("", 0, 0, "","12.30"),
 	            new Course("", 0, 0, "","13.30"),
 	            new Course("", 0, 0, "","14.30"),
 	            new Course("", 0, 0, "","15.30"),
 	            new Course("", 0, 0, "","16.30"),
 	            new Course("", 0, 0, "","17.30"),
 	            
 	            	            
 	            
	         	new Course("ese", 1, 1, "Monday", "8.30"),
	            new Course("mat", 1, 2, "Monday", "8.30"),
	            new Course("eee", 1, 1, "Tuesday", "8.30"),
	            new Course("ese232", 1, 1, "Tuesday", "8.30"),
	            new Course("mat121", 1, 1, "Wednesday", "8.30"),
	            new Course("eee231", 1, 1, "Tuesday", "8.30"),
	            new Course("cmp", 1, 1, "Wednesday", "14.30"),
	            new Course("phy", 1, 1, "Tuesday", "14.30"),
	            new Course("che", 1, 1, "Wednesday", "10.30"),
	            new Course("sen", 1, 2, "Friday", "10.30"),
	            new Course("mch", 1, 1, "Friday", "10.30"),
	            new Course("mch", 1, 1, "Friday", "10.30"),
	            new Course("oop", 1, 1, "Monday", "10.30"),
	        };

        for (Course course : courses) {
            bst.addCourse(course);
        }

        bst.printInOrder();
        
    }
	

}
