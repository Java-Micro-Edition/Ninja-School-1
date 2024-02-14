import javax.microedition.io.Connector;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;

final class c implements Runnable {
    private final String a;
    private final String b;
    private final int c;

    c(String var1, String var2, int var3) {
        this.a = var1;
        this.b = var2;
        this.c = var3;
    }

    public final void run() {
        try {
            MessageConnection var1 = null;
            TextMessage var2;
            (var2 = (TextMessage)(var1 = (MessageConnection)Connector.open(this.a)).newMessage("text")).setAddress(this.a);
            var2.setPayloadText(this.b);
            b.d();
            int[] var10000;
            switch (this.c) {
                case 0:
                    b.Z = 5;
                    return;
                case 1:
                    var10000 = b.W;
                    var10000[0] += 50;
                    return;
                case 2:
                    var10000 = b.W;
                    var10000[1] += 50;
                    return;
                case 3:
                    var10000 = b.W;
                    var10000[2] += 30;
                    return;
                case 4:
                    var10000 = b.W;
                    var10000[3] += 50;
                    return;
                case 5:
                    var10000 = b.W;
                    var10000[4] += 30;
                    return;
                case 6:
                    var10000 = b.W;
                    var10000[5] += 50;
                    return;
                case 7:
                    b.y = 1;
                    b.a();
                    b.t();
                    return;
                case 8:
                    b.y = 2;
                    b.a();
                    b.t();
                    return;
                case 9:
                    b.y = 3;
                    b.a();
                    b.t();
                    return;
                default:
            }
        } catch (Exception var3) {
            switch (this.c) {
                case 0:
                    b.Z = 6;
                    return;
                default:
                    b.s(7);
                    b.a("Không thể mua. Xin hãy thử lại sau.");
                    b.Y = b.V;
                    b.e = 7;
            }
        }
    }
}
