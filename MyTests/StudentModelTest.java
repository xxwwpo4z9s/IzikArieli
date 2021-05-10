package MyTests;

import Entities.Student;
import Model.StudentModel;
import junit.framework.TestCase;

public class StudentModelTest extends TestCase {

	 public StudentModel stu ;
	
	 @Override
     public void setUp()
	    { 
		 stu = new StudentModel();
	       
	    }
	
   
     public void testreturnStudent() {
        Student st;
        st = stu.returnStudent("����");
        if(!(st.getFirstName().equals("����")) )
            assertTrue(false);
        if(!(st.getLastName().equals("�����")) )
            assertTrue(false);
        st = stu.returnStudent("���");
        if(!(st.getFirstName().equals("���")) )
            assertTrue(false);
        if(!(st.getLastName().equals("������")) )
            assertTrue(false);
        st = stu.returnStudent("�����");
        if(!(st.getFirstName().equals("�����")) )
            assertTrue(false);
        if(!(st.getLastName().equals("�����")) )
            assertTrue(false);
    }

   
   public void getStudent() {
        Student student;
        for (int i = 0; i < 3; i++) {
           student =  stu.getStudent(i);
           if((student.getLastName().isEmpty()))
               assertTrue(false);
            if((student.getFirstName().isEmpty()))
                assertTrue(false);
            if((student.getDegree().isEmpty()))
                assertTrue(false);
        }
    }

   
  public void testgetStuNames() {
      
        String[][] str = stu.getStuNames();
        for(int i=0;i<3;i++){
            if( str[i][0].isEmpty())
                assertTrue(false);
            if( str[i][1].isEmpty())
                assertTrue(false);
        }

    }

    
 public void getLastNameByName() {
        String lastname;
        lastname = stu.getLastNameByName("����");
        if (!(lastname.equals("�����")))
            assertTrue(false);
        lastname = stu.getLastNameByName("���");
        if (!(lastname.equals("������")))
            assertTrue(false);
        lastname = stu.getLastNameByName("�����");
        if (!(lastname.equals("�����")))
            assertTrue(false);


    }
	
	
	
}
