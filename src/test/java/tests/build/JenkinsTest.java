package tests.build;
import com.codeborne.selenide.Condition;
import common.Listener;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import tests.base.BaseTest;

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

    /** 5.21 start */
    @Test
    void atom521Test(){
        jenkinsPage.release521.shouldBe(Condition.visible).click();
        jenkinsPage.selectAtom();
        jenkinsPage.startBuild();
    }

    @Test
    void arteria521Test(){
        jenkinsPage.release521.shouldBe(Condition.visible).click();
        jenkinsPage.selectArteria();
        jenkinsPage.startBuild();
    }

    @Test
    void arteriaSoc521Test(){
        jenkinsPage.release521.shouldBe(Condition.visible).click();
        jenkinsPage.selectArteriaSoc();
        jenkinsPage.startBuild();
    }

    @Test
    void x86_64_521Test(){
        jenkinsPage.release521.shouldBe(Condition.visible).click();
        jenkinsPage.selectX86_64();
        jenkinsPage.startBuild();
    }

    @Test
    void lira521Test(){
        jenkinsPage.release521.shouldBe(Condition.visible).click();
        jenkinsPage.selectLira();
        jenkinsPage.startBuild();
    }

    @Test
    void jetson521Test(){
        jenkinsPage.release521.shouldBe(Condition.visible).click();
        jenkinsPage.selectJetson();
        jenkinsPage.startBuild();
    }

    /** master start */
    @Test
    void atomMasterTest(){
        jenkinsPage.trunkReleaseCandidate.shouldBe(Condition.visible).click();
        jenkinsPage.selectAtom();
        jenkinsPage.startBuild();
    }

    @Test
    void arteriaMasterTest(){
        jenkinsPage.trunkReleaseCandidate.shouldBe(Condition.visible).click();
        jenkinsPage.selectArteria();
        jenkinsPage.startBuild();
    }

    @Test
    void arteriaSocMasterTest(){
        jenkinsPage.trunkReleaseCandidate.shouldBe(Condition.visible).click();
        jenkinsPage.selectArteriaSoc();
        jenkinsPage.startBuild();
    }

    @Test
    void x86_64MasterTest(){
        jenkinsPage.trunkReleaseCandidate.shouldBe(Condition.visible).click();
        jenkinsPage.selectX86_64();
        jenkinsPage.startBuild();
    }

    @Test
    void liraMasterTest(){
        jenkinsPage.trunkReleaseCandidate.shouldBe(Condition.visible).click();
        jenkinsPage.selectLira();
        jenkinsPage.startBuild();
    }

    @Test
    void jetsonMasterTest(){
        jenkinsPage.trunkReleaseCandidate.shouldBe(Condition.visible).click();
        jenkinsPage.selectJetson();
        jenkinsPage.startBuild();
    }
}
