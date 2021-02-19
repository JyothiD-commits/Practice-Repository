package learnTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicsTestNG {
	
	/*  Set up system properties  //BeforeSuite
	Launch the browser            //BeforeTest
	Enter Url                     //BeforeClass
	
	Login page                    //BeforeMethod   
	Google logo displayed         //TestCase           
	Logout                        //AfterMethod
	
	Login page               //BeforeMethod   //everytime a test case runs, BeforeMethod and AfterMethod also runs
	Google search displayed  //Testcase       //BeforeSuite,BeforeTest,BeforeClass,AfterClass,AfterTest and AfterSuite 
	Logout                   //AfterMethod    //runs only once.
	
	Login page              //BeforeMethod
	Google title displayed  //Testcase
	Logout                   //AfterMethod
	
	Close the browser      //AfterClass
	Delete all the cookies //AfterTest
	
	Generate the report    //After Suite
	
	
	*/
	
@BeforeSuite
public void setUp() {
	System.out.println("Set up system properties");
}
 
@BeforeTest
public void launchBrowser() {
	System.out.println("Launch the browser");
}

@BeforeClass
public void enterUrl() {
	System.out.println("Enter Url");
}

@BeforeMethod
public void login() {
	System.out.println("Login page");
}

@Test(groups= {"googlegroups"})
public void googleTitleTest() {
	System.out.println("Google title displayed");
}
@Test(groups= {"googlegroups"})
public void googleLogoTest() {
	System.out.println("Google logo displayed");
}

@Test(groups={"googlegroups"})
public void googleSearchTest() {
	System.out.println("Google search displayed");
}

@AfterMethod
public void logOut() {
	System.out.println("Logout");
}

@AfterTest
public void deleteCookies() {
	System.out.println("Delete all the cookies");
}

@AfterClass
public void closeBrowser() {
	System.out.println("Close the browser");
}

@AfterSuite
public void generateTestReport() {
	System.out.println("Generate the test report");
}
}
