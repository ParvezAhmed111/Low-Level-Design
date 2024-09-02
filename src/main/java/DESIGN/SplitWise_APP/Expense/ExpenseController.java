package DESIGN.SplitWise_APP.Expense;

import DESIGN.SplitWise_APP.BalanceSheetController;
import DESIGN.SplitWise_APP.Expense.Split.ExpenseSplit;
import DESIGN.SplitWise_APP.Expense.Split.Split;
import DESIGN.SplitWise_APP.User.User;

import java.util.List;

public class ExpenseController {
    BalanceSheetController balanceSheetController;
    public ExpenseController(){
        balanceSheetController= new BalanceSheetController();
    }

    public Expense createExpense(String expenseId, String description, double expenseAmount,
                              List<Split> splitDetails, ExpenseSplitType splitType, User paidByUser){
        //using factory pattern to get the expenseSplit
        ExpenseSplit expenseSplit= SplitFactory.getSplitObject(splitType);
        //validating request
        expenseSplit.validateRequest(splitDetails, expenseAmount);
        //creating expense
        Expense expense= new Expense(expenseId, description, expenseAmount, paidByUser, splitType, splitDetails);
        //update expense in Balance Sheet
        balanceSheetController.updateUserExpenseBalanceSheet(paidByUser, splitDetails, expenseAmount);

        return expense;
    }

}
