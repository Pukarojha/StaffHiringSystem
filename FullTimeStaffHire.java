public class FullTimeStaffHire extends StaffHire{ 
    //instance variables having private access
    private int salary;
    private int workingHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;
    public FullTimeStaffHire(int vacancyNumber,String designation,String jobType,int salary,int workingHour){
        // the below constructer of the class FullTimeStaffHire
        super(vacancyNumber,designation,jobType);
        //super keyword is used to call the variables from parent class
        this.salary=salary;
        this.workingHour= workingHour;
        this.staffName="";
        this.joiningDate="";
        this.qualification="";
        this.appointedBy="";
        this.joined=false;
    }
    //Getter methods reads the values of the variables and returns instance variables 
    public int getSalary(){
        return salary;
    }

    public int getWorkingHour(){
        return workingHour;
    }

    public String getStaffName(){
        return staffName;
    }

    public String getJoiningDate(){
        return joiningDate;
    }

    public String getQualification(){
        return qualification;
    }

    public String getAppointedBy(){
        return appointedBy;
    }

    public boolean getJoined(){
        return joined;
    }
    //setter method to update the salary,variables with the condition
    public void setSalary(int newSalary){
        if (getJoined()==false){
            salary=newSalary;
        }
        else{
            System.out.println("Sorry,the staff is already appointed and the change in salary is not quite possible now");
        }
    }
    //setter method to update the variables
    public void setWorkingHour(int newWorkingHour){
        workingHour=newWorkingHour;
    }

    public void setStaffName(String staffName){
        this.staffName= staffName;
    }

    public void setJoiningDate(String joiningDate){
        this.joiningDate= joiningDate;
    }

    public void setQualification(String qualification){
        this.qualification= qualification;
    }

    public void setAppointedBy(String appointedBy){
        this.appointedBy=appointedBy;
    }

    public void setJoined(boolean joined){
        this.joined= joined;
    }
    //hireFullTimeStaff method to hire full time staff with condition//
    public void hireFullTimeStaff(String staffName,String joiningDate,String qualification,String appointedBy){
        if(getJoined()==true){
            System.out.println(staffName+" has already apppointed on: " + joiningDate);
        } 
        else{
            this.staffName=staffName;
            this.joiningDate=joiningDate;
            this.qualification=qualification;
            this.appointedBy=appointedBy;
            this.joined =true;
        }
    }
    //display method to print the detils
    public void disply(){
        super.display();
        //super keyword to call the display method of parent class
        if (joined == true){
            System.out.println("Staff Name: "+getStaffName());
            System.out.println("salary: "+ getSalary());
            System.out.println("working hour: "+getWorkingHour());
            System.out.println("joining date: " +getJoiningDate());
            System.out.println("qualification: " +getQualification());
            System.out.println("Appointed by: "+getAppointedBy());
            //printing the details
        }
    }
}