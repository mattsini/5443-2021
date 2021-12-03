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
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.TalonFXInvertType;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SlewRateLimiter;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
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
  private final VictorSP rightmotor2 = new VictorSP(1);
  
   // Left Motors
  private final VictorSP leftmotor1 = new VictorSP(2);
  private final VictorSP leftmotor2 = new VictorSP(3);
  
  //Shooter
  private final VictorSPX shooter1 = new VictorSPX(5);

  //Speed Controller Groups
  private final SpeedControllerGroup rightSpeedGroup = new SpeedControllerGroup(rightmotor1, rightmotor2);
  private final SpeedControllerGroup leftSpeedGroup = new SpeedControllerGroup(leftmotor1, leftmotor2);


  //drivetrain
   DifferentialDrive drivetrain = new DifferentialDrive(rightSpeedGroup, leftSpeedGroup);

   //Joystick
   Joystick stick = new Joystick(1);

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

    drivetrain.arcadeDrive(stick.getY()^3, stick.getZ()^3);

    if (stick.getRawButton(1)==True){
    shooter.set(0.8);
    } else {
    shooter.set(0);
    }
    
    


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
