public class CarsAssemble {
    /*
    1 to 4: 100% success rate.
5 to 8: 90% success rate.
9: 80% success rate.
10: 77% success rate.
     */
    public double productionRatePerHour(int speed) {
        final double carsProduced = 221;
        double carsTotal = carsProduced*speed;
        if (speed>4 && speed<9){
            carsTotal = carsTotal*0.9;
        } else if (speed==9) {
            carsTotal = carsTotal*0.8;
        }else if (speed==10){
            carsTotal = carsTotal*0.77;
        }
        return carsTotal;
    }

    public int workingItemsPerMinute(int speed) {
        int carsHour = ((int) productionRatePerHour(speed));
        return carsHour/60;
    }
}
