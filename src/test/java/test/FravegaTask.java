package test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FravegaTask extends BaseTest {
	public static By inputBuscar = By.cssSelector("#__next > div > div.globalstyles__GlobalWrapper-sc-1rfm2p-0.iHsbWn > header > div > header > div.SearchBar__StyledSearchBar-xgngsx-0.ldQLmj > div > div.SearchBar__SearchWrapper-xgngsx-9.hHqiUW > form > input");
	public static By heladeraFreezzer = By.cssSelector("#__next > div:nth-child(4) > div > div > div.generalstyles__Column-sc-1j7wv79-5.sgWgV > ul > li:nth-child(3) > ul > li:nth-child(1) > ul > li:nth-child(1) > a > h3");	
	public static By vertodasMarcas = By.cssSelector("#__next > div:nth-child(4) > div:nth-child(2) > div > div.generalstyles__Column-sc-1j7wv79-5.sgWgV > ul > li:nth-child(3) > ul > li:nth-child(5) > ul > a");
	public static By checkMarcaSamsung = By.cssSelector("body > div:nth-child(79) > div > div.ant-modal-wrap.viewMore > div > div.ant-modal-content > div > div > div.styled__ItemsContainer-sc-37brzp-5.fhkySw > div:nth-child(11) > label");
	public static By aplicarMarca = By.cssSelector("#apply");
    public static By canHeladeraSam = By.cssSelector("#__next > div:nth-child(4) > div:nth-child(2) > div > div.generalstyles__Column-sc-1j7wv79-5.sgWgV > ul > li.listingDesktopstyled__TotalResult-wzwlr8-2.dTJXAS > span");
	
	
	public FravegaTask(WebDriver driver) {
			super(driver);
			// TODO Auto-generated constructor stub
		}

	public void BuscarHeladera() throws InterruptedException
	{
		type("HELADERA",inputBuscar);
		Thread.sleep(40000);
		if(findElement(heladeraFreezzer).isDisplayed()) {
			click(heladeraFreezzer);
			Thread.sleep(40000);
			MovetoElementClick(vertodasMarcas);
			Thread.sleep(40000);
			click(checkMarcaSamsung);
			Thread.sleep(40000);
			click(aplicarMarca);
			Thread.sleep(40000);
			String cant = findElement(canHeladeraSam).getText();
			assertEquals("5",cant);
		}
		
	}
	
	public void CantHeladera() throws InterruptedException
	{
		Thread.sleep(40000);
		String cant = findElement(canHeladeraSam).getText();
	}


	public String HeladeraFrizzer()
	{
		List<WebElement>fonts = findElements(heladeraFreezzer);
	    return getText(fonts.get(1));
	}
}
