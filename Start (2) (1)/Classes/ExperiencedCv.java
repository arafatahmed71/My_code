package Classes;

//package GeneralApplicant;
//import java.lang.*;
public class ExperiencedCv{
	
   private ExperiencedApplicant users[] = new  ExperiencedApplicant[1000];
   
   
   int b=0;
   int c=0;

     public void insertExperience( ExperiencedApplicant u )
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
		for(ExperiencedApplicant u : users )
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
				System.out.println("                                     +---------------------------------------------------------------------------------------------------------------------+");
				System.out.println("                                     |                                                                                                                     |");
				System.out.println("                                     |                                                                                                                     |");
                System.out.println("                                     |                                ------>>>>>>>>>>>>>>>Curriculum Vitae<<<<<<<<<<<<<<<<---------                       |");	
				System.out.println("                                     |                       _____________________________________________________________________________                 |");
				System.out.println("                                     |                                                                                                                     |");
				System.out.println("                                     |                        CAREER OBJECTIVE:                                                                            |");
				System.out.println("                                     |                        Intend to work in challenging & competive environment where strong since of responsibility   |");
				System.out.println("                                     |                        and commitment  is require,where dignity of work provides job satisfaction and the place     |");
				System.out.println("                                     |                        of work provides potential avenues for learning growing achiving                             |");
				System.out.println("                                     |                        Experience        : "+u.getExperience()+"                                                    |");
				System.out.println("                                     |                        Skill             : "+u.getSkill()+"                                                         |");
				System.out.println("                                     |                                                                                                                     |");
				System.out.println("                                     |                        EDUCATIONAL QUALIFICATION:                                                                   |");
                
                System.out.println("                                     |                        ===========S=S=C================                                                             |");
				System.out.println("                                     |                        Gpa               : "+u.getSsc1()+"                                                          |");
                
                System.out.println("                                     |                        Board             : "+u.getBoards1()+"                                                       |");
                System.out.println("                                     |                        ===========H=S=C================                                                             |");
				System.out.println("                                     |                        Gpa               : "+u.getHscgpa1()+"                                                       |");
				
				System.out.println("                                     |                        Board             : "+u.getBoardh1()+"                                                       |");
                System.out.println("                                     |                        ==========B=S=C================                                                              |");
				System.out.println("                                     |                        Cgpa              : "+u.getBscgpa1()+"                                                       |");
				System.out.println("                                     |                        Name of Degree    : "+u.getBscvarsity1()+"                                                   |");
				System.out.println("                                     |                        ==============++++++++++++============                                                       |");
				

                System.out.println("                                     |                        =============Self Assesment===============                                                   |") ;
           
                System.out.println("                                     |                        1. Willing to learn and building u my career by accepting responsibilities                   |");
                System.out.println("                                     |                        2. Optimistic confident and friendly As a person                                             |");
                System.out.println("                                     |                        3. Energetic,Sincere,Hardworking and dutiful                                                 |");
                System.out.println("                                     |                        4. Good at communication                                                                     |");            
                              
                                                              

   


				System.out.println("                                     |                        =================Personal Information================                                        |");
				System.out.println("                                     |                        User Name        : "+ u.getName1()+"                                                         |");
			    System.out.println("                                     |                        Father's name    : "+ u.getFather1()+"                                                       |");
				System.out.println("                                     |                        Mother's name    : "+ u.getMother1()+"                                                       |");
                System.out.println("                                     |                        Parmanent Address: "+ u.getParmanent1()+"                                                    |");
                System.out.println("                                     |                        Present Address  : "+ u.getPresent1()+"                                                      |");
                System.out.println("                                     |                        Date Of Birth    : "+ u.getDateof1()+"                                                       |");
                System.out.println("                                     |                        Religion         : "+ u.getReligion1()+"                                                     |");
                System.out.println("                                     |                        Marital Status   : "+ u.getMaritals1()+"                                                     |");                   
                System.out.println("                                     |                        Gender           : "+ u.getGender1()+"                                                       |");
               
				System.out.println("                                     |                                                                                                                     |");
		        System.out.println("                                     +---------------------------------------------------------------------------------------------------------------------+");
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