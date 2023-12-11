package casumoTest;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
// Most basic Test but with capital letters.
public class HelloMixedCasesTest {

    @Test
    public void testDevowelizerService() {
        given()
            .baseUri("http://localhost:8080")
            .when()
            .get("/HeLLo")
            .then()
            .statusCode(200)
            .body(equalTo("HLL"));
    }
}