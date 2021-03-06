package com.huatu.ztk.smc.flume;

import java.util.HashMap;
import java.util.Map;

/**
 * This context is an abstraction for scopes. Prior to this there were one
 * scopes the physical node (essentially conf file). This allows for new
 * subscopes such as logical node contexts. This allows information to be passed
 * to specific logical nodes (such as logicalnode name).
 * <p/>
 * This interface will likely subsume FlumeConfiguration (physical node scope),
 * and configuration information grabbed from the master such as as logical node
 * specific failover chains (master scope). With scope chaining and shadowing we
 * can in the future introduce node specific configuration settings
 * transparently.
 */
public class Context {
    Map<String, Object> table = new HashMap<String, Object>();
    final Context parent;

    final public static Context EMPTY = new Context(null);

    public Context(Context parent) {
        this.parent = parent;
    }

    /**
     * This should only be used rarely. You probably want
     * LogicalNode.testingContext
     */
    public Context() {
        this.parent = EMPTY;
    }

    /**
     * Get the parent context
     */
    public Context getParent() {
        return this.parent;
    }

    /**
     * Get a value from the current node, otherwise go up to a larger scope and
     * try to get the value from there.
     */
    public String getValue(String arg) {
        Object val = table.get(arg);
        if (val != null) {
            return val.toString();
        }

        if (getParent() != null) {
            return getParent().getValue(arg);
        }
        return null; // no parent, and was null? return null
    }

    /**
     * Adds a value to the context assuming it is a string.
     */
    protected void putValue(String arg, String val) {
        table.put(arg, val);
    }

    /**
     * Adds an object value to the context.
     */
    protected <T> void putObj(String arg, T val) {
        table.put(arg, val);
    }

    /**
     * Gets an object value from the context.
     */
    public <T> T getObj(String arg, Class<T> clz) {
        Object val = table.get(arg);
        if (val == null && getParent() != null) {
            return getParent().getObj(arg, clz);
        }
        return clz.cast(val);
    }
}
