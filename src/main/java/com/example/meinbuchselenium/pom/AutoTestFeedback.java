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
 * Открывает страницу Обратная связь, заполняет форму, отправляет форму.
 *
 *
 * @author Akhmedli Aydan
 * @version 3.3.3
 */


public class AutoTestFeedback {

    public static void main(String[] args) throws InterruptedException {
        // Устанавливаем путь к драйверу Chrome
        WebDriver driver = new ChromeDriver();// Создаем новый экземпляр WebDriver для Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver.manage().window().maximize();// Максимизируем окно браузера
        driver.get("https://moya-kniga.ru/");// Открываем главную страницу сайта

        //1. Находим раздел "Предложения для организаций" и кликаем по нему
        WebElement offersButton = driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div/div[5]/a"));
        offersButton.click();

        //2. Находим поле "Ваше имя" и вводим имя "Иван"
        WebElement findNameField = driver.findElement(By.xpath("/html/body/div[1]/section[4]/section[2]/div/form/div[1]/div[1]/input"));
        findNameField.sendKeys("Иван");

        //3. Находим строку "Телефон" и вносим в нее следующие данные: "+79999999999"
        WebElement findPhonelLine = driver.findElement(By.xpath("/html/body/div[1]/section[4]/section[2]/div/form/div[1]/div[2]/input"));
        findPhonelLine.sendKeys("+79999999999");

        //5. Находим поле "Электронная почта" и вводим адрес "ivanov-ivan@yandex.ru"
        WebElement findEmailField = driver.findElement(By.xpath("/html/body/div[1]/section[4]/section[2]/div/form/div[1]/div[3]/input"));
        findEmailField.sendKeys("ivanov-ivan@yandex.ru");

        //6. Указываем галочку в чек-бокс для подтверждения согласия
        WebElement checkbox = driver.findElement(By.xpath("/html/body/div[1]/section[4]/section[2]/div/form/div[2]/input"));
        checkbox.click();

        //7. Приостанавливаем выполнение программы для ожидания обновления страницы
        Thread.sleep(10000);

        //8. Находим кнопку "Отправить" и кликаем на нее
        WebElement sendFormButton = driver.findElement(By.xpath("/html/body/div[1]/section[4]/section[2]/div/form/div[3]/a"));
        sendFormButton.click();


    }

}

