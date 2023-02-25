package util;

public interface ISerialPoretListener {

	void connectionOpened(String portName, int baudRate);
	
	void connectionCLosed();
}
