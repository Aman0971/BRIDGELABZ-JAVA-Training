package org.Library_Management.library.publiclib.decorator;

class HomeDeliveryDecorator implements ServiceCharge{
    private ServiceCharge decorated;
    public HomeDeliveryDecorator(ServiceCharge decorated) {
        this.decorated = decorated;
    }
    public double getCost(){
        return decorated.getCost() + 5.0;
    }
}
