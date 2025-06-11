package org.firstinspires.ftc.teamcode.Testing;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name="motor experiment", group="tmp")
public class MotorEncoderBehaviourExperiment extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        DcMotor motor = hardwareMap.get(DcMotor.class, "motor");
        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motor.setTargetPosition(100);
        waitForStart();
        motor.setPower(0.5);
        while (opModeIsActive() && motor.getCurrentPosition() != motor.getTargetPosition()){
            motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            telemetry.addData("encoder: ", motor.getCurrentPosition());
            telemetry.update();
        }
        motor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        while (opModeIsActive()) {
            motor.setPower(gamepad1.right_trigger - gamepad1.left_trigger);
            telemetry.addData("encoder", motor.getCurrentPosition());
            telemetry.update();
        }
    }
}
