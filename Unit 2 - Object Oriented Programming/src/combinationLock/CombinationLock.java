package combinationLock;

// The "CombinationLock" class.
public class CombinationLock {

    // create instance variables
    private boolean lockState;
    private int number1;
    private int number2;
    private int number3;

    // constructor method 1 - specific combination
    public CombinationLock(int n1, int n2, int n3) {
        this.number1 = n1;
        this.number2 = n2;
        this.number3 = n3;
        this.lockState = false; // unlocked
    } // constructor method 1 - access modifier, no static, no return, name must match class

    // constructor method 2 - random combination
    public CombinationLock() {
        this.number1 = (int) (Math.random()*30)+1;
        this.number2 = (int) (Math.random()*30)+1;
        this.number3 = (int) (Math.random()*30)+1;
        this.lockState = true; // locked
    } // constructor method 2

    // accessor methods
    public int getNumber1() {
        return this.number1;
    }
    public int getNumber2() {
        return this.number2;
    }
    public int getNumber3() {
        return this.number3;
    }
    public boolean getLockState() {
        return this.lockState;
    }

    // mutator methods
    public void setNumber1(int n1) {
        this.number1 = n1;
    }
    public void setNumber2(int n2) {
        this.number2 = n2;
    }
    public void setNumber3(int n3) {
        this.number3 = n3;
    }
    public void setLockState(boolean locking) {
        this.lockState = locking;
    }
    public void setUnlockState(boolean unlocking) {
        this.lockState = false;
    }

    // behavioural methods
    public boolean testCombination (int n1, int n2, int n3) {
        boolean rightCombo = false;

        // do current lock object's numbers match arguments?
        if ((this.number1 == n1) && (this.number2 == n2) && (this.number3 == n3)) {
            rightCombo = true; // correct combo
            this.lockState = false; // unlock
        }

        return rightCombo;
    }

    // toString() method
    public String toString() {
        String lockData1 = "Combination: " + this.number1 + "-" + this.number2 + "-" + this.number3;
        String lockData2 = " -- State: " + this.lockState;
        String lockData = lockData1 + lockData2;
        return lockData;
    }

} // "CombinationLock" class.
