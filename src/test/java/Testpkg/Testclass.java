package Testpkg;

import org.testng.annotations.Test;

import Basepkg.Baseclass;
import Pagepkg.Pageclass;
import Utilitiespkg.Excelutilities;





public class Testclass extends Baseclass
{

@Test

public void verifyLoginWithValidCred() throws Exception
{  
	Pageclass ob=new Pageclass(driver);
	
	ob.signIn();
	ob.SIGNIN();
	String x1="C:\\Users\\gowri\\OneDrive\\Documents\\Mavenash.xlsx";
	String Sheet="Sheet1";
	int rowCount=Excelutilities.getRowCount(x1,Sheet);
	
	
	for(int i=1;i<=rowCount;i++)
	{
		Thread.sleep(3000);
		String Username=Excelutilities.getCellVlaue(x1,Sheet,i,0);
		System.out.println("username---"+Username);
		
		String Pwd=Excelutilities.getCellVlaue(x1,Sheet,i,1);
		System.out.println("password---"+Pwd);
		ob.setvalues(Username, Pwd);
		
		ob.Log();
	}
	
	
	ob.Logo();
	ob.title();
    ob.Living();
    ob.Shop();
    Thread.sleep(3000);
	ob.Itemclick1();
	ob.Add1();
	ob.nav1();
	Thread.sleep(3000);
	ob.Itemclick2();
	ob.Add2();
	ob.nav2();
	ob.Materials();
//	ob.Fabric();
	//Thread.sleep(3000);
	ob.Accentfurniture();
	ob.Accentchair();
	Thread.sleep(3000);
	ob.Price();
	ob.Colour();
	//ob.Green();
	
	
}
}



