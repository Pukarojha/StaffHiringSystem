public class PartTimeStaffHire extends StaffHire {
    //class PartTimeStaffHire is the child class of StaffHire
    private int workingHour;
    private int wagesPerHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private String shifts;
    private boolean joined;
    private boolean terminated;
    //the above are instance variables with private access
    public PartTimeStaffHire(int vaccancyNumber,String designation,String jobType,int workingHour,int wagesPerHour,String shifts){
        //this is the constructer of PartTimeStaffHire
        super(vaccancyNumber,designation,jobType);
        //super keyword is used here to call the variables from parent class
        this.workingHour=workingHour;
        this.wagesPerHour=wagesPerHour;
        this.shifts=shifts;
        this.staffName="";
        this.joiningDate="";
        this.qualification="";
        this.appointedBy="";
        this.joined=false;
        this.terminated=false;
        //here this keyword updates the instance variables  
    }
    //Getter methods reads the values of the variables and returns  instance variables of PartTimeStaffHIre class
    public int getWorkingHour(){
        return workingHour;
    }

    public int getWagesPerHour(){
        return wagesPerHour;
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

    public String getShifts(){
        return shifts;
    }

    public Boolean getJoined(){
        return joined;
    }

    public Boolean getTerminated(){
        return terminated;
    }
    //setter methods to update  variables
    public void setWorkingHour(int workingHour){
        this.workingHour=workingHour;
    }

    public void setWagesPerHour(int wagesPerHour){
        this.wagesPerHour=wagesPerHour;
    }

    public void setStaffName(String staffName){
        this.staffName=staffName;
    }

    public void setJoiningDate(String joiningDate){
        this.joiningDate=joiningDate;
    }

    public void setQualification(String qualification){
        this.qualification=qualification;
    }

    public void setAppointedBy(String appointedBy){
        this.appointedBy=appointedBy;
    }

    public void setJoined(boolean joined){
        this.joined=joined;
    }
    //the below is the setter methods to update the  variables with condition
    public void setShifts(String newShifts){
        if (joined==false){
            shifts=newShifts;
        }
        else{
            System.out.println("The staff is already hired");
        }
    }
    //setter method to update terminate variable
    public void setTerminated(Boolean terminated){
        this.terminated= terminated;
    }

    public void hirePartTimeStaff(String staffName,String joiningDate,String qualification,String appointedBy){
        //hirePartTimeStaff method to hire the part time staff  with the condition
        if (getJoined()==true){
            System.out.println("The staff, "+ getStaffName() +" has already joined on " + getJoiningDate());
        }else{
            this.staffName=staffName;
            this.joiningDate=joiningDate;
            this.qualification=qualification;
            this.appointedBy=appointedBy;
            joined=true;
            terminated=false;
        }
    }

    public void terminateStaff(){
        //terminateStaff method to terminate the staff with the condition
        if (getTerminated() ==true){
            System.out.println("The staff is already terminated.");
        }else{
            this.staffName="";
            this.joiningDate="";
            this.qualification="";
            this.appointedBy="";
            this.joined=false;
            this.terminated=true;
        }
    }   

    public void display(){
        //display method to print the details 
        super.display();
        //super keyword to call display method of parent class
        //int incomePerDay= (getWagesPerHour() * getWorkingHour());
        if (joined==true){
            //printing the details 
            System.out.println("The name of the staff is : "+ getStaffName());
            System.out.println("wages per hour : "+getWagesPerHour());
            System.out.println("working hour : "+getWorkingHour());
            System.out.println("joined : "+getJoined());
            System.out.println("qualaification : "+getQualification());
            System.out.println("appointed by : "+getAppointedBy());
            System.out.println("income per day : "+ getWagesPerHour()*getWorkingHour());
        }
    }
}