package DESIGN.SplitWise_APP.Expense;

import DESIGN.SplitWise_APP.Expense.Split.EqualExpenseSplit;
import DESIGN.SplitWise_APP.Expense.Split.ExpenseSplit;
import DESIGN.SplitWise_APP.Expense.Split.PercentageExpenseSplit;
import DESIGN.SplitWise_APP.Expense.Split.UnequalExpenseSplit;

public class SplitFactory {
    public static ExpenseSplit getSplitObject(ExpenseSplitType splitType) {
        return switch (splitType) {
            case EQUAL -> new EqualExpenseSplit();
            case UNEQUAL -> new UnequalExpenseSplit();
            case PERCENTAGE -> new PercentageExpenseSplit();
        };
    }
}
