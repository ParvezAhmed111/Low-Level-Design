package DESIGN.SplitWise_APP.Expense.Split;

import java.util.List;

public class PercentageExpenseSplit implements ExpenseSplit{
    @Override
    public void validateRequest(List<Split> splitList, double totalAmount) {
        double sum= 0;
        for (Split split: splitList){
            sum+= split.getAmountOwe();
        }
        if(sum != 100){
            // throw exception
        }

    }
}
