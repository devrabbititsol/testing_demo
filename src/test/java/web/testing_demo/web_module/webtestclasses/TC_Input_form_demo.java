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
import web.testing_demo.web_module.webpageclasses.Input_demo_screen;
import web.testing_demo.web_module.webpageclasses.Input_form_screen;
import com.utilities.BaseClass;
import com.utilities.ConfigFilesUtility;
import com.utilities.Utilities;
import org.json.JSONObject;

@SuppressWarnings("unused")
public class TC_Input_form_demo extends BaseClass {
	ExtentReports reports;
	ExtentTest test;
	ITestResult result;
	private Logger logger;
	private ConfigFilesUtility configFileObj;
	private String browserName = "chrome";
	public boolean isElementDispalyed = false;
	public static final int datasetsLength = 1;

	public TC_Input_form_demo() throws Exception {
		PropertyConfigurator.configure("log4j.properties");
		logger = Logger.getLogger(TC_Input_form_demo.class);
		configFileObj = new ConfigFilesUtility();
		configFileObj.loadPropertyFile("tc_input_form_demo.properties");
	}

	@BeforeTest
	@Parameters("browser")
	public void browserName(String browser) throws Exception {
		browserName = browser;
		reports = ExtentConfigurations.getExtentInstance(reportsPath, projectPath, Input_demo_screen.projectName);
		test = reports.startTest(setTestcaseName(browserName, "TC_Input_form_demo"));
	}

	
	public void setUP() throws Exception {
		String primaryInfo = Input_demo_screen.primaryInfo;
		Constants.PRIMARY_INFO = primaryInfo;
		driver = launchBrowser(browserName, configFileObj);
		printSuccessLogAndReport(test, logger, "Browser Name : " + browserName);
	}

	public void Input_demo_screenTest(int i) throws Exception {

	 try{
		Constants.TOTAL_TC = Constants.TOTAL_TC + 1;
		Constants.IS_TESTCASE = true; Constants.iS_WEB = true;
		int datasetScreencount = 1;
		Input_demo_screen objInput_demo_screen = PageFactory.initElements(driver, Input_demo_screen.class);
		testLogHeader(test, "Verify Input_demo_screen page");
		String text1 = objInput_demo_screen.clkaInputForms_398154();
		if(text1.equalsIgnoreCase(configFileObj.getProperty("InputForms"+ i + datasetScreencount))){
			printSuccessLogAndReport(test, logger,  "Clicked on : " + configFileObj.getProperty("InputForms"+ i + datasetScreencount));
			printSuccessLogAndReport(test, logger,  "Validated Link Text : " + configFileObj.getProperty("InputForms"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(test, logger,  "Link Text is not displayed  : " + configFileObj.getProperty("InputForms"+ i + datasetScreencount));
		}
		String text2 = objInput_demo_screen.clkaInputFormSubmit_398157();
		if(text2.equalsIgnoreCase(configFileObj.getProperty("InputFormSubmit"+ i + datasetScreencount))){
			printSuccessLogAndReport(test, logger,  "Clicked on : " + configFileObj.getProperty("InputFormSubmit"+ i + datasetScreencount));
			printSuccessLogAndReport(test, logger,  "Validated Link Text : " + configFileObj.getProperty("InputFormSubmit"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(test, logger,  "Link Text is not displayed  : " + configFileObj.getProperty("InputFormSubmit"+ i + datasetScreencount));
		}

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  printFailureLogAndReport(test, logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}
	

	public void Input_form_screenTest(int i) throws Exception {

	 try{
		Constants.TOTAL_TC = Constants.TOTAL_TC + 1;
		Constants.IS_TESTCASE = true; Constants.iS_WEB = true;
		int datasetScreencount = 2;
		Input_form_screen objInput_form_screen = PageFactory.initElements(driver, Input_form_screen.class);
		testLogHeader(test, "Verify Input_form_screen page");
		objInput_form_screen.fillinputFirstName_398833(configFileObj.getProperty("FirstName"+ i + datasetScreencount));
		printSuccessLogAndReport(test, logger,  "Entered FirstName : " + configFileObj.getProperty("FirstName"+ i + datasetScreencount));
		objInput_form_screen.fillinputLastName_398794(configFileObj.getProperty("LastName"+ i + datasetScreencount));
		printSuccessLogAndReport(test, logger,  "Entered LastName : " + configFileObj.getProperty("LastName"+ i + datasetScreencount));
		objInput_form_screen.fillinputEMailAddress_398838(configFileObj.getProperty("EMailAddress"+ i + datasetScreencount));
		printSuccessLogAndReport(test, logger,  "Entered EMailAddress : " + configFileObj.getProperty("EMailAddress"+ i + datasetScreencount));
		objInput_form_screen.fillinput_398877(configFileObj.getProperty(""+ i + datasetScreencount));
		printSuccessLogAndReport(test, logger,  "Entered  : " + configFileObj.getProperty(""+ i + datasetScreencount));
		objInput_form_screen.fillinputAddress_398875(configFileObj.getProperty("Address"+ i + datasetScreencount));
		printSuccessLogAndReport(test, logger,  "Entered Address : " + configFileObj.getProperty("Address"+ i + datasetScreencount));
		objInput_form_screen.fillinputCity_398741(configFileObj.getProperty("City"+ i + datasetScreencount));
		printSuccessLogAndReport(test, logger,  "Entered City : " + configFileObj.getProperty("City"+ i + datasetScreencount));
		objInput_form_screen.clkselectState7_398736();
		printInfoLogAndReport(test, logger, "Clicked on State dropdown and selected Indiana");
				objInput_form_screen.fillinputZipCode_398744(configFileObj.getProperty("ZipCode"+ i + datasetScreencount));
		printSuccessLogAndReport(test, logger,  "Entered ZipCode : " + configFileObj.getProperty("ZipCode"+ i + datasetScreencount));
		objInput_form_screen.fillinputWebsiteOrDomainName_398749(configFileObj.getProperty("WebsiteOrDomainName"+ i + datasetScreencount));
		printSuccessLogAndReport(test, logger,  "Entered WebsiteOrDomainName : " + configFileObj.getProperty("WebsiteOrDomainName"+ i + datasetScreencount));
String text10 = objInput_form_screen.textlabelNo_398788();
		if(text10.equalsIgnoreCase(configFileObj.getProperty("No"+ i + datasetScreencount))){
			printSuccessLogAndReport(test, logger,  "Validating Text is displayed as : " + configFileObj.getProperty("No"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(test, logger,  "Label Text is not displayed as : " + configFileObj.getProperty("No"+ i + datasetScreencount));
		}
		objInput_form_screen.filltextareaProjectDescription_398779(configFileObj.getProperty("ProjectDescription"+ i + datasetScreencount));
		printSuccessLogAndReport(test, logger,  "Entered ProjectDescription : " + configFileObj.getProperty("ProjectDescription"+ i + datasetScreencount));

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  printFailureLogAndReport(test, logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}
	
	@Test
	public void screensTest() throws Exception {
		for(int datasets = 1; datasets <= Input_form_screen.datasetsLength; datasets++) {
			isElementDispalyed = true;			
			setUP();
			if(isElementDispalyed) { Input_demo_screenTest(datasets);}
			if(isElementDispalyed) { Input_form_screenTest(datasets);}
			tearDown();
		}	}

	
	public void tearDown() throws Exception {
		reports.endTest(test);
		reports.flush();
		driver.quit();
	}
}