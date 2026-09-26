// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package org.team5924.frc2027;

import org.wpilib.command3.Scheduler;
import org.wpilib.epilogue.Epilogue;
import org.wpilib.epilogue.Logged;
import org.wpilib.framework.OpModeRobot;

import org.littletonrobotics.junction.LogFileUtil;
import org.littletonrobotics.junction.LoggedRobot;
import org.littletonrobotics.junction.Logger;
import org.littletonrobotics.junction.networktables.NT4Publisher;
import org.littletonrobotics.junction.wpilog.WPILOGReader;
import org.littletonrobotics.junction.wpilog.WPILOGWriter;


@Logged
public class Robot extends OpModeRobot implements LoggedRobot{
  public Robot() {}

  @Override
  public void robotPeriodic() {
    Scheduler.getDefault().run();
    Epilogue.update(this);
  }
}
