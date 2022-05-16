package Classes;
//package GeneralApplicant;
//import java.lang.*;

public class Freshers{

  protected String name;
  protected String fatherName;
  protected String mothersName;
  protected String parmanentADD;				 				 
  protected String presentADD;		 
  protected String dob;
  protected String religion;
  protected String maritals; 
  protected String gender;
  protected String mob;
  protected String jsc; 
  protected String jscschool ;
  protected String board ;
  protected String ssc;
  protected String sscschool;
  protected String board1 ;
  
   protected String hsc;
   protected String hsccollege;
   protected String board2;
   protected String bsc;
   protected String bscvarsity;
   
   
   
   
   
  
  
  
  ////////set method
    public void setName(String name){this.name=name;}
	
	public void setFather(String fatherName){this.fatherName=fatherName;}
	
	public void setMother(String mothersName){this.mothersName=mothersName;}
	public void setParmanent( String parmanentADD){this.parmanentADD=parmanentADD;}
	public void setPresent(String presentADD){this.presentADD=presentADD;}
	public void setDateof(String dob){this.dob=dob;}
	public void setReligion(String religion){this.religion=religion;}
	public void setMaritals(String maritals){this.maritals=maritals;}
	public void setGender(String gender){this.gender=gender;}
    public void setMob(String mob){this.mob=mob;}
	public void setJscgpa(String jsc){this.jsc=jsc;}
	public void setJscSchool(String jscschool){this.jscschool=jscschool;}
	public void setBoardj(String board){this.board=board;}
	public void setSscgpa(String ssc){this.ssc=ssc;}
	public void setSscSchool(String sscschool){this.sscschool=sscschool;}
	public void setBoards(String board1){this.board1=board1;}
	public void setHscgpa(String hsc){this.hsc=hsc;}
	public void setHsccollege(String hsccollege){this.hsccollege=hsccollege;}
	public void setBoardh(String board2){this.board2=board2;}
	public void setBscgpa(String bsc){this.bsc=bsc;}
    public void setBscvarsity(String bscvarsity){this.bscvarsity=bscvarsity;}
	
///////get method
	
	public String getName(){return name;} 
	public String getFather(){return fatherName;}
	public String getMother(){return mothersName ;} 
	public String getParmanent(){return parmanentADD;}
	public String getPresent(){return presentADD;} 
    public String getDateof(){return dob;} 
    public String getReligion(){return religion;}
	public String getMaritals(){return maritals;} 
	public String getGender(){return gender;} 
	public String getMob(){return mob;}
    public String getJsc(){return jsc;}
	public String getJscschool(){return jscschool;}
    public String getBoardj(){return board;}

	public String getSsc(){return ssc;}
	public String getSscschool(){return sscschool;}
	public String getBoards(){return board1;}

	
	public String getHscgpa(){return hsc;}
	public String getHsccollege(){return hsccollege;}
	public String getBoardh(){return board2;}

	public String getBscgpa(){return bsc;}
	public String getBscvarsity(){return bscvarsity;}
    
    
	
	
	
	
	public void print()
	{
	                     System.out.println(" ------>>>>>>>>>>>>>>>Curriculum Vitae<<<<<<<<<<<<<<<<---------");	
	                     System.out.println("1.NAME                     :"+name);
	                     System.out.println("2.FATHER'S NAME            :"+fatherName);
	                     System.out.println("3.Mother's NAME            :"+mothersName);
						 System.out.println("3. PARMANENT ADDRESS       :"+parmanentADD);
	                     System.out.println("4.PRESENT ADDRESS          :"+presentADD);
	                     System.out.println("5.DATE OF BIRTH            :"+dob);
	                     System.out.println("6.RELIGION                 :"+religion);
						 System.out.println("7.MARITIAL STATUS          :"+maritals);
						 System.out.println("8.Gender                   :"+gender);
						 System.out.println("9.MOBILE                   :"+mob);
	                     System.out.println("9.Enter your Jsc Gpa       :"+jsc);
						 System.out.println("10.Enter School            :"+jscschool);
						 System.out.println("12.Enter School            :"+board);
						 System.out.println("11.Enter your SSc Gpa      :"+ssc);
						 System.out.println("12.Enter School            :"+sscschool);
						 System.out.println("12.Enter School            :"+board1);
						 
						 System.out.println("11.Enter your Hsc Gpa      :"+hsc);
						 System.out.println("12.College                 :"+hsccollege);
						 System.out.println("12.Enter School            :"+board2);
						 System.out.println("11.Enter your BSc Gpa      :"+bsc);
						 System.out.println("12. University             :"+bscvarsity);
						 
						 
						 
						 
						 
	}



}



