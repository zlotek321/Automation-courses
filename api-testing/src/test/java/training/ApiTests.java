package training;

import models.Products;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class ApiTests {

    @Test
    public void getCategories() {
        String endpoint = "http://127.0.0.1:8888/api_testing/category/read.php";
        var response = given().when().get(endpoint).then();
        response.log().body();
    }

    @Test
    public void getProduct(){
        String endpoint = "http://127.0.0.1:8888/api_testing/product/read_one.php";
        var response = given().queryParam("id", 2).when().get(endpoint).then();
        response.log().body();
    }

    @Test
    public void createProduct() {
        String endpoint = "http://127.0.0.1:8888/api_testing/product/create.php";
        String body = """
                {
                    "name": "Water Bottle",
                    "description": "Blue water bottle. Holds 64oz",
                    "price": 12,
                    "category_id": 3
                }
                """;
        var response = given().body(body).when().post(endpoint).then();
        response.log().body();
    }

    @Test
    public void updateProduct(){
        String endpoint = "http://127.0.0.1:8888/api_testing/product/update.php";
        String body = """
                {
                    "id": 19,
                    "name": "Water Bottle",
                    "description": "Blue water bottle. Holds 64oz",
                    "price": 15,
                    "category_id": 3
                }
                """;
        var response = given().body(body).when().put(endpoint).then();
        response.log().body();
    }

    @Test
    public void deleteProduct(){
        String endpoint = "http://127.0.0.1:8888/api_testing/product/delete.php";
        String body = """
                {
                    "id": 19
                }
                """;
        var response = given().body(body).when().delete(endpoint).then();
        response.log().body();
    }

    @Test
    public void createSerializedProduct(){
        String endpoint = "http://127.0.0.1:8888/api_testing/product/create.php";
        Products product = new Products(
                "Water Bottle",
                "Blue water bottle. Holds 64oz.",
                12,
                3
        );
        var response = given().body(product).when().post(endpoint).then();
        response.log().body();
    }
}
