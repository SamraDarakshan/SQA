const hompage = require('../pageobjects/homepage')

describe('This is the describe block', function(){
    this.timeout(50000);
    beforeEach(function(){
        //Enter actions performed before test
    });
    afterEach(function(){
        //enter actions to be performed after test
    });
    
    it('POM Test', function(){
        //enter test steps
        var baseurl = 'https://www.google.com/'
        homepage.go_to_url(baseurl);
        hompage.enter_search('QA undergriund tutorial for beginner');
    })
})