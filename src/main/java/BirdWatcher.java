
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
       return new int[]{0,2,5,3,7,8,4};
    }

    public int getToday() {
       return birdsPerDay[6];
    }

    public void incrementTodaysCount() {
       birdsPerDay[6] = getToday() + 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int i = 0; i <= 6; i++) {
            if(birdsPerDay[i] == 0){
                return true;
            }
    }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int numberOfBirds = 0;
        if(numberOfDays > 7 ){
            numberOfDays = 7;
        }
        for (int i = 0; i < numberOfDays; i++) {
            numberOfBirds = numberOfBirds + birdsPerDay[i];
    }
       return numberOfBirds;
    }

    public int getBusyDays() {
       int numberOfBirds = 0;
        for (int i = 0; i <= 6; i++) {
            if(birdsPerDay[i] >= 5)
                numberOfBirds++;
            }
        return numberOfBirds;
    }
}
