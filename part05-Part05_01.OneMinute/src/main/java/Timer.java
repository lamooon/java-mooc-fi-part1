public class Timer {
    private ClockHand hundredths;
    private ClockHand second;

    public Timer()
    {
        this.hundredths = new ClockHand(100);
        this.second = new ClockHand(60);
    }

    public String toString()
    {
        return this.second + ":" + this.hundredths;
    }

    public void advance()
    {
        this.hundredths.advance();
        if (this.hundredths.value() == 0)
        {
            this.second.advance();
        }
        
    }
}

