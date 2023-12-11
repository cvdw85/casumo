package casumoTest;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
// Wanted to see how the service would respond to a null-input. After checking initial test results, it responds sensefully with ndpnt - added to expected result - test passes.
public class NullInputTest {

    @Test
    public void testNullParameterValue() {
        String paramValue = null;

        // Example request where a parameter is only included if it's not null
        given()
            .baseUri("http://localhost:8080")
            .queryParam("param", paramValue) // Exclude parameter if paramValue is null
            .when()
            .get("/endpoint")
            .then()
            .statusCode(200)
            .body(equalTo("ndpnt"));
    }
}