package Java;
import java.util.ArrayList;
import java.util.Map;

/**
 * UberBlack
 */
public class UberBlack extends Car{
    Map<String, ArrayList<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;


    public UberBlack(final String license, final Account driver, final Map<String, ArrayList<String,Integer>> typeCarAccepted, final ArrayList<String> seatsMaterial) {
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
}