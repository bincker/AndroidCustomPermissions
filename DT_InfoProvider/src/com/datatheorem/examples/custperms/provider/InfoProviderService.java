package com.datatheorem.examples.custperms.provider;

import com.datatheorem.examples.custperms.provider.InfoProviderRemote;
import com.datatheorem.examples.custperms.provider.InfoProviderRemote.Stub;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class InfoProviderService extends Service{

	private final InfoProviderRemote.Stub mBinder=new Stub() {
		public String getInfo(String message) throws RemoteException {
			return "Sensitive password for  "+message+" is \"bacon\"";
		}
	};

	public IBinder onBind(Intent arg0) {
		return mBinder;
	}

}
