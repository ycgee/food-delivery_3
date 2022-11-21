package food.delivery.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name = "rider", url = "${api.url.rider}")
public interface DeliveryService {
    @RequestMapping(method= RequestMethod.PUT, path="/deliveries/{id}/decreaterider")
    public void decreateRider(@PathVariable("id") Long id, @RequestBody DecreateRiderCommand decreateRiderCommand );
}

