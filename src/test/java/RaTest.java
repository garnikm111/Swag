import org.junit.jupiter.api.Test;

public class RaTest extends RaBaseTest {
    RestAssuredPage restAssuredPage= new RestAssuredPage();

    @Test
    public void ra1(){
        restAssuredPage.ra1();
    }

    @Test
    public void raPut1() {
        restAssuredPage.raPut1();
    }

    @Test
    public void raGet1() {
        restAssuredPage.raGet1();
    }

}
