package Classes;

//package GeneralApplicant;
//import java.lang.*;
public class HealthcarecV{
	
   private Healthcare users[] = new  Healthcare[1000];
   
   
   int b=0;
   int c=0;

     public void insertExperience( Healthcare u )
	{
		int a = 0;
	
		for(int i=0; i<users.length; i++)
		{
			if( users[i] == null)
			{
				users[i] = u;
				a = 1;
				
				break;
			}
		}
		if(a == 1)
		{
			System.out.println("user Inserted");
			c++;
		}
		if(a==0)
		{
			System.out.println("Can Not Insert");
		}
	}
	
	
	
	
	public void showAllExperience()
	{
		for(Healthcare u : users )
		{
			if(u==null)
			{
				System.out.println("                        =========================================================");
				System.out.println("                        ||||||||||||||||No CV Created|||||||||||||||||||||||");
				System.out.println("                        =========================================================");
				b=0;
				break;
			}
			else if(u != null)
			{
				System.out.println("                                      +---------------------------------------------------------------------------------------------------------------------+");
				System.out.println("                                      |                                                                                                                     ");
				System.out.println("                                      |                                                                                                                     ");
                System.out.println("                                      |                                ------>>>>>>>>>>>>>>>Curriculum Vitae<<<<<<<<<<<<<<<<---------                       ");	
				System.out.println("                                      |                       _____________________________________________________________________________                 ");
				System.out.println("                                      |                                                                                                                     ");
				System.out.println("                                      |                        CAREER OBJECTIVE:                                                                            ");
				System.out.println("                                      |                        Intend to work in challenging & competive environment where strong since of responsibility   ");
				System.out.println("                                      |                        and commitment  is require,where dignity of work provides job satisfaction and the place     ");
				System.out.println("                                      |                        of work provides potential avenues for learning growing achiving                             ");
				System.out.println("                                      |                                                                                                                     ");
				System.out.println("                                      |                                                                                                                     ");
				System.out.println("                                      |                        Experience        :"+u.getExperience4());
				System.out.println("                                      |                        Skill             :"+u.getSkill4());
				System.out.println("                                      |                                                                                                                     ");
				System.out.println("                                      |                                                                                                                     ");
				System.out.println("                                      |                        EDUCATIONAL QUALIFICATION:                                                                   ");
                System.out.println("                                      |                                                                                                                     ");
                System.out.println("                                      |                        ===========S=S=C================                                                             ");
				System.out.println("                                      |                        Gpa           :   "+u.getSsc4());
                
                System.out.println("                                      |                        Board         :   "+u.getBoards4());
                System.out.println("                                      |                        ===========H=S=C================                                                             ");
				System.out.println("                                      |                        Gpa           :   "+u.getHscgpa4());
				
				System.out.println("                                      |                        Board         :   "+u.getBoardh4());
                System.out.println("                                      |                        ==========B=S=C================                                                              ");
				System.out.println("                                      |                        Cgpa          :   "+u.getBscgpa4());
				System.out.println("                                      |                        Name of Degree:   "+u.getBscvarsity4());
				System.out.println("                                      |                        ==============++++++++++++============                                                       ");
				System.out.println("                                      |                                                                                                                     ");
                System.out.println("                                      |                                                                                                                     ");
                System.out.println("                                      |                        =============Self Assesment===============                                                   ") ;
           
                System.out.println("                                      |                        1. Willing to learn and building u my career by accepting responsibilities                   ");
                System.out.println("                                      |                        2. Optimistic confident and friendly As a person                                             ");
                System.out.println("                                      |                        3. Energetic,Sincere,Hardworking and dutiful                                                 ");
                System.out.println("                                      |                        4. Good at communication                                                                     ");            
                              
                                                              

   
                System.out.println("                                      |                                                                                                                     ");
                System.out.println("                                      |                                                                                                                     ");
				System.out.println("                                      |                         =================Personal Information================                                       ");
				System.out.println("                                      |                         User Name             : "+ u.getName4());
			    System.out.println("                                      |                         Father's name         : "+ u.getFather4());
				System.out.println("                                      |                         Mother's name         : "+ u.getMother4());
                System.out.println("                                      |                         Parmanent Address     : "+ u.getParmanent4());
                System.out.println("                                      |                         Present Address       : "+ u.getPresent4());
                System.out.println("                                      |                         Date Of Birth         : "+ u.getDateof4());
                System.out.println("                                      |                         Religion              : "+ u.getReligion4());
                System.out.println("                                      |                         Marital Status        : "+ u.getMaritals4());                   
                System.out.println("                                      |                         Gender                : "+ u.getGender4());
               
				System.out.println("                                      |                                                                                                                     ");
		        System.out.println("                                      +---------------------------------------------------------------------------------------------------------------------+");
				b++;
			}
			if(b==c)
			{
				break;
			}
			
		}
		b=0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}