public class SignedText {
    private String firstName;
    private String lastName;

    public SignedText(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getSignature() {
        if (firstName.equals("")) {
            return lastName;
        } else {
            return firstName.substring(0, 1) + "-" + lastName;
        }
    }

    public String addSignature(String text) {
        String signature = getSignature();
        int sigLength = signature.length();
        int textLength = text.length();
        if (textLength >= sigLength) {
            String endPart = text.substring(textLength - sigLength);
            if (endPart.equals(signature)) {
                return text;  
            }
        }
        if (textLength >= sigLength) {
            String startPart = text.substring(0, sigLength);
            if (startPart.equals(signature)) {
                String restOfText = text.substring(sigLength);
                return restOfText + signature;  
            }
        }
        return text + signature;
    }
}
