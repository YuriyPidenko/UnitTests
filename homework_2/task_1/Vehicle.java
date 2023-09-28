import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


package seminars.second.hw;

public abstract class Vehicle {
    private String company;
    private String model;
    private int yearRelease;
    private int numWheels;
    private int speed;

    public abstract void testDrive();

    public abstract void park();
}

public class Vehicle {

    Car car = new Car("KIA", "Optima", 2022);
    Motorcycle moto = new Motorcycle("Honda", "Gold Wing", 2020);

    //- Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).
    @Test
    void instanceOf() {
        assertThat(car instanceof Vehicle);
    }

    //- Проверить, что объект Car создается с 4-мя колесами.
    @Test
    void WheelsCar() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    //- Проверить, что объект Motorcycle создается с 2-мя колесами.
    @Test
    void MotorcycleWheels() {
        assertThat(moto.getNumWheels()).isEqualTo(2);
    }

    //- Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
    @Test
    void testDriveCar() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    //- Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
    @Test
    void testDriveMotorcycle() {
        moto.testDrive();
        assertThat(moto.getSpeed()).isEqualTo(75);
    }

   // - Проверить, что в режиме парковки (сначала testDrive, потом park, 
   // т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
    @Test
    void parkCar() {
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    //- Проверить, что в режиме парковки (сначала testDrive, потом park, 
    // т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0). движения транспорта) мотоцикл останавливается (speed = 0)
    @Test
    void parkMotorcycle() {
        moto.testDrive();
        moto.park();
        assertThat(moto.getSpeed()).isEqualTo(0);
    }
}