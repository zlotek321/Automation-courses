package training;

import models.Products;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class Challenge1Tests {

    @Test
    public void createProduct(){
        String endpoint = "http://127.0.0.1:8888/api_testing/product/create.php";
        Products product = new Products(
          "Sweatband",
          "Best sport sweatband on the market!",
          5,
          3
        );
        var response = given().body(product).when().post(endpoint).then();
        response.log().body();
    }

    @Test
    public void updateProduct(){
        String endpoint = "http://127.0.0.1:8888/api_testing/product/update.php";
        String productUpdate = """
                {
                "id": 22,
                "price":6
                }
                """;
        var response = given().body(productUpdate).when().put(endpoint).then();
        response.log().body();
    }

    @Test
    public void getProduct(){
        String endpoint = "http://127.0.0.1:8888/api_testing/product/read_one.php";
        var response = given().queryParam("id", 22).when().get(endpoint).then();
        response.log().body();
    }

    @Test
    public void deleteProduct(){
        String endpoint = "http://127.0.0.1:8888/api_testing/product/delete.php";
        Products product = new Products(22);

        var response = given().body(product).when().delete(endpoint).then();
        response.log().body();
    }
}
