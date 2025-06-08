public class App {

    public static void main(String[] args) {
        StepCounter steps = new StepCounter(10000); //COMMENT: Days with at least 10,000 steps are considered active. Assume that the parameter is positive. 
        System.out.println(steps.activeDays()); //RETURN: 0  COMMENT: No data has been recorded yet, so no active days
        System.out.println(steps.averageSteps()); //RETURN: 0.0 COMMENT: When no step data have been recorded, the averageSteps method returns 0.0.
        steps.addDailySteps(9000); //COMMENT: This is too few steps for the day to be considered active (the minimum is set to 10000)
        steps.addDailySteps(5000); //COMMENT: This is too few steps for the day to be considered active (the minimum is set to 10000)
        System.out.println(steps.activeDays()); //RETURN: 0 COMMENT: No day had at least 10,000 steps.
        System.out.println(steps.averageSteps()); //RETURN: 7000.0 COMMENT:  The average number of steps per day is (14000 / 2).
        steps.addDailySteps(13000);  //COMMENT: This represents an active day (over 10000 steps)
        System.out.println(steps.activeDays()); //RETURN: 1 COMMENT:  Of the three days for which step data were entered, only one day had at least 10,000 steps.
        System.out.println(steps.averageSteps()); //RETURN: 9000.0 COMMENT:  The average number of steps per day is (27000 / 3).
        steps.addDailySteps(23000); //COMMENT: This represents an active day.
        steps.addDailySteps(1111); //COMMENT: This is too few steps for the day to be considered active.
        System.out.println(steps.activeDays());//RETURN: 2  COMMENT: Of the five days for which step data were entered, two days had at least 10,000 steps.
        System.out.println(steps.averageSteps());//RETURN: 10222.2  COMMENT: The average number of steps per day is (51111 / 5).
        StepCounter step2 = new StepCounter();  //COMMENT: Creates a StepCounter object with 7,000 steps as the minimum amount to be considered active
        step2.addDailySteps(6000);  //COMMENT: This is too few steps for the day to be considered active (the minimum is set to 7,000)
        System.out.println(step2.activeDays()); //RETURN: 0  COMMENT: No day had at least 7,000 steps.
        step2.addDailySteps(8000); //COMMENT: This represents an active day (over 7,000 steps)
        System.out.println(step2.activeDays()); //RETURN: 1 COMMENT: Only 1 day had more than 7,000 steps
        System.out.println(step2.averageSteps()); //RETURN: 7,000 COMMENT: The average number of steps per day (14,000/2)
    }

}
