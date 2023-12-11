public class Main {
    static final RiceCookerService riceCookerService = new RiceCookerService(false, true, false, false);
    public static void main(String[] args) {
        welcome();
        menu();
    }
    public static void welcome(){
        Utils.print("What do you want to do ?");
    }

    public static void menu() {
        Utils.print("Type a number between the given choice.");
        Utils.print(new StringBuilder()
                .append("1. Plug in.")
                .append("\n")
                .append("2. Pour water.")
                .append("\n")
                .append("3. Put ingredient.")
                .append("\n")
                .append("4. Set time.")
                .append("\n")
                .append("5. Start.")
                .append("\n")
                .append("6. Unplug.")
                .append("\n")
                .append("7. Do something else.")
                .toString());
        switch (Utils.intScanner()) {
            case 1 -> riceCookerService.plugIn();
            case 2 -> riceCookerService.pourWater();
            case 3 -> riceCookerService.putIngredient();
            case 4 -> riceCookerService.setTimer();
            case 5 -> riceCookerService.start();
            case 6 -> riceCookerService.unPlug();
            case 7 -> Utils.quit();
            default -> menu();
        }
    }
}