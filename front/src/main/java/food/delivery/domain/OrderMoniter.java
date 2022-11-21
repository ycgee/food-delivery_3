package food.delivery.domain;

import food.delivery.domain.*;
import food.delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderMoniter extends AbstractEvent {

    private Long id;
    private String foodId;
    private List<String> options;
    private String address;
    private String customerId;
    private String storeId;
    private String status;

    public OrderMoniter(Order aggregate){
        super(aggregate);
    }
    public OrderMoniter(){
        super();
    }
}
