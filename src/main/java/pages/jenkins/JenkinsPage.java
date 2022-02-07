package pages.jenkins;

import com.codeborne.selenide.*;
import pages.base.BasePage;

import static com.codeborne.selenide.Selenide.$x;
import static data.Constant.UsersData.LOGIN_JENKINS;
import static data.Constant.UsersData.PASSWORD_JENKINS;

public class JenkinsPage extends BasePage {


    public void logInJenkins() {
        logIn.shouldBe(Condition.visible).click();
        inputUsername.shouldBe(Condition.visible).sendKeys(LOGIN_JENKINS);
        inputPassword.shouldBe(Condition.visible).sendKeys(PASSWORD_JENKINS);
        buttonLogIn.shouldBe(Condition.visible).click();
    }

    public void startBuild() {
        buttonBuild.shouldBe(Condition.visible).click();
    }

    public void  selectAtom() {
        buildPage.shouldBe(Condition.visible).click();
        selectDeviceType.shouldBe(Condition.visible).selectOptionByValue("SENSOR_ATOM");
    }

    public void  selectArteria() {
        buildPage.shouldBe(Condition.visible).click();
        selectDeviceType.shouldBe(Condition.visible).selectOptionByValue("SENSOR_ARTERIA");
    }

    public void  selectArteriaSoc() {
        buildPage.shouldBe(Condition.visible).click();
        selectDeviceType.shouldBe(Condition.visible).selectOptionByValue("SENSOR_ARTERIA_SOC");
    }

    public void  selectX86_64() {
        buildPage.shouldBe(Condition.visible).click();
        selectDeviceType.shouldBe(Condition.visible).selectOptionByValue("X86_64");
    }

    public void  selectLira() {
        buildPage.shouldBe(Condition.visible).click();
        selectDeviceType.shouldBe(Condition.visible).selectOptionByValue("SENSOR_LIRA");
    }

    public void  selectJetson() {
        buildPage.shouldBe(Condition.visible).click();
        selectDeviceType.shouldBe(Condition.visible).selectOptionByValue("SENSOR_JETSON");
    }

    /** xpath */
    public final SelenideElement logIn = $x("//a/b[text()='log in']");
    public final SelenideElement inputUsername = $x("//input[@name='j_username']");
    public final SelenideElement inputPassword = $x("//input[@name='j_password']");
    public final SelenideElement buttonLogIn = $x("//button[@id='yui-gen1-button']");

    public final SelenideElement release521 = $x("//a[@href='job/Release_5.21/']");
    public final SelenideElement trunkReleaseCandidate = $x("//a[@href='job/Trunk_Release_Candidate/']");

    public final SelenideElement buildPage = $x("//a[text()='Build with Parameters']");
    public final SelenideElement buttonBuild = $x("//button[@id='yui-gen1-button']");
    public final SelenideElement selectDeviceType = $x("//select/option[@value='ALL']/..");


}
