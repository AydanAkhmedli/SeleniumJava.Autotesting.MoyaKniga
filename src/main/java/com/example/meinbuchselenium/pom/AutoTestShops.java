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
 * Осуществляет переход в раздел "Магазины", открывает страницу с адресами,
 * выбирает и просматривает выбранного магазина.
 *
 * @author Akhmedli Aydan
 * @version 3.3.3
 */


public class AutoTestShops {

    public static void main(String[] args) {
        // Устанавливаем путь к драйверу Chrome
        WebDriver driver = new ChromeDriver();// Создаем новый экземпляр WebDriver для Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver.manage().window().maximize();// Максимизируем окно браузера
        driver.get("https://moya-kniga.ru/");// Открываем главную страницу сайта

        //1. Находим кнопку "Магазины" в футере сайта
        WebElement shopsButton = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[4]/div[1]/a"));
        shopsButton.click();

        //2. Находим адрес "ул. Чапаева, д. 79" и кликаем на нее
        WebElement adressString = driver.findElement(By.xpath("/html/body/div[1]/section[4]/div/div[1]/section/div[15]/div/div/div/div[1]/p/a"));
        adressString.click();



    }

}




