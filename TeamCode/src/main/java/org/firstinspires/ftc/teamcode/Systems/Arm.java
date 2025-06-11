package org.firstinspires.ftc.teamcode.Systems;


import com.qualcomm.robotcore.hardware.DcMotor;

public class Arm {

    private DcMotor armRight;
    private DcMotor armLeft;
    private final double START_DEGREE = 35;

    private double deltaAngle;
    private double angle;
    public static int minSoftLim = 45;
    public static int maxSoftLim = 315;

    public static int DEFAULT = 180;
    public static int SUB_PREP = 100;
    public static int SUB_COLLECT = 80;
    public static int COLLECT_FIELD_FRONT = 140;
    public static int COLLECT_FIELD_BACK = 220;
    public static int SCORE_LB = 250;
    public static int COLLECT_SPEC_FENCE = 70;
    public static int PREP_SPEC = 190;
    public static int SCORE_SPEC = 210;
    public static int CLIMB = 300;
    /*
    we calculate the ratio of between the arm ticks and the degrees of rotation in the arm.
     */
    private final double OUTER_GEAR_RATIO = 1;
    private final double INNER_MOTOR_GEAR_RATIO = 250047.0 /4913;
    private final double ENCODERS_PER_INNER_ROTATION = 28;
    private final double TICK_PER_DEGREE = OUTER_GEAR_RATIO * INNER_MOTOR_GEAR_RATIO * ENCODERS_PER_INNER_ROTATION / 360;

    // preset, func, controls

    public Arm(DcMotor left, DcMotor right){

        this.armLeft = left;
        this.armRight = right;

        this.angle = START_DEGREE;
    }



}