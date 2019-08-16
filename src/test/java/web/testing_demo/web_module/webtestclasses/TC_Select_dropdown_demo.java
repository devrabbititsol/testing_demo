package web.testing_demo.web_module.webtestclasses;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.configurations.Constants;
import com.configurations.ExtentConfigurations;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import web.testing_demo.web_module.webpageclasses.Select_demo_screen;
import web.testing_demo.web_module.webpageclasses.Select_screen;
import com.utilities.BaseClass;
import com.utilities.ConfigFilesUtility;
import com.utilities.Utilities;
import org.json.JSONObject;

@SuppressWarnings("unused")
public class TC_Select_dropdown_demo extends BaseClass {
	ExtentReports reports;
	ExtentTest test;
	ITestResult result;
	private Logger logger;
	private ConfigFilesUtility configFileObj;
	private String browserName = "chrome";
	public boolean isElementDispalyed = false;
	public static final int datasetsLength = 1;

	public TC_Select_dropdown_demo() throws Exception {
		PropertyConfigurator.configure("log4j.properties");
		logger = Logger.getLogger(TC_Select_dropdown_demo.class);
		configFileObj = new ConfigFilesUtility();
		configFileObj.loadPropertyFile("tc_select_dropdown_demo.properties");
	}

	@BeforeTest
	@Parameters("browser")
	public void browserName(String browser) throws Exception {
		browserName = browser;
		reports = ExtentConfigurations.getExtentInstance(reportsPath, projectPath, Select_demo_screen.projectName);
		test = reports.startTest(setTestcaseName(browserName, "TC_Select_dropdown_demo"));
	}

	
	public void setUP() throws Exception {
		String primaryInfo = Select_demo_screen.primaryInfo;
		Constants.PRIMARY_INFO = primaryInfo;
		driver = launchBrowser(browserName, configFileObj);
		printSuccessLogAndReport(test, logger, "Browser Name : " + browserName);
	}

	public void Select_demo_screenTest(int i) throws Exception {

	 try{
		Constants.TOTAL_TC = Constants.TOTAL_TC + 1;
		Constants.IS_TESTCASE = true; Constants.iS_WEB = true;
		int datasetScreencount = 1;
		Select_demo_screen objSelect_demo_screen = PageFactory.initElements(driver, Select_demo_screen.class);
		testLogHeader(test, "Verify Select_demo_screen page");
		String text1 = objSelect_demo_screen.clkaInputForms_398154();
		if(text1.equalsIgnoreCase(configFileObj.getProperty("InputForms"+ i + datasetScreencount))){
			printSuccessLogAndReport(test, logger,  "Clicked on : " + configFileObj.getProperty("InputForms"+ i + datasetScreencount));
			printSuccessLogAndReport(test, logger,  "Validated Link Text : " + configFileObj.getProperty("InputForms"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(test, logger,  "Link Text is not displayed  : " + configFileObj.getProperty("InputForms"+ i + datasetScreencount));
		}
		String text2 = objSelect_demo_screen.clkaSelectDropdownList_398094();
		if(text2.equalsIgnoreCase(configFileObj.getProperty("SelectDropdownList"+ i + datasetScreencount))){
			printSuccessLogAndReport(test, logger,  "Clicked on : " + configFileObj.getProperty("SelectDropdownList"+ i + datasetScreencount));
			printSuccessLogAndReport(test, logger,  "Validated Link Text : " + configFileObj.getProperty("SelectDropdownList"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(test, logger,  "Link Text is not displayed  : " + configFileObj.getProperty("SelectDropdownList"+ i + datasetScreencount));
		}

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  printFailureLogAndReport(test, logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}
	

	public void Select_screenTest(int i) throws Exception {

	 try{
		Constants.TOTAL_TC = Constants.TOTAL_TC + 1;
		Constants.IS_TESTCASE = true; Constants.iS_WEB = true;
		int datasetScreencount = 2;
		Select_screen objSelect_screen = PageFactory.initElements(driver, Select_screen.class);
		testLogHeader(test, "Verify Select_screen page");
		objSelect_screen.clkselectSelectADayselectOne1_398640();
		printInfoLogAndReport(test, logger, "Clicked on SelectADayselectOne dropdown and selected Thursday");
			String text2 = objSelect_screen.clkbuttonFirstSelected_398696();
		if(text2.equalsIgnoreCase(configFileObj.getProperty("FirstSelected"+ i + datasetScreencount))){
			printSuccessLogAndReport(test, logger,  "Clicked on Button : " + configFileObj.getProperty("FirstSelected"+ i + datasetScreencount));
			printSuccessLogAndReport(test, logger,  "Validated Button Text : " + configFileObj.getProperty("FirstSelected"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(test, logger,  "Text is displayed as : " + configFileObj.getProperty("FirstSelected"+ i + datasetScreencount));
		}
	String text3 = objSelect_screen.clkbuttonGetAllSelected_398694();
		if(text3.equalsIgnoreCase(configFileObj.getProperty("GetAllSelected"+ i + datasetScreencount))){
			printSuccessLogAndReport(test, logger,  "Clicked on Button : " + configFileObj.getProperty("GetAllSelected"+ i + datasetScreencount));
			printSuccessLogAndReport(test, logger,  "Validated Button Text : " + configFileObj.getProperty("GetAllSelected"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(test, logger,  "Text is displayed as : " + configFileObj.getProperty("GetAllSelected"+ i + datasetScreencount));
		}

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  printFailureLogAndReport(test, logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}
	
	@Test
	public void screensTest() throws Exception {
		for(int datasets = 1; datasets <= Select_screen.datasetsLength; datasets++) {
			isElementDispalyed = true;			
			setUP();
			if(isElementDispalyed) { Select_demo_screenTest(datasets);}
			if(isElementDispalyed) { Select_screenTest(datasets);}
			tearDown();
		}	}

	
	public void tearDown() throws Exception {
		reports.endTest(test);
		reports.flush();
		driver.quit();
	}
}