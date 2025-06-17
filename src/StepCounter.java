public class StepCounter {

    /* Minimum amount of daily steps to be considered active. */
    private int _minimumActiveDailySteps;

    /* Total amount of steps tracked. */
    private int _totalSteps = 0;

    /* Total amount of days tracked. */
    private int _daysTracked = 0;

    /* Total amount of active days tracked. */
    private int _activeDays = 0;
    

    /* Nondefault minimum active daily steps. */
    public StepCounter(int minimumActiveDailySteps)
    {
        this._minimumActiveDailySteps = minimumActiveDailySteps;
    }

    /* Default amount of daily steps. */
    public StepCounter()
    {
        this._minimumActiveDailySteps = 7000;
    }

    /* Add total steps for the day to the total and count an active day if above the minimum number of daily steps. */
    public void addDailySteps(int steps)
    {
        _totalSteps += steps;
        ++_daysTracked;
        if (steps >= _minimumActiveDailySteps)
            ++_activeDays;
    }

    /* Return number of days counted as active. */
    public int activeDays()
    {
        return _activeDays;
    }

    /* Calculate average number of steps per day tracked. */
    public float averageSteps()
    {
        if (_daysTracked == 0)
            return 0f;
        return _totalSteps / _daysTracked;
    }

}
