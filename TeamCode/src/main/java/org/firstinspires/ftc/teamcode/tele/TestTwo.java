package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous
public class TestTwo extends LinearOpMode {
    private HWC robot;
    private Detector detector;
    @Override
    public void runOpMode() throws InterruptedException {
        robot = new HWC(this.hardwareMap, this.telemetry);

        waitForStart();
        robot.driveAndArm(66, 0.4, 0.4, 9000);
        robot.turn(90, 500);
        robot.driveAndArm(30, 0.4, 0.4, 0);

        robot.extenderOut();
        robot.dropBlock();
        robot.extenderIn();

        robot.turn(90, 500);
        robot.driveAndArm(175, 0.4, 0.4, 0);
//        drive(0, 66, 500);
//        drive(280, 30, 500);
//        armTopLayer();
//        sleep(500);
//        armReset();
//        drive(0, -25, 500);
//        drive(250, 0, 500);
//        drive(0, 175, 1200);
        

    }
}
