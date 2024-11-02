package DESIGN.CrickBuzz_or_CricInfo.ScoreUpdater;


import DESIGN.CrickBuzz_or_CricInfo.Inning.BallDetails;

public interface ScoreUpdaterObserver {

    public void update(BallDetails ballDetails);
}
