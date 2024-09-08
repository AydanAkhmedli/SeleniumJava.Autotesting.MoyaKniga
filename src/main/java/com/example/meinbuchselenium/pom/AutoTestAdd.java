package com.example.meinbuchselenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


/*
       ______     __
      / ____/__  / /__  ____  (_)_  ______ ___
      \__ \/ _ \/ / _ \/ __ \/ / / / / __ `__ \
    ___/ /  __/ /  __/ / / / / /_/ / / / / / /
    /____/\___/_/\___/_/ /_/_/\__,_/_/ /_/ /_/
    ------------------------------------------

 */

/**
 * Класс представляет собой автотест функциональности веб-страницы.
 * Осуществляет поиск продукта, добавление его в корзину,
 * переход в корзину и оформления заказа.
 *
 * @author Akhmedli Aydan
 * @version 3.3.3
 */


public class AutoTestAdd {

    public static void main(String[] args) throws InterruptedException {
        // Устанавливаем путь к драйверу Chrome
        WebDriver driver = new ChromeDriver();// Создаем новый экземпляр WebDriver для Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver.manage().window().maximize();// Максимизируем окно браузера
        driver.get("https://moya-kniga.ru/");// Открываем главную страницу сайта

        //1. Находим поле для поиска и вводим запрос "Толстой"
        WebElement searchInputField = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div[1]/form/div[1]/input"));
        searchInputField.sendKeys("Толстой");
        searchInputField.submit();

        //2. Находим кнопку "Купить" и кликаем на нее
        WebElement buyButton = driver.findElement(By.xpath("/html/body/div[1]/section[4]/section/div/div/div[1]/div[1]/div[3]/div[2]/div/a"));
        buyButton.click();

        //3. Приостанавливаем выполнение программы для ожидания обновления страницы
        Thread.sleep(1000);

        //4. Находим кнопку "Корзина" и кликаем на нее
        WebElement goToCartButton = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div[2]/a/div[1]/div"));
        goToCartButton.click();

        //5. Находим кнопку "Выбрать", чтобы выбрать магазин и кликаем на нее
        WebElement chooseButton = driver.findElement(By.xpath("/html/body/div[1]/section[4]/section[1]/div/div[2]/div/div/div/div/div[5]/div[3]/div/div/span"));
        chooseButton.click();

        //6. Приостанавливаем выполнение программы для ожидания обновления страницы
        Thread.sleep(1000);

        //7. Убираем галочку с чек-бокса "в наличии"
        WebElement checkbox = driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/div[1]/div/div[3]/div[2]/div[2]"));
        checkbox.click();

        //8. Нажимаем радиокнопку с адресом "г. Саратов, ул. Осипова, д. 10 "А""
        WebElement radioButton = driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/div[1]/div/div[3]/div[2]/div[1]/div[5]/div/ins"));
        radioButton.click();

        //9. Нажимаем кнопку "Выбрать"
        WebElement chooseButton2 = driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/div[2]/div[1]/a"));
        chooseButton2.click();

        //10. Приостанавливаем выполнение программы для ожидания обновления страницы
        Thread.sleep(1000);

        //11. Находим кнопку "Доставка" и кликаем на нее
        WebElement deliveryButton = driver.findElement(By.xpath("/html/body/div[1]/section[4]/section[1]/div/div[3]/div[1]/div/div"));
        deliveryButton.click();

        //12. Находим кнопку "Далее" и кликаем на нее
        WebElement nextButton1 = driver.findElement(By.xpath("/html/body/div[1]/section[4]/div/form/div/div[1]/div[4]/div[2]/div[2]/div/a"));
        nextButton1.click();

        //13. Находим кнопку очистить поле и кликаем на нее
        WebElement clearButton = driver.findElement(By.xpath("/html/body/div[1]/section[4]/div/form/div/div[1]/div[5]/div[2]/div[2]/div/div[1]/div/div[1]/div[4]"));
        clearButton.click();

        //14. Приостанавливаем выполнение программы для ожидания обновления страницы
        Thread.sleep(1000);

        //15. Находим поле "Местоположение" и очищаем его
        WebElement clearAdressField = driver.findElement(By.xpath("/html/body/div[1]/section[4]/div/form/div/div[1]/div[5]/div[2]/div[2]/div/div[1]/div/div[1]/div[1]/input[2]"));
        clearAdressField.clear();

        //16. Находим поле для ввода Местоположения и вводим запрос "Саратов"
        WebElement locationInputField = driver.findElement(By.xpath("/html/body/div[1]/section[4]/div/form/div/div[1]/div[5]/div[2]/div[2]/div/div[1]/div[2]/div[1]/div[1]/input[2]"));
        locationInputField.sendKeys("Саратов");

        //17. Приостанавливаем выполнение программы для ожидания обновления страницы
        Thread.sleep(1000);

        //18. Находим строку "Саратов, Саратовская область, Россия" и кликаем на нее
        WebElement selectElement = driver.findElement(By.xpath("/html/body/div[1]/section[4]/div/form/div/div[1]/div[5]/div[2]/div[2]/div/div[1]/div[2]/div[1]/div[5]/div/div[1]"));
        selectElement.click();

        //19. Приостанавливаем выполнение программы для ожидания обновления страницы
        Thread.sleep(1000);

        //20. Находим кнопку "Далее" и кликаем на нее
        WebElement nextButton2 = driver.findElement(By.xpath("/html/body/div[1]/section[4]/div/form/div/div[1]/div[5]/div[2]/div[3]/div/a[2]"));
        nextButton2.click();

        //21. Приостанавливаем выполнение программы для ожидания обновления страницы
        Thread.sleep(1000);

        //22. Указываем галочку в чек-бокс с видом доставки "Самовывоз"
        WebElement checkbox2 = driver.findElement(By.xpath("/html/body/div[1]/section[4]/div/form/div/div[1]/div[6]/div[2]/div[2]/div[1]/div[2]/div[1]/input"));
        checkbox2.click();

        //23. Приостанавливаем выполнение программы для ожидания обновления страницы
        Thread.sleep(1000);

        //24. Находим кнопку "Выбрать ПВЗ" и кликаем на нее
        WebElement selectItem = driver.findElement(By.xpath("/html/body/div[1]/section[4]/div/form/div/div[1]/div[6]/div[2]/div[2]/div[2]/div/div[3]/div/div/div/a"));
        selectItem.click();

        //25. Приостанавливаем выполнение программы для ожидания обновления страницы
        Thread.sleep(1000);

        //26. Находим строку с адресом "SAR100, Саратов, ул. Кузнецова" и кликаем на нее
        WebElement selectAdressElement = driver.findElement(By.xpath("/html/body/div[5]/div[3]/div[3]/div[1]/div/div[1]/p[1]"));
        selectAdressElement.click();

        //27. Приостанавливаем выполнение программы для ожидания обновления страницы
        Thread.sleep(1000);

        //28. Находим кнопку "Выбрать" и кликаем на нее
        WebElement findSelectButton = driver.findElement(By.xpath("/html/body/div[5]/div[2]/ymaps/ymaps/ymaps/ymaps[6]/ymaps/ymaps/ymaps/ymaps[1]/ymaps[2]/ymaps/ymaps/div/div[6]/a"));
        findSelectButton.click();

        //29. Приостанавливаем выполнение программы для ожидания обновления страницы
        Thread.sleep(10000);

        //30. Находим кнопку Далее и кликаем на нее
        WebElement nextStepButton = driver.findElement(By.xpath("/html/body/div[1]/section[4]/div/form/div/div[1]/div[6]/div[2]/div[3]/div/a[2]"));
        nextStepButton.click();

        //31. Приостанавливаем выполнение программы для ожидания обновления страницы
        Thread.sleep(5000);

        //32. В разделе Оплата кликаем на кнопку "Далее"
        WebElement nextPaymentButton = driver.findElement(By.xpath("/html/body/div[1]/section[4]/div/form/div/div[1]/div[8]/div[2]/div[3]/div/a[2]"));
        nextPaymentButton.click();

        //33. Приостанавливаем выполнение программы для ожидания обновления страницы
        Thread.sleep(1000);

        //34. Находим строку "ФИО" и вносим в нее следующие данные: "Иванов Иван Иванович"
        WebElement findFullNameLine = driver.findElement(By.xpath("/html/body/div[1]/section[4]/div/form/div/div[1]/div[9]/div[2]/div[2]/div[1]/div[1]/div/input"));
        findFullNameLine.sendKeys("Иванов Иван Иванович");

        //35. Находим строку "E-Mail" и вносим в нее следующие данные: "ivanov-ivan@yandex.ru"
        WebElement findEmailLine = driver.findElement(By.xpath("/html/body/div[1]/section[4]/div/form/div/div[1]/div[9]/div[2]/div[2]/div[1]/div[2]/div/input"));
        findEmailLine.sendKeys("ivanov-ivan@yandex.ru");

        //36. Находим строку "Телефон" и вносим в нее следующие данные: "+79999999999"
        WebElement findPhonelLine = driver.findElement(By.xpath("/html/body/div[1]/section[4]/div/form/div/div[1]/div[9]/div[2]/div[2]/div[1]/div[3]/div/input"));
        findPhonelLine.sendKeys("+79999999999");

        //37. Находим строку "Дом" и вносим в нее следующие данные: "35"
        WebElement findHomeLine = driver.findElement(By.xpath("/html/body/div[1]/section[4]/div/form/div/div[1]/div[9]/div[2]/div[2]/div[1]/div[4]/div/input"));
        findHomeLine.sendKeys("35");

        //38. Находим строку "Street" и вносим в нее следующие данные: "Московская"
        WebElement findStreetLine = driver.findElement(By.xpath("/html/body/div[1]/section[4]/div/form/div/div[1]/div[9]/div[2]/div[2]/div[1]/div[6]/div/input"));
        findStreetLine.sendKeys("Московская");

        //39. Приостанавливаем выполнение программы для ожидания обновления страницы
        Thread.sleep(5000);

        //40. Указываем галочку в чек-бокс для подтверждения согласия
        WebElement checkbox3 = driver.findElement(By.xpath("/html/body/div[1]/section[4]/div/form/div/div[1]/div[10]/input"));
        checkbox3.click();

        //41. Приостанавливаем выполнение программы для ожидания обновления страницы
        Thread.sleep(10000);

        //42. Находим кнопку "Оформить заказ" и кликаем на нее
        WebElement selectOrderButton = driver.findElement(By.xpath("/html/body/div[1]/section[4]/div/form/div/div[1]/div[11]/a"));
        selectOrderButton.click();



    }
}

