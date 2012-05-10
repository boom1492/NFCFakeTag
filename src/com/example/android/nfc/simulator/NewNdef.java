package com.example.android.nfc.simulator;

public class NewNdef {
	private byte[] ndefMessage;
	
	public NewNdef(String url){
		byte[] temp = url.getBytes();
		int length = 5 + temp.length;
		ndefMessage = new byte[length];
		ndefMessage[0] = (byte) 0xd1;
		ndefMessage[1] = (byte) 0x01;
		ndefMessage[2] = (byte)(url.length()+1);
		ndefMessage[3] = (byte) 0x55;
		ndefMessage[4] = (byte) 0x00;
		for(int i=0;i<temp.length;i++){
			ndefMessage[i+5] = temp[i]; 
		}
	}
	
	public byte[] getNdef(){
		return ndefMessage;
	}
}
