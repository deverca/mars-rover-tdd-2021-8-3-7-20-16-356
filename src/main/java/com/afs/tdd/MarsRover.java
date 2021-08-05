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
        }
    }

    private void turnLeft() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        final String direction = roverStatus.getDirection();

        roverStatus.setDirection("W");
    }

    private void move() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        final String direction = roverStatus.getDirection();
        roverStatus.setLocationY(locationY + 1);
    }

    public RoverStatus getRoverStatus() {
        return roverStatus;
    }

}
