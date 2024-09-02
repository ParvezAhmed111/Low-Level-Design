package DESIGN.SplitWise_APP.Expense.Split;

import DESIGN.SplitWise_APP.User.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Split {
    User user;
    double amountOwe;
}
