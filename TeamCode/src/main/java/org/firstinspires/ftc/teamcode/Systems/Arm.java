package org.firstinspires.ftc.teamcode.Systems;


import com.qualcomm.robotcore.hardware.DcMotor;

public class Arm {

    private DcMotor armRight;
    private DcMotor armLeft;
    private int angle;
    private final int minSoftLim = 45;
    private final int maxSoftLim = 315;
    private enum armPositions{
        COLLECTION,
        SCORE,

    }
    /*
    we calculate the ratio of between the arm ticks and the degrees of rotation in the arm.
     */
    private final double OUTER_GEAR_RATIO = 1;
    private final double INNER_MOTOR_GEAR_RATIO = 250047.0 /4913;
    private final double ENCODERS_PER_INNER_ROTATION = 28;
    private final double TICK_PER_DEGREE = OUTER_GEAR_RATIO * INNER_MOTOR_GEAR_RATIO * ENCODERS_PER_INNER_ROTATION / 360;

    // preset, func, controls




}
