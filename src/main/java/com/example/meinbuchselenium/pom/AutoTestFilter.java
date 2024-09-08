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
 * Открывает список продуктов, настраивает фильтр, выдает книги издательства "Азбука".
 *
 *
 * @author Akhmedli Aydan
 * @version 3.3.3
 */


public class AutoTestFilter {

    public static void main(String[] args) throws InterruptedException {
        // Устанавливаем путь к драйверу Chrome
        WebDriver driver = new ChromeDriver();// Создаем новый экземпляр WebDriver для Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver.manage().window().maximize();// Максимизируем окно браузера
        driver.get("https://moya-kniga.ru/");// Открываем главную страницу сайта

        //1. Находим раздел "Художественная литература" и кликаем по нему
        WebElement sectionButton = driver.findElement(By.xpath("/html/body/div[1]/section[3]/div/div/div/div[8]/div/a"));
        sectionButton.click();

        //2. Находим раздел "Классическая литература" и кликаем по нему
        WebElement classicalLiteratureSection = driver.findElement(By.xpath("/html/body/div[1]/section[4]/section/div/div[2]/a[4]/div[1]/div"));
        classicalLiteratureSection.click();

        //3. Находим раздел "Зарубежная литература" и кликаем по нему
        WebElement foreignlLiteratureSection = driver.findElement(By.xpath("/html/body/div[1]/section[4]/section/div/div[2]/a[1]/div[1]/div"));
        foreignlLiteratureSection.click();

        //4. Находим раздел "Издательство" и кликаем на него
        WebElement publishSection = driver.findElement(By.xpath("/html/body/div[1]/section[4]/section[1]/div/div/div[1]/div[1]/div/form/div[1]/div[2]/div[1]"));
        publishSection.click();

        //5. Указываем галочку в чек-боксе издательства "Азбука"
        WebElement checkbox = driver.findElement(By.xpath("/html/body/div[1]/section[4]/section[1]/div/div/div[1]/div[1]/div/form/div[1]/div[2]/div[3]/div/div/div[1]/div[1]/div"));
        checkbox.click();

        //6. Находим кнопку "Применить" и кликаем на нее
        WebElement applyButton = driver.findElement(By.xpath("/html/body/div[1]/section[4]/section[1]/div/div/div[1]/div[1]/div/form/div[2]/div[1]/input"));
        applyButton.click();


    }

}


