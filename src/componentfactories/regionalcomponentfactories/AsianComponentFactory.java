package componentfactories.regionalcomponentfactories;

import componentfactories.ComponentFactory;
import toyproducts.components.Engine;
import toyproducts.components.RotorBlade;
import toyproducts.components.Wheel;
import toyproducts.components.asian.AsianEngine;
import toyproducts.components.asian.AsianRotorBlade;
import toyproducts.components.asian.AsianWheel;

public class AsianComponentFactory extends ComponentFactory{
    @Override
    public Wheel createWheel() {
        Wheel wheel = new AsianWheel();
        return wheel;
    }

    @Override
    public Engine createEngine() {
        Engine engine = new AsianEngine();
        return engine;
    }

    @Override
    public RotorBlade createRotorBlade() {
        RotorBlade rotorBlade = new AsianRotorBlade();
        return rotorBlade;
    }
}
