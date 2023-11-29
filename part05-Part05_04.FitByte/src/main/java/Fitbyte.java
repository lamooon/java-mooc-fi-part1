public class Fitbyte {
    private int age;
    private int heartRate;

    public Fitbyte(int age, int restingHeartRate)
    {
        this.age = age;
        this.heartRate = restingHeartRate;
    }

    public double getMaximumHeartRate()
    {
        return 206.3 - (0.711 * this.age);
    }
    public double targetHeartRate(double percentageOfMaximum)
    {
        return (this.getMaximumHeartRate() - this.heartRate) * percentageOfMaximum + this.heartRate;
    }
}
