package DESIGN.SplitWise_APP.User;

import DESIGN.SplitWise_APP.UserExpenseBalanceSheet;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    String userId;
    String userName;
    UserExpenseBalanceSheet userExpenseBalanceSheet;
    public User(String userId, String userName){
        this.userId= userId;
        this.userName= userName;
        this.userExpenseBalanceSheet= new UserExpenseBalanceSheet();
    }
}
