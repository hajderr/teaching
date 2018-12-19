package loosecoupling;

public class Main {

    public static void main(String[] args) {
        PinCodeVerifierWill pinCodeVerifierWill = new PinCodeVerifierWill();
        PinCodeVerifierPavel pinCodeVerifierPavel = new PinCodeVerifierPavel();

        //Skicka in beroende till verifier
        Bankomat bankomat = new Bankomat(pinCodeVerifierWill);
        String pinCode = "1234";
        String personNr = "8012121122";

        bankomat.verify(pinCode, personNr);


    }
}
