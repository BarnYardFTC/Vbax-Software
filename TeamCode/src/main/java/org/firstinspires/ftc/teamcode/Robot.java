package org.firstinspires.ftc.teamcode;

import org.firstinspires.ftc.teamcode.Systems.Arm;
import org.firstinspires.ftc.teamcode.Systems.Drivetrain;
import org.firstinspires.ftc.teamcode.Systems.SWIS;

public class Robot {

    private Arm arm;
    private Drivetrain drivetrain;
    private SWIS swis;


    public Robot(Arm arm, Drivetrain drivetrain, SWIS swis){
        setArm(arm);
        setDrivetrain(drivetrain);
        setSwis(swis);
    }

    public Arm getArm() {
        return arm;
    }

    public void setArm(Arm arm) {
        this.arm = arm;
    }

    public Drivetrain getDrivetrain() {
        return drivetrain;
    }

    public void setDrivetrain(Drivetrain drivetrain) {
        this.drivetrain = drivetrain;
    }

    public SWIS getSwis() {
        return swis;
    }

    public void setSwis(SWIS swis) {
        this.swis = swis;
    }


    public void manualFieldOrientedDrive(double ly, double lx, double rx){

    }


}