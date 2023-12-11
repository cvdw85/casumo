package casumoTest;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
// Standard Test - Checks how the service handles a simple string of numbers
public class NumberTest {

    @Test
    public void testDevowelizerService() {
        given()
            .baseUri("http://localhost:8080")
            .when()
            .get("/123")
            .then()
            .statusCode(200)
            .body(equalTo("123"));
    }
}