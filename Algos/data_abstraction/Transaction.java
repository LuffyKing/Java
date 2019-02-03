package Algos.data_abstraction;


class Transaction {
    private String initiator;
    private SmartDate transDate;
    private double transAmount;
    
    Transaction(String who, SmartDate when, double amount){
        initiator = who;
        transDate = when;
        transAmount = amount;

    }

    Transaction(String transString){
        String[] transStringArr = transString.split("-");
        initiator = transStringArr[0];
        try {
            transDate = new SmartDate(transStringArr[1]);
        } catch (RuntimeException e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
        }
        try {
            transAmount = Double.parseDouble(transStringArr[2]);
        } catch (NumberFormatException e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
        }
        
    }

    public String getWho(){
        return initiator;
    }

    public SmartDate getWhen(){
        return transDate;
    }

    public double getAmount(){
        return transAmount;
    }

    public String toString(){
        return "The transaction was made by "+initiator+" on "+transDate+" with the amount: "+ transAmount;
    }

    public boolean equals(Object that){
        if (this == that) {
            return true;
        }
        if(that == null){
            return false;
        }
        if (this.getClass() != that.getClass()) {
            return false;
        }
        Transaction thatFinal = (Transaction) that;
        if (this.getWho().equals(thatFinal.getWho()) && this.getWhen().toString().equals(thatFinal.getWhen().toString()) && this.getAmount() == thatFinal.getAmount()) {
            return true;
        }
        return false;

    }
}