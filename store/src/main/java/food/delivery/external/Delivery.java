package food.delivery.external;

import lombok.Data;
import java.util.Date;
@Data
public class Delivery {

    private Long id;
    private String status;
    private String orderId;
    private String address;
    private Integer qty;
}


