
// participant: ConcreteIterator
// Note --> participant: Iterator (using java.util.Iterator)
import java.util.Iterator;

public class ChannelIterator implements Iterator<Channel> {

    private Channel[] channels;
    private int position = 0;

    public ChannelIterator(Channel[] channels) {
        this.channels = channels;
    }

    @Override
    public boolean hasNext() {
        while (position < channels.length && channels[position] == null) {
            ++position;
        }
        if (position == channels.length)
            return false;
        else
            return true; // channels[position] is on-air
    }

    @Override
    public Channel next() {
        if (!hasNext())
            return null;
        return channels[position++];
    }

    @Override
    public void remove() {
        // this code is left for students ^_^
    }
}
