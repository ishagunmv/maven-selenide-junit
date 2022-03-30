package tests.build;

import common.Listener;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import tests.base.BaseTest;

import static data.Constant.Builder.*;
import static data.Constant.Url.JENKINS;


@Feature("Jenkins autostart build")
@Story("build firmware device")
//@Execution(ExecutionMode.CONCURRENT) // Запуск тестов в нескольких потоках
@ExtendWith(Listener.class)

public class JenkinsTest extends BaseTest {


    @BeforeEach
    void loginJenkinsTest(){
        basePage.goToUrl(JENKINS);
        jenkinsPage.logInJenkins();
    }

    /** one build */
    @Test
    void atomOneBuildTest(){
        basePage.goToUrl(ONE_BUILD_JENKINS);
        jenkinsPage.selectAtom();
        jenkinsPage.startBuild();
    }

    @Test
    void arteriaOneBuildTest(){
        basePage.goToUrl(ONE_BUILD_JENKINS);
        jenkinsPage.selectArteria();
        jenkinsPage.startBuild();
    }

    @Test
    void arteriaSocOneBuildTest(){
        basePage.goToUrl(ONE_BUILD_JENKINS);
        jenkinsPage.selectArteriaSoc();
        jenkinsPage.startBuild();
    }

    @Test
    void x86_64OneBuildTest(){
        basePage.goToUrl(ONE_BUILD_JENKINS);
        jenkinsPage.selectX86_64();
        jenkinsPage.startBuild();
    }

    @Test
    void liraOneBuildTest(){
        basePage.goToUrl(ONE_BUILD_JENKINS);
        jenkinsPage.selectLira();
        jenkinsPage.startBuild();
    }

    @Test
    void jetsonOneBuildTest(){
        basePage.goToUrl(ONE_BUILD_JENKINS);
        jenkinsPage.selectJetson();
        jenkinsPage.startBuild();
    }

    /** two build */
    @Test
    void atomTwoBuildTest(){
        basePage.goToUrl(TWO_BUILD_JENKINS);
        jenkinsPage.selectAtom();
        jenkinsPage.startBuild();
    }

    @Test
    void arteriaTwoBuildTest(){
        basePage.goToUrl(TWO_BUILD_JENKINS);
        jenkinsPage.selectArteria();
        jenkinsPage.startBuild();
    }

    @Test
    void arteriaSocTwoBuildTest(){
        basePage.goToUrl(TWO_BUILD_JENKINS);
        jenkinsPage.selectArteriaSoc();
        jenkinsPage.startBuild();
    }

    @Test
    void x86_64TwoBuildTest(){
        basePage.goToUrl(TWO_BUILD_JENKINS);
        jenkinsPage.selectX86_64();
        jenkinsPage.startBuild();
    }

    @Test
    void liraTwoBuildTest(){
        basePage.goToUrl(TWO_BUILD_JENKINS);
        jenkinsPage.selectLira();
        jenkinsPage.startBuild();
    }

    @Test
    void jetsonTwoBuildTest(){
        basePage.goToUrl(TWO_BUILD_JENKINS);
        jenkinsPage.selectJetson();
        jenkinsPage.startBuild();
    }
}
