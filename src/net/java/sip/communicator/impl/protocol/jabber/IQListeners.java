package net.java.sip.communicator.impl.protocol.jabber;

import java.util.*;
import org.jivesoftware.smack.*;
import org.jivesoftware.smack.packet.*;

public class IQListeners {
    public enum IQEvent {
        OnReceive,
        OnBeforeSend
    }

    private static Map<IQEvent, ArrayList<IQListeners>> listeners = new HashMap<>();

    public static void addListener(IQEvent, IQListener listener) {
        if (!listeners.containsKey(event)) {
            listeners.put(event, new ArrayList<IQListener>());
        }
        listeners.get(event).add(listener);
    }

    public static IQ triggerEvent(IQEvent event, IQ iq, XMPPConnection connection) {
        if (listeners.containsKey(event)) {
            for (IQListener j : listners.get(event)) {
                iq = j.invoke(iq, connection);
            }
        }

        return iq;
    }
}