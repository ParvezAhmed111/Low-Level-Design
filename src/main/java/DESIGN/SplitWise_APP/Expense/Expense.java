package DESIGN.SplitWise_APP.Expense;

import DESIGN.SplitWise_APP.Expense.Split.Split;
import DESIGN.SplitWise_APP.User.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class Expense {
    String expenseId;
    String description;
    double expenseAmount;
    User paidByUser;
    ExpenseSplitType splitType;
    List<Split> splitDetails;
}
