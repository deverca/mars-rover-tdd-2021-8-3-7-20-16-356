package com.afs.tdd;

import java.util.Arrays;
import java.util.List;

public class MarsRover {

    private RoverStatus roverStatus;

    public MarsRover(RoverStatus roverStatus) {
        this.roverStatus = roverStatus;
    }

    public void executeCommand(String command) {
        if ("M".equals(command)) {
            move();
        } else if ("L".equals(command)) {
            turnLeft();
        } else if ("R".equals(command)) {
            turnRight();
        }
    }

    public void executeCommands(String commands) {
        for (char command : commands.toCharArray()) {
            executeCommand(String.valueOf(command));
        }
    }

    private void turnRight() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        final String direction = roverStatus.getDirection();
        if ("N".equals(roverStatus.getDirection())) {
            roverStatus.setDirection("E");
        } else if ("S".equals(roverStatus.getDirection())) {
            roverStatus.setDirection("W");
        } else if ("E".equals(roverStatus.getDirection())) {
            roverStatus.setDirection("S");
        }else if ("W".equals(roverStatus.getDirection())) {
            roverStatus.setDirection("N");
        }
    }

    private void turnLeft() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        final String direction = roverStatus.getDirection();
        if ("N".equals(roverStatus.getDirection())) {
            roverStatus.setDirection("W");
        } else if ("S".equals(roverStatus.getDirection())) {
            roverStatus.setDirection("E");
        } else if ("E".equals(roverStatus.getDirection())) {
            roverStatus.setDirection("N");
        } else if ("W".equals(roverStatus.getDirection())) {
            roverStatus.setDirection("S");
        }
    }

    private void move() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        final String direction = roverStatus.getDirection();
        if ("N".equals(roverStatus.getDirection())) {
            roverStatus.setLocationY(locationY + 1);
        } else if ("S".equals(roverStatus.getDirection())) {
            roverStatus.setLocationY(locationY - 1);
        } else if ("E".equals(roverStatus.getDirection())) {
            roverStatus.setLocationX(locationX + 1);
        } else if ("W".equals(roverStatus.getDirection())) {
            roverStatus.setLocationX(locationX - 1);
        }
    }

    public RoverStatus getRoverStatus() {
        return roverStatus;
    }

}
