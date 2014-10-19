package ecommerceInsoft;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by HEMANTH on 16/10/2014.
 */
public class Books extends BaseClass{
    private static WebElement element = null;

   BaseClass bc=new BaseClass();

    public  void selectSortby(){
       bc.dropdownenu(By.id("products-orderby"),"Name: A to Z");


    }
    public void selectNoOfProductsperpage(){
         driver.findElement(By.id("products-pagesize")) ;

    }
   /* public WebElement selectNoOfProductsperpage(WebDriver driver){
        element = driver.findElement(By.id("products-pagesize")) ;
        return element;
    }*/
    public  void productviewmode(){
     driver.findElement(By.id("products-viewmode"));

}
    public  void addToCart(){
       driver.findElement(By.id("add-to-cart-button-13")).click() ;


    }
    public void selectABook(String text){
         driver.findElement(By.linkText(text)).click() ;


    }



}
