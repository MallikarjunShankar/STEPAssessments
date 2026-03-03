public class Q4 {
    public static void main (String[] args){
        int costprice = 129, sellingprice = 191;
        if (sellingprice > costprice){
            int profit = sellingprice - costprice;
            int ProfitPercentage = (profit * 100) / costprice;
            System.out.println("The cost price is INR " + costprice + "and selling price is INR " + sellingprice);
            System.out.println("The Profit is INR " + profit + " and profit percentage is " + ProfitPercentage + "%");
        }
        else if (sellingprice < costprice){
            int loss = costprice - sellingprice;
            int LossPercentage = (loss * 100) / costprice;
            System.out.println("The cost price is INR " + costprice + "and selling price is INR " + sellingprice);
            System.out.println("The Loss is INR " + loss + " and loss percentage is " + LossPercentage + "%");
        }
    }
}
