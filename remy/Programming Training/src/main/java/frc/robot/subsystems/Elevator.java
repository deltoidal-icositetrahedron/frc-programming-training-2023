// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.AbsoluteEncoder;
import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.SparkMaxAbsoluteEncoder;
import com.revrobotics.SparkMaxPIDController;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.revrobotics.SparkMaxAbsoluteEncoder.Type;

public class Elevator extends SubsystemBase {
  private static final class Config{
    private static final int deviceId = 5;
  }
  /** Creates a new Elevator. */
  private CANSparkMax m_elevator = new CANSparkMax(Config.deviceId, MotorType.kBrushless);
  private RelativeEncoder m_elevatorEncoder = m_elevator.getEncoder();


  public Elevator() {
    
  }
  
  public void setSpeed(double speed) {
    m_elevator.set(speed);
  }

  public double getPosition() {
    return m_elevatorEncoder.getPosition();

  }

  public double getConversionFactor() {
    return m_elevatorEncoder.getPositionConversionFactor();
  }

/**
  public void SetNeutralMode(IdleMode neutralMode) {
    
  }
*/


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
