package org.team5924.frc2027.mechanisms.intakePivot;

import org.littletonrobotics.junction.AutoLog;
import org.wpilib.command3.Command;

public interface IntakePivotIO {

    @AutoLog
    public static class IntakePivotIOInputs {
        public boolean motorConnected = true;
        public double position = 0.0;
        public double positionRads = 0.0;
        public double velocityRadsPerSec = 0.0; 
        public double appliedVoltage = 0.0;
        public double supplyCurrentAmps = 0.0;
        public double torqueCurrentAmps = 0.0;
        public double tempCelsius = 0.0;
    }


    public default Command stop() {
        return Command.noRequirements(coroutine -> {}).named("empty");
    }
}
