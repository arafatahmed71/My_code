package Classes;
public class Healthcare{

  protected String name4;
  protected String fatherName4;
  protected String mothersName4;
  protected String parmanentADD4;				 				 
  protected String presentADD4;		 
  protected String dob4;
  protected String religion4;
  protected String maritals4; 
  protected String gender4;
  protected String ssc4;
  protected String board14 ;
  protected String hsc4;
  protected String board24;
  protected String bsc4;
  protected String bscvarsity4;
  protected String experience4;
  protected String skill4;
   
   
   
   
   
  
  
  
  ////////set method
    public void setName4(String name4){this.name4=name4;}
	public void setFather4(String fatherName4){this.fatherName4=fatherName4;}
	public void setMother4(String mothersName4){this.mothersName4=mothersName4;}
	public void setParmanent4( String parmanentADD4){this.parmanentADD4=parmanentADD4;}
	public void setPresent4(String presentADD4){this.presentADD4=presentADD4;}
	public void setDateof4(String dob4){this.dob4=dob4;}
	public void setReligion4(String religion4){this.religion4=religion4;}
	public void setMaritals4(String maritals4){this.maritals4=maritals4;}
	public void setGender4(String gender4){this.gender4=gender4;}
	public void setSscgpa4(String ssc4){this.ssc4=ssc4;}
	public void setBoards4(String board14){this.board14=board14;}
	public void setHscgpa4(String hsc4){this.hsc4=hsc4;}
	public void setBoardh4(String board24){this.board24=board24;}
	public void setBscgpa4(String bsc4){this.bsc4=bsc4;}
    public void setBscvarsity4(String bscvarsity4){this.bscvarsity4=bscvarsity4;}
	public void setExperience4(String experience4){this.experience4=experience4;}
	public void setSkill4(String skill4){this.skill4=skill4;}
	
///////get method
	
	public String getName4(){return name4;} 
	public String getFather4(){return fatherName4;}
	public String getMother4(){return mothersName4 ;} 
	public String getParmanent4(){return parmanentADD4;}
	public String getPresent4(){return presentADD4;} 
    public String getDateof4(){return dob4;} 
    public String getReligion4(){return religion4;}
	public String getMaritals4(){return maritals4;} 
	public String getGender4(){return gender4;} 
	
	public String getSsc4(){return ssc4;}
	public String getBoards4(){return board14;}

	
	public String getHscgpa4(){return hsc4;}
	public String getBoardh4(){return board24;}

	public String getBscgpa4(){return bsc4;}
	public String getBscvarsity4(){return bscvarsity4;}
	public String getExperience4(){return experience4;}
	public String getSkill4(){return skill4;}
    
    
	
	
	
	
	public void print()
	{
	                     System.out.println(" ------>>>>>>>>>>>>>>>Curriculum Vitae<<<<<<<<<<<<<<<<---------");	
	                     System.out.println("1.NAME                     :"+name4);
	                     System.out.println("2.FATHER'S NAME            :"+fatherName4);
	                     System.out.println("3.Mother's NAME            :"+mothersName4);
						 System.out.println("3. PARMANENT ADDRESS       :"+parmanentADD4);
	                     System.out.println("4.PRESENT ADDRESS          :"+presentADD4);
	                     System.out.println("5.DATE OF BIRTH            :"+dob4);
	                     System.out.println("6.RELIGION                 :"+religion4);
						 System.out.println("7.MARITIAL STATUS          :"+maritals4);
						 System.out.println("8.Gender                   :"+gender4);
						 System.out.println("11.Enter your SSc Gpa      :"+ssc4);
					     System.out.println("12.Enter School            :"+board14);
						 System.out.println("13.Enter your Hsc Gpa      :"+hsc4);
						 System.out.println("14.Enter School            :"+board24);
						 System.out.println("15.Enter your BSc Gpa      :"+bsc4);
						 System.out.println("16.University              :"+bscvarsity4);
						 System.out.println("17.Experience              :"+experience4);
						 System.out.println("18.Skill                   :"+skill4);
						 
						 
						 
						 
						 
						 
						 
						 
	}
}