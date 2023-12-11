package casumoTest;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
// A very long string of a vowel is used as input to the system - to give it a longer input would require needless effort at this stage. 
public class VeryLongInputTest {

    @Test
    public void testDevowelizerService() {
        given()
            .baseUri("http://localhost:8080")
            .when()
            .get("/aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")
            .then()
            .statusCode(200)
            .body(equalTo(""));
    }
}