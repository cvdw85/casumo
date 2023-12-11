package casumoTest;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
// Special test- Wanted to see what the system would do when exposed to emogees. Would it handle vowels inside of them? Seems not. Could be mentioned during standup.
public class UnicodeEncodingTest {

    @Test
    public void testDevowelizerService() {
        given()
            .baseUri("http://localhost:8080")
            .when()
            .get("/😊🌟🎉")
            .then()
            .statusCode(200)
            .body(equalTo("🌟🎉"));
    }
}