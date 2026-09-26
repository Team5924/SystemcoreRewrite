package org.team5924.frc2027;


import org.littletonrobotics.junction.networktables.LoggedNetworkChooser;
import org.wpilib.command3.Command;

public class RobotContainer {

    private final LoggedNetworkChooser<Command> autoChooser;

    public RobotContainer() {
        switch (Constants.currentMode) {
            case REAL:
                break;
            case SIM:
                break;
            case REPLAY:
                break;
        }

        // Add AutoBuilder parameter when PathPlanner 2027 is released
        autoChooser = new LoggedNetworkChooser<>("Auto Choices");

    }

    public void configureButtonBindings() {
        // Configure your button bindings here
    }
    public Command getAutonomousCommand() {
        return autoChooser.get();
    }
}
