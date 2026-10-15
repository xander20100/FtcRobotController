package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

@Autonomous
//@Disabled
public class Test extends OpMode {
    boolean ryderIsCool = true;
    @Override
    public void init(){
    }

    @Override
    public void loop(){
        telemetry.addData("Ryder is cool", ryderIsCool);
    }
}
