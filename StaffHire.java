public class StaffHire {
    //instance variables//
    //all these variables access method is private
    private int vacancyNumber;
    private String designation;
    private String jobType; 
    //the below method is the constructer of StaffHire class
    public StaffHire(int vacancyNumber,String designation,String jobType){
        this.vacancyNumber= vacancyNumber;
        this.designation= designation;
        this.jobType=jobType;
    }
    //the below given are geetter method to get the instance variables
    public int getVacancyNumber(){
        return vacancyNumber;
    }

    public String getDesignation(){
        return designation;
    }

    public String getJobType(){
        return jobType;
    }
    //setter methods to update the variables
    public void setVacancyNumber(int vaccancyNumber){
        this.vacancyNumber= vaccancyNumber;
    }

    public void setDesignation(){
        this.designation=designation;
    }

    public void setJobTtype(String jobType){
        this.jobType= jobType;
    }
    //displey method to print the details of the StaffHire class//
    public void display(){
        System.out.println("Vacancy Number: "+ getVacancyNumber());
        System.out.println("Designation: "+ getDesignation());
        System.out.println("Jobtype: "+ getJobType());
    }
}