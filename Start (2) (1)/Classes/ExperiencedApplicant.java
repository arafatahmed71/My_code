package Classes;
public class ExperiencedApplicant{

  protected String name1;
  protected String fatherName1;
  protected String mothersName1;
  protected String parmanentADD1;				 				 
  protected String presentADD1;		 
  protected String dob1;
  protected String religion1;
  protected String maritals1; 
  protected String gender1;
  protected String ssc1;
  protected String board11 ;
  protected String hsc1;
  protected String board21;
  protected String bsc1;
  protected String bscvarsity1;
  protected String experience;
  protected String skill;
   
   
   
   
   
  
  
  
  ////////set method
    public void setName1(String name1){this.name1=name1;}
	public void setFather1(String fatherName1){this.fatherName1=fatherName1;}
	public void setMother1(String mothersName1){this.mothersName1=mothersName1;}
	public void setParmanent1( String parmanentADD1){this.parmanentADD1=parmanentADD1;}
	public void setPresent1(String presentADD1){this.presentADD1=presentADD1;}
	public void setDateof1(String dob1){this.dob1=dob1;}
	public void setReligion1(String religion1){this.religion1=religion1;}
	public void setMaritals1(String maritals1){this.maritals1=maritals1;}
	public void setGender1(String gender1){this.gender1=gender1;}
	public void setSscgpa1(String ssc1){this.ssc1=ssc1;}
	public void setBoards1(String board11){this.board11=board11;}
	public void setHscgpa1(String hsc1){this.hsc1=hsc1;}
	public void setBoardh1(String board21){this.board21=board21;}
	public void setBscgpa1(String bsc1){this.bsc1=bsc1;}
    public void setBscvarsity1(String bscvarsity1){this.bscvarsity1=bscvarsity1;}
	public void setExperience(String experience){this.experience=experience;}
	public void setSkill(String skill){this.skill=skill;}
	
///////get method
	
	public String getName1(){return name1;} 
	public String getFather1(){return fatherName1;}
	public String getMother1(){return mothersName1 ;} 
	public String getParmanent1(){return parmanentADD1;}
	public String getPresent1(){return presentADD1;} 
    public String getDateof1(){return dob1;} 
    public String getReligion1(){return religion1;}
	public String getMaritals1(){return maritals1;} 
	public String getGender1(){return gender1;} 
	
	public String getSsc1(){return ssc1;}
	public String getBoards1(){return board11;}

	
	public String getHscgpa1(){return hsc1;}
	public String getBoardh1(){return board21;}

	public String getBscgpa1(){return bsc1;}
	public String getBscvarsity1(){return bscvarsity1;}
	public String getExperience(){return experience;}
	public String getSkill(){return skill;}
    
    
	
	
	
	
	public void print()
	{
	                     System.out.println(" ------>>>>>>>>>>>>>>>Curriculum Vitae<<<<<<<<<<<<<<<<---------");	
	                     System.out.println("1.NAME                     :"+name1);
	                     System.out.println("2.FATHER'S NAME            :"+fatherName1);
	                     System.out.println("3.Mother's NAME            :"+mothersName1);
						 System.out.println("3. PARMANENT ADDRESS       :"+parmanentADD1);
	                     System.out.println("4.PRESENT ADDRESS          :"+presentADD1);
	                     System.out.println("5.DATE OF BIRTH            :"+dob1);
	                     System.out.println("6.RELIGION                 :"+religion1);
						 System.out.println("7.MARITIAL STATUS          :"+maritals1);
						 System.out.println("8.Gender                   :"+gender1);
						 System.out.println("11.Enter your SSc Gpa      :"+ssc1);
					     System.out.println("12.Enter School            :"+board11);
						 System.out.println("13.Enter your Hsc Gpa      :"+hsc1);
						 System.out.println("14.Enter School            :"+board21);
						 System.out.println("15.Enter your BSc Gpa      :"+bsc1);
						 System.out.println("16.University              :"+bscvarsity1);
						 System.out.println("17.Experience              :"+experience);
						 System.out.println("18.Skill                   :"+skill);
						 
						 
						 
						 
						 
						 
						 
	}



}
