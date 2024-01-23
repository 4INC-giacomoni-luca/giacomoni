package esLettore;

public class MessaggioWhatsApp implements Messaggio {

    private String testo;
    private String emoticon;

    public MessaggioWhatsApp(String testo, String emoticon) {
        this.testo = testo;
        this.emoticon = emoticon;
    }

    @Override
    public String leggiTesto() {
        String t = "TestoWhatsApp: " + testo;
        if (emoticon != null && !emoticon.isEmpty()) {
            t += "\nEmoticon: " + emoticon;
        }

        return t;
    }

}
