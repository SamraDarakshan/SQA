var webdriver = require ('salenium-webdriver');
var driver = new webdriver.Builder().forBrowser('chrome)'.build())
driver.manage().setTimeouts({implicit: (10000)});

class BasePage{
    constructor(){
        globalThis.driver = driver;

    }
    go_to_url(){
        driver.get(theURL)
    }
}

module.exports = BasePage;