import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class ZippoTest {

    @Test
    public void test(){

        given()
        // hazırlık islemleri (token, send body, parameters)

                .when()
                // link and method verme

                .then()
                // asserton ve verileri ele alma extract
        ;

    }
    @Test
    public void statusCodeTest(){

        given()
        .when().get("http://api.zippopotam.us/us/90210")
        .then()
                .log().body()   //  log.All() all responsu göster
                .statusCode(200);  // status kontrolü
    }
    @Test
    public void contentTypeTest(){

        given()
                .when().get("http://api.zippopotam.us/us/90210")
                .then()
                .log().body()   //  log.All() all responsu göster
                .statusCode(200)  // status kontrolü
                .contentType(ContentType.JSON); // hatali durum kontrolü yapalım
    }
}
