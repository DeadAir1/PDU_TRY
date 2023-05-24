
package PDU_TRY;
public class VBDLogic {
    private String message;
    private boolean status;
    private int bandwidth;
    private String number;

    public VBDLogic(String message) {
        this.message = message;
        this.status = true;
        this.bandwidth = 0;
        this.number = "950702702";
    }

    public String getNumber() {
        return number;
    }

    public int getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(int bandwidth) {
        this.bandwidth = bandwidth;
    }

    public void stop() {
        status = false;
    }
}