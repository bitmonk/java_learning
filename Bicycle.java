class Bicycle {

    int cadence = 0;
    int speed = 0;
    int gear = 1;
    int GEAR_MAX = 8;

    void changeCadence(int newValue) {
         cadence = newValue;
    }

    boolean shiftUp() {
      if (gear < GEAR_MAX) {
        gear++;
        return true;
      } else {
        return false;
      }
    }

    boolean shiftDown() {
      if (gear > 1) {
        gear--;
        return true;
      } else {
        return false;
      }
    }

    boolean changeGear(int newValue) {
      if ( newValue <= GEAR_MAX ) {
        gear = newValue;
        return true;
      } else {
        return false;
      }
    }

    void speedUp(int increment) {
         speed = speed + increment;   
    }

    void applyBrakes(int decrement) {
         speed = speed - decrement;
    }

    void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear);
    }
}

