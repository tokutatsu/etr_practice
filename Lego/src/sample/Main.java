
package sample;

import jp.ac.kagawa_u.infoexpr.Sensor.LightSensor;
import jp.ac.kagawa_u.infoexpr.Sensor.TouchSensor;
import lejos.hardware.Sound;
import lejos.hardware.motor.Motor;
import lejos.hardware.port.SensorPort;
import lejos.robotics.RegulatedMotor;

public class Main {
    static TouchSensor touch = new TouchSensor(SensorPort.S1);
    static LightSensor rightLight = new LightSensor(SensorPort.S2);
    static LightSensor leftLight = new LightSensor(SensorPort.S3);
    static RegulatedMotor rightMotor  = Motor.B;
    static RegulatedMotor leftMotor  = Motor.C;

    public static void main (String[] args) {
        float middleValue = 0.40F;
        int lowSpeed = 240;
        int highSpeed = 600;

        while ( ! touch.isPressed() ){
            float leftValue = leftLight.getLight();
            float rightValue = rightLight.getLight();
        	// 黒&黒
            if (leftValue < middleValue && rightValue < middleValue) {

            }
            // 黒&白
            else if (leftValue < middleValue && rightValue >= middleValue) {
                motorSetSpeed(lowSpeed, highSpeed);
                motorForward();
            }
            // 白&黒
            else if (leftValue >= middleValue && rightValue < middleValue) {
                motorSetSpeed(highSpeed, lowSpeed);
                motorForward();
            }
            // 白&白
            else if (leftValue >= middleValue && rightValue >= middleValue) {
                motorSetSpeed(highSpeed + 250, highSpeed + 250);
                motorForward();
            }
            else {
            	Sound.beep();
            }
        }
    }

    // Valueクラスに保存
    private static void motorSetSpeed (int leftMotorSpeed, int rightMotorSpeed) {
        leftMotor.setSpeed(leftMotorSpeed);
        rightMotor.setSpeed(rightMotorSpeed);
    }

    private static void motorForward () {
        leftMotor.forward();
        rightMotor.forward();
    }
}