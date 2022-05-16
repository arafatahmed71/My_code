package Classes;

import java.io.*;

//package GeneralApplicant;
//import java.lang.*;
public class FresherscV{
	
    Freshers users[] = new Freshers [1000];
   
   
   int b=0;
   int c=0;

     public void insertGenaral( Freshers u )
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
	
	
	
	
	public void showAllGenaral()
	{
		for(Freshers u : users )
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
				System.out.println("                                      |                        EDUCATIONAL QUALIFICATION:                                                                   ");
                System.out.println("                                      |                        ===========J=S=c==============                                                               ");
				System.out.println("                                      |                        Gpa           :        "+u.getJsc()+"                                                        ");
				System.out.println("                                      |                        School   	    :        "+u.getJscschool()+"                                                 ");
                System.out.println("                                      |                        Board         :         "+u.getBoardj()+"                                                   ");
                System.out.println("                                      |                        ===========S=S=C================                                                             ");
				System.out.println("                                      |                        Gpa           :         "+u.getSsc()+"                                                    ");
                System.out.println("                                      |                        School        :         "+u.getSscschool()+"                                                   ");
                System.out.println("                                      |                        Board         :         "+u.getBoards()+"                                                        ");
                System.out.println("                                      |                        ===========H=S=C================                                                             ");
				System.out.println("                                      |                        Gpa           :         "+u.getHscgpa()+"                                              ");
				System.out.println("                                      |                        College       :         "+u.getHsccollege()+"                                                  ");
				System.out.println("                                      |                        Board         :         "+u.getBoardh()+"                                                       ");
                System.out.println("                                      |                        ==========B=S=C================                                                              ");
				System.out.println("                                      |                        Cgpa          :         "+u.getBscgpa()+"                                                    ");
				System.out.println("                                      |                        Name of Degree:         "+u.getBscvarsity()+"                                             ");
				System.out.println("                                      |                        ==============++++++++++++============                                                       ");
				

                System.out.println("                                      |                        =============Self Assesment===============                                                   ") ;
           
                System.out.println("                                      |                        1. Willing to learn and building u my career by accepting responsibilities                   ");
                System.out.println("                                      |                        2. Optimistic confident and friendly As a person                                             ");
                System.out.println("                                      |                        3. Energetic,Sincere,Hardworking and dutiful                                                 ");
                System.out.println("                                      |                        4. Good at communication                                                                     ");            
                              
                                                              

   


				System.out.println("                                      |                         =================Personal Information================                                       ");
				System.out.println("                                      |                         User Name             : "+ u.getName()+"                                                          ");
			    System.out.println("                                      |                         Father's name         : "+ u.getFather()+"                                                  ");
				System.out.println("                                      |                         Mother's name         : "+ u.getMother()+"                                                     ");
                System.out.println("                                      |                         Parmanent Address     : "+ u.getParmanent()+"                                                       ");
                System.out.println("                                      |                         Present Address       : "+ u.getPresent()+"                                                      ");
                System.out.println("                                      |                         Date Of Birth         : "+ u.getDateof()+"                                                   ");
                System.out.println("                                      |                         Religion              : "+ u.getReligion()+"                                                 ");
                System.out.println("                                      |                         Marital Status        : "+ u.getMaritals()+"                                               ");                   
                System.out.println("                                      |                         Gender                : "+ u.getGender()+"                                                     ");
                System.out.println("                                      |                         Mobile                : "+ u.getMob()+"                                                      ");
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


	public boolean insertFresser(Freshers e) {
		boolean flag = false;
		for (int i = 0; i < users.length; i++) {
			if (users[i] == null) {
				users[i] = e;
				flag = true;
				break;
			}
		}
		return flag;

	}
	public void showAllFreshers() {







     	///////////////////////txt method////////////////
		int count=0;
		for (int i = 0; i < users.length; i++) {
			if (users[i] != null) {
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("fresh applicant boy Name: " + users[i].getName());
				System.out.println("Fresher gender: " + users[i].getGender());
				System.out.println("Fresher ssc : " + users[i].getSsc());


				System.out.println("");
				count++;

			} else {
				
			}
//search



}}}