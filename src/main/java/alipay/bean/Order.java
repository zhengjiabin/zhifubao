package alipay.bean;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * ¶©µ¥
 * 
 * @author Administrator
 * 
 */
@XmlRootElement
public class Order implements Serializable {
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private String orderId;
    
    private String orderName;
    
    private BigDecimal price;
    
    private String content;
    
    public Order() {
        super();
    }
    
    public Order(String orderId, String orderName) {
        super();
        this.orderId = orderId;
        this.orderName = orderName;
    }
    
    public Order(String orderId, String orderName, BigDecimal price) {
        super();
        this.orderId = orderId;
        this.orderName = orderName;
        this.price = price;
    }
    
    public Order(String orderId, String orderName, BigDecimal price, String content) {
        super();
        this.orderId = orderId;
        this.orderName = orderName;
        this.price = price;
        this.content = content;
    }
    
    public String getOrderId() {
        return orderId;
    }
    
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    
    public String getOrderName() {
        return orderName;
    }
    
    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
    
    public BigDecimal getPrice() {
        return price;
    }
    
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    
    public String getContent() {
        return content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    
}
