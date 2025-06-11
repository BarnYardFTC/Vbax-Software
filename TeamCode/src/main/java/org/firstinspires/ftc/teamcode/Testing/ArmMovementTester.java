package org.firstinspires.ftc.teamcode.Testing;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.telemetry;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.Systems.Arm;


@TeleOp(name = "arm tester", group = "tmp")
public class ArmMovementTester extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {

        Arm arm = new Arm(hardwareMap.get(DcMotor.class, "leftMotor"), hardwareMap.get(DcMotor.class, "rightMotor"));

        while (opModeIsActive()){
            arm.armMovement(gamepad1.right_trigger, gamepad1.left_trigger, telemetry);
        }

    }
}
