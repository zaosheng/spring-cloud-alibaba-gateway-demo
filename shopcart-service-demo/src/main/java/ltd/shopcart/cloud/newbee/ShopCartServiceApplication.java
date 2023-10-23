
package ltd.shopcart.cloud.newbee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author jzs10
 * @email
 */
@SpringBootApplication
public class ShopCartServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopCartServiceApplication.class, args);
    }

}
