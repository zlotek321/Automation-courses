package training;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class Challenge2Tests {
    @Test
    public void getMultivitamin(){
        String endpoint = "http://127.0.0.1:8888/api_testing/product/read_one.php";

        given().
                queryParam("id", "18").
        when().
                get(endpoint).
        then().
            log().
                headers().
            log().
                body().
            assertThat().
                statusCode(200).
                header("Content-Type", equalTo("application/json")).
                body("name", equalTo("Multi-Vitamin (90 capsules)")).
                body("description", equalTo("A daily dose of our Multi-Vitamins fulfills a day’s " +
                        "nutritional needs for over 12 vitamins and minerals.")).
                body("price", equalTo("10.00")).
                body("category_id", equalTo("4")).
                body("category_name", equalTo("Supplements"));
    }
}
