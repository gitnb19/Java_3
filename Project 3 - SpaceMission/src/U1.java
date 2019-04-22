public class U1 extends Rocket {
    int rocketCost = 100;
    int rocketWeight = 10000;
    //int maxWeightWithCargo = 18000;
    int cargoLimit = 18000;
    double launchCrashProbability;
    double landingCrashProbability;
    int maxCargoWeight = cargoLimit - rocketWeight;
    public boolean launch(U1 u1, int cargoCarried){
        launchCrashProbability = 0.05 * (cargoCarried / cargoLimit);
        System.out.println("Launch crash probability for U1 with cargo carried " +cargoCarried + " kg = " +launchCrashProbability);
        if (launchCrashProbability >= 1)
                return true;
        else
            return false;
    }
    public boolean land(U1 u1, int cargoCarried) {
        landingCrashProbability = 0.01 * (cargoCarried / cargoLimit);
        System.out.println("Landing crash probability for U1 with cargo carried " +cargoCarried + " kg = " +landingCrashProbability);
        if (landingCrashProbability >= 1)
            return true;
        else
            return false;
    }
}
