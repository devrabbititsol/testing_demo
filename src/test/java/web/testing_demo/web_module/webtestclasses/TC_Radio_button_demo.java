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
import web.testing_demo.web_module.webpageclasses.Radio_demo_screen;
import web.testing_demo.web_module.webpageclasses.Radio_button_screen;
import com.utilities.BaseClass;
import com.utilities.ConfigFilesUtility;
import com.utilities.Utilities;
import org.json.JSONObject;

@SuppressWarnings("unused")
public class TC_Radio_button_demo extends BaseClass {
	ExtentReports reports;
	ExtentTest test;
	ITestResult result;
	private Logger logger;
	private ConfigFilesUtility configFileObj;
	private String browserName = "chrome";
	public boolean isElementDispalyed = false;
	public static final int datasetsLength = 1;

	public TC_Radio_button_demo() throws Exception {
		PropertyConfigurator.configure("log4j.properties");
		logger = Logger.getLogger(TC_Radio_button_demo.class);
		configFileObj = new ConfigFilesUtility();
		configFileObj.loadPropertyFile("tc_radio_button_demo.properties");
	}

	@BeforeTest
	@Parameters("browser")
	public void browserName(String browser) throws Exception {
		browserName = browser;
		reports = ExtentConfigurations.getExtentInstance(reportsPath, projectPath, Radio_demo_screen.projectName);
		test = reports.startTest(setTestcaseName(browserName, "TC_Radio_button_demo"));
	}

	
	public void setUP() throws Exception {
		String primaryInfo = Radio_demo_screen.primaryInfo;
		Constants.PRIMARY_INFO = primaryInfo;
		driver = launchBrowser(browserName, configFileObj);
		printSuccessLogAndReport(test, logger, "Browser Name : " + browserName);
	}

	public void Radio_demo_screenTest(int i) throws Exception {

	 try{
		Constants.TOTAL_TC = Constants.TOTAL_TC + 1;
		Constants.IS_TESTCASE = true; Constants.iS_WEB = true;
		int datasetScreencount = 1;
		Radio_demo_screen objRadio_demo_screen = PageFactory.initElements(driver, Radio_demo_screen.class);
		testLogHeader(test, "Verify Radio_demo_screen page");
		String text1 = objRadio_demo_screen.clkaInputForms_398154();
		if(text1.equalsIgnoreCase(configFileObj.getProperty("InputForms"+ i + datasetScreencount))){
			printSuccessLogAndReport(test, logger,  "Clicked on : " + configFileObj.getProperty("InputForms"+ i + datasetScreencount));
			printSuccessLogAndReport(test, logger,  "Validated Link Text : " + configFileObj.getProperty("InputForms"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(test, logger,  "Link Text is not displayed  : " + configFileObj.getProperty("InputForms"+ i + datasetScreencount));
		}
		String text2 = objRadio_demo_screen.clkaRadioButtonsDemo_398097();
		if(text2.equalsIgnoreCase(configFileObj.getProperty("RadioButtonsDemo"+ i + datasetScreencount))){
			printSuccessLogAndReport(test, logger,  "Clicked on : " + configFileObj.getProperty("RadioButtonsDemo"+ i + datasetScreencount));
			printSuccessLogAndReport(test, logger,  "Validated Link Text : " + configFileObj.getProperty("RadioButtonsDemo"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(test, logger,  "Link Text is not displayed  : " + configFileObj.getProperty("RadioButtonsDemo"+ i + datasetScreencount));
		}

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  printFailureLogAndReport(test, logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}
	

	public void Radio_button_screenTest(int i) throws Exception {

	 try{
		Constants.TOTAL_TC = Constants.TOTAL_TC + 1;
		Constants.IS_TESTCASE = true; Constants.iS_WEB = true;
		int datasetScreencount = 2;
		Radio_button_screen objRadio_button_screen = PageFactory.initElements(driver, Radio_button_screen.class);
		testLogHeader(test, "Verify Radio_button_screen page");
String text1 = objRadio_button_screen.textlabelFemale_398572();
		if(text1.equalsIgnoreCase(configFileObj.getProperty("Female"+ i + datasetScreencount))){
			printSuccessLogAndReport(test, logger,  "Validating Text is displayed as : " + configFileObj.getProperty("Female"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(test, logger,  "Label Text is not displayed as : " + configFileObj.getProperty("Female"+ i + datasetScreencount));
		}
	String text2 = objRadio_button_screen.clkbuttonGetCheckedValue_398568();
		if(text2.equalsIgnoreCase(configFileObj.getProperty("GetCheckedValue"+ i + datasetScreencount))){
			printSuccessLogAndReport(test, logger,  "Clicked on Button : " + configFileObj.getProperty("GetCheckedValue"+ i + datasetScreencount));
			printSuccessLogAndReport(test, logger,  "Validated Button Text : " + configFileObj.getProperty("GetCheckedValue"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(test, logger,  "Text is displayed as : " + configFileObj.getProperty("GetCheckedValue"+ i + datasetScreencount));
		}
String text3 = objRadio_button_screen.textlabelFemale1_398573();
		if(text3.equalsIgnoreCase(configFileObj.getProperty("Female1"+ i + datasetScreencount))){
			printSuccessLogAndReport(test, logger,  "Validating Text is displayed as : " + configFileObj.getProperty("Female1"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(test, logger,  "Label Text is not displayed as : " + configFileObj.getProperty("Female1"+ i + datasetScreencount));
		}
String text4 = objRadio_button_screen.textlabelTo50_398610();
		if(text4.equalsIgnoreCase(configFileObj.getProperty("To50"+ i + datasetScreencount))){
			printSuccessLogAndReport(test, logger,  "Validating Text is displayed as : " + configFileObj.getProperty("To50"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(test, logger,  "Label Text is not displayed as : " + configFileObj.getProperty("To50"+ i + datasetScreencount));
		}
	String text5 = objRadio_button_screen.clkbuttonGetValues_398567();
		if(text5.equalsIgnoreCase(configFileObj.getProperty("GetValues"+ i + datasetScreencount))){
			printSuccessLogAndReport(test, logger,  "Clicked on Button : " + configFileObj.getProperty("GetValues"+ i + datasetScreencount));
			printSuccessLogAndReport(test, logger,  "Validated Button Text : " + configFileObj.getProperty("GetValues"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(test, logger,  "Text is displayed as : " + configFileObj.getProperty("GetValues"+ i + datasetScreencount));
		}

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  printFailureLogAndReport(test, logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}
	
	@Test
	public void screensTest() throws Exception {
		for(int datasets = 1; datasets <= Radio_button_screen.datasetsLength; datasets++) {
			isElementDispalyed = true;			
			setUP();
			if(isElementDispalyed) { Radio_demo_screenTest(datasets);}
			if(isElementDispalyed) { Radio_button_screenTest(datasets);}
			tearDown();
		}	}

	
	public void tearDown() throws Exception {
		reports.endTest(test);
		reports.flush();
		driver.quit();
	}
}