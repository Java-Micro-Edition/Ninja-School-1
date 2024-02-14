import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;

final class a implements CommandListener {
    private Midlet a;

    a(Midlet var1) {
        this.a = var1;
    }

    public final void commandAction(Command var1, Displayable var2) {
        if (var1.getLabel().equals("Download")) {
            try {
                this.a.platformRequest("http://");
            } catch (ConnectionNotFoundException var3) {
            }
        } else {
            this.a.notifyDestroyed();
        }
    }
}
