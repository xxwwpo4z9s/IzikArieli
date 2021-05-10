package MyTests;

import junit.framework.TestCase;
import Entities.Course;
import Model.CourseModel;

public class CourseModelTest extends TestCase {
	
	
	 public CourseModel cm = new CourseModel();

	 
	 
	 @Override
     public void setUp()
	    { 
		 cm = new CourseModel();
	       
	    }

   
	 public void testgetCourseArr() {
        String[] car = cm.getCourseArr();
        for(int i=0;i<40;i++){
       
        	 if(car[0].isEmpty()) assertTrue(false);
        }
      
    }

    
    
    
	 public void testgetCourseByname() {
        
        Course temp;
        temp = cm.getCourseByName("�����");
        if(!(temp.getName().equals("�����")))
            assertTrue(false);

        temp = cm.getCourseByName("������������� 2");
        if(!(temp.getName().equals("������������� 2")))
            assertTrue(false);

        temp = cm.getCourseByName("������ �");
        if(!(temp.getName().equals("������ �")))
            assertTrue(false);

        temp = cm.getCourseByName("��������");
        if(!(temp.getName().equals("��������")))
            assertTrue(false);

        temp = cm.getCourseByName("������ �");
        if(!(temp.getName().equals("������ �")))
            assertTrue(false);

        temp = cm.getCourseByName("���� �� ����");
        if(temp != null)
            assertTrue(false);
        temp = cm.getCourseByName("�����");
        if(temp != null)
            assertTrue(false);

    }
    
    
  
}


