package loosecoupling;

public class Bankomat {

    private final IPinCodeVerifier verifier;


    public Bankomat(IPinCodeVerifier verifier) {
        this.verifier = verifier;

    }

    public void verify(String pinCode, String personNr) {
        // Använd vår verififer
        this.verifier.verify(pinCode, personNr);
    }

}
