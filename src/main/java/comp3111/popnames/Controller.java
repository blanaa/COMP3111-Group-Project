/**
 * Building on the sample skeleton for 'ui.fxml' Controller Class generated by SceneBuilder 
 */
package comp3111.popnames;

import java.util.Vector;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.RadioButton;

public class Controller {

    @FXML
    private Tab tabTaskZero;

    @FXML
    private TextField textfieldNameF;

    @FXML
    private TextField textfieldYear;

    @FXML
    private Button buttonRankM;

    @FXML
    private TextField textfieldNameM;

    @FXML
    private Button buttonRankF;

    @FXML
    private Button buttonTopM;

    @FXML
    private Button buttonTopF;

    @FXML
    private Button buttonSummary;

    @FXML
    private Tab tabReport1;

    @FXML
    private TextField task1TopNum;
    
    @FXML
    private RadioButton task1male;
    
    @FXML
    private RadioButton task1female;
    
    @FXML
    private TextArea task1report;
    
    @FXML
    private TextField task1y1;
    
    @FXML
    private TextField task1y2;
    
    @FXML
    private Button buttonTask1;
    
    @FXML
    private ToggleGroup T1;

    @FXML
    private Tab tabReport2;

    @FXML
    private TextArea task2report;

    @FXML
    private TextField task2name;

    @FXML
    private RadioButton task2male;

    @FXML
    private ToggleGroup T11;

    @FXML
    private RadioButton task2female;

    @FXML
    private TextField task2y2;

    @FXML
    private TextField task2y1;

    @FXML
    private Button buttomTask2;

    @FXML
    private Tab tabReport3;

    @FXML
    private ToggleGroup T111;

    @FXML
    private Tab tabApp1;
    
    @FXML
    private TextArea App1Report;
    
    @FXML
    private TextField task4DadName;
    
    @FXML
    private TextField task4MomName;
    
    @FXML
    private TextField task4DadYOB;
    
    @FXML
    private TextField task4MomYOB;
    
    @FXML
    private TextField task4VintageYear;
    
    @FXML
    private Button buttonTask4;

    @FXML
    private Tab tabApp2;

    @FXML
    private TextArea task5result;

    @FXML
    private TextField task5Name;

    @FXML
    private TextField task5Year;

    @FXML
    private RadioButton task5male;

    @FXML
    private ToggleGroup T51;

    @FXML
    private RadioButton task5female;

    @FXML
    private RadioButton task5matemale;

    @FXML
    private ToggleGroup T52;

    @FXML
    private RadioButton task5matefemale;

    @FXML
    private RadioButton task5younger;

    @FXML
    private ToggleGroup T53;

    @FXML
    private RadioButton task5older;

    @FXML
    private Button buttontask5;

    @FXML
    private Tab tabApp3;

    @FXML
    private TextArea textAreaConsole;

    
    
    // Task 3
    
    @FXML
    private TextArea task3_textSummary;
    
    @FXML
    private RadioButton task3_buttonMale;
    
    @FXML 
    private RadioButton task3_buttonFemale;
    
    @FXML
    private ToggleGroup T5;
    
    @FXML
    private TextField task3_textN;
    
    @FXML
    private TextField task3_textYear1;
    
    @FXML
    private TextField task3_textYear2;
    
    @FXML
    private Button task3_buttonReport;
    
    
    
    // Task 6
    
    @FXML
    private TextField task6_textMyName;
    
    @FXML
    private RadioButton task6_buttonMale1;
    
    @FXML
    private RadioButton task6_buttonFemale1;
    
    @FXML
    private ToggleGroup T2;
    
    @FXML
    private TextField task6_textBirthYear;
    
    @FXML
    private TextField task6_textMateName;
    
    @FXML
    private RadioButton task6_buttonMale2;
    
    @FXML
    private RadioButton task6_buttonFemale2;
    
    @FXML
    private ToggleGroup T3;
    
    @FXML
    private RadioButton task6_buttonYounger;
    
    @FXML
    private RadioButton task6_buttonOlder;
    
    @FXML
    private ToggleGroup T4;
    
    @FXML
    private Button task6_buttonScore;
    
    
    /**
     *  Task Zero
     *  To be triggered by the "Summary" button on the Task Zero Tab 
     *  
     */
    @FXML
    void doSummary() {
    	int year = Integer.parseInt(textfieldYear.getText());
    	String oReport = AnalyzeNames.getSummary(year);
    	textAreaConsole.setText(oReport);
    }

  
    /**
     *  Task Zero
     *  To be triggered by the "Rank (female)" button on the Task Zero Tab
     *  
     */
    @FXML
    void doRankF() {
    	String oReport = "";
    	String iNameF = textfieldNameF.getText();
    	int iYear = Integer.parseInt(textfieldYear.getText());
    	int oRank = AnalyzeNames.getRank(iYear, iNameF, "F");
    	if (oRank == -1)
    		oReport = String.format("The name %s (female) has not been ranked in the year %d.\n", iNameF, iYear);
    	else
    		oReport = String.format("Rank of %s (female) in year %d is #%d.\n", iNameF, iYear, oRank);
    	textAreaConsole.setText(oReport);
    }
 
    /**
     *  Task Zero
     *  To be triggered by the "Rank (male)" button on the Task Zero Tab
     *  
     */
    @FXML
    void doRankM() {
    	String oReport = "";
    	String iNameM = textfieldNameM.getText();
    	int iYear = Integer.parseInt(textfieldYear.getText());
    	int oRank = AnalyzeNames.getRank(iYear, iNameM, "M");
    	if (oRank == -1)
    		oReport = String.format("The name %s (male) has not been ranked in the year %d.\n", iNameM, iYear);
    	else
    		oReport = String.format("Rank of %s (male) in year %d is #%d.\n", iNameM, iYear, oRank);
    	textAreaConsole.setText(oReport);
    }


    /**
     *  Task Zero
     *  To be triggered by the "Top 5 (female)" button on the Task Zero Tab
     *  
     */
    @FXML
    void doTopF() {
    	String oReport = "";
    	final int topN = 5;
    	int iYear = Integer.parseInt(textfieldYear.getText());
    	oReport = String.format("Top %d most popular names (female) in the year %d:\n", topN, iYear);
    	for (int i=1; i<=topN; i++)
    		oReport += String.format("#%d: %s\n", i, AnalyzeNames.getName(iYear, i, "F"));
    	textAreaConsole.setText(oReport);
    }


    /**
     *  Task Zero
     *  To be triggered by the "Top 5 (male)" button on the Task Zero Tab
     *  
     */
    @FXML
    void doTopM() {
    	System.out.println("kk");
    	String oReport = "";
    	final int topN = 5;
    	int iYear = Integer.parseInt(textfieldYear.getText());
    	oReport = String.format("Top %d most popular names (male) in the year %d:\n", topN, iYear);
    	for (int i=1; i<=topN; i++)
    		oReport += String.format("#%d: %s\n", i, AnalyzeNames.getName(iYear, i, "M"));
    	textAreaConsole.setText(oReport);
    }
    
    /**
     *Task One
     *To be triggered by the "Report" button on the Reporting1 Tab
     *@description This function will get all the parameters from the UI and use them to finish the report.
     *It will detect some of the illegal inputs here and will then return a different report for the
     *user. Others detection of illegal inputs @see TopNamesForBirth.java.
     *@author Yao ZHANG
     *@return no return
    */
    @FXML
    void getReport1() {
    	String Report = "";
    	try {
    	      Integer.parseInt(task1y1.getText());
    	      Integer.parseInt(task1y2.getText());
    	      Integer.parseInt(task1TopNum.getText());
    	  } catch (NumberFormatException e) {
    	   textAreaConsole.setText("Please provide legal number!");
    	   return;
    	  }
    	if(task1y1.getText().equals("") || task1y2.getText().equals("") ||task1TopNum.getText().equals("")) {
    		Report += "Something is missed and please ensure you have finished your input!";
    		textAreaConsole.setText(Report);
    		return;
    	}
    	else if(task1y1.getText().matches(".*\\s.*")|| task1y2.getText().matches(".*\\s.*") ||task1TopNum.getText().matches(".*\\s.*")) {
    		Report += "There should not be any spaces in your input and please ensure you have typed correctly!";
    		textAreaConsole.setText(Report);
    		return;
    	}
 
    	int year1=Integer.parseInt(task1y1.getText());
    	int year2=Integer.parseInt(task1y2.getText());
    	int num=Integer.parseInt(task1TopNum.getText());
    	
    	String gender="";
    	if(task1male.isSelected()){
    		gender="M";
    	}
    	else{
    		gender="F";
    	}
    	//String Report = String.format("no year %d %d",year1,year2);
    	Report=TopNamesForBirth.getReport1(year1, year2, num, gender);
    	textAreaConsole.setText(Report);
    	return;
    }
    
    /**
     *Task Two
     *To be triggered by the "Report" button on the Reporting 2 Tab
     *@description This function will get all the parameters from the UI and use them to finish the report.
     *It will detect some of the illegal inputs here and will then return a different report for the
     *user. Others detection of illegal inputs @see PopularityofName.java.
     *@author Lan Bo
     *@return the report itself
    */
    @FXML
    void getReport2() {
    	if(task2y1.getText().equals("") || task2y2.getText().equals(""))
    	{
    		textAreaConsole.setText("Please provide time peroid");
    		return;
    	}
    	try {
    		Integer.parseInt(task2y1.getText());
    		Integer.parseInt(task2y2.getText());
		} catch (NumberFormatException e) {
			textAreaConsole.setText("Please provide legal time input");
			return;
		}
    	int year1=Integer.parseInt(task2y1.getText());
    	int year2=Integer.parseInt(task2y2.getText());
    	String name=task2name.getText();
    	String gender="";
    	if(task2male.isSelected())
    	{
    		gender="M";
    	}
    	else {
    		gender="F";
    	}
    	String Report=PopularityofName.getReport(year1, year2, name, gender);
    	//String Report="";
    	//Report+=String.format("%d %d %s %s", year1, year2, name, gender);
    	textAreaConsole.setText(Report);
    }
    /**
     *  Task 3
     *  To be triggered by the "Report" button on the Reporting 3 Tab
     *  @description This function will get all parameters from the UI and use them to finish the report.
     *  If any of the inputs are incorrect or invalid, it will return a different report for the users.
     *  For other illegal input detections, @see NameTrend.java.
     *  @author Yih CHENG
     *  @return no return needed
     */
    @FXML
    void task3_getReport() {
     String report = "", brief = "";
     try {
      Integer.parseInt(task3_textYear1.getText());
     } catch (NumberFormatException e) {
      textAreaConsole.setText("The input is incorrect. Please enter a valid input!");
      return;
     }
     try { 
      Integer.parseInt(task3_textYear2.getText());
     } catch (NumberFormatException e) {
      textAreaConsole.setText("The input is incorrect. Please enter a valid input!");
      return;
     }
     try { 
      Integer.parseInt(task3_textN.getText());
     } catch (NumberFormatException e) {
      textAreaConsole.setText("The input N is incorrect. Please enter a valid input!");
      return;
     }
     int year1=Integer.parseInt(task3_textYear1.getText());
     int year2=Integer.parseInt(task3_textYear2.getText());
     int N=Integer.parseInt(task3_textN.getText());

     
     String gender="";
     if(task3_buttonMale.isSelected()){
      gender="M";
     }
     else{
      gender="F";
     }
     Vector<String> nameList = NameTrend.getNameList(year1, year2, gender, N);
     if (nameList.size() == 1) {
    	 report += nameList.get(0);
    	 brief += "";
         textAreaConsole.setText(report);
         task3_textSummary.setText(brief);
         return;
     }
     int[][] allRanks = NameTrend.getAllRanks(year1, year2, gender, nameList);
     int[][] lowhighranks = NameTrend.getHighestRanks(year1, allRanks, N);
     String[] trend = NameTrend.grossTrend(lowhighranks);
     
     brief = String.format("%d names are found to be maintained at a high level of popularity within Top %d over the period from year %d to year %d.", 
       nameList.size(), N, year1, year2);
     
     report += "Name   Lowest Rank[in year]   Highest Rank[in year]   Gross Trend";
     report += "\n";
     for (int i=0; i < nameList.size(); i++) {
      report += String.format("%s                  %d  [ %d ]                  %d  [ %d ]                 %s", nameList.get(i), lowhighranks[i][0], lowhighranks[i][1], 
        lowhighranks[i][2], lowhighranks[i][3], trend[i]);
         report += "\n";
     }

     task3_textSummary.setText(brief);
     textAreaConsole.setText(report);
    }
    
    
    /**
     *Task Four
     *To be triggered by the "Recommed" button on the Application1 Tab
     *@Description This function will get all the parameters from the UI and use them to finish the Recmonmendation.
     *It will detect some of the illegal inputs here and will then return a different report for the
     *user. Other detection please @see NameRecommendation.java.
     *@author Yao ZHANG
     *@return the report itself
    */
    @FXML
    void getNameRecommendation() {
    	if(task4VintageYear.getText().equals("")) {
    		task4VintageYear.setText("2019");
    	}
    	try {
    	      Integer.parseInt(task4DadYOB.getText());
    	      Integer.parseInt(task4MomYOB.getText());
    	      Integer.parseInt(task4VintageYear.getText());
    	  } catch (NumberFormatException e) {
    	   textAreaConsole.setText("Please provide legal number input and no spaces inside numbers is allowed!");
    	   return;
    	  }
    	String Report = "";
    	if(task4DadName.getText().equals("") || task4MomName.getText().equals("") ||task4DadYOB.getText().equals("") || task4MomYOB.getText().equals("")) {
    		Report += "Something is missed and please ensure you have finished your input!";
    		textAreaConsole.setText(Report);
    		return; //empty input situation.
    	}
    	else if(task4DadName.getText().matches(".*\\s.*") || task4MomName.getText().matches(".*\\s.*")) {
    		Report += "You should not type any white space in the names and please ensure you have finished your input!";
    		textAreaConsole.setText(Report);
    		return; //empty input situation.
    	}
    	int Dadyear = Integer.parseInt(task4DadYOB.getText());
    	int Momyear = Integer.parseInt(task4MomYOB.getText());
    	String Dadname = task4DadName.getText();
    	String Momname = task4MomName.getText();
    	int VinYear;
    	VinYear = Integer.parseInt(task4VintageYear.getText());
    	Report = NameRecommendation.getBabyName(Dadyear, Momyear, Dadname,Momname, VinYear);
    	textAreaConsole.setText(Report);
    }
    
    /**
     *Task Five
     *To be triggered by the "Predict" button on the Application 2 Tab
     *@Description This function will get all the parameters from the UI and use them to finish the Prediction.
     *It will detect some of the illegal inputs here and will then return a different report for the
     *user. Other detection please @see PredictPairs.java.
     *@author Lan Bo
     *@return the predicted mate's name
    */ 
    @FXML
    void predictmateName() {
    	if(task5Year.getText().equals(""))
    	{
    		textAreaConsole.setText("Please provide your year of birth");
    		return;
    	}
    	try {
    		Integer.parseInt(task5Year.getText());
		} catch (NumberFormatException e) {
			textAreaConsole.setText("Please provide legal time input");
			return;
		}
    	int year=Integer.parseInt(task5Year.getText());
    	String name=task5Name.getText();
    	String gender="";
    	String mategender="";
    	String preference="";
    	if(task5male.isSelected()) {
    		gender="M";
    	}
    	else {
    		gender="F";
    	}
    	if(task5matemale.isSelected()) {
    		mategender="M";
    	}
    	else {
    		mategender="F";
    	}
    	if(task5younger.isSelected()) {
    		preference="Y";
    	}
    	else {
    		preference="O";
    	}
    	String matename=PredictPairs.getpairname(year,name,gender,mategender,preference);
    	textAreaConsole.setText(matename);
    }
    
    /**
     *  Task 6
     *  To be triggered by the "Report" button on the Reporting 6 Tab
     *  @description This function will get all parameters from the UI and use them to finish the report.
     *  If any of the inputs are incorrect or invalid, it will return a different report for the users.
     *  For other illegal input detections, @see PredictScore.java.
     *  @author Yih CHENG
     *  @return no return needed
     */
    @FXML
    void task6_getScore() {
    	String report = "";
    	
    	String iName = task6_textMyName.getText();
    	String iGender = "";
    	if(task6_buttonMale1.isSelected()){
    		iGender = "M";
    	}
    	else {
    		iGender = "F";
    	}
    	try {
    		Integer.parseInt(task6_textBirthYear.getText());
    	} catch (NumberFormatException e) {
    		textAreaConsole.setText("The input is incorrect. Please enter a valid input!");
    		return;
    	}
    	int iYOB = Integer.parseInt(task6_textBirthYear.getText());
    	String iNameMate = task6_textMateName.getText();
    	String iGenderMate = "";
    	if(task6_buttonMale2.isSelected()){
    		iGenderMate = "M";
    	}
    	else {
    		iGenderMate = "F";
    	}
    	String iPreference = "";
    	if(task6_buttonYounger.isSelected()){
    		iPreference = "younger";
    	}
    	else {
    		iPreference = "older";
    	}
    	
    	int oRank = PredictScores.get_oRank(iYOB, iName, iGender);
    	if (oRank == -1) {
    		String gender = "";
    		if (iGender=="M") {
    			gender = "males";
    		}
    		else if (iGender=="F") {
    			gender = "females";
    		}
    		report += String.format("Your name, %s, is not found in the %s born in %d. Please re-enter your informations.", iName, gender, iYOB);
    		textAreaConsole.setText(report);
    		return;
    	}
    	else if (oRank == -2) {
    		report += String.format("Wrong input! Please make sure year of birth is in range 1880 to 2019!");
    		textAreaConsole.setText(report);
    		return;
    	}
    	int oYOB = PredictScores.get_oYOB(iYOB, iPreference);
    	if (oYOB < 1880 || oYOB > 2019) {
    		report += String.format("Sorry, we do not have the data of people born in %d. Please re-enter your preference or year of birth.", oYOB);
    		textAreaConsole.setText(report);
    		return;
    	}
    	int oRankMate = PredictScores.get_oRankMate(oYOB, iNameMate, iGenderMate);
    	if (oRankMate == -1) {
    		String gender2 = "";
    		if (iGenderMate=="M") {
    			gender2 = "male";
    		}
    		else if (iGenderMate=="F") {
    			gender2 = "female";
    		}
    		report += String.format("There is no %s with name %s that suits your preference of %s mates. Please re-enter your mate's informations.", gender2, iNameMate, iPreference);
    		textAreaConsole.setText(report);
    		return;
    	}
    	String oScore = PredictScores.get_oScore(oRank, oRankMate, iYOB, oYOB, iGender, iGenderMate);
    	
    	report += String.format("The compatibility of you, %s, and your mate, %s, is %s%%.", iName, iNameMate, oScore);
    	
    	textAreaConsole.setText(report);
    }
}

