public abstract class AllAbilities implements CanLearn, CanIntuit, CanSee, CanHear, CanManeuver, CanBeSmooth {
    //A way of passing all abilities on at once.
}

interface CanLearn{
    void learn();
}

interface CanIntuit{
    void intuit();
}

interface CanSee{
    void see();
}

interface CanHear{
    void listen();
}

interface CanManeuver{
    void walk();
}

interface CanLift{
    void pickup();
    void hold();
    void place();
}

interface CanBeSmooth{
    void walkSmoothly();
    void pickupSmoothly();
    void placeSmoothly();
}