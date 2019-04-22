public class U2 extends Rocket {
    int rocketCost = 120;
    int rocketWeight = 18000;
    //int maxWeightWithCargo = 29000;
    int cargoLimit = 29000;
    int maxCargoWeight = maxWeightWithCargo - rocketWeight;
    double launchCrashProbability;
    double landingCrashProbability;
    public boolean launch(Rocket rocket, int cargoCarried){
        launchCrashProbability = 0.04 * (cargoCarried / cargoLimit);
        System.out.println("Launch crash probability for U2 with cargo carried " +cargoCarried + " kg = " +launchCrashProbability);
        if (launchCrashProbability >= 1)
            return true;
        else
            return false;
    }
        public boolean land(Rocket rocket, int cargoCarried) {
            landingCrashProbability = 0.01 * (cargoCarried / cargoLimit);
            System.out.println("Landing crash probability for U2 with cargo carried " +cargoCarried + " kg = " +landingCrashProbability);
            if (landingCrashProbability >= 1)
                return true;
            else
                return false;
        }
}

