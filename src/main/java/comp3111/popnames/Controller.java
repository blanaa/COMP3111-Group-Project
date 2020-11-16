/**
 * Building on the sample skeleton for 'ui.fxml' COntroller Class generated by SceneBuilder 
 */
package comp3111.popnames;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

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
    private Tab tabApp3;

    @FXML
    private TextArea textAreaConsole;
    

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
     *
    */
    @FXML
    void getReport1() {
    	String Report;
    	if(task1y1.getText().equals("") || task1y2.getText().equals("") ||task1TopNum.getText().equals("")) {
    		Report = "Something is missed and please ensure you have finished your input!";
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
     *
    */
    @FXML
    void getReport2() {
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
     *Task Two
     *
    */
    @FXML
    void getNameRecommendation() {
    
    }
}
	