/*
 * @(#)MNetscape6AppletContext.java	1.10 10/03/24
 *
 * Copyright (c) 2006, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package sun.plugin.viewer.context;

import java.net.URL;
import sun.plugin.navig.motif.Worker;
import sun.plugin.services.BrowserService;

/**
 * This class corresponds to an applet's environment: the
 * document containing the applet and the other applets in the same
 * document in Netscape 6 on Solaris/Linux.
 * <p>
 * The methods in this interface can be used by an applet to obtain
 * information about its environment.
 *
 */
public class MNetscape6AppletContext extends NetscapeAppletContext
{
    /**
     * Create a MNetscape6AppletContext object.
     */
    public MNetscape6AppletContext()
    {
    }

    /*
     * Requests that the browser or applet viewer show the Web page
     * indicated by the url argument. 
     *
     * @param url the address to transfer to
     * @param target One of the value
     *	"_self"  show in the current frame
     *  "_parent"show in the parent frame
     *  "_top"   show in the topmost frame
     *  "_blank" show in a new unnamed top-level windownameshow in a 
     *           new top-level window named name
     */
    public void doShowDocument(URL url, String target)
    {
	// Call native method
	if (instance >= 0)
	    Worker.showDocument(instance, url, target);
    }

    /*
     * Show status.
     * 
     * @param status status message
     */ 
    public void doShowStatus(String status)
    {
	// Call native method
	if (instance >= 0)
	    Worker.showStatus(instance, status);
    }
}


