package casumoTest;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
// Standard Test - Checks if the service handles a single vowel as would be expected.
public class SingleVowelsTest {

    @Test
    public void testDevowelizerService() {
        given()
            .baseUri("http://localhost:8080")
            .when()
            .get("/a")
            .then()
            .statusCode(200)
            .body(equalTo(""));
    }
}
