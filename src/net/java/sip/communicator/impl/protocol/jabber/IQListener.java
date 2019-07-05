package net.java.sip.communicator.impl.protocol.jabber;

import net.java.sip.communicator.impl.protocol.jabber.extensions.jingle.JingleIQ;
import org.jivesoftware.smack.*;
import org.jivesoftware.smack.packet.*;

public abstract class IQListener {
    public abstract IQ invoke(IQ iq, XMPPConnection connection);
}