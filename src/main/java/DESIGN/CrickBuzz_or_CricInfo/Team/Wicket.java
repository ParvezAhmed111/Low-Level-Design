package DESIGN.CrickBuzz_or_CricInfo.Team;

import DESIGN.CrickBuzz_or_CricInfo.Inning.BallDetails;
import DESIGN.CrickBuzz_or_CricInfo.Inning.OverDetails;
import DESIGN.CrickBuzz_or_CricInfo.Team.Player.PlayerDetails;

public class Wicket {

    public WicketType wicketType;
    public PlayerDetails takenBy;
    public OverDetails overDetail;
    public BallDetails ballDetail;

    public Wicket(WicketType wicketType, PlayerDetails takenBy, OverDetails overDetail, BallDetails ballDetail){

        this.wicketType = wicketType;
        this.takenBy = takenBy;
        this.overDetail = overDetail;
        this.ballDetail = ballDetail;
    }
}
