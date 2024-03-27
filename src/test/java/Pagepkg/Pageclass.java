package Pagepkg;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class Pageclass {
	
	WebDriver driver;
	

	@FindBy(xpath="//*[@id=\"header\"]/div[1]/div/div[2]/div/div/div/div[2]/a/img[1]")
	WebElement  logo;
	
	
	@FindBy(xpath="//*[@id=\"left-menu-link-and-right-social-icon\"]/nav/ul/li[2]/a/i")
	WebElement signin;
	
	@FindBy(xpath="//*[@id=\"left-menu-link-and-right-social-icon\"]/nav/ul/li[2]/ul/li[2]/a")
	WebElement Signin;
	
	@FindBy(id="cust_emailid")
	WebElement Username;
	
	@FindBy(id="cust_password")
	WebElement Password;
	
	@FindBy(xpath="//*[@id=\"frmcustomer_login\"]/div[4]/button")
	WebElement log;

	@FindBy(xpath="//*[@id='primary-menu']/ul/li[1]/a/font")
	WebElement living;
	
	@FindBy(xpath="//*[@id=\"primary-menu\"]/ul/li[1]/div[1]/div[1]/div/div/ul/li[1]/a")
	WebElement sofa;

	@FindBy(xpath="//*[@id=\"products\"]/div[1]/div[1]/div/a/div[1]/img")
    WebElement shop;
	
	@FindBy(xpath="//*[@id=\"category_products_list\"]/div[1]/div[1]/div/div[1]/div[3]/a/img")
	WebElement itemclick1;
	
	@FindBy(xpath="//*[@id=\"product_details\"]/div[1]/div/div[1]/div/form/div[2]/button")
    WebElement ac1;
	
	@FindBy(xpath="//*[@id=\"category_products_list\"]/div[1]/div[3]/div/div[1]/div[3]/a/img")
	WebElement itemclick2;
	
	
	@FindBy(xpath="//*[@id=\"product_details\"]/div[1]/div/div[1]/div/form/div[2]/button")
	WebElement ac2;
	
	@FindBy(xpath="//*[@id=\"left_sidebar_filter\"]/ul/li[4]/a")
	WebElement materials;
	
	@FindBy(xpath="//*[@id=\"left_sidebar_filter\"]/ul/li[4]/ul/li[1]/div/div/label/span[3]")
	WebElement fabric;
	
	@FindBy(xpath="//*[@id=\"primary-menu\"]/ul/li[4]/a/font")
	WebElement accentfurniture;
	
	@FindBy(xpath="//*[@id=\"category_list\"]/div/div/div[1]/div/div[1]/div[1]/div/a/img")
	WebElement accentchair;
	
	@FindBy(xpath="//*[@id=\"left_sidebar_filter\"]/ul/li[1]/a")
	WebElement price;
	
	@FindBy(xpath="//*[@id=\"left_sidebar_filter\"]/ul/li[6]/a")
	WebElement colour;
	
	@FindBy(xpath="//*[@id=\"left_sidebar_filter\"]/ul/li[6]/ul/li[2]/div/div/label/span[3]")
	WebElement green;
	
	public Pageclass(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Logo()
	{
	
		if(logo.isDisplayed())
		{
		System.out.println("displayed");
	}
		else
		{
			System.out.println("not dispalyed");
		}
	}
	
	public void title()
	{
		String exp="Ashley Furniture Homestore India | Buy Home Furniture and Accessories | Bangalore | Hyderabad | Mumbai | Mysore";
		String actual=driver.getTitle();
		System.out.println(actual);
		if(exp.equals(actual))
		{
			System.out.println("title verified");
		}
		else
	{
			System.out.println("title not verified");
		}
//		if(exp.equalsIgnoreCase(actual))
//		{
//			System.out.println("tilte verified");
//		}
//		else
//		{
//			System.out.println("title not verified");
//		}
		
	}
	public void signIn()
	{
		signin.click();
	}
	public void SIGNIN()
	{
		Signin.click();
	}
	
//	public void Email(String un)
//	{
//		email.sendKeys(un);
//	}
//	public void Contin(String pw)
//	{
//		contin.sendKeys(pw);
//	}
	public void setvalues(String UN, String PWD)
	{
		Username.sendKeys(UN);
		Password.sendKeys(PWD);
	}
	public void Log()
	{
		log.click();
	}
	
	public void Living()
	{
		
		living.click();
	}
	
	public void Shop()
	{
		shop.click();
	}
	
		public void Itemclick1()
		{ 
		itemclick1.click();
		}
		public void Add1()
		{
			ac1.click();
		}
		public void nav1()
		{
			driver.navigate().back();
		}
		public void Itemclick2()
		{
			itemclick2.click();
		}
		public void Add2()
		{
			ac2.click();
		}
		public void nav2()
		{
			driver.navigate().back();
		}
		
		public void Materials()
		{
			materials.click();
		}	
//		public void Fabric()
//		{
//			JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//			fabric.click();
//		}	
		public void Accentfurniture()
		{
			accentfurniture.click();
		}
		
		public void Accentchair()
		{
			
			accentchair.click();
		}
		public void Price()
		{
			
			price.click();
		}
		
		public void Colour()
		{
			
			colour.click();
		}
//		public void Green()
//		{
//			JavascriptExecutor js=(JavascriptExecutor)driver;
//			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//			
//		green.click();
//		}
		
}
