package part1Threads.thread1;

public class Race {
    public static void main(String[] args) {
        RaceCar[] cars = new RaceCar[5];
        cars[0] = new RaceCar(10, "Zeri");
        cars[1] = new RaceCar(10, "Katarina");
        cars[2] = new RaceCar(10, "Yasuo");
        cars[3] = new RaceCar(10, "Lee Sin");
        cars[4] = new RaceCar(10, "Zed");

        for (int i = 0; i < 5; i++) {
            cars[i].start();
        }
    }
}
