package casumoTest;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
// Standard test - Mixes consonants, vowels and special chars together - expected result should not include a vowel.
public class ConsVowelsSpCharsTest {

    @Test
    public void testDevowelizerService() {
        given()
            .baseUri("http://localhost:8080")
            .when()
            .get("/abc!@#hello123")
            .then()
            .statusCode(200)
            .body(equalTo("bc!@#hll123"));
    }
}