package za.ac.cput.controller;


import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.entity.ShippingDetails;
import za.ac.cput.factory.ShippingDetailsFactory;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ShippingDetailsControllerTest {


    private static ShippingDetails shippingDetails = ShippingDetailsFactory.getShippingDetails("1", 1223);
    private static String SECURITY_USERNAME = "admin";
    private static String SECURITY_PASSWORD = "admin123";

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/ShippingDetails/";

    @Test
    public void a_create() {
        String url = baseURL + "create";
        System.out.println("URL:" + url);
        System.out.println("Post date:" + shippingDetails);
        ResponseEntity<ShippingDetails> postResponse = restTemplate.withBasicAuth(SECURITY_USERNAME, SECURITY_PASSWORD).postForEntity(url, shippingDetails, ShippingDetails.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        shippingDetails = postResponse.getBody();
        System.out.println("Saved data:" + shippingDetails);
        assertEquals(shippingDetails.getShippingId(), postResponse.getBody().getShippingId());
    }

    @Test
    public void b_read() {
        String url = baseURL + "read/" + shippingDetails.getShippingId();
        System.out.println("URL: " + url);
        ResponseEntity<ShippingDetails> response = restTemplate.withBasicAuth(SECURITY_USERNAME, SECURITY_PASSWORD).getForEntity(url, ShippingDetails.class);
        assertEquals(shippingDetails.getShippingId(), response.getBody().getShippingId());
    }

    @Test
    public void c_update() {
        ShippingDetails updated = new ShippingDetails.Builder().copy(shippingDetails).setShippingCost(shippingDetails.getShippingCost()+950.00).build();
        updated = new ShippingDetails.Builder().copy(updated).setShippingCost(shippingDetails.getShippingCost()-67).build();
        String url = baseURL + "update";
        System.out.println("URL: " + url);
        System.out.println("Post date: " + updated);
        ResponseEntity<ShippingDetails> response = restTemplate.withBasicAuth(SECURITY_USERNAME, SECURITY_PASSWORD).postForEntity(url, updated, ShippingDetails.class);
        assertEquals(shippingDetails.getShippingId(), response.getBody().getShippingId());
    }

    @Test
    public void d_getall() {
        String url = baseURL + "all";
        System.out.println("URL: " + url);
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.withBasicAuth(SECURITY_USERNAME, SECURITY_PASSWORD).exchange(url, HttpMethod.GET, entity, String.class);
        System.out.println(response);
        System.out.println(response.getBody());
    }

    @Test
    public void e_delete() {
        String url = baseURL + "delete/" + shippingDetails.getShippingId();
        System.out.println("URL: " + url);
        restTemplate.withBasicAuth(SECURITY_USERNAME,SECURITY_PASSWORD).delete(url);
    }
}