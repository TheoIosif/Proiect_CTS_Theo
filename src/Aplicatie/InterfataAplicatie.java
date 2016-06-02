package Aplicatie;

public interface InterfataAplicatie {
	public boolean conecteazaDeviceExtern(String ip);
	public String getProdus(String provider,String db,String password) throws Exception;

}
