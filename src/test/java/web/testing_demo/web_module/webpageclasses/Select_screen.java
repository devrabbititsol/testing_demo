package web.testing_demo.web_module.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.support.ui.Select;

@SuppressWarnings("unused")
public class Select_screen extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":85,\"executed_user_id\":85,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"https://www.seleniumeasy.com/test/\",\"report_upload_url\":\"https://smartqe.io:443/UploadReportFile\",\"project_name\":\"Testing_Demo\",\"project_description\":\"desc\",\"project_id\":391,\"module_name\":\"web_module\",\"module_description\":\"desc\",\"sub_module_id\":0,\"module_id\":656,\"testcase_name\":\"TC_Select_dropdown_demo\",\"testcase_id\":562,\"testset_id\":0,\"executed_timestamp\":-1454470591,\"browser_type\":\"mozilla\",\"testcase_overwrite\":true}";

	public static String projectName = "testing_demo";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public Select_screen(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.CSS, using = "#select-demo")	
	private WebElement	SelectADayselectOne1_398640select;
	public String clkselectSelectADayselectOne1_398640() {
		waitForExpectedElement(driver, SelectADayselectOne1_398640select);		
		Select selectOption = new Select(SelectADayselectOne1_398640select);
		selectOption.selectByValue("Thursday");
		String text = selectOption.getFirstSelectedOption().getText();
		return text;
	}

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'First Selected')]")	
	private WebElement	FirstSelected_398696button;
	public String clkbuttonFirstSelected_398696() {
		waitForExpectedElement(driver, FirstSelected_398696button);		
		String text = FirstSelected_398696button.getText();
		FirstSelected_398696button.click();
		return text;
	}

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Get All Selected')]")	
	private WebElement	GetAllSelected_398694button;
	public String clkbuttonGetAllSelected_398694() {
		waitForExpectedElement(driver, GetAllSelected_398694button);		
		String text = GetAllSelected_398694button.getText();
		GetAllSelected_398694button.click();
		return text;
	}

}