package org.jnect.demo.incquery.sheldon;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Utility class to connect to Sheldon.
 * 
 * @author istvanrath
 * 
 */
public class SheldonConnectivity {

	private static SheldonConnectivity instance = new SheldonConnectivity();

	public static SheldonConnectivity getInstance() {
		return instance;
	}
	
	private SheldonConnectivity() {

	}

	private static final String sheldonAddress = "192.168.1.22";
	
	private static final int sheldonPort = 13485;

	void sendUDPMessage() {
		DatagramSocket clientSocket=null; 
		try {
			clientSocket = new DatagramSocket();
			InetAddress IPAddress = InetAddress.getByName(sheldonAddress);
			byte[] sendData = new byte[1024];
			byte[] receiveData = new byte[1024];
			String sentence = "42";
			sendData = sentence.getBytes();
			DatagramPacket sendPacket = new DatagramPacket(sendData,
					sendData.length, IPAddress, sheldonPort);
			clientSocket.send(sendPacket);
			System.out.println("[SheldonConnectivity] send packet '" + sentence
					+ "'to " + sheldonAddress + ":" + sheldonPort);
			/*
			 * DatagramPacket receivePacket = new DatagramPacket(receiveData,
			 * receiveData.length); clientSocket.receive(receivePacket); String
			 * modifiedSentence = new String(receivePacket.getData());
			 */
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (clientSocket!=null) {
				clientSocket.close();
			}
		}
		
		
	}

}
