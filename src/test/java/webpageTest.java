import org.junit.jupiter.api.*;

public class webpageTest extends BaseTestClass{


    @Test
    @Order(1)
    public void set_mail() {
        webpage.set_mail("kirk22311@lotmail.net");
        System.out.println("E-mail set");
    }

    @Test
    @Order(2)
    public void set_password() {
        webpage.set_password("kirk22311");
        System.out.println("Password set");
    }

    @AfterAll
    @Order(3)
    public void login() {
        webpage.login();
        System.out.println("LOGGED IN!!");
    }
    /////////////////////////////////////////////////////

}
