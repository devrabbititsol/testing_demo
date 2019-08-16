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
import web.testing_demo.web_module.webpageclasses.Simple_demo_screen;
import web.testing_demo.web_module.webpageclasses.Simple_form_screen;
import com.utilities.BaseClass;
import com.utilities.ConfigFilesUtility;
import com.utilities.Utilities;
import org.json.JSONObject;

@SuppressWarnings("unused")
public class TC_Simple_form_demo extends BaseClass {
	ExtentReports reports;
	ExtentTest test;
	ITestResult result;
	private Logger logger;
	private ConfigFilesUtility configFileObj;
	private String browserName = "chrome";
	public boolean isElementDispalyed = false;
	public static final int datasetsLength = 1;

	public TC_Simple_form_demo() throws Exception {
		PropertyConfigurator.configure("log4j.properties");
		logger = Logger.getLogger(TC_Simple_form_demo.class);
		configFileObj = new ConfigFilesUtility();
		configFileObj.loadPropertyFile("tc_simple_form_demo.properties");
	}

	@BeforeTest
	@Parameters("browser")
	public void browserName(String browser) throws Exception {
		browserName = browser;
		reports = ExtentConfigurations.getExtentInstance(reportsPath, projectPath, Simple_demo_screen.projectName);
		test = reports.startTest(setTestcaseName(browserName, "TC_Simple_form_demo"));
	}

	
	public void setUP() throws Exception {
		String primaryInfo = Simple_demo_screen.primaryInfo;
		Constants.PRIMARY_INFO = primaryInfo;
		driver = launchBrowser(browserName, configFileObj);
		printSuccessLogAndReport(test, logger, "Browser Name : " + browserName);
	}

	public void Simple_demo_screenTest(int i) throws Exception {

	 try{
		Constants.TOTAL_TC = Constants.TOTAL_TC + 1;
		Constants.IS_TESTCASE = true; Constants.iS_WEB = true;
		int datasetScreencount = 1;
		Simple_demo_screen objSimple_demo_screen = PageFactory.initElements(driver, Simple_demo_screen.class);
		testLogHeader(test, "Verify Simple_demo_screen page");
		String text1 = objSimple_demo_screen.clkaInputForms_398154();
		if(text1.equalsIgnoreCase(configFileObj.getProperty("InputForms"+ i + datasetScreencount))){
			printSuccessLogAndReport(test, logger,  "Clicked on : " + configFileObj.getProperty("InputForms"+ i + datasetScreencount));
			printSuccessLogAndReport(test, logger,  "Validated Link Text : " + configFileObj.getProperty("InputForms"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(test, logger,  "Link Text is not displayed  : " + configFileObj.getProperty("InputForms"+ i + datasetScreencount));
		}
		String text2 = objSimple_demo_screen.clkaSimpleFormDemo_398088();
		if(text2.equalsIgnoreCase(configFileObj.getProperty("SimpleFormDemo"+ i + datasetScreencount))){
			printSuccessLogAndReport(test, logger,  "Clicked on : " + configFileObj.getProperty("SimpleFormDemo"+ i + datasetScreencount));
			printSuccessLogAndReport(test, logger,  "Validated Link Text : " + configFileObj.getProperty("SimpleFormDemo"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(test, logger,  "Link Text is not displayed  : " + configFileObj.getProperty("SimpleFormDemo"+ i + datasetScreencount));
		}

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  printFailureLogAndReport(test, logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}
	

	public void Simple_form_screenTest(int i) throws Exception {

	 try{
		Constants.TOTAL_TC = Constants.TOTAL_TC + 1;
		Constants.IS_TESTCASE = true; Constants.iS_WEB = true;
		int datasetScreencount = 2;
		Simple_form_screen objSimple_form_screen = PageFactory.initElements(driver, Simple_form_screen.class);
		testLogHeader(test, "Verify Simple_form_screen page");
		objSimple_form_screen.fillinputPleaseEnterYourMessage_398256(configFileObj.getProperty("PleaseEnterYourMessage"+ i + datasetScreencount));
		printSuccessLogAndReport(test, logger,  "Entered PleaseEnterYourMessage : " + configFileObj.getProperty("PleaseEnterYourMessage"+ i + datasetScreencount));
	String text2 = objSimple_form_screen.clkbuttonShowMessage_398244();
		if(text2.equalsIgnoreCase(configFileObj.getProperty("ShowMessage"+ i + datasetScreencount))){
			printSuccessLogAndReport(test, logger,  "Clicked on Button : " + configFileObj.getProperty("ShowMessage"+ i + datasetScreencount));
			printSuccessLogAndReport(test, logger,  "Validated Button Text : " + configFileObj.getProperty("ShowMessage"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(test, logger,  "Text is displayed as : " + configFileObj.getProperty("ShowMessage"+ i + datasetScreencount));
		}
		objSimple_form_screen.fillinputEnterValueA_398308(configFileObj.getProperty("EnterValueA"+ i + datasetScreencount));
		printSuccessLogAndReport(test, logger,  "Entered EnterValueA : " + configFileObj.getProperty("EnterValueA"+ i + datasetScreencount));
		objSimple_form_screen.fillinputEnterValueB_398309(configFileObj.getProperty("EnterValueB"+ i + datasetScreencount));
		printSuccessLogAndReport(test, logger,  "Entered EnterValueB : " + configFileObj.getProperty("EnterValueB"+ i + datasetScreencount));
	String text5 = objSimple_form_screen.clkbuttonGetTotal_398302();
		if(text5.equalsIgnoreCase(configFileObj.getProperty("GetTotal"+ i + datasetScreencount))){
			printSuccessLogAndReport(test, logger,  "Clicked on Button : " + configFileObj.getProperty("GetTotal"+ i + datasetScreencount));
			printSuccessLogAndReport(test, logger,  "Validated Button Text : " + configFileObj.getProperty("GetTotal"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(test, logger,  "Text is displayed as : " + configFileObj.getProperty("GetTotal"+ i + datasetScreencount));
		}

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  printFailureLogAndReport(test, logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}
	
	@Test
	public void screensTest() throws Exception {
		for(int datasets = 1; datasets <= Simple_form_screen.datasetsLength; datasets++) {
			isElementDispalyed = true;			
			setUP();
			if(isElementDispalyed) { Simple_demo_screenTest(datasets);}
			if(isElementDispalyed) { Simple_form_screenTest(datasets);}
			tearDown();
		}	}

	
	public void tearDown() throws Exception {
		reports.endTest(test);
		reports.flush();
		driver.quit();
	}
}