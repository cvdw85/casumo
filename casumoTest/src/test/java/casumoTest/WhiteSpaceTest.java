package casumoTest;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
// Special Test - Used to see what the service would return. Turns out it would send the same response as with no input, that is - Send GET to /:input. Added to expected result.
// Could be mentioned during standup
public class WhiteSpaceTest {

    @Test
    public void testDevowelizerService() {
        given()
            .baseUri("http://localhost:8080")
            .when()
            .get("/ ")
            .then()
            .statusCode(200)
            .body(equalTo("Send GET to /:input"));
    }
}