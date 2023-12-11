package casumoTest;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
// Standard Test - Checks to see what the service does when offered only special characters.
public class SpecialCharsOnlyTest {

    @Test
    public void testDevowelizerService() {
        given()
            .baseUri("http://localhost:8080")
            .when()
            .get("/!@#$%^&")
            .then()
            .statusCode(200)
            .body(equalTo("!@#$%^&"));
    }
}