package fr.wither.utils;

import java.io.File;
import java.lang.management.ManagementFactory;

import com.sun.management.OperatingSystemMXBean;

@SuppressWarnings("restriction")
public class SystemInformations {
	
	//Choix du facteur entre un octet et un Go (Gio pour etre exact dans ce cas-ci)
	public static final long BYTES_TO_GO = 1073741824 ;
	
	//retourne le maximum de mémoire vive(RAM) de l'ordinateur. /!\ peut être sous-estimée
	public long getSystemRAM() {
		return ((OperatingSystemMXBean)ManagementFactory.getOperatingSystemMXBean()).getTotalPhysicalMemorySize() / BYTES_TO_GO;
	}
	
	//retourne Unknown, 32 ou 64 suivant l'architecture java (32 bits, 64 bits, Inconnue/Indeterminable)
	public String getJavaBits() {
		return System.getProperty("sun.arch.data.model");
	}
	
	//retourne l'espace disque total
	public long getDiskSize() {
		return new File("/").getTotalSpace() / BYTES_TO_GO;
	}
	
	
	//Retourne la version java sous la forme X.X
	public String getJavaVersion() {
		return System.getProperty("java.specification.version");
	}
	
	
	//Retourne la version de java sous la forme X.X.X_XXX
	public String getExactJavaVersion() {
		return System.getProperty("java.version");
	}
}
