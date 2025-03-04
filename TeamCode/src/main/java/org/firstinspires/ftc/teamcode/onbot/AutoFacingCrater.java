package org.firstinspires.ftc.teamcode.onbot;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name="Auto-FacingCrater", group="Tournament")
public class AutoFacingCrater extends BotBase{
    public void beforeWaitForStart(){
        initTensorFlow();
    }
    public void runTasks(){
        String goldLocation = getGoldLocation(3);

        latchDown();

        if(goldLocation.equals("Left")){
            turnDegrees(-28,8);//Turn to face the gold mineral
            runForward(40,8); //push gold mineral
            runForward(-15,8); // go back after pushing mineral
            turnDegrees(-85,8); // midturn towards depot
            runForward(46,8); // run closer to the wall
            turnDegrees(-49,8); // turn towards depot
            runForward(42,8); //run inside the depot
            dropMarker();
            runForward(-95,8);
            resetMarker();

        }else if (goldLocation.equals("Right")){
            turnDegrees(28,8);//Turn to face the gold mineral
            runForward(37,8); //push gold mineral
            runForward(-15,8); // go back after pushing mineral
            turnDegrees(-115,8); // midturn towards depot
            runForward(55,8); // run closer to the wall
            turnDegrees(-55,8); // turn towards depot
            runForward(42,8); //run inside the depot
            dropMarker();
            runForward(-90,8);
            resetMarker();

        }else if (goldLocation.equals("Center")){
            runForward(35,8); //push gold mineral
            runForward(-15,8); // go back after pushing mineral
            turnDegrees(-90,8); // midturn towards depot
            runForward(45,8); // run closer to the wall
            turnDegrees(-59,8); // turn towards depot
            runForward(65,8); //run inside the depot
            dropMarker();
            resetMarker();
            runForward(-95,8);

        }
        else{
            runForward(20, 5); // move forward 20 in
            turnDegrees(-94, 4.0); // turn left
            runForward(55, 6);
            turnDegrees(-48, 4.0); // turn left
            runForward(40, 5); // run forward into depot
            dropMarker();
            resetMarker();
            runForward(-87, 5); // run backwards into crater
        }

        stopTensorFlow();
    /*    // Step through each leg of the path,
        runForward(20, 5); // move forward 20 in
        turnDegrees(-94, 4.0); // turn left
        runForward(55, 6);
        turnDegrees(-48, 4.0); // turn left
        runForward(40, 5); // run forward into depot
        dropMarker();
        resetMarker();
        runForward(-87, 5); // run backwards into crater
*/
    }
}
