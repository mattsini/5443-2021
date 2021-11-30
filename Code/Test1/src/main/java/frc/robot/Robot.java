// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */

   //Right Motors
  private final VictorSP rightmotor1 = new VictorSP(0);
  private final WPI_VictorSPX rightmotor2 = new WPI_VictorSPX(1);
   // Left Motors
  private final VictorSP leftmotor1 = new VictorSP(3);
  private final WPI_VictorSPX leftmotor2 = new WPI_VictorSPX(4);
  //Speed Controller Groups
  private final SpeedControllerGroup rightSpeedGroup = new SpeedControllerGroup(rightmotor1, rightmotor2);
  private final SpeedControllerGroup leftSpeedGroup = new SpeedControllerGroup(leftmotor1, leftmotor2);

  //drivetrain
   DifferentialDrive drivetrain = new DifferentialDrive(rightSpeedGroup, leftSpeedGroup);

   //Joystick
   Joystick stick = new Joystick(0);

  @Override
  public void robotInit() {}

  @Override
  public void robotPeriodic() {}

  @Override
  public void autonomousInit() {}

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {}

  @Override
  public void teleopPeriodic() {

    drivetrain.arcadeDrive(stick.getY(), stick.getZ());




  }

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}
}
