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
import web.testing_demo.web_module.webpageclasses.Checkbox_demo_screen;
import web.testing_demo.web_module.webpageclasses.Checkbox_screen;
import com.utilities.BaseClass;
import com.utilities.ConfigFilesUtility;
import com.utilities.Utilities;
import org.json.JSONObject;

@SuppressWarnings("unused")
public class TC_Checkbox_demo extends BaseClass {
	ExtentReports reports;
	ExtentTest test;
	ITestResult result;
	private Logger logger;
	private ConfigFilesUtility configFileObj;
	private String browserName = "chrome";
	public boolean isElementDispalyed = false;
	public static final int datasetsLength = 1;

	public TC_Checkbox_demo() throws Exception {
		PropertyConfigurator.configure("log4j.properties");
		logger = Logger.getLogger(TC_Checkbox_demo.class);
		configFileObj = new ConfigFilesUtility();
		configFileObj.loadPropertyFile("tc_checkbox_demo.properties");
	}

	@BeforeTest
	@Parameters("browser")
	public void browserName(String browser) throws Exception {
		browserName = browser;
		reports = ExtentConfigurations.getExtentInstance(reportsPath, projectPath, Checkbox_demo_screen.projectName);
		test = reports.startTest(setTestcaseName(browserName, "TC_Checkbox_demo"));
	}

	
	public void setUP() throws Exception {
		String primaryInfo = Checkbox_demo_screen.primaryInfo;
		Constants.PRIMARY_INFO = primaryInfo;
		driver = launchBrowser(browserName, configFileObj);
		printSuccessLogAndReport(test, logger, "Browser Name : " + browserName);
	}

	public void Checkbox_demo_screenTest(int i) throws Exception {

	 try{
		Constants.TOTAL_TC = Constants.TOTAL_TC + 1;
		Constants.IS_TESTCASE = true; Constants.iS_WEB = true;
		int datasetScreencount = 1;
		Checkbox_demo_screen objCheckbox_demo_screen = PageFactory.initElements(driver, Checkbox_demo_screen.class);
		testLogHeader(test, "Verify Checkbox_demo_screen page");
		String text1 = objCheckbox_demo_screen.clkaInputForms_398154();
		if(text1.equalsIgnoreCase(configFileObj.getProperty("InputForms"+ i + datasetScreencount))){
			printSuccessLogAndReport(test, logger,  "Clicked on : " + configFileObj.getProperty("InputForms"+ i + datasetScreencount));
			printSuccessLogAndReport(test, logger,  "Validated Link Text : " + configFileObj.getProperty("InputForms"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(test, logger,  "Link Text is not displayed  : " + configFileObj.getProperty("InputForms"+ i + datasetScreencount));
		}
		String text2 = objCheckbox_demo_screen.clkaCheckboxDemo_398184();
		if(text2.equalsIgnoreCase(configFileObj.getProperty("CheckboxDemo"+ i + datasetScreencount))){
			printSuccessLogAndReport(test, logger,  "Clicked on : " + configFileObj.getProperty("CheckboxDemo"+ i + datasetScreencount));
			printSuccessLogAndReport(test, logger,  "Validated Link Text : " + configFileObj.getProperty("CheckboxDemo"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(test, logger,  "Link Text is not displayed  : " + configFileObj.getProperty("CheckboxDemo"+ i + datasetScreencount));
		}

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  printFailureLogAndReport(test, logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}
	

	public void Checkbox_screenTest(int i) throws Exception {

	 try{
		Constants.TOTAL_TC = Constants.TOTAL_TC + 1;
		Constants.IS_TESTCASE = true; Constants.iS_WEB = true;
		int datasetScreencount = 2;
		Checkbox_screen objCheckbox_screen = PageFactory.initElements(driver, Checkbox_screen.class);
		testLogHeader(test, "Verify Checkbox_screen page");
		objCheckbox_screen.clkinputCheck_box_398477();
		printInfoLogAndReport(test, logger, "Clicked on Check_boxButton");
		String text2 = objCheckbox_screen.textlabelOption2_398394();
		if(text2.equalsIgnoreCase(configFileObj.getProperty("Option2"+ i + datasetScreencount))){
			printSuccessLogAndReport(test, logger,  "Validating Text is displayed as : " + configFileObj.getProperty("Option2"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(test, logger,  "Label Text is not displayed as : " + configFileObj.getProperty("Option2"+ i + datasetScreencount));
		}
		objCheckbox_screen.clkinputOption4_398392();
		printInfoLogAndReport(test, logger, "Clicked on Option4Button");
		
	   } catch (Exception e) {
		  isElementDispalyed = false;
		  printFailureLogAndReport(test, logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}
	
	@Test
	public void screensTest() throws Exception {
		for(int datasets = 1; datasets <= Checkbox_screen.datasetsLength; datasets++) {
			isElementDispalyed = true;			
			setUP();
			if(isElementDispalyed) { Checkbox_demo_screenTest(datasets);}
			if(isElementDispalyed) { Checkbox_screenTest(datasets);}
			tearDown();
		}	}

	
	public void tearDown() throws Exception {
		reports.endTest(test);
		reports.flush();
		driver.quit();
	}
}