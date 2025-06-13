package org.firstinspires.ftc.teamcode.Systems;


import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.telemetry;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

import org.firstinspires.ftc.robotcore.external.Telemetry;

@Config
public class Arm {

    private DcMotor armRight;
    private DcMotor armLeft;

    private double deltaAngle;
    private double angle;


    public static int MINIMUM_SOFT_LIMIT = 35;
    public static int MAXIMUM_SOFT_LIMIT = 325;

    private final double START_DEGREE = 35;

    public static int DEFAULT = 180;
    public static int SUB_PREP = 100;
    public static int SUB_COLLECT = 80;
    public static int COLLECT_FIELD_FRONT = 140;
    public static int COLLECT_FIELD_BACK = 220;
    public static int COLLECT_SPEC_FENCE = 70;
    public static int SCORE_LB = 250;
    public static int PREP_SPEC = 190;
    public static int SCORE_SPEC = 210;
    public static int CLIMB = 300;

    /*
    We calculate the ratio of between the arm ticks and the degrees of rotation in the arm.
    */
    private final double OUTER_GEAR_RATIO = 1;
    private final double INNER_MOTOR_GEAR_RATIO = 250047.0 /4913;
    private final double ENCODERS_PER_INNER_ROTATION = 28;
    private final double TICK_PER_DEGREE = OUTER_GEAR_RATIO * INNER_MOTOR_GEAR_RATIO * ENCODERS_PER_INNER_ROTATION / 360;



    public Arm(DcMotor left, DcMotor right){

        this.armLeft = left;
        this.armRight = right;

        this.angle = START_DEGREE;

        armRight.setDirection(DcMotorSimple.Direction.REVERSE);

    }

    public void armMovement(double rTrigger, double lTrigger, Telemetry tele){
        armLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        armRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        armLeft.setPower(rTrigger - lTrigger);
        armRight.setPower(rTrigger - lTrigger);
        tele.addData("encoderL", armLeft.getCurrentPosition());
        tele.addData("encoderR", armRight.getCurrentPosition());
        tele.update();

    }

    private void setPower(double power){

        armLeft.setPower(power);
        armRight.setPower(power);

    }

    public void moveToDefault(double power){

        int targetTicks = (int)(DEFAULT * TICK_PER_DEGREE);

        armLeft.setTargetPosition(targetTicks);
        armRight.setTargetPosition(targetTicks);

        armLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        armRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        setPower(power);

    }

    public void moveToSubPrep(double power){
        int targetTicks = (int)(SUB_PREP * TICK_PER_DEGREE);

        armLeft.setTargetPosition(targetTicks);
        armRight.setTargetPosition(targetTicks);

        armLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        armRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        setPower(power);
    }

    public void moveToScoreSpec(double power){
        int targetTicks = (int)(SCORE_SPEC * TICK_PER_DEGREE);

        armLeft.setTargetPosition(targetTicks);
        armRight.setTargetPosition(targetTicks);

        armLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        armRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        setPower(power);
    }

    public void moveToSubCollect(double power){
        int targetTicks = (int)(SUB_COLLECT * TICK_PER_DEGREE);

        armLeft.setTargetPosition(targetTicks);
        armRight.setTargetPosition(targetTicks);

        armLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        armRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        setPower(power);
    }

    public void climbPos(double power){
        int targetTicks = (int)(CLIMB * TICK_PER_DEGREE);

        armLeft.setTargetPosition(targetTicks);
        armRight.setTargetPosition(targetTicks);

        armLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        armRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        setPower(power);
    }

    public void moveToCollectFieldFront(double power){
        int targetTicks = (int)(COLLECT_FIELD_FRONT * TICK_PER_DEGREE);

        armLeft.setTargetPosition(targetTicks);
        armRight.setTargetPosition(targetTicks);

        armLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        armRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        setPower(power);
    }

    public void moveToScoreLB(double power){
        int targetTicks = (int)(SCORE_LB * TICK_PER_DEGREE);

        armLeft.setTargetPosition(targetTicks);
        armRight.setTargetPosition(targetTicks);

        armLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        armRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        setPower(power);
    }

    public void moveToCollectFieldBack(double power){
        int targetTicks = (int)(COLLECT_FIELD_BACK * TICK_PER_DEGREE);

        armLeft.setTargetPosition(targetTicks);
        armRight.setTargetPosition(targetTicks);

        armLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        armRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        setPower(power);
    }

    public void moveToPrepSpec(double power){
        int targetTicks = (int)(PREP_SPEC * TICK_PER_DEGREE);

        armLeft.setTargetPosition(targetTicks);
        armRight.setTargetPosition(targetTicks);

        armLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        armRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        setPower(power);
    }

    public void moveToCollectSpecFence(double power){
        int targetTicks = (int)(COLLECT_SPEC_FENCE * TICK_PER_DEGREE);

        armLeft.setTargetPosition(targetTicks);
        armRight.setTargetPosition(targetTicks);

        armLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        armRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        setPower(power);
    }

}