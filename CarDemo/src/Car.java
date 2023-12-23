package src;

public class Car {
    String type;
    String model;
    String color;
    int speed;
    int speedLimit;

    Car(String model, int speed, String color) { // kurucu method
        this.model = model;
        this.speed = speed;
        this.type = "sedan";
        this.color = color;
        this.speedLimit = 180;
    }

    void increaseSpeed(int increment) {
        if (this.speed + increment < this.speedLimit) {
            this.speed += increment;

        }

    }

    void decreaseSpeed(int dicrease) {
        if (this.speed > 0) {
            this.speed -= dicrease;

        }
    }

    void printInfo() {
        System.out.println("model :" + this.model);
        System.out.println("speed :" + this.speed);
        System.out.println("color :" + this.color);
        System.out.println("model :" + this.type);
    }

}
