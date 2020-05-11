package Tasks;

import jdk.vm.ci.meta.Constant;
import org.graalvm.compiler.core.common.type.ArithmeticOpTable;
import org.graalvm.compiler.core.common.type.Stamp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.lang.Math;
import java.util.Scanner;


public class SampleTest {

    //задание 3.1
    @Test(dataProvider = "dataProv_Task3Abs")
    public void Task3Abs(int a){
        SoftAssert sa = new SoftAssert();
        int MOD = Math.abs(a);
        sa.assertFalse(MOD < 0, "Модуль не может быть меньше 0 !!!");
        sa.assertAll();

        System.out.println("\nЗадание №1: ");
        System.out.println("Программма завершена успешно!!!\n abs(mod) = " + MOD);
    }

    //исп-я дата-провайдера для Task3AddExact
    @DataProvider(name = "dataProv_Task3AddExact")
    public Object[][] dataProvMethod2()
    {
        return new Object[][] {{-100,1000},{0,0},{999999999,999999999},{10,20},{111,222}};
    }
    //задание 3.2
    @Test(dataProvider = "dataProv_Task3AddExact")
    public void Task3AssExact(int a, int b)
    {
        try{
            int SUM = Math.addExact(a,b);
            System.out.println("\nЗадание №2: ");
            System.out.println("Программма завершена успешно!!!\n addExact = " + SUM);
        } catch (ArithmeticException e){
            e.printStackTrace();
        }
    }

    //исп-я дата-провайдера для Task3FloorDiv
    @DataProvider(name = "dataProv_Task3FloorDiv")
    public Object[][] dataProvMethod3()
    {
        return new Object[][] {{4,4},{4,3},{4,2},{4,1},{4,0}};
    }
    //задание 3.3
    @Test(dataProvider = "dataProv_Task3FloorDiv")
    public void Task3FloorDiv(int a, int b)
    {
        try{
            int REMAIN = Math.floorDiv(a,b);
            System.out.println("\nЗадание №3: ");
            System.out.println("Программма завершена успешно!!!\n addExact = " + REMAIN);
        } catch (ArithmeticException e){
            e.printStackTrace();
        }
    }
}