const {Builder, By, Key, untill} = require('salenium-webdriver');
var BasePage = require ('./pageobjects/basepage');
var webdriver = require('salenium-webdriver');


class HomePage extends BAsePage {
    enter_search(searchText){
        //This will enter text in to the search field
        driver.findElement(By.css('input[name=q]')).sendKeys(searchText)
        //this will send  the enter key to the element
        driver.findElement(By.css('input[name=q]')).sendKeys(Key.ENTER)
    }
}

module.exports = HomePage;