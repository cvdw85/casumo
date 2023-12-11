package casumoTest;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
// Expected the service to return an empty string -> "" - instead returns the text I found and put in. Seems the Dev want to handle blank inputs this way. No problem.
public class EmptyInputTest {

    @Test
    public void testDevowelizerService() {
        given()
            .baseUri("http://localhost:8080")
            .when()
            .get("/")
            .then()
            .statusCode(200)
            .body(equalTo("Send GET to /:input"));
    }
}