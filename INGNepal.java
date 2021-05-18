import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class INGNepal{
    private JFrame window;
    private JPanel mainPanel,ftPanel,ptPanel,panel1,panel2;
    private JMenuBar menuBar;
    private JMenu menuFile,menuAbout;
    private JMenuItem menuItemNew,menuItemExit,menuItemApp,menuItemDeveloper;
    private JLabel mainLabel,
        //label  for full time staff hiring system
    labelFtVaccancy,
    labelFtDesignation,
    labelFtJobType,
    labelFtSalary,
    labelFtWorkingHour,
    labelFtStaffName,
    labelFtJoiningDate,
    labelFtQualification,
    labelFtAppointedBy,
    labelFtJoined;
    // button for main panel
    private JButton btnFT,btnPT;
    //textfield for full time staff hiring system
    private JTextField textFtVaccancy,
    textFtDesignation,
    textFtJobType,
    textFtSalary,
    textFtWorkingHour,
    textFtStaffName,
    textFtJoiningDate,
    textFtQualification,
    textFtAppointedBy;
    //button for full time staff hiring system
    private JButton btnFTBack,
    btnAddFtStaff,
    btnFtAppoint,
    btnFtDisplay,
    btnFtClear;

    //radio buttons for full time staff hiring system
    private JRadioButton rbtnFtYes,rbtnFtNo;

    //button group for full time staff hiring system
    private ButtonGroup ftJoined;

    //PART TIME STAAFF HIRING SYSTEM

    //button for part time staff hiring system
    private JButton btnPTBack;

    //label's for part time 
    private JLabel labelPtVaccancy,
    labelPtDesignation,
    labelPtJobType,
    labelPtWorkingHr,
    labelPtWagesPerHr,
    labelPtStaffName,
    labelPtJoiningDate,
    labelPtQualification,
    labelPtAppointedBy,
    labelPtShifts,
    labelPtJoined,
    labelPtTerminate;

    //textfield's for part time 
    private JTextField textPtVaccancy,
    textPtDesignation,
    textPtJobType,
    textPtWorkingHr,
    textPtWagesPerHr,
    textPtStaffName,
    textPtJoiningDate,
    textPtQualification,
    textPtAppointedBy,
    textPtShifts;

    //button for part time staff hiring system
    private JButton btnPtAddStaff,
    btnPtAppoint,
    btnPtTerminate,
    btnPtDisplay,
    btnPtClear;

    //this is constructer for initialization

    private ArrayList<StaffHire>list= new ArrayList<>();
    public INGNepal(){
        initializeFrame();
        initializeMenu();
        iniMainPanel();

    }
    //initailizing the frame
    public void initializeFrame(){
        window= new JFrame("Staff Hiring System");
        window.setSize(750,750);
        window.setLayout(null);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    public void initializeMenu(){
        menuBar= new JMenuBar();
        menuBar.setBounds(0,0,1994,26) ;
        window.add(menuBar);
        menuBar.setBackground(Color.white);

        menuFile = new JMenu("File");
        menuBar.add(menuFile);

        menuItemNew = new JMenuItem("New");
        //adding action listener in menu item "new" 
        menuItemNew.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                    mainPanel.setVisible(true);
                    panel1.setVisible(false);
                    panel2.setVisible(false);
                    ftClear();
                    ptClear();
            }
        });
        menuFile.add(menuItemNew);
        menuFile.addSeparator();

        //creating "Exit" menu item

        menuItemExit= new JMenuItem("Exit");
        menuFile.add(menuItemExit);

        //adding action listener to exit menu item
        menuItemExit.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae){
                    System.exit(0);
                };
            });

        //creating and adding "about" menu in menu bar
        menuAbout= new JMenu("About");
        menuBar.add(menuAbout);

        //creating a menu  item "app" inside "about" menu
        menuItemApp= new JMenuItem("App");
        menuAbout.add(menuItemApp);
        menuAbout.addSeparator();

        //adding actionListener in "App" menu item
        menuItemApp.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    JOptionPane.showMessageDialog(window, "Version: 1.0.0", "Version", JOptionPane.INFORMATION_MESSAGE);
                };
            });

        //creating menu item "developer" inside the  "about" menu
        menuItemDeveloper= new JMenuItem("Developer");
        menuAbout.add(menuItemDeveloper);
        //adding action listener on menu item,"developer"
        menuItemDeveloper.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    JOptionPane.showMessageDialog(window,  "DevelopedBy: PKR Inc.", "Developer",JOptionPane.INFORMATION_MESSAGE);
                };
            });
    }
    //method for initializing the main panel of the window
    public void iniMainPanel(){
        mainPanel= new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setSize(750,750);
        window.add(mainPanel);

        //setting up the background color for the main panel
        mainPanel.setBackground(Color.RED);

        //creating label for staff hiring system 
        mainLabel= new JLabel("What kind of staff do you want to hire? ");
        mainLabel.setBounds(40,30,375,35);
        mainPanel.add(mainLabel);

        //Creating button for selecting part time or full time staff hiring system
        btnFT= new JButton("Full Time");
        btnFT.setBounds(40,80,90,35);
        btnFT.setLayout(new FlowLayout());
        mainPanel.add(btnFT);
        //adding action listener to the full time staff hiring system
        btnFT.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    panel1();
                    mainPanel.setVisible(false);
                    panel1.setVisible(true);
                }
            });

        btnPT = new JButton("Part Time");
        btnPT.setBounds(140,80,90,35);
        btnPT.setLayout(new FlowLayout());
        mainPanel.add(btnPT);
        //adding action listener to the part time staff hiring system
        btnPT.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    panel2();
                    mainPanel.setVisible(false);
                    panel2.setVisible(true);
                }
            });

        window.add(mainPanel);
        mainPanel.setLayout(null);
        mainPanel.setVisible(true);
    }

    public void panel1(){
        //creating and initializg the panel1 inside main panel
        panel1= new JPanel();
        window.add(panel1);
        panel1.setLayout(null);
        panel1.setBounds(0,0,740,930);
        panel1.setBackground(Color.LIGHT_GRAY);

        //creating back button to return the main panel
        btnFTBack= new JButton("Back");
        btnFTBack.setBounds(460,640,80,30);
        panel1.add(btnFTBack);
        // adding action listener to back button of full time  staff hire's panel;panel1
        btnFTBack.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    panel1.setVisible(false);
                    mainPanel.setVisible(true);
                }
            });
        //label for vaccancy number and  textfield
        labelFtVaccancy= new JLabel("Vaccancy Number: ");
        labelFtVaccancy.setBounds(10,40,220,30);
        panel1.add(labelFtVaccancy);

        //textfield for entry of Vaccnacy number
        textFtVaccancy = new JTextField();
        textFtVaccancy.setBounds(150,40,220,30);
        panel1.add(textFtVaccancy);

        //label for designation
        labelFtDesignation= new JLabel("Designation: ");
        labelFtDesignation.setBounds(10,90,220,30);
        panel1.add(labelFtDesignation);

        //textfield for designation entry
        textFtDesignation= new JTextField();
        textFtDesignation.setBounds(150,90,220,30);
        panel1.add(textFtDesignation);

        //label for job type
        labelFtJobType= new JLabel("Job Type: ");
        labelFtJobType.setBounds(10,140,220,30);
        panel1.add(labelFtJobType);

        //textField for job type
        textFtJobType= new JTextField();
        textFtJobType.setBounds(150,140,220,30);
        panel1.add(textFtJobType);

        //label for salary
        labelFtSalary= new JLabel("Salary");
        labelFtSalary.setBounds(10,190,220,30);
        panel1.add(labelFtSalary);

        //textfield for salary
        textFtSalary= new JTextField();
        textFtSalary.setBounds(150,190,220,30);
        panel1.add(textFtSalary);

        //label for working hour
        labelFtWorkingHour= new JLabel("Working Hour: ");
        labelFtWorkingHour.setBounds(10,240,220,30);
        panel1.add(labelFtWorkingHour);
        //text field for working hour
        textFtWorkingHour= new JTextField();
        textFtWorkingHour.setBounds(150,240,220,30);
        panel1.add(textFtWorkingHour);

        //button for adding full time staff
        btnAddFtStaff= new JButton("Add Vacancy");
        btnAddFtStaff.setBounds(150,290,220,30);
        panel1.add(btnAddFtStaff);
        btnAddFtStaff.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    ftAddVacancy();
                }
            });

        //label for staff name
        labelFtStaffName= new JLabel("Staff Name: ");
        labelFtStaffName.setBounds(10,340,220,30);
        panel1.add(labelFtStaffName);

        //textfield for staff name
        textFtStaffName= new JTextField();
        textFtStaffName.setBounds(150,340,220,30);
        panel1.add(textFtStaffName);

        //label for joining Date
        labelFtJoiningDate= new JLabel("Joining Date");
        labelFtJoiningDate.setBounds(10,390,220,30);
        panel1.add(labelFtJoiningDate);

        //textField for joining date
        textFtJoiningDate= new JTextField();
        textFtJoiningDate.setBounds(150,390,220,30);
        panel1.add(textFtJoiningDate);

        //label for qualification
        labelFtQualification = new JLabel("Qualification: ");
        labelFtQualification.setBounds(10,440,220,30);
        panel1.add(labelFtQualification);

        //text field for qualification
        textFtQualification= new JTextField();
        textFtQualification.setBounds(150,440,220,30);
        panel1.add(textFtQualification);

        //label for appoineted by
        labelFtAppointedBy= new JLabel("Appointed By :");
        labelFtAppointedBy.setBounds(10,490,220,30);
        panel1.add(labelFtAppointedBy);

        //textfield for appointed by
        textFtAppointedBy= new JTextField();
        textFtAppointedBy.setBounds(150,490,220,30);
        panel1.add(textFtAppointedBy);
        /*
        //label for joined status
        labelFtJoined= new JLabel("Joined");
        labelFtJoined.setBounds(10,540,220,30);
        panel1.add(labelFtJoined);

        //radio buttons for joined status
        rbtnFtYes= new JRadioButton("Yes");
        rbtnFtYes.setBounds(150,540,80,25);
        panel1.add(rbtnFtYes);

        rbtnFtNo= new JRadioButton("No");
        rbtnFtNo.setBounds(250,540,80,25);
        panel1.add(rbtnFtNo);

        ftJoined= new ButtonGroup();
        ftJoined.add(rbtnFtYes);
        ftJoined.add(rbtnFtNo);
         */

        //buttton for appointing full time staff
        btnFtAppoint= new JButton("Appoint");
        btnFtAppoint.setBounds(150,590,80,35);
        panel1.add(btnFtAppoint);
        btnFtAppoint.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    ftAppoint();
                }
            });

        //button for displaying full time staff
        btnFtDisplay= new JButton("Display");
        btnFtDisplay.setBounds(350,590,80,35);
        panel1.add(btnFtDisplay);
        btnFtDisplay.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    ftDisplay();
                };
            });

        //btnFtClear for clearing full time staff 
        btnFtClear= new JButton("Clear");
        btnFtClear.setBounds(150,640,80,30);
        panel1.add(btnFtClear);
        btnFtClear.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    ftClear();
                };
            });
        panel1.setVisible(false);
        window.add(panel1);

    }

    public void ftAddVacancy(){
        String ftVacancy = textFtVaccancy.getText();
        String ftDesignation= textFtDesignation.getText();
        String ftJobType= textFtJobType.getText();
        String ftSalary= textFtSalary.getText();
        String ftWorkHr=  textFtWorkingHour.getText();
        int vacancy, salary, workingHr;

        if(ftVacancy.trim().equals("") || ftDesignation.trim().equals("") || ftJobType.trim().equals("") || ftSalary.trim().equals("") || ftWorkHr.trim().equals("")){
            JOptionPane.showMessageDialog(window,"Please fill all the forms","Error" ,0);
        }
        else{
            try{
                vacancy= Integer.parseInt(ftVacancy);
                salary= Integer.parseInt(ftSalary);
                workingHr= Integer.parseInt(ftWorkHr);
            }catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(window,"Please enter data in correct format" ,"Error", 0);
                return;
            }
            for(StaffHire sh : list){
                if (sh instanceof FullTimeStaffHire){
                    FullTimeStaffHire ft= (FullTimeStaffHire)sh;
                    if(ft.getVacancyNumber()==vacancy){
                        JOptionPane.showMessageDialog(window,"Vacancy Number already added", "Error" ,0);
                        return;
                    }
                }
            }
            FullTimeStaffHire ftList= new FullTimeStaffHire(vacancy,ftDesignation,ftJobType,salary,workingHr);
            list.add(ftList);
            JOptionPane.showMessageDialog(window,"Full time staff added Sucessfully","Information",1);
        }
    }

    public void ftAppoint(){
        String ftVacancy= textFtVaccancy.getText();
        String ftStaffName= textFtStaffName.getText();
        String ftJoiningDate= textFtJoiningDate.getText();
        String ftQualification= textFtQualification.getText();
        String ftAppoint = textFtAppointedBy.getText();
        int vacancy;
        if(ftVacancy.trim().equals("") || ftStaffName.trim().equals("") || ftJoiningDate.trim().equals("") || ftQualification.trim().equals("")|| 
        ftAppoint.trim().equals("")){
            JOptionPane.showMessageDialog(window,"Please fill all the forms","Error",0);
        }
        else{
            try{
                vacancy=Integer.parseInt(ftVacancy);
            }catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(window,"Please enter data in correct format", "Error",0);
                return;
            }
            boolean join= false;
            for(int i =0;i<list.size();++i){
                StaffHire sh= list.get(i);
                if(sh instanceof FullTimeStaffHire){
                    FullTimeStaffHire ft= (FullTimeStaffHire)sh;
                    if(ft.getVacancyNumber()== vacancy){
                        join= true;
                        if(ft.getJoined()== true){
                            JOptionPane.showMessageDialog(window,"The staff is already appointed","Error",0);
                        }
                        else{
                            ft.hireFullTimeStaff(ftStaffName,ftJoiningDate,ftQualification,ftAppoint);
                            JOptionPane.showMessageDialog(window,"Staff hired sucessfully","Staff Hired",1);
                            break;
                        }
                    }
                }
            }if(join== false){
                JOptionPane.showMessageDialog(window,"Vacancy is not added yet.Please enter the vacacny", "Error",0);
            }
        }
    }

    public void ftDisplay(){
        boolean join = false;
        for(StaffHire sh: list){
            if(sh instanceof FullTimeStaffHire){
                FullTimeStaffHire ft= (FullTimeStaffHire)sh;
                join= true;
                ft.disply();
            }
        }
        if(join == false){
            JOptionPane.showMessageDialog(window,"Vacancy is not added yet","Error",0);
        }
    }

    public void ftClear(){
        int x= JOptionPane.showConfirmDialog(window,"Do you want to clear all the information of Full Time Staff","Info",JOptionPane.YES_NO_OPTION);
        if(x==JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(window,"Cleared","Info",(1));
            textFtVaccancy.setText(null);
            textFtDesignation.setText(null);
            textFtJobType.setText(null);
            textFtSalary.setText(null);
            textFtWorkingHour.setText(null);
            textFtStaffName.setText(null);
            textFtJoiningDate.setText(null);
            textFtQualification.setText(null);
            textFtAppointedBy.setText(null);

        }
    }

    public void panel2(){
        panel2= new JPanel();
        window.add(panel2);
        panel2.setLayout(null);
        panel2.setBounds(0,0,740,930);
        panel2.setBackground(Color.GREEN);

        btnPTBack = new JButton("Back");
        btnPTBack.setBounds(459,640,100,50);
        panel2.add(btnPTBack);
        btnPTBack.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    panel2.setVisible(false);
                    mainPanel.setVisible(true);
                }
            });

        //label's for part time staff hiring system. 
        labelPtVaccancy= new JLabel("Vaccancy Number: ");
        labelPtVaccancy.setBounds(10,40,220,30);
        panel2.add(labelPtVaccancy);

        //textfield for vaccancy number

        textPtVaccancy  = new JTextField();
        textPtVaccancy.setBounds(150,40,220,30);
        panel2.add(textPtVaccancy);

        labelPtDesignation= new JLabel("Designation: ");
        labelPtDesignation.setBounds(10,90,220,30);
        panel2.add(labelPtDesignation);

        textPtDesignation = new JTextField();
        textPtDesignation.setBounds(150,90,220,30);
        panel2.add(textPtDesignation);

        labelPtJobType= new JLabel("JobType: ");
        labelPtJobType.setBounds(10,140,220,30);
        panel2.add(labelPtJobType);

        textPtJobType= new JTextField();
        textPtJobType.setBounds(150,140,220,30);
        panel2.add(textPtJobType);

        labelPtWorkingHr = new JLabel("Working Hour: ");
        labelPtWorkingHr.setBounds(10,190,220,30);
        panel2.add(labelPtWorkingHr);

        textPtWorkingHr= new JTextField();
        textPtWorkingHr.setBounds(150,190,220,30);
        panel2.add(textPtWorkingHr);

        labelPtWagesPerHr= new JLabel("Wages Per Hour: ");
        labelPtWagesPerHr.setBounds(10,240,220,30);
        panel2.add(labelPtWagesPerHr);

        textPtWagesPerHr= new JTextField();
        textPtWagesPerHr.setBounds(150,240,220,30);
        panel2.add(textPtWagesPerHr);

        labelPtShifts= new JLabel("Shifts: ");
        labelPtShifts.setBounds(10,290,220,30);
        panel2.add(labelPtShifts);

        textPtShifts= new JTextField();
        textPtShifts.setBounds(150,290,220,30);
        panel2.add(textPtShifts);

        btnPtAddStaff= new JButton("Add Vacancy");
        btnPtAddStaff.setBounds(150,340,120,30);
        panel2.add(btnPtAddStaff);
        btnPtAddStaff.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    ptAddVacancy();

                }
            });

        labelPtStaffName = new JLabel("Staff Name: ");
        labelPtStaffName.setBounds(10,390,220,30);
        panel2.add(labelPtStaffName);

        textPtStaffName= new JTextField();
        textPtStaffName.setBounds(150,390,220,30);
        panel2.add(textPtStaffName);

        labelPtJoiningDate= new JLabel("Joining Date: ");
        labelPtJoiningDate.setBounds(10,440,220,30);
        panel2.add(labelPtJoiningDate);

        textPtJoiningDate= new JTextField();
        textPtJoiningDate.setBounds(150,440,220,30);
        panel2.add(textPtJoiningDate);

        labelPtQualification= new JLabel("Qualification: ");
        labelPtQualification.setBounds(10,490,220,30);
        panel2.add(labelPtQualification);

        textPtQualification= new JTextField();
        textPtQualification.setBounds(150,490,220,30);
        panel2.add(textPtQualification);

        labelPtAppointedBy= new JLabel("Appointed By: ");
        labelPtAppointedBy.setBounds(10,540,220,30);
        panel2.add(labelPtAppointedBy);

        textPtAppointedBy= new JTextField();
        textPtAppointedBy.setBounds(150,540,220,30);
        panel2.add(textPtAppointedBy);

        btnPtAppoint= new JButton("Appoint");
        btnPtAppoint.setBounds(150,590,120,30);
        panel2.add(btnPtAppoint);
        btnPtAppoint.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    ptAppoint();
                }
            });

        btnPtTerminate= new JButton("Terminate");
        btnPtTerminate.setBounds(300,590,120,30);
        panel2.add(btnPtTerminate);
        btnPtTerminate.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    ptTerminate();
                }
            });

        btnPtDisplay= new JButton("Display");
        btnPtDisplay.setBounds(150,640,120,30);
        panel2.add(btnPtDisplay);
        btnPtDisplay.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    ptDisplay();

                }
            });

        btnPtClear= new JButton("Clear");
        btnPtClear.setBounds(90,675,120,30);
        panel2.add(btnPtClear);
        btnPtClear.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    ptClear();
                }
            });
    }

    public void ptAddVacancy(){
        int ptVn,ptWorkHr,ptWageHr;
        String ptVacancy= textPtVaccancy.getText();
        String ptDesignation = textPtDesignation.getText();
        String ptJobType= textPtJobType.getText();
        String ptWorkingHr= textPtWorkingHr.getText();
        String ptWagesPerHr= textPtWagesPerHr.getText();
        String ptShifts= textPtShifts.getText();
        if(ptVacancy.trim().equals("")|| ptDesignation.trim().equals("")|| ptJobType.trim().equals("") || ptWorkingHr.trim().equals("") ||
        ptWagesPerHr.trim().equals("") || ptShifts.trim().equals("")){
            JOptionPane.showMessageDialog(window,"Please fill all the forms",  "Error",JOptionPane.ERROR_MESSAGE);
        }else{
            try{
                ptVn=Integer.parseInt(ptVacancy);
                ptWorkHr= Integer.parseInt(ptWorkingHr);
                ptWageHr= Integer.parseInt(ptWagesPerHr);
            }catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(window,"Please enter data in correct format", "Error Message",JOptionPane.ERROR_MESSAGE);
                return;
            }
            for(StaffHire sh: list){
                if (sh instanceof PartTimeStaffHire){
                    PartTimeStaffHire pt= (PartTimeStaffHire)sh;
                    if(pt.getVacancyNumber()== ptVn){
                        JOptionPane.showMessageDialog(window,"Vacancy Number already added", "Error",0);
                        return;
                    }
                }
            }
            PartTimeStaffHire ptList = new PartTimeStaffHire(ptVn,ptDesignation,ptJobType,ptWorkHr,ptWageHr,ptShifts);
            list.add(ptList);
            JOptionPane.showMessageDialog(window,"Part Time Staff is added Sucessfully", "Information Message",1);
        }

    }

    public void ptAppoint(){
        int ptVn;
        String ptVacancy= textPtVaccancy.getText();
        String ptStaffName = textPtStaffName.getText();
        String ptJoiningDate= textPtJoiningDate.getText();
        String ptQualification= textPtQualification.getText();
        String ptAppointedBy= textPtAppointedBy.getText();

        if(ptVacancy.trim().equals("")|| ptStaffName.trim().equals("")|| ptJoiningDate.trim().equals("") || 
        ptQualification.trim().equals("") ||ptAppointedBy.trim().equals("")){
            JOptionPane.showMessageDialog(window,"Please fill all the forms",  "Error",JOptionPane.ERROR_MESSAGE);
        }else{
            try{
                ptVn=Integer.parseInt(ptVacancy);
            }catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(window,"Vacancy Number already exist", "Error Message",JOptionPane.ERROR_MESSAGE);
                return;
            }
            boolean join= false;
            for (int i=0; i< list.size(); ++i){
                StaffHire sh= list.get(i);
                if(sh instanceof PartTimeStaffHire){
                    PartTimeStaffHire pt= (PartTimeStaffHire) sh;
                    if (pt.getVacancyNumber()== ptVn){
                        join= true;
                        if (pt.getJoined()== true){
                            JOptionPane.showMessageDialog(window, "The staff is already appointed","Error",JOptionPane.ERROR_MESSAGE);
                        }else{
                            pt.hirePartTimeStaff(ptStaffName,ptJoiningDate,ptQualification,ptAppointedBy);
                            JOptionPane.showMessageDialog(window, "Staff appointed sucessfully", "Staff appointed",1);
                            break;
                        }
                    }

                }

            }
            if(join == false){
                JOptionPane.showMessageDialog(window," Vacancy is not added, add the vacancy first" ,"Error",0);
            }
        } 
    }

    public void ptTerminate(){
        int ptVn;
        String ptVacancy = JOptionPane.showInputDialog(window,"Enter vacancy number","Terminate",3);
        try{
            if(ptVacancy.trim().equals("")){
                JOptionPane.showMessageDialog(window,"Please Enter Vacancy Number","Terminate",3);
                return;
            }
        }
        catch(NullPointerException npe){
            return;
        }

        try{
            ptVn=Integer.parseInt(ptVacancy);
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(window,"Please enter appropriate number","Error",0);
            return;
        }
        boolean join= false;
        for(StaffHire sh: list){
            if(sh instanceof PartTimeStaffHire){
                PartTimeStaffHire pt = (PartTimeStaffHire)sh;
                if(sh.getVacancyNumber()==ptVn){
                    join= true;
                    pt.terminateStaff();
                    list.remove(sh);
                    JOptionPane.showMessageDialog(window,"Staff terminate sucessfully","Terminated",1);
                    break;
                }
            }
        }
        if(join==false){
            JOptionPane.showMessageDialog(window,"Vacancy Number not found","Error",0);
        }

    }

    public void ptDisplay(){
        boolean joined = false;
        for(StaffHire sh: list){
            if(sh instanceof PartTimeStaffHire){
                PartTimeStaffHire pt= (PartTimeStaffHire) sh;
                joined= true;
                pt.display();
            }
        }
        if(joined== false){
            JOptionPane.showMessageDialog(window,"Vacancy Number is not added yet","Error",0);
        }
    }

    public void ptClear(){
        int x = JOptionPane.showConfirmDialog(window, "Do you want to clear the informations of Part Time Staff", "info", JOptionPane.YES_NO_OPTION);
        if (x == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(window, "Cleared", "info", (1));
            textPtVaccancy.setText(null);
            textPtDesignation.setText(null);
            textPtJobType.setText(null);
            textPtWorkingHr.setText(null);
            textPtWagesPerHr.setText(null);
            textPtShifts.setText(null);
            textPtStaffName.setText(null);
            textPtJoiningDate.setText(null);
            textPtQualification.setText(null);
            textPtAppointedBy.setText(null);
        }
    }

    public static void main(String [] args){
        new INGNepal().window.setVisible(true);
    }
}