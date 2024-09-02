package DESIGN.SplitWise_APP.Expense.Split;

import java.util.List;

public interface ExpenseSplit {
    public void validateRequest(List<Split> splitList, double totalAmount);
}
