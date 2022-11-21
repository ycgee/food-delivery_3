package food.delivery.domain;

import food.delivery.infra.AbstractEvent;
import lombok.Data;
import java.util.*;

@Data
public class OrderAccepted extends AbstractEvent {

    private Long id;
    private String status;
    private String foodId;
    private String customerId;
    private String storeId;
    private List<String> options;
    private String orderId;
    private String address;
}
