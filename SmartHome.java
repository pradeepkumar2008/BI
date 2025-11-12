public class SmartHome {
    @FunctionalInterface
    interface LightAction {
        void activate();
    }
    public static void main(String[] args) {
        // Lambda 1
        LightAction motionTrigger = () ->
                System.out.println("Motion detected! Turning lights ON");

        // Lambda 2
        LightAction timeTrigger = () ->
                System.out.println("It's evening! Dimming lights");

        // Lambda 3
        LightAction voiceTrigger = () ->
                System.out.println("Voice command received! Activating movie light mode.");

        simulateTrigger("motion", motionTrigger);
        simulateTrigger("time", timeTrigger);
        simulateTrigger("voice", voiceTrigger);
    }

    static void simulateTrigger(String triggerType, LightAction action) {
        System.out.println("\nTrigger: " + triggerType.toUpperCase());
        action.activate();
    }
}
