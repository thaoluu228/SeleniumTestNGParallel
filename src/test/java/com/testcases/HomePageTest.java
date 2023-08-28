package com.testcases;

import com.common.BaseTest;
import com.pages.HomePage;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
    HomePage homePage;

    @Test
    public void checkCurrentURL() throws Exception {
        homePage = new HomePage();
//        homePage.verifyURL("https://f45training.com/lowereastside","https://f45training.com/studio/lowereastside/" );

        homePage.verifyURL("https://f45training.com/studio/lowereastside/","https://f45training.com/studio/lowereastside/");
        homePage.verifyURL("https://f45training.com/studio/lowereastside/find-this-studio/","https://f45training.com/studio/lowereastside/find-this-studio/");
        homePage.verifyURL("https://f45training.com/studio/lowereastside/new-to-f45/","https://f45training.com/studio/lowereastside/new-to-f45/");
        homePage.verifyURL("https://f45training.com/studio/lowereastside/?plan=500075","https://f45training.com/studio/lowereastside/?plan=500075");

        homePage.verifyURL("https://f45training.com/lowereastside","https://f45training.com/studio/lowereastside/");
        homePage.verifyURL("https://f45training.com/lowereastside/","https://f45training.com/studio/lowereastside/");

        homePage.verifyURL("https://f45training.com/lowereastside/home","https://f45training.com/studio/lowereastside/");
        homePage.verifyURL("https://f45training.com/lowereastside/home/","https://f45training.com/studio/lowereastside/");

        homePage.verifyURL("https://f45training.com/lowereastside/new-to-f45","https://f45training.com/studio/lowereastside/new-to-f45/");
        homePage.verifyURL("https://f45training.com/lowereastside/new-to-f45/","https://f45training.com/studio/lowereastside/new-to-f45/");

        homePage.verifyURL("https://f45training.com/lowereastside/trial","https://f45training.com/studio/lowereastside/?trial=1");
        homePage.verifyURL("https://f45training.com/lowereastside/trial/","https://f45training.com/studio/lowereastside/?trial=1");

        homePage.verifyURL("https://f45training.com/lowereastside/find-us","https://f45training.com/studio/lowereastside/find-this-studio/");
        homePage.verifyURL("https://f45training.com/lowereastside/find-us/","https://f45training.com/studio/lowereastside/find-this-studio/");

        homePage.verifyURL("https://f45training.com/lowereastside/about","https://f45training.com/studio/lowereastside/");
        homePage.verifyURL("https://f45training.com/lowereastside/about/","https://f45training.com/studio/lowereastside/");

        homePage.verifyURL("https://f45training.com/lowereastside/schedule","https://f45training.com/studio/lowereastside/#schedule");
        homePage.verifyURL("https://f45training.com/lowereastside/schedule/","https://f45training.com/studio/lowereastside/#schedule");

        homePage.verifyURL("https://f45training.com/lowereastside/join","https://f45training.com/studio/lowereastside/");
        homePage.verifyURL("https://f45training.com/lowereastside/join/","https://f45training.com/studio/lowereastside/");

        homePage.verifyURL("https://f45training.com/lowereastside/join/500075","https://f45training.com/studio/lowereastside/?plan=500075");
        homePage.verifyURL("https://f45training.com/lowereastside/join/500075/","https://f45training.com/studio/lowereastside/?plan=500075");

        homePage.verifyURL("https://f45training.com/lowereastside/challenge-signup","https://f45training.com/studio/lowereastside/");
        homePage.verifyURL("https://f45training.com/lowereastside/challenge-signup/","https://f45training.com/studio/lowereastside/");

        homePage.verifyURL("https://f45training.com/lowereastside/live","https://f45training.com/studio/lowereastside/");
        homePage.verifyURL("https://f45training.com/lowereastside/live/","https://f45training.com/studio/lowereastside/");


        homePage.verifyURL("https://f45training.com/au/studio/deewhy/","https://f45training.com/au/studio/deewhy/");
        homePage.verifyURL("https://f45training.com/au/studio/deewhy/find-this-studio/","https://f45training.com/au/studio/deewhy/find-this-studio/");
        homePage.verifyURL("https://f45training.com/au/studio/deewhy/new-to-f45/","https://f45training.com/au/studio/deewhy/new-to-f45/");
        homePage.verifyURL("https://f45training.com/au/studio/deewhy/?plan=120","https://f45training.com/au/studio/deewhy/?plan=120");

        homePage.verifyURL("https://f45training.com/deewhy","https://f45training.com/au/studio/deewhy/");
        homePage.verifyURL("https://f45training.com/deewhy/","https://f45training.com/au/studio/deewhy/");

        homePage.verifyURL("https://f45training.com/deewhy/home","https://f45training.com/au/studio/deewhy/");
        homePage.verifyURL("https://f45training.com/deewhy/home/","https://f45training.com/au/studio/deewhy/");

        homePage.verifyURL("https://f45training.com/deewhy/new-to-f45","https://f45training.com/au/studio/deewhy/new-to-f45/");
        homePage.verifyURL("https://f45training.com/deewhy/new-to-f45/","https://f45training.com/au/studio/deewhy/new-to-f45/");

        homePage.verifyURL("https://f45training.com/deewhy/trial","https://f45training.com/au/studio/deewhy/?trial=1");
        homePage.verifyURL("https://f45training.com/deewhy/trial","https://f45training.com/au/studio/deewhy/?trial=1");

        homePage.verifyURL("https://f45training.com/deewhy/find-us","https://f45training.com/au/studio/deewhy/find-this-studio/");
        homePage.verifyURL("https://f45training.com/deewhy/find-us/","https://f45training.com/au/studio/deewhy/find-this-studio/");

        homePage.verifyURL("https://f45training.com/deewhy/about","https://f45training.com/au/studio/deewhy/");
        homePage.verifyURL("https://f45training.com/deewhy/about/","https://f45training.com/au/studio/deewhy/");

        homePage.verifyURL("https://f45training.com/deewhy/schedule","https://f45training.com/au/studio/deewhy/#schedule");
        homePage.verifyURL("https://f45training.com/deewhy/schedule/","https://f45training.com/au/studio/deewhy/#schedule");

        homePage.verifyURL("https://f45training.com/deewhy/join","https://f45training.com/au/studio/deewhy/");
        homePage.verifyURL("https://f45training.com/deewhy/join/","https://f45training.com/au/studio/deewhy/");

        homePage.verifyURL("https://f45training.com/deewhy/join/120","https://f45training.com/au/studio/deewhy/?plan=120");
        homePage.verifyURL("https://f45training.com/deewhy/join/120/","https://f45training.com/au/studio/deewhy/?plan=120");

        homePage.verifyURL("https://f45training.com/deewhy/challenge-signup","https://f45training.com/au/studio/deewhy/");
        homePage.verifyURL("https://f45training.com/deewhy/challenge-signup/","https://f45training.com/au/studio/deewhy/");

        homePage.verifyURL("https://f45training.com/deewhy/live","https://f45training.com/au/studio/deewhy/");
        homePage.verifyURL("https://f45training.com/deewhy/live/","https://f45training.com/au/studio/deewhy/");


        homePage.verifyURL("https://f45training.com/au/studio/seaford-aldinga/","https://f45training.com/au/studio/seaford-aldinga/");
        homePage.verifyURL("https://f45training.com/au/studio/seaford-aldinga/find-this-studio/","https://f45training.com/au/studio/seaford-aldinga/find-this-studio/");
        homePage.verifyURL("https://f45training.com/au/studio/seaford-aldinga/new-to-f45/","https://f45training.com/au/studio/seaford-aldinga/new-to-f45/");
        homePage.verifyURL("https://f45training.com/au/studio/seaford-aldinga/?plan=104078","https://f45training.com/au/studio/seaford-aldinga/?plan=104078");

        homePage.verifyURL("https://f45training.com/seaford-aldinga","https://f45training.com/au/studio/seaford-aldinga/");
        homePage.verifyURL("https://f45training.com/seaford-aldinga/","https://f45training.com/au/studio/seaford-aldinga/");

        homePage.verifyURL("https://f45training.com/seaford-aldinga/home","https://f45training.com/au/studio/seaford-aldinga/");
        homePage.verifyURL("https://f45training.com/seaford-aldinga/home/","https://f45training.com/au/studio/seaford-aldinga/");

        homePage.verifyURL("https://f45training.com/seaford-aldinga/new-to-f45","https://f45training.com/au/studio/seaford-aldinga/new-to-f45/");
        homePage.verifyURL("https://f45training.com/seaford-aldinga/new-to-f45/","https://f45training.com/au/studio/seaford-aldinga/new-to-f45/");

        homePage.verifyURL("https://f45training.com/seaford-aldinga/trial","https://f45training.com/au/studio/seaford-aldinga/?trial=1");
        homePage.verifyURL("https://f45training.com/seaford-aldinga/trial/","https://f45training.com/au/studio/seaford-aldinga/?trial=1");

        homePage.verifyURL("https://f45training.com/seaford-aldinga/find-us","https://f45training.com/au/studio/seaford-aldinga/find-this-studio/");
        homePage.verifyURL("https://f45training.com/seaford-aldinga/find-us/","https://f45training.com/au/studio/seaford-aldinga/find-this-studio/");

        homePage.verifyURL("https://f45training.com/seaford-aldinga/about","https://f45training.com/au/studio/seaford-aldinga/");
        homePage.verifyURL("https://f45training.com/seaford-aldinga/about/","https://f45training.com/au/studio/seaford-aldinga/");

        homePage.verifyURL("https://f45training.com/seaford-aldinga/schedule","https://f45training.com/au/studio/seaford-aldinga/#schedule");
        homePage.verifyURL("https://f45training.com/seaford-aldinga/schedule/","https://f45training.com/au/studio/seaford-aldinga/#schedule");

        homePage.verifyURL("https://f45training.com/seaford-aldinga/join","https://f45training.com/au/studio/seaford-aldinga/");
        homePage.verifyURL("https://f45training.com/seaford-aldinga/join/","https://f45training.com/au/studio/seaford-aldinga/");

        homePage.verifyURL("https://f45training.com/seaford-aldinga/join/104078","https://f45training.com/au/studio/seaford-aldinga/?plan=104078");
        homePage.verifyURL("https://f45training.com/seaford-aldinga/join/104078/","https://f45training.com/au/studio/seaford-aldinga/?plan=104078");

        homePage.verifyURL("https://f45training.com/seaford-aldinga/challenge-signup","https://f45training.com/au/studio/seaford-aldinga/");
        homePage.verifyURL("https://f45training.com/seaford-aldinga/challenge-signup/","https://f45training.com/au/studio/seaford-aldinga/");

        homePage.verifyURL("https://f45training.com/seaford-aldinga/live","https://f45training.com/au/studio/seaford-aldinga/");
        homePage.verifyURL("https://f45training.com/seaford-aldinga/live/","https://f45training.com/au/studio/seaford-aldinga/");


    }
}
