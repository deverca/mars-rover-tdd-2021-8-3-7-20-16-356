package com.afs.tdd;

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

    private void turnRight() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        final String direction = roverStatus.getDirection();
        if ("N".equals(roverStatus.getDirection())) {
            roverStatus.setDirection("E");
        } else if ("S".equals(roverStatus.getDirection())) {
            roverStatus.setDirection("W");
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
        }
    }

    public RoverStatus getRoverStatus() {
        return roverStatus;
    }

}
