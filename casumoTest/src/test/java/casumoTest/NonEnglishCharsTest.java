package casumoTest;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
// Tests if the service would remove Chinese vowels from the String - As expected, it would not. Test confirms service failure (understandably so - could mention it during standup)
public class NonEnglishCharsTest {

    @Test
    public void testDevowelizerService() {
        given()
            .baseUri("http://localhost:8080")
            .when()
            .get("/你好世界")
            .then()
            .statusCode(200)
            .body(equalTo("你世界"));
    }
}