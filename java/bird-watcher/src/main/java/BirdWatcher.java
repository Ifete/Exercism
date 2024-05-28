
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] = birdsPerDay[birdsPerDay.length - 1] + 1;
    }

    public boolean hasDayWithoutBirds() {
        boolean hasDayWith0 = false;
        for (int bird :
                birdsPerDay) {
            if (bird <= 0) {
                hasDayWith0 = true;
            }
        }
        ;
        return hasDayWith0;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int totalBirds = 0;
        for (int i = 0; i < numberOfDays ; i++) {
            if (i<birdsPerDay.length){
                totalBirds = totalBirds+ birdsPerDay[i];
            }
        }

        return totalBirds;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int bird :
                birdsPerDay) {
            if (bird >= 5) {
                busyDays++;
            }
        }
        ;
        return busyDays;
    }
}
