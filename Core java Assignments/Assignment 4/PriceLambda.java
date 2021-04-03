public class PriceLambda {

    public static void main(String[] args) {

        criteria mylambda = (str) ->{
            if (str>10000){
                return "The order status is Accepted and Completed";
            }
            else{
                return "Order status is Not accepted";
            }
        };
        System.out.println(mylambda.money(15000));
    }
}

interface criteria{
    String money(int str);
}