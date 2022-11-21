package food.delivery.domain;

import food.delivery.CustomerApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Message_table")
@Data

public class Message  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String status;
    
    
    
    
    
    private String foodId;
    
    
    
    
    
    private String address;


    public static MessageRepository repository(){
        MessageRepository messageRepository = CustomerApplication.applicationContext.getBean(MessageRepository.class);
        return messageRepository;
    }




    public static void notify(OrderAccepted orderAccepted){

        /** Example 1:  new item 
        Message message = new Message();
        repository().save(message);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderAccepted.get???()).ifPresent(message->{
            
            message // do something
            repository().save(message);


         });
        */

        
    }
    public static void notify(OrderRejected orderRejected){

        /** Example 1:  new item 
        Message message = new Message();
        repository().save(message);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderRejected.get???()).ifPresent(message->{
            
            message // do something
            repository().save(message);


         });
        */

        
    }
    public static void notify(CookStarted cookStarted){

        /** Example 1:  new item 
        Message message = new Message();
        repository().save(message);

        */

        /** Example 2:  finding and process
        
        repository().findById(cookStarted.get???()).ifPresent(message->{
            
            message // do something
            repository().save(message);


         });
        */

        
    }
    public static void notify(Picked picked){

        /** Example 1:  new item 
        Message message = new Message();
        repository().save(message);

        */

        /** Example 2:  finding and process
        
        repository().findById(picked.get???()).ifPresent(message->{
            
            message // do something
            repository().save(message);


         });
        */

        
    }
    public static void notify(Delivered delivered){

        /** Example 1:  new item 
        Message message = new Message();
        repository().save(message);

        */

        /** Example 2:  finding and process
        
        repository().findById(delivered.get???()).ifPresent(message->{
            
            message // do something
            repository().save(message);


         });
        */

        
    }


}
