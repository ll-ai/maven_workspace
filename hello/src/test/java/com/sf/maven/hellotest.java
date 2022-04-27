package com.sf.maven;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.ref.PhantomReference;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class hellotest {
    @Test
    /*public void testHello() {
        hello Hello = new hello();
        String maven = Hello.sayHello("Maven");
        System.out.println(maven);
    }*/
    public void openUrl() throws InterruptedException {
        //打开百度的url
       /* System.setProperty("webdriver.chrome.driver","D:/stu/chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver ();
        driver.get("https://www.baidu.com");
        //等待3秒
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        *//*Dimension dimension=new Dimension(300,300);
        driver.manage().window().setSize(dimension);*//*
        driver.get("https://www.baidu.com");
        *//*WebElement webelement=driver.findElement(By.xpath("//*[@id=\"s-top-left\"]/a[1]"));
        webelement.click();*//*
        WebElement webElement=driver.findElement(By.xpath("//*[@id=\"kw\"]"));
        webElement.sendKeys("上海疫情");
        driver.findElement(By.xpath("//*[@id=\"su\"]")).click();*/
        System.setProperty("webdriver.chrome.driver", "D:/stu/chromedriver/chromedriver.exe");
       /* System.setProperty("phantomjs.binary.path","D:/stu/chromedriver/phantomjs.exe");*//*
        WebDriver driver = new ChromeDriver();
        *//*PhantomJSDriver driver=new PhantomJSDriver();*//*
        driver.get("https://www.baidu.com");
        String title=driver.getTitle();
        System.out.println(title);
        driver.quit();*/
        ChromeOptions chromeOptions=new ChromeOptions();


// 设置为 headless 模式 (必须)

        chromeOptions.addArguments("--headless");

// 设置浏览器窗口打开大小 (非必须)

        chromeOptions.addArguments("--window-size=1920,1080");

        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("http://www.baidu.com");

        String title = driver.getTitle();

        System.out.println(title);

        driver.quit();
        /*List listText = driver.findElements(By.xpath("//*[@id=\"u1\"]/a"));
        //逐个输出打印
        for (int i = 0; i < listText.size(); i++) {
            String test = listText.get(i).toString();
            System.out.println(test);

*/
      /*  WebElement element=driver.findElement(By.id("kw"));
        element.sendKeys("webdriver");
        String att=element.getAttribute("value");
        System.out.println(att);*/
        /*driver.get("file:///C:/Users/ll0503/Desktop/百度一下，你就知道.html");
        driver.findElement(By.id("user")).sendKeys("this is iframe");
        Thread.sleep(3000);
        driver.switchTo().frame("aa");
        driver.findElement(By.linkText("baidu")).click();
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        driver.findElement(By.id("user")).clear();
        driver.findElement(By.id("user")).sendKeys("this is another iframe");*/

        /*   WebElement moreselect=driver.findElement(By.id("moreselect"));
        //new 一个 select对象
        *//*Select select=new Select(moreselect);
        select.selectByIndex(3);//根据索引值
        select.selectByValue("huawei");//根据value值
        select.selectByVisibleText(" ");//根据文本值*/
        /*public void windowsTest() throws InterruptedException {
            driver.findElement(By.className("open")).click();
            //获取第一个页面的句柄
            String handle1 = driver.getWindowHandle();
            //for循环判断是否为第一个页面的句柄，如果不是就移交权限
            for (String handle2:driver.getWindowHandles()) {
                if(handle1.equals(handle2)){
                    continue;
                }else {driver.switchTo().window(handle2);}
            }
            //下面是采用迭代器的方式实现for循环
*//*      Set<String> allHandle=driver.getWindowHandles();
        Iterator iterator=allHandle.iterator();
        for (int i=0;i<allHandle.size();i++){
            String handle=iterator.next().toString();
            if (handle1.equals(handle));
            continue;
            driver.switchTo().window(handle);
        }*//*
            Thread.sleep(100);
            //移交权限后可以操作第二个页面
            driver.findElement(By.id("kw")).sendKeys("selenium");
            driver.findElement(By.id("su")).click();
            Thread.sleep(1000);
            //关闭当前页面
            driver.close();
        }*/
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 全局等待
        //隐式等待，如果没有满足until后面的值，会等待5s，然后抛超时异常，如果5s之内就正常了，那就无需等待
        /*WebDriverWait webDriverWait=new WebDriverWait(driver,5);
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.id()));*/
       /* WebElement rightclick=driver.findElement(By.id("su"));
        Actions actions=new Actions(driver);
        actions.contextClick(rightclick).perform();
        actions.doubleClick().build().perform();*/
       /* WebElement webElement=driver.findElement(By.xpath("//*[@id=\"su\"]"));
        Actions bulider=new Actions(driver);
        bulider.moveToElement(webElement).perform();*/
    }
    }



