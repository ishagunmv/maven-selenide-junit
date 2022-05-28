package pages.jenkins;

import com.codeborne.selenide.*;
import pages.base.BasePage;

import static com.codeborne.selenide.Selenide.$x;

public class JenkinsPage extends BasePage {


    public void logInJenkins() {
        logIn.shouldBe(Condition.visible).click();
        inputUsername.shouldBe(Condition.visible).sendKeys("shagun");
        inputPassword.shouldBe(Condition.visible).sendKeys("d7g0wp4");
        buttonLogIn.shouldBe(Condition.visible).click();
    }


    public void startBuild(){
        buildPage.shouldBe(Condition.visible).click();
        buttonBuild.shouldBe(Condition.visible).click();
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

}
