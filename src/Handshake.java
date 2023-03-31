public class Handshake {
    int type=1;
    char srcID;
    int distance;
    int tar_port;

    public Handshake(char srcID, int distance, int tar_port) {
        this.srcID = srcID;
        this.distance = distance;
        this.tar_port = tar_port;
    }

    @Override
    public String toString() {
        return "Handshake{" +
                "type=" + type +
                ", srcID=" + srcID +
                ", distance=" + distance +
                ", tar_port=" + tar_port +
                '}';
    }
}
