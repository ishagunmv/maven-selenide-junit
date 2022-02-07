package tests.build;
import com.codeborne.selenide.Condition;
import common.Listener;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import tests.base.BaseTest;

import static data.Constant.Url.*;


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

    /** release start */
    @Test
    void atomReleaseTest(){
        basePage.goToUrl(RELEASE_JENKINS);
        jenkinsPage.selectAtom();
        jenkinsPage.startBuild();
    }

    @Test
    void arteriaReleaseTest(){
        basePage.goToUrl(RELEASE_JENKINS);
        jenkinsPage.selectArteria();
        jenkinsPage.startBuild();
    }

    @Test
    void arteriaSocReleaseTest(){
        basePage.goToUrl(RELEASE_JENKINS);
        jenkinsPage.selectArteriaSoc();
        jenkinsPage.startBuild();
    }

    @Test
    void x86_64ReleaseTest(){
        basePage.goToUrl(RELEASE_JENKINS);
        jenkinsPage.selectX86_64();
        jenkinsPage.startBuild();
    }

    @Test
    void liraReleaseTest(){
        basePage.goToUrl(RELEASE_JENKINS);
        jenkinsPage.selectLira();
        jenkinsPage.startBuild();
    }

    @Test
    void jetsonReleaseTest(){
        basePage.goToUrl(RELEASE_JENKINS);
        jenkinsPage.selectJetson();
        jenkinsPage.startBuild();
    }

    /** master start */
    @Test
    void atomMasterTest(){
        basePage.goToUrl(MASTER_JENKINS);
        jenkinsPage.selectAtom();
        jenkinsPage.startBuild();
    }

    @Test
    void arteriaMasterTest(){
        basePage.goToUrl(MASTER_JENKINS);
        jenkinsPage.selectArteria();
        jenkinsPage.startBuild();
    }

    @Test
    void arteriaSocMasterTest(){
        basePage.goToUrl(MASTER_JENKINS);
        jenkinsPage.selectArteriaSoc();
        jenkinsPage.startBuild();
    }

    @Test
    void x86_64MasterTest(){
        basePage.goToUrl(MASTER_JENKINS);
        jenkinsPage.selectX86_64();
        jenkinsPage.startBuild();
    }

    @Test
    void liraMasterTest(){
        basePage.goToUrl(MASTER_JENKINS);
        jenkinsPage.selectLira();
        jenkinsPage.startBuild();
    }

    @Test
    void jetsonMasterTest(){
        basePage.goToUrl(MASTER_JENKINS);
        jenkinsPage.selectJetson();
        jenkinsPage.startBuild();
    }
}
