/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /Users/dthome/Documents/workspace/Evil_InfoRetriever/src/com/datatheorem/examples/custperms/provider/InfoProviderRemote.aidl
 */
package com.datatheorem.examples.custperms.provider;
public interface InfoProviderRemote extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.datatheorem.examples.custperms.provider.InfoProviderRemote
{
private static final java.lang.String DESCRIPTOR = "com.datatheorem.examples.custperms.provider.InfoProviderRemote";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.datatheorem.examples.custperms.provider.InfoProviderRemote interface,
 * generating a proxy if needed.
 */
public static com.datatheorem.examples.custperms.provider.InfoProviderRemote asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.datatheorem.examples.custperms.provider.InfoProviderRemote))) {
return ((com.datatheorem.examples.custperms.provider.InfoProviderRemote)iin);
}
return new com.datatheorem.examples.custperms.provider.InfoProviderRemote.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_getInfo:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.getInfo(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.datatheorem.examples.custperms.provider.InfoProviderRemote
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public java.lang.String getInfo(java.lang.String message) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(message);
mRemote.transact(Stub.TRANSACTION_getInfo, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_getInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public java.lang.String getInfo(java.lang.String message) throws android.os.RemoteException;
}
