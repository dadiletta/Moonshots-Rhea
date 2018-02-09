package org.frc5973.robot;

import org.strongback.command.CommandGroup;
import org.strongback.drive.TankDrive;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;

public class GroupForwardLeft extends CommandGroup {
	public GroupForwardLeft(TankDrive drive, ADXRS450_Gyro gyro) {
		sequentially(new TimedDriveCommand(drive, gyro, .4, false, 2000),
				new AngularTurnCommand(drive, gyro, .2, false, 180),
				new TimedDriveCommand(drive, gyro, .4, false, 2000));
	}

}

//TODO
//Left-Cube-Left
//Left-Cube-Right
//Left-Cube-None

//Middle-Cube-Left
//Middle-Cube-Right
//Middle-Cube-None

//Right-Cube-Left
//Right-Cube-Right
//Right-Cube-None