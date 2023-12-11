package casumoTest;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
// A long string of vowels to test the service.
public class LongStringTest {

    @Test
    public void testDevowelizerService() {
        given()
            .baseUri("http://localhost:8080")
            .when()
            .get("/aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaeeeeeeeeeeeeeeeeeeeeeiiiiiiiiiiiiiiiiiiiioooooooooooooooooooouuuuuuuuuuuuuuuuuuuuuuuuu")
            .then()
            .statusCode(200)
            .body(equalTo(""));
    }
}