public class RewardValue {

    double cashValue;
    int milesValue;
    double conversion = 0.0035;
    RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / conversion);
    }

    RewardValue(int milesValue){
        this.milesValue = milesValue;
        this.cashValue = (milesValue * conversion);
    }

    double getCashValue(){
        return this.cashValue;
    }

    int getMilesValue(){
        return this.milesValue;
    }
}
