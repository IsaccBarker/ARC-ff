package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Detector;

@TeleOp(name="Detector Test", group="test")
public class DetectorTest extends LinearOpMode {
    @Override
    public void runOpMode() {
        Detector detector = new Detector(hardwareMap);
        telemetry.addData("initializing", "done");
        telemetry.update();
        waitForStart();
        while (opModeIsActive()) {
            if (gamepad1.right_bumper) {
                detector.loadImage();
            }
            // Default position is NONE so make sure you click 'Right_bumper' to get the actual position.
            Detector.ElementPosition pos = detector.getElementPosition();
            telemetry.addData("seen objects", pos == Detector.ElementPosition.LEFT ? "left" :
                    (pos == Detector.ElementPosition.RIGHT ? "right" : "none"));
            telemetry.update();
        }
    }
}
