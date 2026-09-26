package org.team5924.frc2027;

import org.wpilib.framework.RobotBase;

public class Constants {
    public static final Mode simMode = Mode.SIM;
    public static final Mode currentMode = RobotBase.isReal() ? Mode.REAL : simMode;


    public static enum Mode{
        REAL,
        SIM,
        REPLAY
    }
}
