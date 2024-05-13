package testpkg;

import org.testng.annotations.Test;

import basepkg.Basecls;
import java.time.Duration;
import pagepkg.Logpage;
import utilities.Utili;

public class Logtest extends Basecls{
	
    @Test(priority=1)
	public void verifyLogin () throws Exception

	{
	            
                Logpage p = new Logpage(driver);

	            String xl = "D:\\Book2.xlsx";

	            String Sheet = "Sheet1";

	            int rowCount = Utili.getRowCount(xl, Sheet);

	            for (int i=1;i<=rowCount;i++)

	            {
	            	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
	                        String UserName=Utili.getCellvalue(xl, Sheet, i, 0);
                            System.out.println("username---"+UserName);
	                        String Pwd=Utili.getCellvalue(xl, Sheet, i, 1);
                            System.out.println("password---"+Pwd);
	                        
	                        p.setvalue(UserName, Pwd);
                                           
                            p.clickLogin();
                            
                            driver.navigate().refresh();              
	            }
	}
    
    @Test(priority=2)
    public void addCart () throws Exception
    {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    	Logpage p = new Logpage(driver);

    	 p.addtocart();
//    	 JavascriptExecutor js = (JavascriptExecutor) driver;
//    	  js.executeScript("window.scrollBy(0,650)", "");
    	  p.checkoutBtn();
    }
    
    @Test(priority=3)

    public void addInfo () throws Exception
    {
        Logpage p = new Logpage(driver);

    	String xl="D:\\book3.xlsx";
    	
    	String Sheet = "Sheet1";
    	
    	
    	String FirstName=Utili.getCellvalue(xl, Sheet, 1, 0);
    	System.out.println("FirstName" +FirstName);

    	String lastName=Utili.getCellvalue(xl, Sheet, 1, 1);
    	System.out.println("lastName" +lastName);

    	String postalCode=Utili.getCellvalue(xl, Sheet, 1, 2);
    	System.out.println("postalCode" +postalCode);

    	p.setInfoValues(FirstName, lastName, postalCode);
    	
    	p.clickFinal();
    	
    	p.clickLogout();
    }
}
