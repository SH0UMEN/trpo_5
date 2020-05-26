import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import java.lang.Math;

public class Five {
    //Данные для проверки abs()
    @DataProvider(name = "dataForAbsTest")
    public Object[][] dataForAbsTest()
    {
        return new Object[][]{
            { 8 },
            { -7 },
            { 32 },
            { -23}
        };
    }

    //Данные для проверки addExact()
    @DataProvider(name = "dataForAddExactTest")
    public Object[][] dataForAddExactTest()
    {
        return new Object[][] {
            { -20, 43 },
            { 31, -2 },
            { 1, -3 },
            { -42, 11 }
        };
    }

    //Данные для проверки floorDiv()
    @DataProvider(name = "dataForFloorDivTest")
    public Object[][] dataForFloorDivTest()
    {
        return new Object[][] {
            { 12, 3 },
            { 7, 6 },
            { 8, 5 },
            { 3, 2 }
        };
    }

    //Проверка abs()
    @Test(dataProvider = "dataForAbsTest")
    public void absTest(int a){
        SoftAssert sa = new SoftAssert();
        int res = Math.abs(a);
        sa.assertFalse(res < 0, "Ошибка: Модуль не может быть меньше 0!");
        sa.assertAll();
        System.out.println("Проверка abs пройдена успешно. \nabs = " + res);
    }

    //Проверка addExact()
    @Test(dataProvider = "dataForAddExactTest")
    public void addExactTest(int a, int b)
    {
        try {
            int res = Math.addExact(a,b);
            System.out.println("Проверка addExact пройдена успешно. \naddExact = " + res);
        } catch (ArithmeticException e){
            e.printStackTrace();
        }
    }

    //Проверка floorDiv()
    @Test(dataProvider = "dataForFloorDivTest")
    public void Task3FloorDiv(int a, int b)
    {
        try {
            int res = Math.floorDiv(a,b);
            System.out.println("Проверка floorDiv пройдена успешно. \nfloorDiv = " + res);
        } catch (ArithmeticException e){
            e.printStackTrace();
        }
    }
}