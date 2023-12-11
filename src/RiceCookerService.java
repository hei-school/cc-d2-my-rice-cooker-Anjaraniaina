public class RiceCookerService {
    private boolean isPluggedIn;
    private boolean isEmpty;
    private boolean containWater;

    private boolean isTimerSet;

    private int timerValue;

    public RiceCookerService(boolean isPluggedIn, boolean isEmpty, boolean containWater, boolean isTimerSet) {
        this.isPluggedIn = isPluggedIn;
        this.isEmpty = isEmpty;
        this.containWater = containWater;
        this.isTimerSet = isTimerSet;
    }

    public boolean isPluggedIn() {
        return isPluggedIn;
    }

    public boolean isTimerSet() {
        return isTimerSet;
    }

    public void setTimerSet(boolean timerSet) {
        isTimerSet = timerSet;
    }

    public int getTimerValue() {
        return timerValue;
    }

    public void setTimerValue(int timerValue) {
        this.timerValue = timerValue;
    }

    public void setPluggedIn(boolean pluggedIn) {
        isPluggedIn = pluggedIn;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public boolean isContainWater() {
        return containWater;
    }

    public void setContainWater(boolean containWater) {
        this.containWater = containWater;
    }

    public void pourWater() {
        if(!containWater) {
            setContainWater(true);
            setEmpty(false);
            Utils.print("You poured water.");
        } else {
            Utils.print("There's already water.");
        }
        Main.menu();
    }

    public void putIngredient() {
        setEmpty(false);
        Utils.print("You put ingredient in.");
        Main.menu();
    }

    public boolean checkIfCookedWithoutWater() {
        return !isEmpty && !containWater;
    }

    public void plugIn() {
        if(!isPluggedIn) {
            setPluggedIn(true);
            Utils.print("You plugged in. The rice cooker is ready to use.");
        } else {
            Utils.print("It's already plugged in.");
        }
        Main.menu();
    }

    public void start() {
        if(!isPluggedIn) {
            Utils.print("The rice cooker is not plugged in yet.");
        } else {
            if(isEmpty && isTimerSet) {
                Utils.print("There's nothing to cook yet in the rice cooker.");
            } else if (checkIfCookedWithoutWater() && isTimerSet){
                Utils.print("You put ingredient without water.");
            } else if(isTimerSet && !checkIfCookedWithoutWater()){
                Utils.print("Ok");
                Utils.schedule(timerValue);
                Utils.print("You can eat now.");
            } else if(!isTimerSet){
                Utils.print("Timer not set.");
            }
        }
        Main.menu();
    }

    public void setTimer() {
        Utils.print("How many minutes ?");
        try {
            int timerValue = Utils.intScanner();
            setTimerValue(timerValue);
            setTimerSet(true);
        } catch (Exception e) {
            Utils.print("Error");
            setTimerSet(false);
        }
        Main.menu();
    }

    public void unPlug() {
        setPluggedIn(false);
        Utils.print("You unplugged the rice cooker.");
        Main.menu();
    }
}
