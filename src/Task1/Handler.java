package Task1;

import lombok.Setter;

public abstract class Handler {
    private Integer quantity;
    @Setter
    private Handler next;
    public Handler(int quantity){
        this.quantity=quantity;
    }
    public void process(int amount){
        Integer num=amount/quantity;
        if (next!=null){
            next.process(amount%quantity);
        } else if (amount%quantity>0) {
            throw new IllegalArgumentException();
        }
        System.out.println(quantity.toString()+" = "+num.toString());
    }

}
