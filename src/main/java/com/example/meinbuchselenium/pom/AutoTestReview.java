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
 * Осуществляет поиск продукта, открывает карточку книги,
 * открывает форму отзыва, размещает отзыва.
 *
 * @author Akhmedli Aydan
 * @version 3.3.3
 */


public class AutoTestReview {

    public static void main(String[] args) throws InterruptedException {
        // Устанавливаем путь к драйверу Chrome
        WebDriver driver = new ChromeDriver();// Создаем новый экземпляр WebDriver для Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver.manage().window().maximize();// Максимизируем окно браузера
        driver.get("https://moya-kniga.ru/");// Открываем главную страницу сайта

        //1. Находим поле для поиска и вводим запрос "Джейн Эйр"
        WebElement searchInputField = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div[1]/form/div[1]/input"));
        searchInputField.sendKeys("Джейн Эйр");
        searchInputField.submit();

        //2. Находим название книги и кликаем на него
        WebElement bookNameButton = driver.findElement(By.xpath("/html/body/div[1]/section[4]/section/div/div/div[1]/div[2]/div[1]/a/div"));
        bookNameButton.click();

        //3. Находим кнопку "Оставить отзыв" и кликаем на нее
        WebElement leaveAReviewButton = driver.findElement(By.xpath("/html/body/div[1]/section[4]/section[2]/div/div/a"));
        leaveAReviewButton.click();

        //4. Находим поле "Ваше имя" и вводим имя "Иван"
        WebElement findNameField = driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/form/div[1]/div[2]/div/div/div[2]/input"));
        findNameField.sendKeys("Иван");

        //5. Находим поле "Электронная почта" и вводим адрес "ivanov-ivan@yandex.ru"
        WebElement findEmailField = driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/form/div[1]/div[2]/div/div/div[3]/input"));
        findEmailField.sendKeys("ivanov-ivan@yandex.ru");

        //6. Указываем галочку в чек-бокс для подтверждения согласия
        WebElement checkbox = driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/form/div[1]/div[2]/div/div/div[4]/input"));
        checkbox.click();

        //7. Находим окошко "Оставьте свой отзыв о товаре" и вносим в него отзыв о книге
        WebElement findReviewForm = driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/form/div[1]/div[3]/div/div/textarea"));
        findReviewForm.sendKeys("Идеальный готический роман");

        //8. Находим строку "Оцените товар" и выберите оценку "4*"
        WebElement findRateButton = driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/form/div[1]/div[4]/div/div[2]/div[4]"));
        findRateButton.click();

        //9. Находим кнопку "Оставить отзыв" и кликаем на нее
        WebElement leaveReviewButton = driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/form/div[2]/div/div/a"));
        leaveReviewButton.click();

        //Итог: выходит ошибка "Сервис временно недоступен", оставить отзыв на данный момент невозможно


    }

}


















