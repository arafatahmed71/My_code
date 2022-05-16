
import java.io.*;
import java.util.*;
import Classes.*;
import fileio.*;

public class Start
{
	private static Scanner g;



	public static boolean FreshApplicantLogIn() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		boolean foundcs=false;
        System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.print("\t\t\t\t\t\t\t\t\tApplicant contact number : ");
		String customerContactNumber = sc.next();

		System.out.print("\t\t\t\t\t\t\t\t\tApplicant Password : ");
		String customerPassword = sc.next();
		String filepath="fileio/Applicant.txt";


		File file= new File(filepath);
		file.createNewFile();
		try
		{
			Scanner inputBuffer=new Scanner(file);
			while (inputBuffer.hasNext())
			{
				String line=inputBuffer.nextLine();
				String[] valuescs =line.split(",");
				if(valuescs[0].equals(customerContactNumber))
				{
					if(valuescs[6].equals(customerPassword))
					{
						foundcs=true;
					}
				}
			}
			inputBuffer.close();


		}
		catch (FileNotFoundException fe)
		{
			fe.printStackTrace();
		}
		return foundcs;

	}
	//////////////////////////////txt logIn method////////////////////////////////////////
	public static void main(String [] args) throws IOException
	{


		double x;
		ITcV C = new ITcV  ();

		String User_id;
		String admin = "admin";
		String Applicant_user_id[] = new String[100];
		Applicant_user_id[0] = "Applicant";

		FileReadWrite frsr = new FileReadWrite();
		FileReadWrite frex = new FileReadWrite();
		FresherscV fcv=new FresherscV();

		String password;
		String pass[] = new String[200];
		pass[0] = "abc";
		pass[2] = "admin";
		boolean q = true;
		boolean a = true;
		boolean b = true;
		boolean c = true;
		boolean d = true;
		boolean adm=false;
		boolean Applicantlogin=true;
		int option;

		System.out.println();
		System.out.println();
		System.out.println("                                                         \t\t\t+------------------------------+  ");
		System.out.println("                                                         \t\t\t|                              |  ");
		System.out.println("                                                         \t\t\t|         WELCOME!             |  ");
		System.out.println("                                                         \t\t\t|       -------------          |  ");
		System.out.println("                                                         \t\t\t|     JOB WINING CV MAKER      |  ");
		System.out.println("                                                         \t\t\t|                              |  ");
		System.out.println("                                                         \t\t\t|                              |  ");
		System.out.println("                                                         \t\t\t+------------------------------+  ");
		System.out.println();
		System.out.println();
		 q = true;
		 a = true;
		 b = true;
		 c = true;
		 d = true;
		 adm=true;
		Applicantlogin=true;
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("                                                           \t\t+=====================================+");
		System.out.println("                                                           \t\t| ********CHOOSE YOUR OPTION*******   |");
		System.out.println("                                                           \t\t|            1.login                  |");
		System.out.println("                                                           \t\t|            2.Exit                   |");
		System.out.println("                                                           \t\t+=====================================+");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();




		Scanner sc = new Scanner(System.in);

		while(q)
		{

			System.out.println();
			System.out.println();
			System.out.println("                                                         \t\t\t+============================+  ");
			System.out.println("                                                         \t\t\t|     Select your option     |  ");
			System.out.println("                                                         \t\t\t+============================+  ");
			System.out.println();
			System.out.println();
			option = sc.nextInt();
			cls();

			switch(option)
			{
				case 1:
					while(q)
					{
						a=true;


						System.out.println();
						System.out.println();
						System.out.println();
						System.out.println();
						System.out.println();
						System.out.println();
						System.out.println();
						System.out.println("                                                      \t\t\t+===============================+  ");
						System.out.println("                                                      \t\t\t|       Choose Your Option      |  ");
						System.out.println("                                                      \t\t\t|                               |  ");
						System.out.println("                                                      \t\t\t|       1.Applicant SignUp      |  ");
						System.out.println("                                                      \t\t\t|       2.Applicant LogIn       |  ");
						System.out.println("                                                      \t\t\t|       3.Admin                 |  ");
						System.out.println("                                                      \t\t\t+===============================+  ");
						adm=true;
						Applicantlogin=true;
						System.out.println();
						Scanner sc1 = new Scanner(System.in);

						System.out.println();
						System.out.print(" Enter Your Choice: ");
						option = sc1.nextInt();
						cls();
						switch(option)
			
						{

							case 2:

								while(Applicantlogin)
								{

									boolean isApplicantLogIn = FreshApplicantLogIn();
									if (isApplicantLogIn)
									{


										System.out.println("");
										System.out.println("                                                      \t\t\t+============================+");
										System.out.println("                                                      \t\t\t|          CONGRATS!         |");
										System.out.println("                                                      \t\t\t|     SUCCESSFULLY LOG IN    |");
										System.out.println("                                                      \t\t\t|                            |");
										System.out.println("                                                      \t\t\t| Welcome to Applicant Panel |");
										System.out.println("                                                      \t\t\t+============================+");
										System.out.println("");


										Scanner sc2 = new Scanner(System.in);
										//while(q)
										//{
										System.out.println();
										a = true;
										//System.out.println("Enter Your Choice");
										//option = sc2.nextInt();
									//	switch (option)
										//{
											//case 1:

											//	while (a)
												//{
												//	System.out.print("Prese 1 to see your available option ");
												//	System.out.println();


													//Scanner sc3 = new Scanner(System.in);
													//System.out.println(" Select your option");
													//option = sc3.nextInt();

													b = true;
													//switch (option)
													//{
														//case 1:
															b = true;
															while (b)
															{

																System.out.println();
																System.out.println("                                                     \t\t\t +=================+");
																q=true;
																System.out.println("                                                      \t\t\t|  Choose one...  |");
																System.out.println("                                                      \t\t\t|   1. General    |");
																System.out.println("                                                      \t\t\t|   2. Premium    |");
																System.out.println("                                                      \t\t\t|   3. LogOut     |");
																System.out.println("                                                      \t\t\t+=================+");
																System.out.println("");

																Scanner sc4 = new Scanner(System.in);

																System.out.print("Enter Your Choice: ");
																option = sc4.nextInt();
																switch (option)
																{
																	case 1:
																		while (a)
																		{

                                                                           
																			System.out.println();
																			System.out.println();
																			System.out.println();
																			System.out.println();
																			System.out.println();
																			System.out.println();
																			System.out.println();
																			System.out.println();
																			System.out.println("                                                      \t\t\t*********YOU HAVE CHOSEN THE GENERAL APPLICANT OPTION**********");
																			System.out.println("                                                      \t\t\t___________________________________________________________________________");
																			System.out.println("");
																			System.out.println("                                                      \t\t\t+=========================================+");
																			System.out.println("                                                      \t\t\t|*****This service is free for you******  |");
																			System.out.println("                                                      \t\t\t|      *****Thanks for choose us*****     |");
																			System.out.println("                                                      \t\t\t|                                         |");
																			System.out.println("                                                      \t\t\t|          1. Fresher                     |");
																			System.out.println("                                                      \t\t\t|          2. Experienced                 |");
																			System.out.println("                                                      \t\t\t|          3. Go Back                     |");
																			System.out.println("                                                      \t\t\t+=========================================+");
																			System.out.println("");
																			System.out.println("");
																			


																			Scanner sc5 = new Scanner(System.in);

																			System.out.print("\t\t\tEnter Your Choice: ");
																			//sc5.nextInt();
																			option = sc5.nextInt();
																			switch (option)
																			{
																				case 1:
																				    
																					System.out.println();
																					System.out.println();
																					System.out.println();
																					
																					System.out.println("\t\t\tEnter your data to get a professional CV");
																					String name;
																					String fatherName;
																					String mothersName;
																					String parmanentADD;
																					String presentADD;
																					String dob;
																					String religion;
																					String maritals;
																					String gender;
																					String mob;
																					String jsc;
																					String jscschool;
																					String board;
																					String ssc;
																					String sscschool;
																					String board1;
																					String hsc;
																					String hsccollege;
																					String board2;
																					String bsc;
																					String bscvarsity;

																					Scanner input1 = new Scanner(System.in);
																					System.out.print("\t\t\tEnter your Name: ");
																					name = input1.nextLine();

																					System.out.print("\t\t\tEnter your Father Name: ");
																					fatherName = input1.nextLine();

																					System.out.print("\t\t\tEnter Your Mother Name: ");
																					mothersName = input1.nextLine();

																					System.out.print("\t\t\tEnter your Parmanent Address: ");
																					parmanentADD = input1.nextLine();

																					System.out.print("\t\t\tEnter your  Present Address: ");
																					presentADD = input1.nextLine();

																					System.out.print("\t\t\tEnter YourDate Of Birth: ");
																					dob = input1.nextLine();

																					System.out.print("\t\t\tEnter your Religion: ");
																					religion = input1.nextLine();

																					System.out.print("\t\t\tMaritial Status: ");
																					maritals = input1.nextLine();

																					System.out.print("\t\t\tGender: ");
																					gender = input1.nextLine();

																					System.out.print("\t\t\tMobile: ");
																					mob = input1.nextLine();

																					System.out.print("\t\t\tEDUCATIONAL QUALIFICATION: \n");
																					//jsc
																					System.out.print("\t\t\tJSC(gpa) : ");
																					jsc = input1.nextLine();
																					System.out.print("\t\t\tSchool[jsc]: ");
																					jscschool = input1.nextLine();
																					System.out.print("\t\t\tJsc[Board]: ");
																					board = input1.nextLine();


																					//ssc
																					System.out.print("\t\t\tSsc(gpa): ");
																					ssc = input1.nextLine();

																					System.out.print("\t\t\tSchool[ssc]: ");
																					sscschool = input1.nextLine();

																					System.out.print("\t\t\tBoard[ssc]: ");
																					board1 = input1.nextLine();

																					//hsc

																					System.out.print("\t\t\tHsc(gpa): ");
																					hsc = input1.nextLine();

																					System.out.print("\t\t\tCollege[Hsc]: ");
																					hsccollege = input1.nextLine();

																					System.out.print("\t\t\tBoard[Hsc]: ");
																					board2 = input1.nextLine();


																					System.out.print("\t\t\tBsc(cgpa): ");
																					bsc = input1.nextLine();

																					System.out.print("\t\t\tUniversity[Bsc]: ");
																					bscvarsity = input1.nextLine();

																					Freshers ing = new Freshers();
																					ing.setName(name);
																					ing.setFather(fatherName);
																					ing.setMother(mothersName);
																					ing.setParmanent(parmanentADD);
																					ing.setPresent(presentADD);
																					ing.setDateof(dob);
																					ing.setReligion(religion);
																					ing.setMaritals(maritals);
																					ing.setGender(gender);
																					ing.setMob(mob);
																					ing.setJscgpa(jsc);
																					ing.setJscSchool(jscschool);
																					ing.setBoardj(board);
																					ing.setSscgpa(ssc);
																					ing.setSscSchool(sscschool);
																					ing.setBoards(jscschool);
																					ing.setHscgpa(hsc);
																					ing.setHsccollege(hsccollege);
																					ing.setBoardh(jscschool);
																					ing.setBscgpa(bsc);
																					ing.setBscvarsity(bscvarsity);

                                                                                    
																					frsr.writeInFileFresher("      \t\t\t +---------------------------------------------------------------------------------------------------------------------+");
																					frsr.writeInFileFresher("      \t\t\t |                                                                                                                     ");
																					frsr.writeInFileFresher("       \t\t\t|                                                                                                                     ");
																					frsr.writeInFileFresher("      \t\t\t |                                ------>>>>>>>>>>>>>>>Curriculum Vitae<<<<<<<<<<<<<<<<---------                       ");
																					frsr.writeInFileFresher("       \t\t\t|                       _____________________________________________________________________________                 ");
																					frsr.writeInFileFresher("       \t\t\t|                                                                                                                     ");
																					frsr.writeInFileFresher("       \t\t\t|                        CAREER OBJECTIVE:                                                                            ");
																					frsr.writeInFileFresher("       \t\t\t|                        Intend to work in challenging & competive environment where strong since of responsibility   ");
																					frsr.writeInFileFresher("       \t\t\t|                        and commitment  is require,where dignity of work provides job satisfaction and the place     ");
																					frsr.writeInFileFresher("       \t\t\t|                        of work provides potential avenues for learning growing achiving                             ");
																					frsr.writeInFileFresher("       \t\t\t|                                                                                                                     ");
																					frsr.writeInFileFresher("       \t\t\t|                        EDUCATIONAL QUALIFICATION:                                                                   ");
																					frsr.writeInFileFresher("       \t\t\t|                        ===========J=S=c==============                                                               ");
																					frsr.writeInFileFresher("       \t\t\t|                        Gpa           :        " + ing.getJsc() + "                                                      ");
																					frsr.writeInFileFresher("       \t\t\t|                        School        :        " + ing.getJscschool() + "                                                ");
																					frsr.writeInFileFresher("       \t\t\t|                        Board         :         " + ing.getBoardj() + "                                                  ");
																					frsr.writeInFileFresher("       \t\t\t|                        ===========S=S=C================                                                             ");
																					frsr.writeInFileFresher("       \t\t\t|                        Gpa           :         " + ing.getSsc() + "                                                     ");
																					frsr.writeInFileFresher("       \t\t\t|                        School        :         " + ing.getSscschool() + "                                               ");
																					frsr.writeInFileFresher("       \t\t\t|                        Board         :         " + ing.getBoards() + "                                                  ");
																					frsr.writeInFileFresher("       \t\t\t|                        ===========H=S=C================                                                             ");
																					frsr.writeInFileFresher("       \t\t\t|                        Gpa           :         " + ing.getHscgpa() + "                                                  ");
																					frsr.writeInFileFresher("       \t\t\t|                        College       :         " + ing.getHsccollege() + "                                              ");
																					frsr.writeInFileFresher("       \t\t\t|                        Board         :         " + ing.getBoardh() + "                                                  ");
																					frsr.writeInFileFresher("       \t\t\t|                        ==========B=S=C================                                                              ");
																					frsr.writeInFileFresher("       \t\t\t|                        Cgpa          :         " + ing.getBscgpa() + "                                                  ");
																					frsr.writeInFileFresher("       \t\t\t|                        Name of Degree:         " + ing.getBscvarsity() + "                                              ");
																					frsr.writeInFileFresher("       \t\t\t|                        ==============++++++++++++============                                                       ");
																					frsr.writeInFileFresher("       \t\t\t|                        =============Self Assesment===============                                                   ");
																					frsr.writeInFileFresher("       \t\t\t|                        1. Willing to learn and building u my career by accepting responsibilities                   ");
																					frsr.writeInFileFresher("       \t\t\t|                        2. Optimistic confident and friendly As a person                                             ");
																					frsr.writeInFileFresher("       \t\t\t|                        3. Energetic,Sincere,Hardworking and dutiful                                                 ");
																					frsr.writeInFileFresher("       \t\t\t|                        4. Good at communication                                                                     ");
																					frsr.writeInFileFresher("       \t\t\t|                         =================Personal Information================                                       ");
																					frsr.writeInFileFresher("       \t\t\t|                         User Name             : " + ing.getName() + "                                                  ");
																					frsr.writeInFileFresher("       \t\t\t|                         Father's name         : " + ing.getFather() + "                                                ");
																					frsr.writeInFileFresher("       \t\t\t|                         Mother's name         : " + ing.getMother() + "                                                ");
																					frsr.writeInFileFresher("       \t\t\t|                         Parmanent Address     : " + ing.getParmanent() + "                                             ");
																					frsr.writeInFileFresher("       \t\t\t|                         Present Address       : " + ing.getPresent() + "                                               ");
																					frsr.writeInFileFresher("       \t\t\t|                         Date Of Birth         : " + ing.getDateof() + "                                                ");
																					frsr.writeInFileFresher("       \t\t\t|                         Religion              : " + ing.getReligion() + "                                              ");
																					frsr.writeInFileFresher("       \t\t\t|                         Marital Statings        : " + ing.getMaritals() + "                                            ");
																					frsr.writeInFileFresher("       \t\t\t|                         Gender                : " + ing.getGender() + "                                                ");
																					frsr.writeInFileFresher("       \t\t\t|                         Mobile                : " + ing.getMob() + "                                                   ");
																					frsr.writeInFileFresher("       \t\t\t|                                                                                                                     ");
																					frsr.writeInFileFresher("       \t\t\t+---------------------------------------------------------------------------------------------------------------------+");


																					//FresherscV fcv = new FresherscV();

																					//cv.insertGenaral(ing);


																					if (fcv.insertFresser(ing))
																					{
																						System.out.println("\t\t\tData Inserted");
																						//fcv.showAllGenaral();
																						frsr.readFromFileFresher();
																					}


																					break;

																				case 2:
																				
																				System.out.println();
																				System.out.println();
																				System.out.println();
																					System.out.println("\t\t\tEnter your data to get a professional CV");
																					String name1;
																					String fatherName1;
																					String mothersName1;
																					String parmanentADD1;
																					String presentADD1;
																					String dob1;
																					String religion1;
																					String maritals1;
																					String gender1;

																					String ssc1;

																					String board11;
																					String hsc1;

																					String board21;
																					String bsc1;
																					String bscvarsity1;
																					String experience;
																					String skill;

																					Scanner input2 = new Scanner(System.in);
																					System.out.print("\t\t\tEnter your Name: ");
																					name1 = input2.nextLine();

																					System.out.print("\t\t\tEnter your Father Name: ");
																					fatherName1 = input2.nextLine();

																					System.out.print("\t\t\tEnter Your Mother Name: ");
																					mothersName1 = input2.nextLine();

																					System.out.print("\t\t\tEnter your Parmanent Address: ");
																					parmanentADD1 = input2.nextLine();

																					System.out.print("\t\t\tEnter your  Present Address: ");
																					presentADD1 = input2.nextLine();

																					System.out.print("\t\t\tEnter YourDate Of Birth: ");
																					dob1 = input2.nextLine();

																					System.out.print("\t\t\tEnter your Religion: ");
																					religion1 = input2.nextLine();

																					System.out.print("\t\t\tMaritial Status: ");
																					maritals1 = input2.nextLine();

																					System.out.print("\t\t\tGender: ");
																					gender1 = input2.nextLine();


																					System.out.print("\t\t\tEDUCATIONAL QUALIFICATION: \n");


																					//ssc
																					System.out.print("\t\t\tSsc(gpa): ");
																					ssc1 = input2.nextLine();


																					System.out.print("\t\t\tBoard[ssc]: ");
																					board11 = input2.nextLine();

																					//hsc

																					System.out.print("\t\t\tHsc(gpa): ");
																					hsc1 = input2.nextLine();


																					System.out.print("\t\t\tBoard[Hsc]: ");
																					board21 = input2.nextLine();


																					System.out.print("\t\t\tBsc(cgpa): ");
																					bsc1 = input2.nextLine();

																					System.out.print("\t\t\tUniversity[Bsc]: ");
																					bscvarsity1 = input2.nextLine();

																					System.out.print("\t\t\tExperience: ");
																					experience = input2.nextLine();

																					System.out.print("\t\t\tSkill: ");
																					skill = input2.nextLine();


																					ExperiencedApplicant EC = new ExperiencedApplicant();
																					EC.setName1(name1);
																					EC.setFather1(fatherName1);
																					EC.setMother1(mothersName1);
																					EC.setParmanent1(parmanentADD1);
																					EC.setPresent1(presentADD1);
																					EC.setDateof1(dob1);
																					EC.setReligion1(religion1);
																					EC.setMaritals1(maritals1);
																					EC.setGender1(gender1);

																					EC.setSscgpa1(ssc1);

																					EC.setBoards1(board11);
																					EC.setHscgpa1(hsc1);

																					EC.setBoardh1(board21);
																					EC.setBscgpa1(bsc1);
																					EC.setBscvarsity1(bscvarsity1);
																					EC.setExperience(experience);
																					EC.setSkill(skill);
																					
																					frsr.writeInFileExperienced("       \t\t\t+---------------------------------------------------------------------------------------------------------------------+");
																					frsr.writeInFileExperienced("       \t\t\t|                                                                                                                     ");
																					frsr.writeInFileExperienced("       \t\t\t|                                                                                                                     ");
																					frsr.writeInFileExperienced("       \t\t\t|                                ------>>>>>>>>>>>>>>>Curriculum Vitae<<<<<<<<<<<<<<<<---------                       ");
																					frsr.writeInFileExperienced("       \t\t\t|                       _____________________________________________________________________________                 ");
																					frsr.writeInFileExperienced("       \t\t\t|                                                                                                                     ");
																					frsr.writeInFileExperienced("       \t\t\t|                        CAREER OBJECTIVE:                                                                            ");
																					frsr.writeInFileExperienced("       \t\t\t|                        Intend to work in challenging & competive environment where strong since of responsibility   ");
																					frsr.writeInFileExperienced("       \t\t\t|                        and commitment  is require,where dignity of work provides job satisfaction and the place     ");
																					frsr.writeInFileExperienced("       \t\t\t|                        of work provides potential avenues for learning growing achiving                             ");
																					frsr.writeInFileExperienced("       \t\t\t|                        Experience        : " + EC.getExperience() + "                                                    ");
																					frsr.writeInFileExperienced("       \t\t\t|                        Skill             : " + EC.getSkill() + "                                                         ");
																					frsr.writeInFileExperienced("       \t\t\t|                                                                                                                     ");
																					frsr.writeInFileExperienced("       \t\t\t|                        EDUCATIONAL QUALIFICATION:                                                                   ");
																					frsr.writeInFileExperienced("       \t\t\t|                        ===========S=S=C================                                                             ");
																					frsr.writeInFileExperienced("       \t\t\t|                        Gpa               : " + EC.getSsc1() + "                                                          ");
																					frsr.writeInFileExperienced("       \t\t\t|                        Board             : " + EC.getBoards1() + "                                                       ");
																					frsr.writeInFileExperienced("       \t\t\t|                        ===========H=S=C================                                                             ");
																					frsr.writeInFileExperienced("       \t\t\t|                        Gpa               : " + EC.getHscgpa1() + "                                                       ");
																					frsr.writeInFileExperienced("       \t\t\t|                        Board             : " + EC.getBoardh1() + "                                                       ");
																					frsr.writeInFileExperienced("       \t\t\t|                        ==========B=S=C================                                                              ");
																					frsr.writeInFileExperienced("       \t\t\t|                        Cgpa              : " + EC.getBscgpa1() + "                                                       ");
																					frsr.writeInFileExperienced("       \t\t\t|                        Name of Degree    : " + EC.getBscvarsity1() + "                                                   ");
																					frsr.writeInFileExperienced("       \t\t\t|                        ==============++++++++++++============                                                       ");
																					frsr.writeInFileExperienced("       \t\t\t|                        =============Self Assesment===============                                                   ");
																					frsr.writeInFileExperienced("       \t\t\t|                        1. Willing to learn and building u my career by accepting responsibilities                   ");
																					frsr.writeInFileExperienced("       \t\t\t|                        2. Optimistic confident and friendly As a person                                             ");
																					frsr.writeInFileExperienced("       \t\t\t|                        3. Energetic,Sincere,Hardworking and dutiful                                                 ");
																					frsr.writeInFileExperienced("       \t\t\t|                        4. Good at communication                                                                     ");
																					frsr.writeInFileExperienced("       \t\t\t|                        =================Personal Information================                                        ");
																					frsr.writeInFileExperienced("       \t\t\t|                        User Name        : " + EC.getName1() + "                                                         ");
																					frsr.writeInFileExperienced("       \t\t\t|                        Father's name    : " + EC.getFather1() + "                                                       ");
																					frsr.writeInFileExperienced("       \t\t\t|                        Mother's name    : " + EC.getMother1() + "                                                       ");
																					frsr.writeInFileExperienced("       \t\t\t|                        Parmanent Address: " + EC.getParmanent1() + "                                                    ");
																					frsr.writeInFileExperienced("       \t\t\t|                        Present Address  : " + EC.getPresent1() + "                                                      ");
																					frsr.writeInFileExperienced("       \t\t\t|                        Date Of Birth    : " + EC.getDateof1() + "                                                       ");
																					frsr.writeInFileExperienced("       \t\t\t|                        Religion         : " + EC.getReligion1() + "                                                     ");
																					frsr.writeInFileExperienced("       \t\t\t|                        Marital Status   : " + EC.getMaritals1() + "                                                     ");
																					frsr.writeInFileExperienced("       \t\t\t|                        Gender           : " + EC.getGender1() + "                                                       ");
																					frsr.writeInFileExperienced("       \t\t\t|                                                                                                                     ");
																					frsr.writeInFileExperienced("       \t\t\t+---------------------------------------------------------------------------------------------------------------------+");
																					ExperiencedCv CV = new ExperiencedCv();
																					CV.insertExperience(EC);
																					//CV.showAllExperience();
																					frsr.readFromFileExperienced();
																					break;

																				case 3:
																					a = false;

																					break;


																				default:
																					System.out.println("Invalid. Please Try Again");
																			}
																		}

																		break;

																	case 2:

                                                                        
																		System.out.println();
																		System.out.println();
																		System.out.println();
																		System.out.println();
																		System.out.println();
																		Payment P1 = new Payment();
																		P1.payment_method();
																		
																		System.out.println();
																		System.out.println();
																		System.out.println();
																		System.out.println();
																		System.out.println();
																		System.out.println();
																		System.out.println();
																		System.out.println("                                                      \t\t\t*********YOU HAVE CHOSEN THE PREMIUM APPLICANT OPTION**********");
																		System.out.println("                                                 \t\t\t___________________________________________________________________________");
																		System.out.println("");
																		System.out.println("");
																		System.out.println("                                                                      \t\t\t+=======================================+");
																		System.out.println("                                                                      \t\t\t| To get this service, You Have to pay  |");
																		System.out.println("                                                                      \t\t\t|      *********PICK ONE**********      |");
																		System.out.println("                                                                      \t\t\t|          1. IT                        |");
																		System.out.println("                                                                      \t\t\t|          2. Banking                   |");
																		System.out.println("                                                                      \t\t\t|          3. Healthcare                |");
																		System.out.println("                                                                      \t\t\t|          4. Go Back                   |");
																		System.out.println("                                                                      \t\t\t+=======================================+");
																		System.out.println("");

																		Scanner sc6 = new Scanner(System.in);
																		while (q)
																		{
																			System.out.println("\t\t\tEnter Your Choice");
																			option = sc6.nextInt();
																			switch (option)
																			{
																				case 1:
																			
																				System.out.println();
																				System.out.println();
																				System.out.println();
																					System.out.println("\t\t\tEnter your data to get a professional CV");
																					String name2;
																					String fatherName2;
																					String mothersName2;
																					String parmanentADD2;
																					String presentADD2;
																					String dob2;
																					String religion2;
																					String maritals2;
																					String gender2;

																					String ssc2;

																					String board12;
																					String hsc2;

																					String board22;
																					String bsc2;
																					String bscvarsity2;
																					String experience2;
																					String skill2;

																					Scanner input3 = new Scanner(System.in);
																					System.out.print("\t\t\tEnter your Name: ");
																					name2 = input3.nextLine();

																					System.out.print("\t\t\tEnter your Father Name: ");
																					fatherName2 = input3.nextLine();

																					System.out.print("\t\t\tEnter Your Mother Name: ");
																					mothersName2 = input3.nextLine();

																					System.out.print("\t\t\tEnter your Parmanent Address: ");
																					parmanentADD2 = input3.nextLine();

																					System.out.print("\t\t\tEnter your  Present Address: ");
																					presentADD2 = input3.nextLine();

																					System.out.print("\t\t\tEnter YourDate Of Birth: ");
																					dob2 = input3.nextLine();

																					System.out.print("\t\t\tEnter your Religion: ");
																					religion2 = input3.nextLine();

																					System.out.print("\t\t\tMaritial Status: ");
																					maritals2 = input3.nextLine();

																					System.out.print("\t\t\tGender: ");
																					gender2 = input3.nextLine();


																					System.out.print("\t\t\tEDUCATIONAL QUALIFICATION: \n");


																					//ssc
																					System.out.print("\t\t\tSsc(gpa): ");
																					ssc2 = input3.nextLine();


																					System.out.print("\t\t\tBoard[ssc]: ");
																					board12 = input3.nextLine();

																					//hsc

																					System.out.print("\t\t\tHsc(gpa): ");
																					hsc2 = input3.nextLine();


																					System.out.print("\t\t\tBoard[Hsc]: ");
																					board22 = input3.nextLine();


																					System.out.print("\t\t\tBsc(cgpa): ");
																					bsc2 = input3.nextLine();

																					System.out.print("\t\t\tUniversity[Bsc]: ");
																					bscvarsity2 = input3.nextLine();

																					System.out.print("\t\t\tExperience: ");
																					experience2 = input3.nextLine();

																					System.out.print("\t\t\tSkill: ");
																					skill2 = input3.nextLine();


																					IT T = new IT();
																					T.setName2(name2);
																					T.setFather2(fatherName2);
																					T.setMother2(mothersName2);
																					T.setParmanent2(parmanentADD2);
																					T.setPresent2(presentADD2);
																					T.setDateof2(dob2);
																					T.setReligion2(religion2);
																					T.setMaritals2(maritals2);
																					T.setGender2(gender2);

																					T.setSscgpa2(ssc2);

																					T.setBoards2(board12);
																					T.setHscgpa2(hsc2);

																					T.setBoardh2(board22);
																					T.setBscgpa2(bsc2);
																					T.setBscvarsity2(bscvarsity2);
																					T.setExperience2(experience2);
																					T.setSkill2(skill2);
                                                                                    
																					C.insertExperience(T);
																					
																					C.showAllExperience();


																					break;

																				case 2:
																				
																				System.out.println();
																				System.out.println();
																				System.out.println();
																				
																					System.out.println("\t\t\tEnter your data to get a professional CV");
																					String name3;
																					String fatherName3;
																					String mothersName3;
																					String parmanentADD3;
																					String presentADD3;
																					String dob3;
																					String religion3;
																					String maritals3;
																					String gender3;

																					String ssc3;

																					String board13;
																					String hsc3;

																					String board23;
																					String bsc3;
																					String bscvarsity3;
																					String experience3;
																					String skill3;

																					Scanner input4 = new Scanner(System.in);
																					System.out.print("\t\t\tEnter your Name: ");
																					name3 = input4.nextLine();

																					System.out.print("\t\t\tEnter your Father Name: ");
																					fatherName3 = input4.nextLine();

																					System.out.print("\t\t\tEnter Your Mother Name: ");
																					mothersName3 = input4.nextLine();

																					System.out.print("\t\t\tEnter your Parmanent Address: ");
																					parmanentADD3 = input4.nextLine();

																					System.out.print("\t\t\tEnter your  Present Address: ");
																					presentADD3 = input4.nextLine();

																					System.out.print("\t\t\tEnter YourDate Of Birth: ");
																					dob3 = input4.nextLine();

																					System.out.print("\t\t\tEnter your Religion: ");
																					religion3 = input4.nextLine();

																					System.out.print("\t\t\tMaritial Status: ");
																					maritals3 = input4.nextLine();

																					System.out.print("\t\t\tGender: ");
																					gender3 = input4.nextLine();


																					System.out.print("\t\t\tEDUCATIONAL QUALIFICATION: \n");


																					//ssc
																					System.out.print("\t\t\tSsc(gpa): ");
																					ssc3 = input4.nextLine();


																					System.out.print("\t\t\tBoard[ssc]: ");
																					board13 = input4.nextLine();

																					//hsc

																					System.out.print("\t\t\tHsc(gpa): ");
																					hsc3 = input4.nextLine();


																					System.out.print("\t\t\tBoard[Hsc]: ");
																					board23 = input4.nextLine();


																					System.out.print("\t\t\tBsc(cgpa): ");
																					bsc3 = input4.nextLine();

																					System.out.print("\t\t\tUniversity[Bsc]: ");
																					bscvarsity3 = input4.nextLine();

																					System.out.print("\t\t\tExperience: ");
																					experience3 = input4.nextLine();

																					System.out.print("\t\t\tSkill: ");
																					skill3 = input4.nextLine();


																					Banking B = new Banking();
																					B.setName3(name3);
																					B.setFather3(fatherName3);
																					B.setMother3(mothersName3);
																					B.setParmanent3(parmanentADD3);
																					B.setPresent3(presentADD3);
																					B.setDateof3(dob3);
																					B.setReligion3(religion3);
																					B.setMaritals3(maritals3);
																					B.setGender3(gender3);

																					B.setSscgpa3(ssc3);

																					B.setBoards3(board13);
																					B.setHscgpa3(hsc3);

																					B.setBoardh3(board23);
																					B.setBscgpa3(bsc3);
																					B.setBscvarsity3(bscvarsity3);
																					B.setExperience3(experience3);
																					B.setSkill3(skill3);
																					BankingcV K = new BankingcV();
																					K.insertExperience(B);
																					K.showAllExperience();


																					break;

																				case 3:

																					System.out.println("\t\t\tEnter your data to get a professional CV");
																					String name4;
																					String fatherName4;
																					String mothersName4;
																					String parmanentADD4;
																					String presentADD4;
																					String dob4;
																					String religion4;
																					String maritals4;
																					String gender4;

																					String ssc4;

																					String board14;
																					String hsc4;

																					String board24;
																					String bsc4;
																					String bscvarsity4;
																					String experience4;
																					String skill4;

																					Scanner input5 = new Scanner(System.in);
																					System.out.print("\t\t\tEnter your Name: ");
																					name4 = input5.nextLine();

																					System.out.print("\t\t\tEnter your Father Name: ");
																					fatherName4 = input5.nextLine();

																					System.out.print("\t\t\tEnter Your Mother Name: ");
																					mothersName4 = input5.nextLine();

																					System.out.print("\t\t\tEnter your Parmanent Address: ");
																					parmanentADD4 = input5.nextLine();

																					System.out.print("\t\t\tEnter your  Present Address: ");
																					presentADD4 = input5.nextLine();

																					System.out.print("\t\t\tEnter YourDate Of Birth: ");
																					dob4 = input5.nextLine();

																					System.out.print("\t\t\tEnter your Religion: ");
																					religion4 = input5.nextLine();

																					System.out.print("\t\t\tMaritial Status: ");
																					maritals4 = input5.nextLine();

																					System.out.print("\t\t\tGender: ");
																					gender4 = input5.nextLine();


																					System.out.print("\t\t\tEDUCATIONAL QUALIFICATION: \n");


																					//ssc
																					System.out.print("\t\t\tSsc(gpa): ");
																					ssc4 = input5.nextLine();


																					System.out.print("\t\t\tBoard[ssc]: ");
																					board14 = input5.nextLine();

																					//hsc

																					System.out.print("\t\t\tHsc(gpa): ");
																					hsc4 = input5.nextLine();


																					System.out.print("\t\t\tBoard[Hsc]: ");
																					board24 = input5.nextLine();


																					System.out.print("\t\t\tBsc(cgpa): ");
																					bsc4 = input5.nextLine();

																					System.out.print("\t\t\tUniversity[Bsc]: ");
																					bscvarsity4 = input5.nextLine();

																					System.out.print("\t\t\tExperience: ");
																					experience4 = input5.nextLine();

																					System.out.print("\t\t\tSkill: ");
																					skill4 = input5.nextLine();


																					Healthcare H = new Healthcare();
																					H.setName4(name4);
																					H.setFather4(fatherName4);
																					H.setMother4(mothersName4);
																					H.setParmanent4(parmanentADD4);
																					H.setPresent4(presentADD4);
																					H.setDateof4(dob4);
																					H.setReligion4(religion4);
																					H.setMaritals4(maritals4);
																					H.setGender4(gender4);

																					H.setSscgpa4(ssc4);

																					H.setBoards4(board14);
																					H.setHscgpa4(hsc4);

																					H.setBoardh4(board24);
																					H.setBscgpa4(bsc4);
																					H.setBscvarsity4(bscvarsity4);
																					H.setExperience4(experience4);
																					H.setSkill4(skill4);
																					HealthcarecV R = new HealthcarecV();
																					R.insertExperience(H);
																					R.showAllExperience();

																					break;

																				case 4:
																					q=false;
																					break;


																				default:
																					System.out.println("Invalid.Please Try Again");
																					break;
																			}
																		}

                                                                    break;

																	case 3:
																		b = false;
																		a=false;
																		Applicantlogin=false;
																		break;

																	default:
																		System.out.println("Invalid.Please Try Again1");
																		break;
																}


															}

                                                       //  break;
														//default:
															//System.out.println("Invalid.Please Try Again2");
															//break;
												//	}
												//}//////////////////////////////////////////////////////////////

                                            //  break;
										//	default:
											//	System.out.println("Invalid.Please Try Again3");
												//break;
										//}
										//}


									}
									else
									{
										System.out.println("Please Input Valid Number");
									}
								}
								break;
							case 1:  //SingUp
                                cls();
								System.out.println();
								System.out.println();
								System.out.println();
								System.out.println();
								System.out.println();
								System.out.println();
								System.out.println();
								System.out.println();
								System.out.println();
								System.out.println();
								System.out.println();
								
								System.out.println("\t\t\t\t\t\t\t\t\t Please enter your information correctly : ");
								System.out.print("\t\t\t\t\t\t\t\t\tApplicant Name: ");
								sc.nextLine();/////////////////
								String customerName = sc.nextLine();
								System.out.print("\t\t\t\t\t\t\t\t\tApplicantAge : ");
								String customerAge = sc.nextLine();
								System.out.print("\t\t\t\t\t\t\t\t\tApplicant Gender : ");
								String customerGender = sc.nextLine();
								System.out.print("\t\t\t\t\t\t\t\t\tApplicant Address : ");
								String customerAddress = sc.nextLine();
								System.out.print("\t\t\t\t\t\t\t\t\tApplicant Contact Number : ");
								String customerContactNumber = sc.nextLine();
								System.out.print("\t\t\t\t\t\t\t\t\tApplicant Email Address : ");
								String customerEmailAddress = sc.nextLine();
								System.out.print("\t\t\t\t\t\t\t\t\tSet password : ");
								String customerPassword = sc.nextLine();

								File file = new File("fileio/Applicant.txt");
								file.createNewFile();
								String fileContent;
								try (Scanner scan = new Scanner(file))
								{

									// fileContent = (del1[i].getDeliveryBoyId() + "," + del1[i].getDeliveryBoyName() + "," + del1[i].getDeliveryBoyAge()+ "," + del1[i].getDeliveryBoyGender()+ "," + del1[i].getDeliveryBoyAddress()+ "," + del1[i].getDeliveryBoyContactNumber()+ "," + del1[i].getDeliveryBoyEmailAddress()+","+del1[i].getDeliveryBoyPassword());

									// while (scan.hasNext()) {
									//    fileContent = (scan.nextLine().concat(fileContent));
									// }
								}
								FileWriter writer = new FileWriter(file,true);
								PrintWriter pw=new PrintWriter(writer);
								//  writer.write(fileContent);
								pw.println(customerContactNumber+","+customerName+","+customerAge+","+customerGender+","+customerAddress+","+customerEmailAddress+","+customerPassword);
								// writer.write(System.lineSeparator());//System.getProperty("line.separator")
								writer.flush();
								writer.close();




								break;


							case 3:

								adm = true;
								while(adm)
								{   
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								
									System.out.println("\t\t\t\t\t\t\t\t\t***********Enter your Admin_ID & password***********");
									System.out.println("");
									System.out.print("\t\t\t\t\t\t\t\t\tEnter Your UserId : ");
									Scanner ad = new Scanner(System.in);
									User_id = ad.nextLine();

									System.out.print("\t\t\t\t\t\t\t\t\tEnter Your Password : ");
									Scanner ad1 = new Scanner(System.in);
									password = ad1.nextLine();

									if (password.equals(pass[2]) && User_id.equals(admin))
									{

										System.out.println("\t\t\t\t\t\t\t\t\t************Login Successful****************");
										c = true;
										System.out.println("");
										System.out.println("\t\t\t\t\t\t\t\t\tWelcome");
										System.out.println("");
										System.out.println("");
										while (c)
										{   
										System.out.println("");
										System.out.println("");
										System.out.println("");
										System.out.println("");
										System.out.println("");
										System.out.println("");
										System.out.println("");
                                            System.out.println("\t\t\t\t\t\t\t\t\t+------------------------------------+");
											System.out.println("\t\t\t\t\t\t\t\t\t|Please enter the mention number...  |");

											System.out.println("\t\t\t\t\t\t\t\t\t|  1. show all freshers applicant    |");
											System.out.println("\t\t\t\t\t\t\t\t\t|  2. remove applicant               |");
											System.out.println("\t\t\t\t\t\t\t\t\t|  3. LogOut                         |");
											System.out.println("\t\t\t\t\t\t\t\t\t+------------------------------------+");
											Scanner i2 = new Scanner(System.in);

											System.out.println("\t\t\t\t\t\t\t\t\t	Enter Your Choice");
											option = i2.nextInt();
											switch (option)
											{
												/*case 0:
													d = true;
													while (d)
													{
														System.out.println("Add Applicant");
														System.out.println("Delete Applicant");


														System.out.println("Enter Your Choice");
														option = i2.nextInt();
														switch (option)
														{
															case 1:
																System.out.println("Enter Id for add applicant");
//add method
																break;
															case 2:
																System.out.println("Enter Id for delete applicant");
//delete method
																break;
															case 3:
																d = false;
																break;

															default:
																System.out.println("Invalid");
														}
													}

													break;*/
//Add method
												case 1:///show freshers applicant
													//fcv.showAllFreshers();
													System.out.print("\t\t\t\t\t\t\t\t\tEnter Applicant phone number :");
													//sc.nextLine();
													String customerSearchPhoneNumber = sc.nextLine();
													//cls();

													//String searchDeliveryBoyId = sc.nextLine();

													String filepath="fileio/Applicant.txt";
													FileReader fr = new FileReader(filepath);
													BufferedReader br = new BufferedReader(fr);
													String line9 = "";
													int i = 0;
													File file4= new File(filepath);
													FileReader fr1 = new FileReader(filepath);
													BufferedReader br1 = new BufferedReader(fr);
													try{
														Scanner inputBuffer=new Scanner(file4);
														while((line9 = br1.readLine())!=null){
															String line8=inputBuffer.nextLine();
															String[] valueTrack =line8.split(",");
															if(valueTrack[0].equals(customerSearchPhoneNumber)){
																try{
																	System.out.println("\n\t\t\t\t\t\t\t\t\t===========================================================\n\t\t\t\t\t\t\t\t\tCustomer Contact Number: "+valueTrack[0]+" \n\t\t\t\t\t\t\t\t\tCustomer Name : "+valueTrack[1]+" \n\t\t\t\t\t\t\t\t\tCustomer Age : "+valueTrack[2]+" \n\t\t\t\t\t\t\t\t\tCustomer Gender : "+valueTrack[3]+" \n\t\t\t\t\t\t\t\t\tCustomer Email Address : "+valueTrack[4]+" \n\t\t\t\t\t\t\t\t\tCustomer Address : "+valueTrack[5]+" \n\t\t\t\t\t\t\t\t\tCustomer Address : "+valueTrack[6]);


																}catch (ArrayIndexOutOfBoundsException ar){}

															}

														}
														inputBuffer.close();
														//br.close();
														//fr.close();
														br1.close();
														fr1.close();

													}catch (FileNotFoundException fe){
														fe.printStackTrace();
													}


//Delete method
													break;

												case 2://remove fresh
													///////////////////////remove Fresher////////////////////////////////////
													System.out.print("\t\t\t\t\t\t\t\t\tEnter Applicant contact number :");

													String removeCustomerByContactNumber = sc.nextLine();/////////////////////////////////////////////////////


													String customerFilePath="fileio/Applicant.txt";
													String tempFile ="fileio/tempApplicant.txt";
													File oldFile = new File (customerFilePath);
													File newFile=new File(tempFile);
													String getCustomerContactNumber="";
													String getCustomerName="";
													String getCustomerAge="";
													String getCustomerGender="";
													String getCustomerEmailAdress="";
													String getCustomerAddress="";
													String getCustomerPassword="";
													// String deliveryBoyPassword="";
													try
													{
														FileWriter fw = new FileWriter(tempFile,true);
														BufferedWriter bw=new BufferedWriter(fw);
														PrintWriter pw1 = new PrintWriter(bw);
														g=new Scanner(new File(customerFilePath));
														g.useDelimiter("[,\n]");


														while (g.hasNext())
														{
															getCustomerContactNumber=g.next();
															getCustomerName=g.next();
															getCustomerAge=g.next();
															getCustomerGender=g.next();
															getCustomerEmailAdress=g.next();
															getCustomerAddress=g.next();
															getCustomerPassword=g.next();
															//deliveryBoyPassword=x.next();
															if(!getCustomerContactNumber.equals(removeCustomerByContactNumber))
															{
																pw1.println(getCustomerContactNumber+","+getCustomerName+","+getCustomerAge+","+getCustomerGender+","+getCustomerEmailAdress+","+getCustomerAddress+","+getCustomerPassword);
															}

														}
														g.close();
														pw1.flush();
														pw1.close();
														oldFile.delete();
														File dump = new File(customerFilePath);
														newFile.renameTo(dump);



													}
													catch (Exception ex)
													{

													}


													///////////////////////remove Fresher////////////////////////////////////



													break;

												case 3:
													c = false;
													adm=false;
													break;

												default:
													System.out.println("Invalid");
											}
										}

										break;
									}
								}


							case 5:
								break;

							default:
								System.out.println("Invalid Output....");

						}
					}


				case 2:

					break;
				default:
					System.out.println("Invalid Output....");
			}
		}


		System.out.println("Hello Sir/Ma'am, please log in to get our service....");
	}

	public static void cls()
	{
		try
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		}
		catch(Exception E)
		{
			System.out.println(E);
		}
	}

}
