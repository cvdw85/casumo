package casumoTest;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
// Standard test - Consonants simply mixed with Special Characters
public class ConsonantsSpecialCharsMixTest {

    @Test
    public void testDevowelizerService() {
        given()
            .baseUri("http://localhost:8080")
            .when()
            .get("/abc!@#123")
            .then()
            .statusCode(200)
            .body(equalTo("bc!@#123"));
    }
}