
package com.feedzai.netsim.engine;

/**
 * Represents the overall computer network.
 */
public class Network {
    public static Network createWithLatency(int latency) {
        // TODO: Implement factory method for creating a new network with a default latency
        return null;
    }

    public void connect(String idA, String idB) {
        // TODO: Implement adding a network connection between to nodes -- default latency is used
        // You may (or may not) need to throw exceptions... change signature if needed
    }

    public void connect(String idA, String idB, int latency) {
        // TODO: Implement adding a network connection between two nodes with a specified latency
        // You may (or may not) need to throw exceptions... change signature if needed
    }

    public NetworkPath sendPacket(String idA, String idB) {
        // TODO: Simulates sending a packet from node idA to node idB. Returns the route that the packet followed
        // You may (or may not) need to throw exceptions... change signature if needed
        return null;
    }
}
