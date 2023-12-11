package casumoTest;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
// Standard Test- Mixes Special Characters with Vowels and Consonants - Expected result should not contain a vowel.
public class SpecialCharsMixedTest {

    @Test
    public void testDevowelizerService() {
        given()
            .baseUri("http://localhost:8080")
            .when()
            .get("/!@#hello$%^&")
            .then()
            .statusCode(200)
            .body(equalTo("!@#hll$%^&"));
    }
}