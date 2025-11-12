public class Main{
    public class void main(String[] args){
        SmartDevices Light= new Light();
        SmartDevices SmartTV= new SmartTV();
        SmartDevices Speakers= new Speaker();

        Light.turnON();
        SmartTV.turnON();
        Speaker.turnON();

        Light.turnOFF();
        SmartTV.turnOFF();
        Speaker.turnOFF();
    }
}