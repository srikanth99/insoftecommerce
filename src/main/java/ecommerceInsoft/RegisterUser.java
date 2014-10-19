package ecommerceInsoft;

import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

/**
 * Created by HEMANTH on 18/10/2014.
 */
public class RegisterUser extends BaseClass{
    public void registeruser(String gender,String firstname,String lastname,String email,String password,String confirmpassword){
        driver.findElement(By.id(gender)).click();
        driver.findElement(By.id("FirstName")).sendKeys(firstname);
        driver.findElement(By.id("LastName")).sendKeys(lastname);
        BaseClass bc =new BaseClass();
        bc.dropdownenu(By.name("DateOfBirthDay"),"1");
        bc.dropdownenu(By.name("DateOfBirthMonth"),"January");
        bc.dropdownenu(By.name("DateOfBirthYear"),"1970");
        driver.findElement(By.id("Email")).sendKeys(email);
        driver.findElement(By.id("Password")).sendKeys(password);
        driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmpassword);
        driver.findElement(By.id("register-button")).click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);


    }
}
