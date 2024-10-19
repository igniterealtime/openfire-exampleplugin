package org.igniterealtime.openfire.exampleplugin;

import org.jivesoftware.openfire.container.Plugin;
import org.jivesoftware.openfire.container.PluginManager;

import java.io.File;

/**
 * A sample plugin for Openfire.
 */
public class ExamplePlugin implements Plugin {

    public void initializePlugin(PluginManager pluginManager, File pluginDirectory) {
        // Your code goes here
    }

    public void destroyPlugin() {
        // Your code goes here
    }
}
